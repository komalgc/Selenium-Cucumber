Feature: Login Feature
  Scenario: Test Successful Login

    Given The user in HomePage
    And Clicks on FormAuthentication
    When The user Enters "tomsmith" in username field
    And The user Enters "SuperSecretPassword!" in password field
    And Clicks on Login Button
    Then User is Navigated to Secure Area