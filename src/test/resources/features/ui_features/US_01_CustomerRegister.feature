
  Feature:US_01 Customer sayfaya kayıt olabilmelidir.

    Background:
      Given Ansayfaya gidilir.
      When Register  butonuna tıklanır.


      Scenario: First Name girmeli, bu alan boş geçildiğinde "First name is required" uyarı metni gelmeli
        When Last Name kısmına gecerli bir isim girilir.
        And Phone Number kısmına geçerli bir phone number girilir.
        And Email kısmına geçerli bir email girilir.
        And Enter Password kısmına geçerli password girilir.
        And Confirm Password kısmına password tekrar girilir.
        And "I understand and agree to GetLandEstate' Terms of Use and Privacy Policy" kutucugu tıklanır.
        And REGISTER  butonuna tıklanır.
        Then First Name bos bırakıldıgında "First name is required" uyarı metni cıktıgı dogrulanır.
        And sayfayi kapatir.




