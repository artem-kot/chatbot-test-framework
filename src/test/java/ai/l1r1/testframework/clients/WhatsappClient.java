package ai.l1r1.testframework.clients;

import ai.l1r1.testframework.pojo.whatsapp.WhatsappRequest;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.filter.Filter;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class WhatsappClient {
    public static final String whatsappUrl = "http://localhost:8043/whatsapp";

    private final Filter requestFilter = new RequestLoggingFilter();
    private final Filter responseFiler = new ResponseLoggingFilter();
    private final Filter allureLogger = new AllureRestAssured();

    public Response requestWhatsapp(WhatsappRequest request) {
        return RestAssured
                .with()
                .filters(requestFilter, responseFiler)
                .filters(allureLogger)
                .baseUri( whatsappUrl )
                .contentType(ContentType.JSON)
                .and()
                .body(request)
                .post();
    }
}
