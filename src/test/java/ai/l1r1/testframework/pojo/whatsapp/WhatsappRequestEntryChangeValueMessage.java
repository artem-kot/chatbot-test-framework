package ai.l1r1.testframework.pojo.whatsapp;

public class WhatsappRequestEntryChangeValueMessage {
    private String from;
    private String id;
    private String timestamp;
    private WhatsappRequestEntryChangeValueMessageText text;
    private String type;

    public WhatsappRequestEntryChangeValueMessage() {
    }

    public WhatsappRequestEntryChangeValueMessage(String from, String id, String timestamp, WhatsappRequestEntryChangeValueMessageText text, String type) {
        this.from = from;
        this.id = id;
        this.timestamp = timestamp;
        this.text = text;
        this.type = type;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public WhatsappRequestEntryChangeValueMessageText getText() {
        return text;
    }

    public void setText(WhatsappRequestEntryChangeValueMessageText text) {
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
