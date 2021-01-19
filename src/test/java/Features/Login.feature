Feature: Login Feature
  Scenario: Test Successful Login

    Given The user in HomePage
    And Clicks on FormAuthentication
    When The user Enters "tomsmith" in username field
    And The user Enters "SuperSecretPassword!" in password field
    And Clicks on Login Button
    Then User is Navigated to Secure Area


  Scenario: Bill Amount Generation
    Given I placed an order for following items
      |Cucumber Sandwich |2|20|
      |Cucumber Salad    |1|15|
    When I generate the bill
    Then a bill of $40 should be generated