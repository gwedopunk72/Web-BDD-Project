@Feature
Feature: Test Case Menu Informasi

  @Scenario
  Scenario: Cek Menu informasi Profil Kami
    Given Klik menu profil kami
    When Cek title halaman1
    Then Kembali ke menu awal1