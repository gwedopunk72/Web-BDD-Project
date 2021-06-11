@Feature
Feature: Menu Artikel TosanAji

  @Scenario
  Scenario: Cek Menu Artikel TosanAji
    Given Open site duniakeris
    When Klik menu Artikel
    And Klik artikel keris bali
    And Klik artikel jenis keris
    And Klik artikel Besalen
    And Klik artikel keris rucah
    Then Kembali ke menu utama