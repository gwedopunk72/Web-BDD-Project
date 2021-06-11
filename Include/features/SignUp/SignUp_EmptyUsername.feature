@Feature
Feature: SignUp with Empty Username

  @Scenario
  Scenario: SignUp with Empty Username
    Given Click register button1
    When Enter empty username1
    And Enter Email1
    And Enter password1
    Then Tap register button1