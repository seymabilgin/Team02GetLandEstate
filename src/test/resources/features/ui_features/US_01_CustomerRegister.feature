
  Feature:US_01 Customer sayfaya kayıt olabilmelidir.

    Background:
      Given Ansayfaya gidilir.
      When Register  butonuna tıklanır.


    Scenario: First Name girmeli, bu alan boş geçildiğinde "First name is required" uyarı metni gelmeli
      When First Name kısmı bos bırakılır.
      And Last Name kısmına gecerli bir lastName girilir.
      But kullanıcı 2 saniye bekler.
      And Phone Number kısmına geçerli bir phone number girilir.
      And Email kısmına geçerli bir email girilir.
      And Enter Password kısmına geçerli password girilir.
      And Confirm Password kısmına password tekrar girilir.
      And I understand and agree to GetLandEstate' Terms of Use and Privacy Policy kutucugu tıklanır.
      But kullanıcı 2 saniye bekler.
      And REGISTER  butonuna tıklanır.
      But kullanıcı 2 saniye bekler.
      Then First Name bos bırakıldıgında First name is required uyarı metni cıktıgı dogrulanır.
      And sayfayi kapatir.



