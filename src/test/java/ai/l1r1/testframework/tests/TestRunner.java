package ai.l1r1.testframework.tests;

import ai.l1r1.testframework.pojo.testrunner.TestCase;
import ai.l1r1.testframework.pojo.testrunner.TestSuite;
import ai.l1r1.testframework.steps.BaseTestData;
import io.qameta.allure.Description;
import io.qameta.allure.Link;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
@DisplayName("E2E test cases")
@Link(name = "(Optional link) Test Automation Guide", url = "https://www.notion.so/", type = "Notion")
public class TestRunner extends BaseTestData {

    TestCase testCase;

    public TestRunner(TestCase testCase) {
        this.testCase = testCase;
    }

    @Parameterized.Parameters
    public static TestCase[] getTestData() {
        TestSuite testSuite = readTestCases(testSuitePath);
        TestCase[] testCases = new TestCase[testSuite.getAdvancedCasesPaths().length];
        for (int i = 0; i < testCases.length; i++) {
            testCases[i] = readTestData(testSuite.getAdvancedCasesPaths()[i]);
        }
        return testCases;
    }

    @Test
    @DisplayName("")
    @Description("")
    public void dialogueTest() {
        super.setUpTestName(testCase.getTestCaseName());
        super.setUpTestDescription(testCase.getTestCaseDescription());

        for (int i = 0; i < testCase.getSteps().length; i++) {
            String stepName = testCase.getSteps()[i].getStepName();
            String input = testCase.getSteps()[i].getUserInput();
            String[] keywords = testCase.getSteps()[i].getResponseKeywords();
            String response = sendRequest(stepName, input)
                    .then()
                    .statusCode(200)
                    .extract()
                    .body()
                    .path("output").toString();
            assertResponseContainsKeywords(response, keywords);
        }
    }
}