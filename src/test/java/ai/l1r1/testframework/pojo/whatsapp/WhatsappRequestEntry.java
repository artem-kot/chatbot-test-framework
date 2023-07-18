package ai.l1r1.testframework.pojo.whatsapp;

public class WhatsappRequestEntry {
    private String id;
    private WhatsappRequestEntryChange[] changes;

    public WhatsappRequestEntry(String id, WhatsappRequestEntryChange[] changes) {
        this.id = id;
        this.changes = changes;
    }

    public WhatsappRequestEntry() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public WhatsappRequestEntryChange[] getChanges() {
        return changes;
    }

    public void setChanges(WhatsappRequestEntryChange[] changes) {
        this.changes = changes;
    }
}
