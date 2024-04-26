Feature:US_03 Customer profile bilgilerini görebilmeli ve güncelleyebilmeli
Background:
  Given Web sitesine gidilir
  And Profile tıklanır
  And Logout tiklanir
  When Login linkini tıklar






  @TC0001
  Scenario:Customer profile bilgilerini görebilmeli ve güncelleyebilmel
    And Email geçerli bilgi girilir
    And Enter password gecerli bilgi girilir
    And LOGIN butonu tıklanır
    And Profil tıklanır
    And My Profile tıklanır
    And İsmini Aysegul olarak değiştirir
    And Soyismini Gull olarak değiştirir
    And Telefon numarasını 5303405061 olarak değiştirir
    And Email adresini aysegul@gul.com olarak değiştirir
    And Update butonu tıklanır
    Then Customer olarak profil bilgilerini değiştirdiği test edilir


  @TC0002
  Scenario:Customer profile bilgilerini görebilmeli  password bilgilerini değiştirebilmeli
    And Yeni email geçerli bilgi girilir
    And Enter password gecerli bilgi girilir
    And LOGIN butonu tıklanır
    And Profil tıklanır
    And My Profile tıklanır
    And Chance Password tıklanır
    And Current Pasword kısmına mevcut şifre girilir
    And New Password kısmına yeni şifre girilir
    And Confirm Password kısmına yeni şifre tekrar girilir
    And Change butonu tıklanır
    Then Customer olarak password bilgilerini değiştirdiği test edilir


  @TC0003
  Scenario:Customer profile bilgilerini görebilmeli  ve profil resmi ekleyebilmeli
    And Yeni email geçerli bilgi girilir
    And Yeni Enter password gecerli bilgi girilir
    And LOGIN butonu tıklanır
    And Profil tıklanır
    And My Profile tıklanır
    And Profile Photo tıklanır
    And Select tıklanır
    And Photograf seçilir
    And Done butonu tıklanır
    And Save butonu tıklanır
    Then Customer olarak profil resmi eklenebildiği test edilir


  @TC0004
  Scenario:Customer profile bilgilerini görebilmeli  ve hesabını silebilmeli
    And Yeni email geçerli bilgi girilir
    And Yeni Enter password gecerli bilgi girilir
    And LOGIN butonu tıklanır
    And Profil tıklanır
    And My Profile tıklanır
    And Delete Account tıklanır
    And Yeni email geçerli bilgi girilir
    And Delete Account butonu tıklanır
    And Yes butonu tıklanır
    Then Customer olarak hesabını silebildiği test edilir