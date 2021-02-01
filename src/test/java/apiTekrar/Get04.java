package apiTekrar;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

import static io.restassured.RestAssured.*;
public class Get04 {
    /*
      2)When I send a GET request to REST API URL
       https://restful-booker.herokuapp.com/booking/5
        Then HTTP Status Code should be 200
        And response content type is "application/JSON"
        And "firstname" should be "Jim",
        And "totalprice" should be 602
       And "checkin" should be "2015-06-12"

    */

    @Test
    public void get01(){
        Response response = given().
                when().
                get("https://restful-booker.herokuapp.com/booking/3");
        response.
                then().
                assertThat().
                statusCode(200).
                contentType("application/json").
                body("firstname", equalTo("Sally"),
                        "lastname",equalTo("Smith"),
                        "totalprice", equalTo("484"),
                        "depositpaid",equalTo(true),
                        "bookingdates.checkin",equalTo("2016-09-04"),
                        "booking.checkout", equalTo("2017-07-04"));
    }
}
