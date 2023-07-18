package ai.l1r1.testframework.pojo.whatsapp;

public class WhatsappRequestEntryChangeValue {
    private String messaging_product;
    private WhatsappRequestEntryChangeValueMetadata metadata;
    private WhatsappRequestEntryChangeValueContact[] contacts;
    private WhatsappRequestEntryChangeValueMessage[] messages;

    public WhatsappRequestEntryChangeValue() {
    }

    public WhatsappRequestEntryChangeValue(String messaging_product, WhatsappRequestEntryChangeValueMetadata metadata, WhatsappRequestEntryChangeValueContact[] contacts, WhatsappRequestEntryChangeValueMessage[] messages) {
        this.messaging_product = messaging_product;
        this.metadata = metadata;
        this.contacts = contacts;
        this.messages = messages;
    }

    public String getMessaging_product() {
        return messaging_product;
    }

    public void setMessaging_product(String messaging_product) {
        this.messaging_product = messaging_product;
    }

    public WhatsappRequestEntryChangeValueMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(WhatsappRequestEntryChangeValueMetadata metadata) {
        this.metadata = metadata;
    }

    public WhatsappRequestEntryChangeValueContact[] getContacts() {
        return contacts;
    }

    public void setContacts(WhatsappRequestEntryChangeValueContact[] contacts) {
        this.contacts = contacts;
    }

    public WhatsappRequestEntryChangeValueMessage[] getMessages() {
        return messages;
    }

    public void setMessages(WhatsappRequestEntryChangeValueMessage[] messages) {
        this.messages = messages;
    }
}
