package stepdefinitions;

import static io.restassured.RestAssured.given;

public class Main {

    public static void main(String[] args) {
        //Variables needed to log onto API

        String baseUri = "https://magento.abox.co.za/rest/V1/";
        String loginPath = "integration/admin/token";
        //String productCatalogPath = "products";
        String apiUserName = "training_api_user";
        String apiPassword = "PtkekYqgRZW8pCVN";
        String sessionToken;

        //get session token using rest assured framework

        sessionToken =
                given()
                        .baseUri(baseUri)
                        .basePath(loginPath)
                        .queryParam("username", apiUserName)
                        .queryParam("password", apiPassword)
                        .when()
                        .post()
                        .then()
                        .statusCode(200)
                        .extract()
                        .body().asString();

        System.out.println(sessionToken.toString());

    }
}
