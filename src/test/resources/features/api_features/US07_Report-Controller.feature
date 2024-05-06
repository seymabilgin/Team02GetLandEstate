@ApiUS07 @APIAdmin
  Feature: Deneme icin api
    Scenario:
      Given Get Report Controller icin URL düzenlenir
      And Get report icin gerekli expected data duzenlenır
      When Get report icin GET request gonderilir ve response alinir
      Then Get report icin Status kodunun 200 oldugu dogrulanır
      And Get report icin Response body dogrulanır