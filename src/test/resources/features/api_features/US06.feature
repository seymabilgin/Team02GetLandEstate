@APIUS06
Feature: API contact-controller Testleri

  @APICustomer @APIUS06TC01
  Scenario: TC01 | Post Contact-Controller Testi
    Given Post Contact-Controller icin URL duzenlenir
    And Post Contact-Controller icin payload duzenlenir
    When Post Contact-Controller icin POST request gonderilir ve Response alinir
    Then Post Contact-Controller icin Status kodunun 200 oldugu dogrulanir
    And Post Contact-Controller icin Response body dogrulanir

  @APIAdmin @APIUS06TC02
  Scenario: TC02 | Get Contact-Controller Testi
    Given Get Contact-Controller icin URL duzenlenir
    And Get Contact-Controller icin expected data duzenlenir
    When Get Contact-Controller icin GET request gonderilir ve response alinir
    Then Get Contact-Controller icin Status kodunun 200 oldugu dogrulanır
    And Get Contact-Controller icin Response body dogrulanır

  @APIAdmin @APIUS06TC03
  Scenario: TC03 | Patch Contact-Controller Testi
    Given Patch Contact-Controller icin URL duzenlenir
    And Patch Contact-Controller icin expected data duzenlenir
    When Patch Contact-Controller icin patch request gonderilir ve response alinir
    Then Patch Contact-Controller icin Status kodunun 200 oldugu dogrulanır
    And Patch Contact-Controller icin Response body dogrulanır

  @APIAdmin @APIUS06TC04
  Scenario: TC04 | Delete Contact-Controller Testi
    Given Kendi mesajini silmek icin UrL duzenlenir
    When Kendi mesajini silmek icin DELETE request gonderilir ve response alinir
    Then Kendi mesajini silmek icin Status kodunun 200 oldugu dogrulanır




