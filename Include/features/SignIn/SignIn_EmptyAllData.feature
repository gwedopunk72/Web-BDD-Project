@Feature
Feature: SignIn Empty All Data

  @Scenario
  Scenario: SignIn Empty All Data
    Given Click login button2
    When Enter empty username2
    And Enter empty password22
    Then Tap login button2