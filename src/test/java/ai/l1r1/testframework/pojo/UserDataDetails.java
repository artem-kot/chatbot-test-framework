package ai.l1r1.testframework.pojo;

public class UserDataDetails {

    private String date;
    private String name;
    private String phone;
    private String address;
    private String[] positions;
    private String summary;

    public UserDataDetails() {
    }

    public UserDataDetails(String date, String name, String phone, String address, String[] positions, String summary) {
        this.date = date;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.positions = positions;
        this.summary = summary;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String[] getPositions() {
        return positions;
    }

    public void setPositions(String[] positions) {
        this.positions = positions;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
