@API
  Feature: API User Controller Testleri


    @APIAdmin  #scenarioların baslarına bu taglar muhakkak yazılmalı
      Scenario: TC01 | User Register Testi
      Given User Register icin URL duzenlenir
      And User Register icin payload duzenlenir
      When User Register icin POST request gonderilir ve Response alinir
      Then User Register icin Status kodunun 200 oldugu dogrulanir
      And User Register icin Response body dogrulanir

    @APIAdmin
    Scenario: TC02 | Get User Testi
      Given Get user icin URL duzenlenir
      And Get User icin expected data duzenlenir
      When Get User icin GET request gonderilir ve response alinir
      Then Get User icin Status kodunun 200 oldugu dogrulanır
      And Get User icin Response body dogrulanır

    @APICustomer
    Scenario: TC03 | Kendi hesabini silme testi
      Given Kendi hesabini silmek icin UrL duzenlenir
      When Kendi hesabini silmek icin DELETE request gonderilir ve response alinir
      Then Kendi hesabini silmek icin Status kodunun 200 oldugu dogrulanır


