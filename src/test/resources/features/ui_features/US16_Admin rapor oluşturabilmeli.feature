@US16
Feature: US16 Admin rapor olusturabilmeli

  Background:
    Given Url'e gidilir
    When Login butonuna tiklanir
    And Admin olarak login olunur
    And Reports butonuna tiklanir

  @TC01
  Scenario: TC01_01 Admin Adverts raporu olusturabilmeli
    When Adverts kismindaki secimler yapilir ve raporlama butonuna tiklanir
    Then Adverts Download dogrulamasi yapilir
    And Sayfa kapanir

  @TC01
  Scenario: TC01_2 Admin Most Popular Properties raporu olusturabilmeli
    When Most Popular Properties kismindaki Amount kısmına deger girilir ve raporlama butonuna tiklanir
    Then Most Popular Download dogrulamasi yapilir
    And Sayfa kapanir

  @TC01
  Scenario: TC01_03 Admin Users raporu olusturabilmeli
    When Users kisminda Admin rolu secili iken raporlama butonuna tiklanir
    Then Users Download dogrulamasi yapilir
    And Sayfa kapanir

  @TC01
  Scenario: TC01_04 Admin Tour Request raporu olusturabilmeli
    When Tour Requests kismindaki secimler yapilir ve raporlama butonuna tiklanir
    Then Tour Request Download dogrulamasi yapilir
    And Sayfa kapanir

  @TC02
  Scenario: TC02 Admin eksik secim ile rapor olusturamamali (Negative)
    When Adverts kisminda yalniz Category kismi bos birakilarak raporlama butonuna tiklanır
    Then Adverts bos Catergory ile No Download dogrulamasi yapilir
    And Sayfa kapanir

  @TC03
  Scenario: TC03 Admin eksik secim ile rapor olusturamamali (Negative)
    When Adverts kisminda yalniz Advert Type kismi bos birakilarak raporlama butonuna tiklanır
    Then Adverts bos Advert Type ile No Download dogrulamasi yapilir
    And Sayfa kapanir

    @TC04
    Scenario: Admin yanlis deger girdiginde rapor olusturamamali (Negative)
      When Most Popular Properties kismindaki Amount a negatif deger girilir ve raporlama butonuna tiklanir
      Then Most Popular No Download dogrulamasi yapilir
      And Sayfa kapanir

  @TC05
  Scenario: TC05 Admin eksik secim ile rapor olusturamamali (Negative)
    When Tour Request kisminda yalniz Status kismi bos birakilarak raporlama butonuna tiklanır
    Then Tour Request bos Status ile No Download dogrulamasi yapilir
    And Sayfa kapanir