@APIUS12 @APIAdmin
Feature: API country-controller Testleri

    Scenario: API country-controller Testleri
      Given Get Country Controller icin URL düzenlenirr
      And Get country icin gerekli expected data duzenlenır
      When Get country icin GET request gonderilir ve response alinir
      Then Get country icin Status kodunun 200 oldugu dogrulanır
      Then Get country icin Response body dogrulanır

