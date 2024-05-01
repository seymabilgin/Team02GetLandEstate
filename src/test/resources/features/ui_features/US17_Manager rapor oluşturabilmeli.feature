@US17 @UITakesScreenShot
Feature: US17 Manager rapor olusturabilmeli

  Background:
    Given Url'e gidilir
    When Login butona tiklanir
    And Manager olarak login olunur
    And Reports butonuna tiklanir

  @US17TC01
  Scenario: TC01_01 Manager Adverts raporu olusturabilmeli
    When Adverts kismindaki secimler yapilir ve raporlama butonuna tiklanir
    Then Adverts Download dogrulamasi yapilir
    And Sayfa kapanir

  @US17TC01
  Scenario: TC01_02 Manager Most Popular Properties raporu olusturabilmeli
    When Most Popular Properties kismindaki Amount kısmına deger girilir ve raporlama butonuna tiklanir
    Then Most Popular Download dogrulamasi yapilir
    And Sayfa kapanir

  @US17TC01
  Scenario: TC01_03 Manager Users raporu olusturabilmeli
    When Users kisminda Manager rolu secili iken raporlama butonuna tiklanir
    Then Users Manager Download dogrulamasi yapilir
    And Sayfa kapanir

  @US17TC01
  Scenario: TC01_04 Manager Tour Request raporu olusturabilmeli
    When Tour Requests kismindaki secimler yapilir ve raporlama butonuna tiklanir
    Then Tour Request Download dogrulamasi yapilir
    And Sayfa kapanir

  @US17TC02
  Scenario: TC02 Manager eksik secim ile rapor olusturamamali (Negative)
    When Adverts kisminda yalniz Category kismi bos birakilarak raporlama butonuna tiklanır
    Then Adverts bos Catergory ile No Download dogrulamasi yapilir
    And Sayfa kapanir

  @US17TC03
  Scenario: TC03 Manager eksik secim ile rapor olusturamamali (Negative)
    When Adverts kisminda yalniz Advert Type kismi bos birakilarak raporlama butonuna tiklanır
    Then Adverts bos Advert Type ile No Download dogrulamasi yapilir
    And Sayfa kapanir

  @US17TC04
  Scenario: TC04 Manager yanlis deger girdiginde rapor olusturamamali (Negative)
    When Most Popular Properties kismindaki Amount a negatif deger girilir ve raporlama butonuna tiklanir
    Then Most Popular No Download dogrulamasi yapilir
    And Sayfa kapanir

  @US17TC05
  Scenario: TC05 Manager eksik secim ile rapor olusturamamali (Negative)
    When Tour Request kisminda yalniz Status kismi bos birakilarak raporlama butonuna tiklanır
    Then Tour Request bos Status ile No Download dogrulamasi yapilir
    And Sayfa kapanir