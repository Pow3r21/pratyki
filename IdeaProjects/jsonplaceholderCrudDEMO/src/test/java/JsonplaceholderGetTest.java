import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.*;

public class JsonplaceholderGetTest {

    // GIVEN - konfiguracja
    // WHEN - wysyłanie requestu
    // THEN - asercja

    @Test
    public void jsonplaceholderReadAllUsers(){

        Response response = given()
                .when()
                .get("https://jsonplaceholder.typicode.com/posts");

        assertEquals( 200, response.statusCode());
        JsonPath json = response.jsonPath();

        List<String> title = json.getList("title");

        assertEquals( 100, title.size());
    }

    @Test
    public void jsonplaceholderReadOneUser(){
        Response response = given()
                .when()
                .get( "https://jsonplaceholder.typicode.com/posts/1");
        assertEquals( 200, response.statusCode());

        JsonPath json = response.jsonPath();

        assertEquals("sunt aut facere repellat provident occaecati excepturi optio reprehenderit", json.get("title"));



        System.out.println(response.asString());
    }

    // Path Variables

    @Test
    public void jsonplaceholderReadOneUserWithPathVariable(){
        Response response = given()
                .pathParam("userId", 1)
                .when()
                .get("https://jsonplaceholder.typicode.com/posts/{userId}");

        assertEquals( 200, response.statusCode());

        JsonPath json = response.jsonPath();

        assertEquals("sunt aut facere repellat provident occaecati excepturi optio reprehenderit", json.get("title"));



        System.out.println(response.asString());
    }


}
