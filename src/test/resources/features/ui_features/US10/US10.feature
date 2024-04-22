@US10
Feature: US10 Customer Kiralik Ilan Arama Testi

  @Setup
  Scenario: Setup
    Given kullanici sayfaya gider
    When login butonuna tiklar
    And email ve password bilgileri ile login olur

  @TC01
  Scenario: TC01 Search kısmından istediği emlağı seçip genel arama yapma islemi
    When Rent butonu tiklanir
    And Arama kismina aradigimiz emlak turu aratilir
    Then  Aranan emlak turleri goruntulendigi dogrulanir


  @TC02
  Scenario: TC02 Price Range, Advert Type, Category, Country, City, District bölümlerini girerek özel arama yapabilmeli
    When Price Range kismina istenilen fiyat araligi secilir
    And Advert Type kismina rent kismi secilir
    And Category butonundan istenilen emlak turu secilir
    And City butonunda istenilen ulke secilir
    And District butonuyla mahalle secilir
    Then Search butonuna tiklayarak ozel aranan emlak turleri goruntulendigi dogrulanir

  @TC03
  Scenario: TC03 Seçtiği emlak ile alakalı resim, Description, DETAILS, LOCATION bilgilerini görebilmeli
    Then Emlak turunun resmi goruntulendigi dorgulanmali
    And Emlak turunun Description bilgileri goruntulendigi dorgulanmali
    And Emlak turunun Details bilgileri goruntulendigi dorgulanmali
    And Emlak turunun Location bilgileri goruntulendigi dorgulanmali

  @TC04
  Scenario: TC04 İlanı verenin iletişim bilgilerini görebilmeli
    Then Ilan veren kisinin iletisim bilgileri goruntulendigi dorgulanmali
    And Gorunurluk butonuna tiklayarak telefon bilgileri goruntulendigi dorgulanmali
    And Gorunurluk butonuna tiklayarak mail bilgileri goruntulendigi dorgulanmali

  @TC05
  Scenario: TC05 Tarih ve saat girerek ilan için randevu isteğinde bulunabilmeli
    When Takvim butonunu tiklayarak tarih secilir
    And Saat butonunu tiklayarak saat secilir
    And "Submit a tour request"butonuna tiklayarak randevu talebinde bulunur
    Then "Created; TourRequest created successfully" mesaji goruntulendigi dogrulanmali

  @TC06
  Scenario: TC06 Randevu isteklerini görebilmeli
    When Kullanici profilinden "My tour request" e tiklayarak randevu sayfasina ulasir
    Then Kullanici istekte bulundugu randevulari goruntulendigi dogrulanir

  @TC07
  Scenario: TC07 Randevu isteği onaylandığında görebilmeli
    Then Kullanicinin randevu sayfasindan randevu isteginin onaylandigi dogrulanir

  @TC08
  Scenario: TC08 Randevu isteği reddedildiginde görebilmeli
    Then Kullanicinin randevu sayfasindan randevu isteginin reddedildigi dogrulanir
    And Sayfa kapatilir




