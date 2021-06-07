package org.kavi.svc.license;

import org.testng.annotations.Test;
import utils.BaseTest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class LicenseTests extends BaseTest {

    @Test
    public void sendAListRequestAndValidateResponse() {
        given()
                .when()
                .auth().basic("", "")//input username/password
                .get(getBaseUrl() + "/licenses")
                .then()
                .statusCode(200)
                .body("[0].name", notNullValue())
                .body("[0].key", equalTo("agpl-3.0"));
    }
}
