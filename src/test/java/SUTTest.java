import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class SUTTest {
    @Test
    void shouldReturnAnswer() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("Ха-ха-ха-ха")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("Ха-ха-ха-ха"))
        ;
    }
}
