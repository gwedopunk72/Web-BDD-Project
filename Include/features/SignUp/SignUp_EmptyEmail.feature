@Feature
Feature: Sign Up new account with empty Email

  @Scenario
  Scenario: Sign Up new account with empty Email
    Given Open website
    When Click register button
    And Enter username
    And Enter empty Email
    And Enter password
    Then Tap register button