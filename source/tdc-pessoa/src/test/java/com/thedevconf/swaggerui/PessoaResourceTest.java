package com.thedevconf.swaggerui;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class PessoaResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/api/pessoa")
          .then()
             .statusCode(200);
    }

}