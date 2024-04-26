@US14
Feature: US14 Manager Randevu Testi

  Background:
    Given Ana sayfaya gidilir
    When Login butonuna tiklanirSU
    And E-mail ve password kismina gecerli veriler girilir ve login tiklanir

  @US14TC01
  Scenario: TC01 Kendine ait olmayan bir ilan icin randevu olusturabilmeli
    And Dashboard kisminda back to site tiklarr
    And  SearchBoxta randevu olusturmak istedigi ilanin aramasini yapar
    And Sonuclardan ilkine tiklar
    And Acilan sayfada Schedule a tour kisminda tarih girer
    And Schedule a tour kisminda saat secer
    And Submit a tour Request tiklar
    Then Created TourRequest created successfully yazisinin ciktigini dogrular
    And User menusunden My tour requests tiklar
    And Acilan menude My Requests tiklar
    Then Olusturdugu requestin sayfada goruldugunu dogrular
    And sayfayi kapatir


  @US14TC02
  Scenario: TC02 Oluşturduğu randevunun kabul veya reddedildiğini görebilmeli
    And Dashboard kisminda back to site tiklar
    And User kismindan My Tour Requests tiklar
    And Acilan menude My Requests tiklar
    Then  Olusturdugu requestin Declined oldugunu dogrular
    Then Olusturdugu requestin Approved oldugunu dogrular
    And sayfayi kapatir

