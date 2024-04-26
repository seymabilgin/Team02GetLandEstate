
Feature:US_09 Admin girilen ilanları aktif edebilmeli, reddedebilmeli, güncelleyebilmeli

  Background:
    Given Admin Anasayfaya gider
    When Admin sistemde oturum acar

  @TC01
  Scenario: Admin Ilanlar ile ilgili Arama yapabilmeli
    #Given Web sitesinin "Ilanlarim" bolümüne gidilir.
    And  Belirli kriterlere gore ilan aratilir.
    Then Adminin arama kriterleriyle eslesen ilanlarin listesini görüntüleyebildigi dogrulanir.
    And sayfayi kapatir.


  @TC02
  Scenario: Admin Ilanlar  ile ilgili "Activated" işlemini yapabilmeli
   # Given Web sitesinin "Ilanlarım" bolümüne gidilir.
    And  Pending olan ilanlar aratilir
    Then Adminin arama kriterleriyle eslesen ilanlarin listesini görüntüleyebildigi dogrulanir.
    And Listeden herhangi bir ilan seçilir.
    And Listede herhangi bir ilandaki "Pending" butonuna tiklanir.
    Then Ilanin artık aktif olarak isaretlendigi dogrulanir.
    And sayfayi kapatir.

  @TC03
  Scenario: Admin Ilanlar ile ilgili "Rejected"  islemini yapabilmeli
   # Given Web sitesinin "İlanlarim" bolümüne gidilir.
    And  Belirli kriterlere gore ilan aratilir.
    Then Adminin arama kriterleriyle eslesen ilanlarin listesini görüntüleyebildigi dogrulanir.
    And Listeden herhangi bir ilan seçilir.
    And Listeden secilen ilan icin red islemi yapilir
    Then Ilanin artık reddedildi olarak isaretlendigi dogrulanir.
    And sayfayi kapatir.

  @TC04
  Scenario: Admin Ilanlar ile ilgili "Update"  islemini yapabilmeli
    #Given Web sitesinin "İlanlarim" bolümüne gidilir.
    And  Belirli kriterlere gore ilan aratilir.
    Then Adminin arama kriterleriyle eslesen ilanlarin listesini görüntüleyebildigi dogrulanir.
    And Listeden herhangi bir ilan seçilir.
    And Listeden secilen ilanin bazı bilgileri degistirilerek secili reklam guncellenir
    And Yapilan degisiklikler kaydedilir
    Then Degisikliklerin ilan ayrintilarina yansitildigi dogrulanir.
    And sayfayi kapatir.