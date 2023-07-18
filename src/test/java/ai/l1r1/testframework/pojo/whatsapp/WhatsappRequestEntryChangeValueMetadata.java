package ai.l1r1.testframework.pojo.whatsapp;

public class WhatsappRequestEntryChangeValueMetadata {
    private String display_phone_number;
    private String phone_number_id;

    public WhatsappRequestEntryChangeValueMetadata() {
    }

    public WhatsappRequestEntryChangeValueMetadata(String display_phone_number, String phone_number_id) {
        this.display_phone_number = display_phone_number;
        this.phone_number_id = phone_number_id;
    }

    public String getDisplay_phone_number() {
        return display_phone_number;
    }

    public void setDisplay_phone_number(String display_phone_number) {
        this.display_phone_number = display_phone_number;
    }

    public String getPhone_number_id() {
        return phone_number_id;
    }

    public void setPhone_number_id(String phone_number_id) {
        this.phone_number_id = phone_number_id;
    }
}
