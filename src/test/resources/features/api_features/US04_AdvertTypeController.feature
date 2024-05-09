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

  @APIAdmin
  Scenario: TC03 | Advert Type Degistirme (Put)