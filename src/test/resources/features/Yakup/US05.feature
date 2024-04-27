@US05_Getland
Feature: US05 Admin customer ve manager kullanicilarini admin yapabilmeli ve silebilmeli
  Background:
  @US05_Getland1
  Scenario: TC01 Admin oluşturulan Customer kullanıcısını Admin yapabilmeli
    Given kullanici "http://getlandestate.com" gider
    When kullanici login butonuna tiklar
    And kullanıcı 2 saniye bekler.
    And admin kullanici email ve password bilgileri ile login olur
    And kullanıcı 2 saniye bekler.
    And Kullanıcılar Kısmına tıklanır
    And kullanıcı 2 saniye bekler.
    Then Daha önce belirlemiş olduğımuz Customer kullanıcsı arama kutusunda aratılır
    And kullanıcı 2 saniye bekler.
    And Düzenle seçeneğine tıklanır ve Customer kullanıcısının bilgileri görülür
    And kullanıcı 2 saniye bekler.
    And Roller kısmından Customer olan kişi rolü admin olarak güncellenir
    And kullanıcı 2 saniye bekler.
    And Güncelle butonuna tıklanır
    And kullanıcı 2 saniye bekler.
    And Kullanıcı türü başarıyla kaydedildi yazısı görülür
    And sayfayi kapatir

  @US05_Getland2
  Scenario: TC02 Admin oluşturulan Customer kullanıcısını silebilmeli
    Given kullanici "http://getlandestate.com" gider
    When kullanici login butonuna tiklar
    And kullanıcı 2 saniye bekler.
    And admin kullanici email ve password bilgileri ile login olur
    And kullanıcı 2 saniye bekler.
    And Kullanıcılar Kısmına tıklanır
    And kullanıcı 2 saniye bekler.
    Then Daha önce belirlemiş olduğımuz Customer 2 kullanıcsı arama kutusunda aratılır
    And kullanıcı 2 saniye bekler.
    And Sil seceneğine tıklanır ve Customer kullanıcı silinir
    And kullanıcı 2 saniye bekler.
   # And Kullanıcı türü başarıyla silindi yazısı görülür
  #  And sayfayi kapatir