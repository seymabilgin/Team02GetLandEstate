@DB_US04
Feature: US02 | Contacts sutun isimlerini ve bilgilerini doğrulama
  Scenario: Contacts sutun isimlerini ve bilgilerini doğrulanır.
    Given Database ile bağlantı kurulur
    Given contacs sutun isimleri ve bilgileri almak icin query gonderilir
    Then  contacs sutun isimleri ve bilgileri dogrulanır