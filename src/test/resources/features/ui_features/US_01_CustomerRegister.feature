@US01-UI
  Feature:US_01 Customer sayfaya kayıt olabilmelidir.

    Background:
      Given Ansayfaya gidilir.
      When Register  butonuna tıklanır.

    @US01-UI-TC01
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

    @US01-UI-TC02
    Scenario:Last Name girmeli,bu alan boş geçildiğinde "Last name is required" uyarı metni gelmeli
      When First Name kısmına gecerli bir isim girilir.
      And Last Name kısmmı bos bırakılır.
      But kullanıcı 2 saniye bekler.
      And Phone Number kısmına geçerli bir phone number girilir.
      And Email kısmına geçerli bir email girilir.
      And Enter Password kısmına geçerli password girilir.
      And Confirm Password kısmına password tekrar girilir.
      And I understand and agree to GetLandEstate' Terms of Use and Privacy Policy kutucugu tıklanır.
      But kullanıcı 2 saniye bekler.
      And REGISTER  butonuna tıklanır.
      But kullanıcı 2 saniye bekler.
      Then Last Name bos bırakıldıgında Last name is required uyarı metni cıktıgı dogrulanır.
      And sayfayi kapatir.

    @US01-UI-TC03
    Scenario:Phone Number girmeli. Bu alan boş geçildiğinde "Invalid phone number" uyarı metni gelmeli
      When First Name kısmına gecerli bir isim girilir.
      And Last Name kısmına gecerli bir lastName girilir.
      But kullanıcı 2 saniye bekler.
      And Phone Number kısmı bos bırakılır.
      But kullanıcı 2 saniye bekler.
      Then Phone Number kısmı bos bırakıldıgında Invalid phone number uyarı metni cıktıgı dogrulanır.
      And sayfayi kapatir.

    @US01-UI-TC04
    Scenario:Email girmeli, bu alan boş geçildiğinde "Email is required" uyarı metni gelmeli
      When First Name kısmına gecerli bir isim girilir.
      And Last Name kısmına gecerli bir lastName girilir.
      But kullanıcı 2 saniye bekler.
      And Phone Number kısmına geçerli bir phone number girilir.
      And Email kısmı bos bırakılır.
      But kullanıcı 2 saniye bekler.
      Then Email kısmı bos bırakıldıgında Email is required uyarı metni cıktıgı dogrulanır.
      And sayfayi kapatir.

    @US01-UI-TC05
    Scenario:Email adresi abc@abc.com formatında olmalı, @ ve . işareti kullanılmadan girilen email adreslerinde "Invalid email" uyarı metni gelmeli.
      When Email kısmına @ ve . olmadan mail yazılır.
      But kullanıcı 2 saniye bekler.
      Then Email kısmına gecersiz formatda email yazıldıgında Invalid email uyarı  metni cıktıgı dogrulanır.
      And sayfayi kapatir.


    @US01-UI-TC06
    Scenario:Email adresi abc@abc.com formatında olmalı, @ ve . işareti kullanılmadan girilen email adreslerinde "Invalid email" uyarı metni gelmeli.
      When Email kısmına . olmadan mail yazılır.
      But kullanıcı 2 saniye bekler.
      Then Email kısmına gecersiz formatda email yazıldıgında Invalid email uyarı  metni cıktıgı dogrulanır.
      And sayfayi kapatir.


    @US01-UI-TC07
    Scenario:Password girmeli, bu alan boş geçildiğinde "Password is required" uyarı metni gelmeli.
      When Enter Password kısmı bos bırakılır.
      But kullanıcı 2 saniye bekler.
      Then Enter Password kısmı bos bırakıldıgında  Password is required uyarı metni cıktıgı dogrulanır.

    @US01-UI-TC08
    Scenario:Password en az 8 karakterden oluşmalıdır. Büyük harf, küçük harf, rakam ve özel karakter içermelidir.
      When Enter Password kısmına 8 karakterden az karakter girilir.
      But kullanıcı 2 saniye bekler.
      Then At least 8 characters uyarı metni cıktıgı dogrulanır.

    @US01-UI-TC09
    Scenario:Password en az 8 karakterden oluşmalıdır. Büyük harf, küçük harf, rakam ve özel karakter içermelidir.
      When Enter Password kısmına  büyük harf kullanmadan  karakter girilir
      But kullanıcı 2 saniye bekler.
      Then One uppercase char uyarı metni cıktıgı dogrulanır.

    @US01-UI-TC10
    Scenario:Password en az 8 karakterden oluşmalıdır. Büyük harf, küçük harf, rakam ve özel karakter içermelidir.
      When Enter Password kısmına  kucuk harf kullanmadan  karakter girilir
      But kullanıcı 2 saniye bekler.
      Then One lowercase char uyarı metni cıktıgı dogrulanır.

    @US01-UI-TC11
    Scenario:Password en az 8 karakterden oluşmalıdır. Büyük harf, küçük harf, rakam ve özel karakter içermelidir.
      When Enter Password kısmına rakam kullanmadan  karakter girilir
      But kullanıcı 2 saniye bekler.
      Then One  number uyarı metni cıktıgı dogrulanır.

    @US01-UI-TC12
    Scenario:Password en az 8 karakterden oluşmalıdır. Büyük harf, küçük harf, rakam ve özel karakter içermelidir.
      When Enter Password kısmına özel karakter kullanmadan  karakter girilir
      But kullanıcı 2 saniye bekler.
      Then One special character uyarı metni cıktıgı dogrulanır.

    @US01-UI-TC13
    Scenario: Confirm Password girmeli, bu alan boş geçildiğinde "Confirm password is required" uyarı metni gelmeli.
      When Confirm Password kısmı bos bırakılır.
      But kullanıcı 2 saniye bekler.
      Then Confirm Password kısmı bos bırakıldıgında Confirm password is required uyarı metni cıktıgı dogrulanır.

    @US01-UI-TC14
    Scenario:Tüm bilgiler doldurulmadan ve "I understand and agree to PrettierHomes' Terms of Use and Privacy Policy" checkbox tıklanmadan Register butonu tıklanabilir olmamalı
      When I understand and agree to GetLandEstate' Terms of Use and Privacy Policy kutucugu bos bırakılır.
      But kullanıcı 2 saniye bekler.
      Then I understand and agree to PrettierHomes' Terms of Use and Privacy Policy checkbox tıklanmadan Register butonu tıklanabilir olmadıgı dogrulanır.

    @US01-UI-TC15
    Scenario:Kayıt tamamlandığında "Success" mesajı alınmalı.
      When First Name kısmına gecerli bir isim girilir.
      And Last Name kısmına gecerli bir lastName girilir.
      And Phone Number kısmına geçerli bir phone number girilir.
      And Email kısmına geçerli bir email girilir.
      And Enter Password kısmına geçerli password girilir.
      And Confirm Password kısmına password tekrar girilir.
      And I understand and agree to GetLandEstate' Terms of Use and Privacy Policy kutucugu tıklanır.
      And REGISTER  butonuna tıklanır.
      Then Success yazısının görüldügü dogrulanır.



