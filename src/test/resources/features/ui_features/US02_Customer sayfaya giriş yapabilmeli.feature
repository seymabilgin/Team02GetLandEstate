Feature:US_02 Customer sayfaya giriş yapabilmeli


  Background:

    Given Web sitesine gidilir
    When Login linkini tiklar




  @TC001
  Scenario:Customer sayfaya giris yapabilmeli
    And Email gecerli bilgi girilir
    And Enter password geçerli bilgi girilir
    And LOGIN butonu tiklanir
    Then Customer olarak sayfaya giris yapildigi test edilir


  @TC002
  Scenario:Customer olarak gecerli olmayan email ile sayfaya giris yapilamamali
  And Emaila gecerli olmayan bilgi girilir
  And Enter password geçerli bilgi girilir
  And LOGIN butonu tiklanir
  Then Customera olarak sayfaya giris yapilamadigi test edilir


  @TC003
  Scenario:Customer olarak gecerli olmayan email ile sayfaya giris yapilamamali
    And Emailb gecerli olmayan bilgi girilir
    And Enter password geçerli bilgi girilir
    And LOGIN butonu tiklanir
    Then Customerb olarak sayfaya giris yapilamadigi test edilir



  @TC004
  Scenario:Customer olarak "Enter password" linki bos birakildiginda sayfaya giris yapilamamali
    And Enter password alani bos birakilir
    And Email gecerli bilgi girilir
    And LOGIN butonu tiklanir
    But  kullanıcı 3 saniye bekler.
    Then Customerc olarak sayfaya giris yapilamadigi test edilir



  @TC005
  Scenario:Customer olarak "Email" ve "Enter password" linki bos birakildiginda sayfaya giris yapilamamali
    And Email alani bos birakilir
    And Enter password alanı bos birakilir
    And LOGIN butonu tiklanir
    Then Customerd olarak sayfaya giris yapilamadigi test edilir
