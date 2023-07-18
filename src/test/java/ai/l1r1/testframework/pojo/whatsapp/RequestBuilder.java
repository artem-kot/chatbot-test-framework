package ai.l1r1.testframework.pojo.whatsapp;

import org.apache.commons.lang3.RandomStringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RequestBuilder {
    public WhatsappRequest build(String input) {
        String name = "Test_" + (int) (Math.random() * 1_000_000);
        String userPhone = "4912345678901";
        String laraPhone = "4912345678900";
        String laraPhoneId = "108197845313542";
        String entryId = "8" + (long) (Math.random() * 1_000_000_000_000_000L);
        String messageId = "wamid." + RandomStringUtils.randomAlphabetic(15);
        String timestamp = new SimpleDateFormat("HHmmssSSSS").format(new Date());
        String messagingProduct = "whatsapp";

        WhatsappRequestEntryChangeValueMessageText text = new WhatsappRequestEntryChangeValueMessageText(input);
        WhatsappRequestEntryChangeValueContactProfile profile = new WhatsappRequestEntryChangeValueContactProfile(name);
        WhatsappRequestEntryChangeValueMetadata metadata = new WhatsappRequestEntryChangeValueMetadata(laraPhone, laraPhoneId);
        WhatsappRequestEntryChangeValueMessage message = new WhatsappRequestEntryChangeValueMessage(userPhone, messageId, timestamp, text, "text");
        WhatsappRequestEntryChangeValueContact contact = new WhatsappRequestEntryChangeValueContact(profile, userPhone);
        WhatsappRequestEntryChangeValueContact[] contacts = {contact};
        WhatsappRequestEntryChangeValueMessage[] messages = {message};
        WhatsappRequestEntryChangeValue value = new WhatsappRequestEntryChangeValue(messagingProduct, metadata, contacts, messages);
        WhatsappRequestEntryChange[] changes = {new WhatsappRequestEntryChange(value, "messages")};
        WhatsappRequestEntry[] entry = {new WhatsappRequestEntry(entryId, changes)};
        return new WhatsappRequest("whatsapp_business_account", entry);
    }
}