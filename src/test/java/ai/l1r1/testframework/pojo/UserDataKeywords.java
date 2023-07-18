package ai.l1r1.testframework.pojo;

public class UserDataKeywords {

    private String[] greeting;
    private String[] intention;
    private String[] details;
    private String[] name;
    private String[] phone;
    private String[] address;
    private String[] positions;
    private String[] positionsAdd;
    private String[] summary;
    private String[] result;

    public UserDataKeywords() {
    }

    public UserDataKeywords(String[] greeting, String[] intention, String[] details, String[] name, String[] phone, String[] address, String[] positions, String[] positionsAdd, String[] summary, String[] result) {
        this.greeting = greeting;
        this.intention = intention;
        this.details = details;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.positions = positions;
        this.positionsAdd = positionsAdd;
        this.summary = summary;
        this.result = result;
    }

    public String[] getGreeting() {
        return greeting;
    }

    public void setGreeting(String[] greeting) {
        this.greeting = greeting;
    }

    public String[] getIntention() {
        return intention;
    }

    public void setIntention(String[] intention) {
        this.intention = intention;
    }

    public String[] getDetails() {
        return details;
    }

    public void setDetails(String[] details) {
        this.details = details;
    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public String[] getPhone() {
        return phone;
    }

    public void setPhone(String[] phone) {
        this.phone = phone;
    }

    public String[] getAddress() {
        return address;
    }

    public void setAddress(String[] address) {
        this.address = address;
    }

    public String[] getPositions() {
        return positions;
    }

    public void setPositions(String[] positions) {
        this.positions = positions;
    }

    public String[] getPositionsAdd() {
        return positionsAdd;
    }

    public void setPositionsAdd(String[] positionsAdd) {
        this.positionsAdd = positionsAdd;
    }

    public String[] getSummary() {
        return summary;
    }

    public void setSummary(String[] summary) {
        this.summary = summary;
    }

    public String[] getResult() {
        return result;
    }

    public void setResult(String[] result) {
        this.result = result;
    }
}
