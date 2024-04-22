@deneme4
Feature: US21 GetlandEstate sayfasında manager ilanlar ile ilgili yapılan işlemler

  Scenario: TC-01 Sayfadaki bir ilanı görmek için istekte bulunabilmeli

    Given Kullanici "http://www.getlandestate.com/" sayfasina gider
    When Sayfanin sag ust bolumundeki Login butonuna tiklayarak giris ekranina ulasir.
    But Kullanici ilgili alanlara Email ve Enter password bilgisini yazar ve giris yapar.
    And Acilan sayfada soldaki menuden ContactMessage'a tiklar.
    #And Liste halinde gelen mesajlarin oldugunu dogrular
    And Listeden random olarak bir mesaj istegine tiklar;okundu olarak isaretle ve silme islemlerinin oldugunu dogrular
    And Arama cubuguna filtrelemek istedigi sozcugu yazar ve sagdaki arama butonuna tiklayarak aramayi gerceklestirir
    And Filtreleme butonuna tiklayarak ilgili ekrana ulasir
    And Aratmak istedigi tarihleri girer ve sag usteki onay butonuna tiklar