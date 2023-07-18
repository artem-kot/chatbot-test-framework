package ai.l1r1.testframework.pojo.whatsapp;

public class WhatsappRequestEntryChange {
    private WhatsappRequestEntryChangeValue value;
    private String field;

    public WhatsappRequestEntryChange() {
    }

    public WhatsappRequestEntryChange(WhatsappRequestEntryChangeValue value, String field) {
        this.value = value;
        this.field = field;
    }

    public WhatsappRequestEntryChangeValue getValue() {
        return value;
    }

    public void setValue(WhatsappRequestEntryChangeValue value) {
        this.value = value;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
