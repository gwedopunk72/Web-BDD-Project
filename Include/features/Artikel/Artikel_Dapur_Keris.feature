@Feature
Feature: Menu Artikel Dapur Keris

  @Scenario
  Scenario: Cek Menu Artikel Dapur Keris
    Given Klik SubMenu Dapur Keris
    When Klik artikel Keris Brojol
    And Klik artikel Dapur keris luk 9
    And Klik artikel Dapur Keris Lurus
    And Klik artikel Apa Itu Dapur Keris
    Then Kembali ke menu utama1