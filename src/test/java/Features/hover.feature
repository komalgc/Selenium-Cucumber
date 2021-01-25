Feature: Hover test
  @HoverTag
  Scenario: testSuccessful hover and get title
    Given Click on HoverPage
    When The user Hovers on figure "1"
    Then Caption is Displayed
    And The title is "name: user1"
    And The link text is "View Profile"