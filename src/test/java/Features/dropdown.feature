Feature: Dropdown Feature
  @Dropdowntag
  Scenario Outline: Select one option from the dropdown
    Given The user in HomePage
    And Clicks on Dropdownoption
    When The user selects "<Dropdownoptiontoselect>" from the dropdown
    Then "<Dropdownoptiontoselect>" is selected

    Examples:
    |Dropdownoptiontoselect|
    |Option 1               |
    |Option 2               |