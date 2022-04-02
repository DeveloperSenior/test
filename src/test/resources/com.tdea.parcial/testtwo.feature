Feature: Test Two

  Scenario: Could select checkboxes
    Given Url "https://the-internet.herokuapp.com/checkboxes"
    When The component "checkboxes" and position 1
    Then Execute "checked"
