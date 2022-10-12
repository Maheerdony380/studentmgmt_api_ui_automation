# studentmgmt_api_ui_automation

### Summary
API framework test APIs and UI

**Tool Stack:**
- **_Programming Language:_** Java
- **_Test Runner:_** Junit
- **_API Client:_** REST-Assured
- **_Build tool:_** Maven
- **_Reporting Tool:_** Allure

**Project Setup:**
- Install **Maven** and Import as Maven project in IntelliJ or Eclipse
- Install **Lombok** plugin within the IDE (IntelliJ or Eclipse)
- Add allure’s bin directory to system Path variable.

**Framework Structure:**
- **_reqquestBody:_** Dynamic request body for APIs
- **_stepDefination:_** Classes containing functions used in test cases
- **_utils:_**  Commonly used methods
- **_features:_** All test features commands
- **_custom.properties:_** All api endpoints

**Command to run all scenarios:**
   ```bash
     mvn clean test
   ```

**Report Generation and Open command: Allure**
   ```bash
    allure serve target/allure-results
   ```


**Maven Libraries:**
- **_cucumber-java:_** Cucumber BDD Java client
- **_cucumber-junit:_** Cucumber BDD JUnit client
- **_rest-assured:_** REST API test automation
- **_json-simple:_**  JSON data read library
- **_allure-cucumber4-jvm:_** Allure reporting library
- **_gson:_** Supporting library for data read
- **_commons-io:_**  Supporting library for common input output actions

