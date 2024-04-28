@DB
  Feature: User Data Dogrulama
    Scenario: Kayıtlı User Datasini Dogrulama Testi
      Given Database baglantisi kurulur
      And Beklenen User datasi duzenlenir
      When Kayitli User datasini almak icin query gonderilir
      Then Kayitli User datasi dogrulanir
