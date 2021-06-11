@Feature
Feature: SignIn Empty username

  @Scenario
  Scenario: SignIn Empty username
    Given Open browser duniakeris
    When Click login button
    And Enter empty username
    And Enter for password
    Then Tap login button