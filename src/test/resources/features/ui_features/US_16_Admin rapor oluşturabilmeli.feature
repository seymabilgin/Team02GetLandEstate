@US16
Feature: US16 Admin rapor olusturabilmeli

  Background:
    Given Url'e gidilir
    When Login butonuna tiklanir
    And Admin olarak login olunur
    And Reports butonuna tiklanir


  Scenario: TC01 Admin rapor olusturabilmeli
    When Adverts kismindaki secimler yapilir ve raporlama butonuna tiklanir
    Then Download dogrulamasi yapilir
    When Most Popular Properties kismindaki Amount kısmına deger girilir ve raporlama butonuna tiklanir
    Then Download dogrulamasi yapilir
    When Users kisminda Admin rolu secili iken raporlama butonuna tiklanir
    Then Download dogrulamasi yapilir
    When Tour Requests kismindaki secimler yapilir ve raporlama butonuna tiklanir
    Then Download dogrulamasi yapilir
