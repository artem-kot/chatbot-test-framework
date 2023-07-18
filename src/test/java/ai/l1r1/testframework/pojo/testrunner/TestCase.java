package ai.l1r1.testframework.pojo.testrunner;

public class TestCase {
    private String testCaseName;
    private String testCaseDescription;
    private TestStep[] steps;

    public TestCase() {
    }

    public TestCase(String testCaseName, String testCaseDescription, TestStep[] steps) {
        this.testCaseName = testCaseName;
        this.testCaseDescription = testCaseDescription;
        this.steps = steps;
    }

    public String getTestCaseName() {
        return testCaseName;
    }

    public void setTestCaseName(String testCaseName) {
        this.testCaseName = testCaseName;
    }

    public String getTestCaseDescription() {
        return testCaseDescription;
    }

    public void setTestCaseDescription(String testCaseDescription) {
        this.testCaseDescription = testCaseDescription;
    }

    public TestStep[] getSteps() {
        return steps;
    }

    public void setSteps(TestStep[] steps) {
        this.steps = steps;
    }
}
