@US_08
Feature:US_08 Manager verdiği ilanları görebilmeli, güncelleyebilmeli ve silebilmelidir

  Background:
    Given Manager Anasayfaya gider
    When Manager sistemde oturum acar

  @TC01
  Scenario: Manager verdigi ilanlari görebilmeli
    Given Web sitesinde myAdverts bolümüne gidilir.
    Then Managerin ilanlarinin listesini gorebildigi dogrulanir.
    And Listeden ilanlardan birini secer.
    Then Managerin sectigi ilanin ayrintilarini goruntuleyebildigi dogrulanir
    And sayfayi kapatir.


  @TC02
  Scenario: Manager verdiği ilanlar ile ilgili Date Published, Status ve View-Like-Tour bilgilerini görebilmeli
    Given Web sitesinin "İlanlarım" bolümüne gidilir.
    Then Managerin ilanlarinin  listesini görebildigi dogrulanir.
    And Managerin verdigi ilanlar ile ilgili Date Published, Status ve View-Like-Tour dahil olmak Uzere secilen ilanin ayrintilarini goruntuleyebildigi dogrulanir
    And sayfayi kapatir.

  @TC03
  Scenario: Manager verdiği ilanları güncelleyebilmeli
    Given Web sitesinin "İlanlarim" bolümüne gidilir.
    Then Managerin ilanlarinin listesini gorebildigi dogrulanir.
    And Listeden ilanlardan birini secer.
    Then Managerin sectigi ilanin ayrintilarini goruntuleyebildigi dogrulanir
    And Bazı bilgileri ( başlık, açıklama, fiyat vb.) güncelleyerek ilanı düzenleyin.
    And Değişiklikleri kaydedin.
    Then Değişikliklerin ilan ayrıntılarına yansıtıldığını doğrulayın.
    And sayfayi kapatir.

  @TC04
  Scenario: Manager verdiği ilanları güncelleyebilmeli
    Given Web sitesinin "İlanlarim" bolümüne gidilir.
    Then Managerin ilanlarinin listesini gorebildigi dogrulanir.
    And Listeden ilanlardan birini secer.
    Then Managerin sectigi ilanin ayrintilarini goruntuleyebildigi dogrulanir
    And Bazı ilanlar silinir.
    Then İlanin artik Managerin ilanlar listesinde görünmedigini dogrulayin.
    And sayfayi kapatir.