package apiTekrar;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class Get01 {
    @Test
    public void get01(){
        given().
                when().
                get("https://restful-booker.herokuapp.com/booking/").
                then().
                assertThat().
                statusCode(200);
    }
}
