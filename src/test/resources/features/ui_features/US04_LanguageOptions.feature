@US04_Getland
Feature: US04 Admin olarak Dil Secimi Testi
  Background:
  @US04_Getland1
  Scenario: TC01 Kullanıcı Admin olarak sayfayı 5 farklı dilde görüntülüyebilmeli
    Given kullanici "http://getlandestate.com" gider
    When kullanici login butonuna tiklar
    And kullanici email ve password bilgileri ile login olur
    And Back To Site butonuna tiklar
   # But kullanici sayfada 2 saniye bekler
    Then sayfa dilinin default olarak ingilizce oldugunu dogrular
    And Turkce dil secenegini secer ve sayfa dilinin Turkce oldugunu dogrular
   #  But kullanici sayfada 2 saniye bekler
    And Francais dil secenegini secer ve sayfa dilinin Francais oldugunu dogrular
   #  But kullanici sayfada 2 saniye bekler
    And Deutsch dil secenegini secer ve sayfa dilinin Deutsch oldugunu dogrular
   #  But kullanici sayfada 2 saniye bekler
    And Espanol dil secenegini secer ve sayfa dilinin Espanol oldugunu dogrular
    # But kullanici sayfada 2 saniye bekler
  And sayfayi kapatir

  @US04_Getland2


  Scenario: TC02 Kullanıcı Manager olarak sayfayı 5 farklı dilde görüntülüyebilmeli
    Given kullanici "http://getlandestate.com" gider
    When kullanici login butonuna tiklar
    And kullanici email ve password bilgileri ile manager olarak login olur
    And Back To Site butonuna tiklar
   # But kullanici sayfada 2 saniye bekler
    Then sayfa dilinin default olarak ingilizce oldugunu dogrular
    And Turkce dil secenegini secer ve sayfa dilinin Turkce oldugunu dogrular
   # But kullanici sayfada 2 saniye bekler
    And Francais dil secenegini secer ve sayfa dilinin Francais oldugunu dogrular
   # But kullanici sayfada 2 saniye bekler
    And Deutsch dil secenegini secer ve sayfa dilinin Deutsch oldugunu dogrular
   # But kullanici sayfada 2 saniye bekler
    And Espanol dil secenegini secer ve sayfa dilinin Espanol oldugunu dogrular
   # But kullanici sayfada 2 saniye bekler
  And sayfayi kapatir

  @US04_Getland3


  Scenario: TC03 Kullanıcı Customer olarak sayfayı 5 farklı dilde görüntülüyebilmeli
    Given kullanici "http://getlandestate.com" gider
    When kullanici login butonuna tiklar
    And kullanici email ve password bilgileri ile customer olarak login olur
    And Back To Site butonuna tiklar
   # But kullanici sayfada 2 saniye bekler
    Then sayfa dilinin default olarak ingilizce oldugunu dogrular
    And Turkce dil secenegini secer ve sayfa dilinin Turkce oldugunu dogrular
   # But kullanici sayfada 2 saniye bekler
    And Francais dil secenegini secer ve sayfa dilinin Francais oldugunu dogrular
   # But kullanici sayfada 2 saniye bekler
    And Deutsch dil secenegini secer ve sayfa dilinin Deutsch oldugunu dogrular
   # But kullanici sayfada 2 saniye bekler
    And Espanol dil secenegini secer ve sayfa dilinin Espanol oldugunu dogrular
   # But kullanici sayfada 2 saniye bekler
    And sayfayi kapatir