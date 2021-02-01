package apiTekrar;

import io.restassured.response.Response;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Get03 {
    /*
    Positive Scenario:
 When Asagidaki Endpoint'e bir GET request yollayalim
 https://restful-booker.herokuapp.com/booking/7
 And Accept type "application/json" mi?
 Then
 HTTP Status Code 200
 And Response format "application/json"
 And firstname "Susan"
 And lastname "Wilson"
 And checkin date "2016-07-13"
 And checkout date "2016-12-15"*/
    @Test
    public void get01(){
        Response response= given().
                accept("application/json").
                when().
                get("https://restful-booker.herokuapp.com/booking/7");
        response.then().assertThat().
                statusCode(200).
                contentType("application/json").
                body("firstname", Matchers.equalTo("Jim")).
                body("lastname",Matchers.equalTo("Jackson")).
                body("totalprice", Matchers.equalTo(214)).
                body("depositpaid", Matchers.equalTo(false));

    }
    @Test
    public void get02(){
        Response response= given().
                when().
                get("https://restful-booker.herokuapp.com/booking/1001");
        response.then().assertThat().statusCode(404);

    }
}
