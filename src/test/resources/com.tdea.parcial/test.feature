Feature: test

  Scenario: should Be Before Six But After Zero
    Given Hour 4
    When The hour is 4
    Then The Day hour should be "Night"

  Scenario: should Be Before Twelve But After Six
    Given Hour 6
    When The hour is 6
    Then The Day hour should be "Morning"

  Scenario: should Be After Twelve But Before Eighteen
    Given Hour 13
    When The hour is 13
    Then The Day hour should be "Afternoon"

  Scenario: should Be After Eighteen
    Given Hour 19
    When The hour is 19
    Then The Day hour should be "Evening"

  Scenario: should No Range Twenty Four Hours
    Given Hour 30
    When The hour is 30
    Then The Day hour should be "Invalid hour"