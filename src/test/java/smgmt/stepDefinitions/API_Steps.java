package smgmt.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import smgmt.apiMethods.AddStudent;
import smgmt.apiMethods.DeleteStudent;
import smgmt.apiMethods.GetStudent;
import smgmt.apiMethods.UpdateStudent;

public class API_Steps {
    // Create objects
    AddStudent addStudent = new AddStudent();
    GetStudent getStudent = new GetStudent();
    UpdateStudent updateStudent = new UpdateStudent();
    DeleteStudent deleteStudent = new DeleteStudent();

    // Make JSON payload to Create new student
    @Given("Add Student JSON payload with {string}, {string}, {string}, {string} and {string}")
    public void makeJsonPayload(String fName, String lName, String id, String cls, String country) {
        addStudent.addStudent(id, fName, lName, country, cls);
    }

    // Create new student request
    @Then("request with added JSON payload and check status code {string}")
    public void postRequestForAddNewStudent(String httpStatus) {
        addStudent.postStudent(httpStatus);
    }

    // Fetch student request
    @Given("Fetch student {string} with http status {string}")
    public void fetchStudent(String stId, String httpCode) {
        getStudent.fetchStudent(stId, httpCode);
    }

    // Update
    @Given("Update student {string}, {string}, {string}, {string} using {string} with http status {string}")
    public void updateStudent(String fName, String lName, String stClass, String country, String stId, String status) {
        updateStudent.putUpdate(fName,lName,stClass,country,stId,status);
    }

    // Delete student
    @Given("Delete student {string} with http status {string}")
    public void deleteStudent(String stId, String httpCode) {
        deleteStudent.deleteStudent(stId, httpCode);
    }
}
