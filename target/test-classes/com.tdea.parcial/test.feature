Feature: test

  Scenario: should Be Before Six But After Zero
    Given Hour 4
    When The hour is 4
    Then The Day hour should be "Night"