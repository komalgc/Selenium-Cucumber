Feature: TestInput Field with Key Presses
  @KeyPress
  Scenario: successfultest for Key Presses
    Given You are on Input Page
    When You send "A"
    Then  You get a message "You entered: BACK_SPACE"

    @Pivalue
    Scenario: successfulTest Pi Test
      Given You are on Input Page
      When You send Pi Value
      Then it should pass the Pi value in the field
