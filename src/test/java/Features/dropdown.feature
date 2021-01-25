 Feature: Dropdown Feature
  @DropDownTag
  Scenario: Select one option from the dropdown
    Given Clicks on Dropdownoption page
    When The user selects "Option 1" from the dropdown
    Then "Option 1" is selected
