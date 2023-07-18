package ai.l1r1.testframework.pojo.testrunner;

public class TestSuite {
    String[] advancedCasesPaths;

    public TestSuite() {
    }

    public TestSuite(String[] testCasePaths) {
        this.advancedCasesPaths = testCasePaths;
    }

    public String[] getAdvancedCasesPaths() {
        return advancedCasesPaths;
    }

    public void setAdvancedCasesPaths(String[] advancedCasesPaths) {
        this.advancedCasesPaths = advancedCasesPaths;
    }
}
