@Feature
Feature: SignIn Empty Password

  @Scenario
  Scenario: SignIn Empty Password
    Given Click login button1
    When Enter username1
    And Enter empty password1
    Then Tap login button1