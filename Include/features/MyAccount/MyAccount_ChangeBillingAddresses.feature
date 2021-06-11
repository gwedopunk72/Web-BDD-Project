@Feature
Feature: Change billing address

  @Scenario
  Scenario: Change billing address
    Given Pilih menu my account
    When Pilih addresses
    And Pilih menu edit
    And Fill data
    Then Pilih save address