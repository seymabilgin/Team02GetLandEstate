Feature:US_03 Customer profile bilgilerini görebilmeli ve güncelleyebilmeli
Background:
  Given Web sitesine gidilir
  When Login linkini tiklar






  @TC0001
  Scenario:Customer profile bilgilerini görebilmeli ve güncelleyebilmeli
    And Email gecerli bilgi girilir
    And Enter password geçerli bilgi girilir
    And LOGIN butonu tiklanir
    And Profil tıklanır
    And My Profile tıklanır
    And İsmini değiştirir
    And Soyismini değiştirir
    And Telefon numarasını değiştirir
    And Update butonu tıklanır
    Then Customer olarak profil bilgilerini değiştirdiği test edilir


  @TC0002
  Scenario:Customer profile bilgilerini görebilmeli  password bilgilerini değiştirebilmeli
    And Email gecerli bilgi girilir
    And Enter password geçerli bilgi girilir
    And LOGIN butonu tiklanir
    And Profil tıklanır
    And My Profile tıklanır
    But kullanıcı 2 saniye bekler.
    And Chance Password tıklanır
    And Current Pasword kısmına mevcut şifre girilir
    And New Password kısmına yeni şifre girilir
    And Confirm Password kısmına yeni şifre tekrar girilir
    And Change butonu tıklanır
    Then Customer olarak password bilgilerini değiştirdiği test edilir


  @TC0003
  Scenario:Customer profile bilgilerini görebilmeli  ve profil resmi ekleyebilmeli
    And Email gecerli bilgi girilir
    And Yeni Enter password gecerli bilgi girilir
    And LOGIN butonu tiklanir
    And Profil tıklanır
    And My Profile tıklanır
    And Profile Photo tıklanır
    And Select tıklanır
    And Photograf seçilir
    And Done butonu tıklanır
    But kullanıcı 2 saniye bekler.
    And Save butonu tıklanır
    Then Customer olarak profil resmi eklenebildiği test edilir


  @TC0004
  Scenario:Customer profile bilgilerini görebilmeli  ve hesabını silebilmeli
    And Email gecerli bilgi girilir
    And Yeni Enter password gecerli bilgi girilir
    And LOGIN butonu tiklanir
    And Profil tıklanır
    And My Profile tıklanır
    And Delete Account tıklanır
    And Yeni Enter password gecerli bilgi girilir
    And Delete Account butonu tıklanır
    But kullanıcı 2 saniye bekler.
    And Yes butonu tıklanır
    But kullanıcı 2 saniye bekler.
    Then Customer olarak hesabını silebildiği test edilir