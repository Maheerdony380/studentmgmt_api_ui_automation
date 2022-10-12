package smgmt.apiMethods;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class DeleteStudent {

    // Delete Request
    @Test
    public void deleteStudent(String stId, String httpCode){
        JSONObject request = new JSONObject();
        request.put("id",Integer.parseInt(stId));

        baseURI = "http://localhost:9080/studentmgmt";
        given().
                header("Content-Type","application/json").
                contentType(ContentType.JSON).
                accept(ContentType.JSON)
                .body(request.toJSONString()).
                when().
                delete("/deleteStudent").
                then().
                statusCode(Integer.parseInt(httpCode));
    }
}
