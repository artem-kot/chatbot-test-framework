package ai.l1r1.testframework.steps;

import ai.l1r1.testframework.clients.WhatsappClient;
import ai.l1r1.testframework.pojo.testrunner.TestCase;
import ai.l1r1.testframework.pojo.testrunner.TestSuite;
import ai.l1r1.testframework.pojo.whatsapp.RequestBuilder;
import ai.l1r1.testframework.pojo.whatsapp.WhatsappRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import io.qameta.allure.Allure;
import io.qameta.allure.AllureLifecycle;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.junit.After;
import org.junit.Before;

import java.io.File;
import java.io.IOException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class BaseTestData {

    protected static String testSuitePath = "src/test/resources/TestScenarios.yaml";

    private WhatsappClient apiClient;

    public static TestSuite readTestCases(String filePath) {
        try {
            ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
            mapper.findAndRegisterModules();
            return mapper.readValue(new File(filePath), TestSuite.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static TestCase readTestData(String filePath) {
        try {
            ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
            mapper.findAndRegisterModules();
            return mapper.readValue(new File(filePath), TestCase.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public WhatsappRequest setInput(String input) {
        RequestBuilder request = new RequestBuilder();
        return request.build(input);
    }

    @Before
    public void setup() {
        apiClient = new WhatsappClient();
    }

    //    Universal test step, sends string input to cortex and returns output.
    @Step("{stepName}")
    public Response sendRequest(String stepName, String input) {
        return apiClient.requestWhatsapp(setInput(input));
    }

    //    Validator with assertion. Validates that cortex response contains each of the keywords.
    public void assertResponseContainsKeywords(String response, String[] keywords) {
        for (String keyword : keywords) {
            assertThat(response, containsString(keyword));
        }
    }

    //    Interrupts execution to set up the name of the test case.
    public void setUpTestName(String testName) {
        AllureLifecycle lifecycle = Allure.getLifecycle();
        lifecycle.updateTestCase(testResult -> testResult.setName(testName));
    }

    //    Interrupts execution to set up the description of the test case.
    public void setUpTestDescription(String testDescription) {
        AllureLifecycle lifecycle = Allure.getLifecycle();
        lifecycle.updateTestCase(testDescription1 -> testDescription1.setDescription(testDescription));
    }

    @After
    public void reset() {
        sendRequest("Clean the dialog cache", "Alles zuruck");
        sendRequest("Confirm cleaning the cache", "Ja");
    }
}
