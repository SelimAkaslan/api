package apiTekrar02;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class GetRequest05 {
    @Test
    public void get01(){
        Response response = given().
                            when().
                            get("https://demoqa.com/BookStore/V1/Books/");
        response.prettyPrint();
        response.then().
                assertThat().
                statusCode(200);
    }
    @Test
    public void get02(){
        Response res = given().
                when().
                get("https://demoqa.com/BookStore/V1/Books/");
        res.prettyPrint();
        res.then().
                assertThat().
                statusCode(200).
                contentType("application/json");

    }
}
