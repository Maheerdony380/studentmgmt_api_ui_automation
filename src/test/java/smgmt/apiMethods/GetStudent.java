package smgmt.apiMethods;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetStudent {

    // Get Request
    @Test
    public void fetchStudent(String stId, String httpStatus){
        baseURI = "http://localhost:9080/studentmgmt";

        given().
                get("/fetchStudents?id="+ Integer.parseInt(stId)).
                then().
                statusCode(Integer.parseInt(httpStatus)).
                body("[0].id",equalTo(Integer.parseInt(stId)));
    }
}
