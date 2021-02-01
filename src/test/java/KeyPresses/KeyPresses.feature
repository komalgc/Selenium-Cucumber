Feature TestInput Field with Key Presses
  @KeyPress
  Scenario: successfultest for Key Presses
    Given You are on Input Page
    When You send "A"
    And You send "BACK_SPACE"
    Then You get a message You entered: "BACK_SPACE"