
@API_US08 @APIAdmin
Feature: API Log Controller Testleri


  Scenario: TC01 | Get Log Controller testi
  Given Get Log Controller için URL düzenlenir
    And Get Log Controller gerekli expected data duzenlenır
    When GetLog Controller GET request gonderilir ve response alinir
    Then GetLog Controller Status kodunun 200 oldugu dogrulanır
    And Get Log Controller Response body dogrulanır
