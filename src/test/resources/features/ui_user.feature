Feature: User Login

  @UiTest
  Scenario Outline: Login in user module
    Given As a user I Navigate to baseURL
    When I click on "Form Authentication"
    When Login with user "<username>" and "<password>"
    When I click on "Login" Button
    Then I should see "Secure Area"
    Examples:
      | username | password             |
      | tomsmith | SuperSecretPassword! |