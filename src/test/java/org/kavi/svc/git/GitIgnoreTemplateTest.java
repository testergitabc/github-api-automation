package org.kavi.svc.git;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTest;

import static io.restassured.RestAssured.given;


public class GitIgnoreTemplateTest  extends BaseTest {
    @Test
    public void testGitIgnoreTemplateResponse() {
        String result =  given()
                .when()
                .get(getBaseUrl() + "/gitignore/templates")
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .body().asString();
        Assert.assertTrue(result.contains("Java"));

    }
}
