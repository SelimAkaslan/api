package utilities;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;
import org.testng.annotations.Test;

public class TestBase {
    protected RequestSpecification spec01;
    protected RequestSpecification spec02;
    protected RequestSpecification spec03;
    @Before
    public void setup01(){
        spec01= new RequestSpecBuilder().
                setBaseUri("https://restful-booker.herokuapp.com/booking").
                build();

    }
    @Before
    public void setup02(){
        spec02= new RequestSpecBuilder().
                setBaseUri("https://restful-booker.herokuapp.com/booking").
                build();

    }
    @Before
    public void setup03(){
        spec03= new RequestSpecBuilder().
                setBaseUri("http://dummy.restapiexample.com/api/v1/employees").
                build();

    }
}
