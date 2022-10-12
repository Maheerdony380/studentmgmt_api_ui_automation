package smgmt.apiMethods;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class AddStudent {

    JSONObject payload = new JSONObject();

    // Make payload
    public void addStudent(String id, String firstName, String lastName, String nationality, String studentClass){


        payload.put("firstName", firstName);
        payload.put("id", id);
        payload.put("lastName", lastName);
        payload.put("nationality", nationality);
        payload.put("studentClass", studentClass);

        System.out.println(payload.toJSONString());
    }

    // Post Request
    @Test
    public void postStudent(String httpStatus){
        baseURI = "http://localhost:9080/studentmgmt";
        given().
                header("Content-Type","application/json").
                contentType(ContentType.JSON).
                accept(ContentType.JSON)
                .body(payload.toJSONString()).
                when().
                post("/addStudent").
                then().
                statusCode(Integer.parseInt(httpStatus));
    }
}
