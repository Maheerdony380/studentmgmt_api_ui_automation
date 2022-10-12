package smgmt.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import smgmt.pages.TheInternet;

public class UI_Steps {
    TheInternet theInternet = new TheInternet();

    @Given("As a user I Navigate to baseURL")
    public void iNavigateToBaseUrl() {
    }

    // click on form auth list
    @When("I click on {string}")
    public void iClickOn(String listName) {
        theInternet.clickFormAuthentication();
    }

    // fill login fields
    @When("Login with user {string} and {string}")
    public void loginWithCreds(String username, String password) {
        theInternet.passLoginFields(username, password);
    }

    // click on login button
    @When("I click on {string} Button")
    public void iClickOnButton(String login) {
        theInternet.clickOnLogin();
    }

    // after login validation
    @Then("I should see {string}")
    public void iShouldSee(String title) {
        theInternet.loginConfirmationAssert(title);
    }
}
