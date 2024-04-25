Feature:US_03 Customer profile bilgilerini görebilmeli ve güncelleyebilmeli
Background:
  Given Web sitesine gidilir
  When Login linkini tıklar
  And Email geçerli bilgi girilir
  And Enter password gecerili bilgi girilir
  And LOGIN butonu tıklanır
  And Profil tıklanır
  And My Profile tıklanır



  @TC01
  Scenario:Customer profile bilgilerini görebilmeli ve güncelleyebilmel
   And İsmini Aysegul olarak değiştirir
    And Soyismini Gull olarak değiştirir
    And Telefon numarasını 5303405061 olarak değiştirir
    And Email adresini aysegul@gul.com olarak değiştirir
    And Update butonu tıklanır
    Then Customer olarak profil bilgilerini değiştirdiği test edilir


  @TC02
  Scenario:Customer profile bilgilerini görebilmeli  password bilgilerini değiştirebilmeli
  And Chance Password tıklanır
  And Current Pasword kısmına mevcut şifre girilir
  And New Password kısmına yeni şifre girilir
  And Confirm Password kısmına yeni şifre tekrar girilir
  And Change butonu tıklanır
  Then Customer olarak pasword bilgilerini değiştirdiği test edilir


  @TC03
  Scenario:Customer profile bilgilerini görebilmeli  ve profil resmi ekleyebilmeli
  And Profile Photo tıklanır
  And Select tıklanır
  And Photograf seçilir
  And Done butonu tıklanır
  And Save butonu tıklanır
  Then Customer olarak profil resmi eklenebildiği test edilir


  @TC04
  Scenario:Customer profile bilgilerini görebilmeli  ve hesabını silebilmeli
  And Delete Account tıklanır
  And Enter your password pasword bilgileri girilir
  And Delete Account butonu tıklanır
  And Yes butonu tıklanır
  Then Customer olarak hesabını silebildiği test edilir