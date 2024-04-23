Feature:US_02 Customer sayfaya giriş yapabilmeli


  Background:
    Given Web sitesine gidilir
    When Login linkini tiklar




  @TC01
  Scenario:Customer sayfaya giris yapabilmeli
    And Email gecerli bilgi girilir
    And Enter password geçerli bilgi girilir
    And LOGIN butonu tiklanir
    Then Customer olarak sayfaya giris yapildigi test edilir


  @TC02
  Scenario:Customer olarak gecerli olmayan email ile sayfaya giris yapilamamali
  And Email gecerli olmayan bilgi girilir
  And Enter password gecerli bilgi girilir
  And LOGIN butonu tiklanir
  Then Customer olarak sayfaya giris yapilamadigi test edilir


  @TC03
  Scenario:Customer olarak gecerli olmayan email ile sayfaya giris yapilamamali
    And Email gecerli olmayan bilgi girilir
    And Enter password gecerli bilgi girilir
    And LOGIN butonu tiklanir
    Then Customer olarak sayfaya giris yapilamadigi test edilir



  @TC04
  Scenario:Customer olarak "Enter password" linki bos birakildiginda sayfaya giris yapilamamali
    And Email gecerli bilgi girilir
    And Enter password alani bos birakilir
    And LOGIN butonu tiklanir
    Then Customer olarak sayfaya giris yapilamadigi test edilir



  @TC05
  Scenario:Customer olarak "Email" ve "Enter password" linki bos birakildiginda sayfaya giris yapilamamali
    And Email alani bos birakilir
    And Enter password alanı bos birakilir
    And LOGIN butonu tiklanir
    Then Customer olarak sayfaya giris yapilamadigi test edilir
