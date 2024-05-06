@DB_US15
Feature: advert_types sutun isimlerini ve bilgilerini doğrulama
  Scenario: advert_types sutun isimlerini ve bilgilerini doğrulanır
    Given Database ile bağlantı kurulur
    Given advert_types sutun isimleri ve bilgileri almak icin query gonderilir
    Then advert_types sutun isimleri ve bilgileri dogrulanır
