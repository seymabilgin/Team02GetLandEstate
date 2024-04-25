@US13
Feature: US13 Manager Randevu Testi
  @US13TC01
  Scenario: TC01 Verdigi ilanlara ait randevu isteklerini görebilmeli
    Given Ana sayfaya gidilir
    When Login butonuna tiklanir
    And E-mail ve password kismina gecerli veriler girilir ve login tiklanir
    And Dashboard kisminda Tour Requests tiklanir
    And Search boxa verdigi ilanin ismini girerek aratir
    Then Verdigi ilana ait tour requestlerin goruldugunu dogrular
    And sayfayi kapatir

  Scenario: TC02 Verdigi ilana ait randevu isteklerini red ve kabul edebilmeli
    Given Ana sayfaya gidilir
    When Login butonuna tiklanir
    And E-mail ve password kismina gecerli veriler girilir ve login tiklanir
    And Dashboard kisminda "back to site" tiklar
    And User kismindan "My Tour Requests" tiklar
    And Acilan menude "My Responses" tiklar
    And Bekleyen taleplerden ilkini onay resmine tiklayarak kabul eder
    Then İlana ait status kisminin "approved" olduğunu dogrular
    And Bekleyen 2.ilanı x kismina tiklayarak reddeder
    Then Reddettigi ilanın status kısmının "declined" oldugunu dogrular
    And sayfayi kapatir


