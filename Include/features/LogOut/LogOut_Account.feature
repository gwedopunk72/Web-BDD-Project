@Feature
Feature: Test fitur Log out

  @Scenario
  Scenario: Test fitur Log out
    Given Klik menu My Account
    When Klik side menu Logout
    And Klik konfirmasi logout
    Then Account berhasil logout