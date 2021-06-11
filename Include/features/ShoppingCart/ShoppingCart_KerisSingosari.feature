@Feature
Feature: Purchasing keris

  @Scenario
  Scenario: Pembelian keris singosari
    Given Pilih lihat semua produk
    When Pilih menu keris Langka
    And Pilih keris Singosari
    Then Pilih add cart