@Feature
Feature: Remove item from shopping cart

  @Scenario
  Scenario: Remove item dari shopping cart
    Given Pilih menu continue shopping
    When Pilih menu view cart
    And Remove item dari cart
    Then Item keris terhapus