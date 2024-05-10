@E2E
Feature :E2E User Controller Testi

  Scenario:TC01 | User Register Testi
    When First Name kısmına gecerli bir isim girilir.
    And Last Name kısmına gecerli bir lastName girilir.
    And Phone Number kısmına geçerli bir phone number girilir.
    And Email kısmına geçerli bir email girilir.
    And Enter Password kısmına geçerli password girilir.
    And Confirm Password kısmına password tekrar girilir.
    And I understand and agree to GetLandEstate' Terms of Use and Privacy Policy kutucugu tıklanır.
    And REGISTER  butonuna tıklanır.
    But kullanıcı 4 saniye bekler.
    Then Success yazısının görüldügü dogrulanır.

  @APIAdmin
  Scenario: TC02 | Get User Id Admin Testi
    Given Kayıtlı User Id bilgisi alinir
    Given Get user icin URL duzenlenir
    And Get User icin expected data duzenlenir
    When Get User icin GET request gonderilir ve response alinir
    Then Get User icin Status kodunun 200 oldugu dogrulanır
    And Get User icin Response body dogrulanır


  Scenario: Kayıtlı User Datasini Dogrulama Testi
    Given Database baglantisi kurulur
    And Beklenen User datasi duzenlenir
    When Kayitli User datasini almak icin query gonderilir
    Then Kayitli User datasi dogrulanir

  Scenario: TC05 | Kendi hesabini silme Testi
    Given Kendi hesabini silmek icin UrL duzenlenir
    When Kendi hesabini silmek icin DELETE request gonderilir ve response alinir
    Then Kendi hesabini silmek icin Status kodunun 200 oldugu dogrulanır