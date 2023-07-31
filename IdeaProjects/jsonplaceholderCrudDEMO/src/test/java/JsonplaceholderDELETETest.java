import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class JsonplaceholderDELETETest {

    @Test
    public void jsonplacholderDeleteUser(){
        given()
                .when()
                .delete("https://jsonplaceholder.typicode.com/posts/1")
                .then()
                .statusCode(200)
                .extract()
                .response();
    }

}
