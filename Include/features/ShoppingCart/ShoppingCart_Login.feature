@Feature
Feature: Login untuk melakukan add chart

  @Scenario
  Scenario: Login sebelum purchase
    Given Membuka website
    When Klik menu Login
    And Input username
    And Input password
    Then Klik menu login