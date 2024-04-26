@US19
Feature:US_19 Kullanıcılar sayfadan mesaj gönderebilmeli (Contact)

@US19_TC01
  Scenario:TC_01 Contact kısmına ulaşabilmeli ve mesaj gönderebilmelidir
    Given Kullanici sayfasina gidebilmeli
    When login butonuna tiklayabilmeli
    And email ve password bilgileri ile login olabilmeli
    And üst menüden Contact tıklanır
    Then  Açılan sayfada Have a question? yazısının görüldüğü test edilir
    And First Name  girilir
    And Last Name girilir
    And Email Addres girilir
    And Messsage girilir
    But captcha geçilir
 ##And sayfayı kapatır

@US19_TC02
  Scenario:TC_02 Contact kısmına ulaşabilmeli ve mesaj gönderebilmelidir
 Given kullanici sayfaya giderr
    And Contact yazısına tıklanır
    And  First Name  girilir(a)
    And Last Name girilir(bohem)
    And email kısmına bir deger girer
    And mesaj kısmına bir deger girer
    And im not a robot checkbox'ını işaretler
    And sent butonun aktif oldugunu dogrular

  @US19_TC03
  Scenario:TC_03 Contact kısmına ulaşabilmeli ve mesaj gönderebilmelidir
    Given kullanici sayfaya giderr
    And Contact yazısına tıklanır
    And  First Name  girilir(virgilio)
    And Last Name girilir(a)
    And email kısmına bir deger girer
    And mesaj kısmına bir deger girer
    And im not a robot checkbox'ını işaretler
    And sent butonun aktif oldugunu dogrular
    And sayfayı kapatır

  @US19_TC04
  Scenario:TC_04 Contact kısmına ulaşabilmeli ve mesaj gönderebilmelidir
    Given kullanici sayfaya giderr
    And Contact yazısına tıklanır
    And  First Name  girilir(virgilio)
    And Last Name girilirrrr(bohem)
    And email kısmına bir deger girerrr(abc@abccom)
    And mesaj kısmına bir deger girer
    And im not a robot checkbox'ını işaretler
    And sent butonun aktif oldugunu dogrular
  And sayfayı kapatır

















