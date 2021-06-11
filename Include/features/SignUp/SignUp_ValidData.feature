@Feature
Feature: SignUp with Valid Data

  @Scenario
  Scenario: SignUp with Valid Data
    Given Click register button3
    When Enter username3
    And Enter Email3
    And Enter password3
    Then Tap register button3