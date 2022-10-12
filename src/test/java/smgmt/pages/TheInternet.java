package smgmt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import smgmt.utils.TestBase;

public class TheInternet extends TestBase {

    // Form Authentication
    @FindBy(xpath = "//a[text()='Form Authentication']")
    private WebElement formAuthentication;

    // Username field
    @FindBy(name = "username")
    private WebElement usernamefield;

    // password field
    @FindBy(name = "password")
    private WebElement passwordField;

    //login button
    @FindBy(xpath = "//i[text()=' Login']")
    private WebElement loginButton;

    //page title
    @FindBy(xpath = "//h2")
    private WebElement loggedInPageTitle;

    // init elements
    public TheInternet(){
        PageFactory.initElements(driver, this);
    }

    // click on Form Authentication
    public void clickFormAuthentication(){
        formAuthentication.click();
    }

    // run login fields
    public void passLoginFields(String username, String password){
        usernamefield.sendKeys(username);
        passwordField.sendKeys(password);
    }

    // click on login button
    public void clickOnLogin(){
        loginButton.click();
    }

    // after login assert
    public void loginConfirmationAssert(String expectLoggedTitle){
        String actualTitle = loggedInPageTitle.getText();

        Assert.assertEquals(actualTitle, expectLoggedTitle);
    }
}
