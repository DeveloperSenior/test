Feature: Test Three

  Scenario: Forgot Password
    Given The Url "https://the-internet.herokuapp.com/forgot_password"
    When The email is "andresfescobar92@gmail.com"
    Then Retrieve password
