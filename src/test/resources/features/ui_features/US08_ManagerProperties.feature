@US_08
Feature:US_08 Manager verdiği ilanları görebilmeli, güncelleyebilmeli ve silebilmelidir
  Background:
    Given Manager Anasayfaya gider
    When Manager olarak login olunur
    When Adverts  butonuna tiklanir

  @TC01
  Scenario: TC01 Manager ilanlari  ve ilanlardaki Date Published, Status , View-Like-Tour bilgilerini gorebilmeli
    Then Manager olarak ilanlarin goruntulendigi dogrulanir
    Then Manager ilanlarda Date Published bilgisi goruntulendigi dogrulanir
    Then Manager ilanlarda Status bilgisi goruntulendigi dogrulanir
    Then Manager ilanlarda View-Like-Tour bilgisi goruntulendigi dogrulanir
    And Sayfa kapatilir

  Scenario: TC02 Manager bir ilani silebilmeli

    And Silinecek ilan search yapilir
    And Ilan uzerindeki cop kutusu butonuna tiklanir
    And Yes butonuna tiklanir
    Then Ilanin delete edilebildigi dogrulanir
    And Sayfa kapatilir


  Scenario: TC03 Manager bir ilani update edebilmeli

    And kullanici kalem ikonuna tiklanir
    And Acilan Edit sayfasinda Title ve sluq a datalar girilir
    And Update butonuna tiklanir
    Then Advert update successfully goruntulendigi dogrulanir
    And Sayfa kapatilir

