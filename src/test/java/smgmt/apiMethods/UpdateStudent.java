package smgmt.apiMethods;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class UpdateStudent {

    // Update Request
    @Test
    public void putUpdate(String fName, String lName, String stClass, String country, String stId, String status){
        JSONObject request = new JSONObject();
        request.put("firstName",fName);
        request.put("id",stId);
        request.put("lastName",lName);
        request.put("nationality",country);
        request.put("studentClass",stClass);

        baseURI = "http://localhost:9080/studentmgmt";
        given().
                header("Content-Type","application/json").
                contentType(ContentType.JSON).
                accept(ContentType.JSON)
                .body(request.toJSONString()).
                when().
                put("/updateStudent").
                then().
                statusCode(Integer.parseInt(status));
    }
}
