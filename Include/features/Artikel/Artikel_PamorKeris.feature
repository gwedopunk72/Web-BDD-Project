@Feature
Feature: Menu Artikel Pamor Keris

  @Scenario
  Scenario: Cek Menu Artikel Pamor Keris
    Given Klik SubMenu Pamor Keris
    When Klik artikel Sejarah Pamor Keris
    And Klik artikel Pamor Miring
    And Klik artikel Pamor Akhodiyat
    And Klik artikel Asal Bahan Pamor
    Then Kembali ke menu utama2