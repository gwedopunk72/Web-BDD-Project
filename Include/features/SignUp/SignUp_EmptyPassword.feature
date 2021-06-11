@Feature
Feature: SignUp with Empty Password

  @Scenario
  Scenario: SignUp with Empty Password
    Given Click register button2
    When Enter username2
    And Enter Email2
    And Enter empty password2
    Then Tap register button2