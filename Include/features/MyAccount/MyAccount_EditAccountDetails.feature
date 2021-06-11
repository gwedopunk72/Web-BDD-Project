@Feature
Feature: Change account details

  @Scenario
  Scenario: Change account details
    Given Pilih menu acount details
    When Edit first name
    And Edit last name
    Then Pilih save changes