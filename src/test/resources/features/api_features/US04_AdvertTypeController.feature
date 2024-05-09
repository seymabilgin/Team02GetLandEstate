@API_US04
Feature: US04 | Advert Type Controller Testleri

  @APIAdmin
  Scenario: TC01 | Advert Type Olusturma (Post)
    Given Advert Olusturma icin URL duzenlenir
    And Advert Olusturma icin payload duzenlenir
    When Advert Olusturma icin POST request gonderilir ve Response alinir
    Then Advert Olusturma icin Status kodunun 200 oldugu dogrulanir
    And Advert Olusturma icin Response body dogrulanir

  @APIAdmin
  Scenario: TC02 | Advert Type Cagirma (Get)
    Given Advert Cagirma icin URL duzenlenir
    And Advert Cagirma icin expected data duzenlenir
    When Advert Cagirma icin GET request gonderilir ve response alinir
    Then Advert Cagirma icin Status kodunun 200 oldugu dogrulanir
    And Advert Cagirma icin Response body dogrulanir

  @APIAdmin
  Scenario: TC03 | Advert Type Degistirme (Put)
    Given Advert Degistirme icin URL duzenlenir
    And Advert Degistirme icin payload duzenlenir
    When Advert Degistirme icin PUT request gonderilir ve response alinir
    Then Advert Degistirme icin Status kodunun 200 oldugu dogrulanir
    And Advert Degistirme icin Response body dogrulanir