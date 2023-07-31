import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.*;

public class JsonplaceholderGetTwoTest {

    private final String BASE_URL = "https://jsonplaceholder.typicode.com";
    private final String POSTS = "posts";

    @Test
    public void jsonplaceholderReadAllUsers(){

        Response response = given()
                .when()
                .get(BASE_URL + "/" + POSTS)
                .then()
                .statusCode(200)
                .extract()
                .response();
        JsonPath json = response.jsonPath();
        List<String> names = json.getList("title");
        assertEquals( 100, names.size());
    }

    @Test
    public void jsonplaceholderReadOneUser(){
        Response response = given()
                .when()
                .get(BASE_URL + "/" + POSTS + "/1")
                .then()
                .statusCode(200)
                .extract()
                .response();
        assertEquals( 200, response.statusCode());

        JsonPath json = response.jsonPath();
        assertEquals("sunt aut facere repellat provident occaecati excepturi optio reprehenderit", json.get("title"));


    }

    // Path Variables

    @Test
    public void jsonplaceholderReadOneUserWithPathVariable(){
        Response response = given()
                .pathParam("userId", 1)
                .when()
                .get(BASE_URL + "/" + POSTS + "/{userId}")
                .then()
                .statusCode(200)
                .extract()
                .response();
        assertEquals( 200, response.statusCode());

        JsonPath json = response.jsonPath();

        assertEquals("sunt aut facere repellat provident occaecati excepturi optio reprehenderit", json.get("title"));

        System.out.println(response.asString());
    }


}
