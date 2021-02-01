package apiTekrar;

import io.restassured.response.Response;
import org.junit.Test;
import static io.restassured.RestAssured.*;
import static org.junit.Assert.*;
public class Get02 {
    @Test
    public void get01(){
        Response response = given().
                when().
                get("https://restful-booker.herokuapp.com/booking/");
        response.prettyPrint();
        System.out.println("status code" + response.getStatusCode());
        System.out.println("status line" + response.getStatusLine());
        System.out.println(response.getContentType());
        System.out.println(response.header("ContentType"));
        System.out.println(response.getHeaders());
    }
}