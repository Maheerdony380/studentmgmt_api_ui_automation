package smgmt.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import smgmt.utils.TestBase;

public class Hooks extends TestBase {

    // global hooks
    @Before("@UiTest")
    public void setup(){
        initDriver();
    }

    // after tests
    @After("@UiTest")
    public void down(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // close browser
        driver.quit();
    }
}
