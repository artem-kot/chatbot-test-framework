package ai.l1r1.testframework.pojo;

public class UserData {
    private String greeting;
    private String intention;
    private UserDataDetails details;

    public UserData() {
    }

    public UserData(String greeting, String intention, UserDataDetails details) {
        this.greeting = greeting;
        this.intention = intention;
        this.details = details;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getIntention() {
        return intention;
    }

    public void setIntention(String intention) {
        this.intention = intention;
    }

    public UserDataDetails getDetails() {
        return details;
    }

    public void setDetails(UserDataDetails details) {
        this.details = details;
    }
}
