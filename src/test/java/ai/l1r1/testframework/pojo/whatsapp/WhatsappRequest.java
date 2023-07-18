package ai.l1r1.testframework.pojo.whatsapp;

public class WhatsappRequest {
    private String object;
    private WhatsappRequestEntry[] entry;

    public WhatsappRequest() {
    }

    public WhatsappRequest(String object, WhatsappRequestEntry[] entry) {
        this.object = object;
        this.entry = entry;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public WhatsappRequestEntry[] getEntry() {
        return entry;
    }

    public void setEntry(WhatsappRequestEntry[] entry) {
        this.entry = entry;
    }
}
