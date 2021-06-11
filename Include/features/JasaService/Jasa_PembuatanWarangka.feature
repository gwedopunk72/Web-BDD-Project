@Feature
Feature: Test Case Menu Jasa Service

  @Scenario
  Scenario: Cek Menu jasa pembuatan warangka
    Given Klik menu jasa pembuatan warangka
    When Cek konten halaman
    Then Kembali ke menu home1