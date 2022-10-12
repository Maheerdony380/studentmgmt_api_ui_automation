package smgmt.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

// features and step defs connector
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "smgmt/stepDefinitions",
        dryRun = false

)

public class TestRunner extends AbstractTestNGCucumberTests {

}

