package ai.l1r1.testframework.pojo.testrunner;

public class TestStep {
    private String stepName;
    private String userInput;
    private String[] responseKeywords;

    public TestStep(String stepName, String userInput, String[] responseKeyWords) {
        this.stepName = stepName;
        this.userInput = userInput;
        this.responseKeywords = responseKeyWords;
    }

    public TestStep() {
    }

    public String getStepName() {
        return stepName;
    }

    public void setStepName(String stepName) {
        this.stepName = stepName;
    }

    public String getUserInput() {
        return userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    public String[] getResponseKeywords() {
        return responseKeywords;
    }

    public void setResponseKeywords(String[] responseKeywords) {
        this.responseKeywords = responseKeywords;
    }
}
