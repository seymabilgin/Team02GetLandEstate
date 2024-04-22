Feature: US13 Manager Randevu Testi
  Scenario: TC01
    Given Ana sayfaya gidilir
  When Login butonuna tiklanir
  And E-mail ve password kismina gecerli veriler girilir ve login tiklanir
  And Dashboard kisminda Tour Requests tiklanir
 And Search boxa verdigi ilanin ismini girerek aratir
  Then Verdigi ilana ait tour requestlerin goruldugunu dogrular