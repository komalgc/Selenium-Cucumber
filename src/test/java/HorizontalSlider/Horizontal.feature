Feature: test Horizontal slider
 @Slider
  Scenario: slide the slider to value 4
    Given the user is on the Horizontalslider page
    When slide the slider to right till the value is "4"
    Then slide is moved