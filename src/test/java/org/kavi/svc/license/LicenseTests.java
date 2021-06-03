package org.kavi.svc.license;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class LicenseTests {
    private static final String BASE_URL = "https://api.github.com";

    @Test
    public void sendAListRequestAndValidateResponse() {
        given()
                .when()
                //.auth().basic("", "") basic authentication - Not required for this End Point
                .get(BASE_URL + "/licenses")
                .then()
                .statusCode(200)
                .body("[0].name", notNullValue())  // Make sure it is not null
                .body("[0].key", equalTo("agpl-3.0"));  // Verify that agpl-3.0 is supported
//        Assert.assertEquals(response.getStatusCode(), 200);
    }
}
