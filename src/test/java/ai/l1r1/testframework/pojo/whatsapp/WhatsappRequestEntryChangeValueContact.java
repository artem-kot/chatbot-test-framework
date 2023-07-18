package ai.l1r1.testframework.pojo.whatsapp;

public class WhatsappRequestEntryChangeValueContact {
    private WhatsappRequestEntryChangeValueContactProfile profile;
    private String wa_id;

    public WhatsappRequestEntryChangeValueContact() {
    }

    public WhatsappRequestEntryChangeValueContact(WhatsappRequestEntryChangeValueContactProfile profile, String wa_id) {
        this.profile = profile;
        this.wa_id = wa_id;
    }

    public WhatsappRequestEntryChangeValueContactProfile getProfile() {
        return profile;
    }

    public void setProfile(WhatsappRequestEntryChangeValueContactProfile profile) {
        this.profile = profile;
    }

    public String getWa_id() {
        return wa_id;
    }

    public void setWa_id(String wa_id) {
        this.wa_id = wa_id;
    }
}
