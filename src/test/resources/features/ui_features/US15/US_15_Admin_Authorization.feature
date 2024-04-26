@US15
Feature: US15 Admin islemleri senaryosu

  @US15TC01
  Scenario: TC01 Yeni kategori ve reklam turu olusturma, kullanici yonetimi ve kategori guncelleme/silme
    Given Kullanici siteye gider
    When Login butonuna tiklar
    And Email kismini doldurur
    And Password kismini doldurur
    And Categories kismina tiklar
    And Add new butonuna tiklar
    And Title kismini doldurur
    And Sequence kismini doldurur
    And Icon kismini doldurur
    And Active kismini isaretler
    And Create butonuna basar
    And Category Created alertini gorur ve kapatir
    And Dashboarddaki advert typesa tiklar
    And Add new butonuna tiklar
    And Title kismini doldurur2
    And Create butonuna tiklar2
    And Advert type created successfully mesajini gorur
    And Dashboarddaki Usersa tiklar
    And Arama kismini istenilen kisinin adıyla doldurur
    And Ilgili kisinin kalem butonuna basar
    And Telefon numarasinda bir degisiklik yapar
    And Roles kismindan manager secer
    And Update butonuna tiklar
    And User type save successfully mesajini gorur
    And Categories Kismina tiklar2
    And Arama kismini doldurur
    And Buyutec ikonuna tiklar ve aratir.
    And Ilgili Category'nin kalem ikonuna tiklar
    And Sequence kismini gunceller
    And Update butonuna tiklar
    And Category updated successfully mesajini gorur
    And Categories Kismina tiklar3
    And Arama kismini doldurur
    And Buyutec ikonuna tiklar ve aratir.
    And Ilgili Category'nin cop kutusu ikonuna tiklar
    And Are you sure you want to delete the category? yazisini gorur
    And YES butonuna tiklar
    And Category deleted successfully mesajini gorur
    And Dashboarddaki Tour Requestse tiklar
    And Sayfadaki tur isteklerini gorur
    Then Tarayiciyi kapatir

@US15TC02
  Scenario:TC02 Admin Advert Types kısmında oluşturduğu bir kategoriyi silebilmeli
    Given Kullanici siteye gider
    When Login butonuna tiklar
    And Email kismini doldurur
    And Password kismini doldurur
    And Dashboarddaki advert typesa tiklar
    And Olusturmus oldugu ilanı silme butonuna tiklar
    Then Tarayiciyi kapatir

  @US15TC03
  Scenario: TC03 Admin Categories eklerken title kısmını boş bırakmamalı
    Given Kullanici siteye gider
    When Login butonuna tiklar
    And Email kismini doldurur
    And Password kismini doldurur
    And Categories kismina tiklar
    And Add new butonuna tiklar
    And Sequence kismini doldurur
    And Icon kismini doldurur
    Then Butonun aktif olmadigini dogrular
    Then Tarayiciyi kapatir

    @US15TC04
    Scenario: TC04 Admin ''Users" kısmındaki bir Customer'in email'ini "abc@abc.com" Formatında güncellemeli.
      Given Kullanici siteye gider
      When Login butonuna tiklar
      And Email kismini doldurur
      And Password kismini doldurur
      And Dashboarddaki Usersa tiklar
      And Arama kismini istenilen kisinin adiyla doldurur2
      And Kisiyi gordugunu dogrular
      And Ilgili kisinin kalem butonuna basar
      And Email kismindaki veriyi degistirir
      Then Tarayiciyi kapatir







