@Feature
Feature: Menu Artikel Wayang

  @Scenario
  Scenario: Menu Artikel Wayang
    Given Klik SubMenu Artikel Wayang
    When Klik artikel RadenHanoman
    And Klik artikel ResiSubali
    And Klik artikel Ramaparasu
    And Klik artikel BambangSumantri
    Then Kembali ke menu utama3