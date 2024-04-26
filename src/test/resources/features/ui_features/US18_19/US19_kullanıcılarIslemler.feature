@US19
Feature:US_19 Kullanıcılar sayfadan mesaj gönderebilmeli (Contact)

  Scenario:TC_01 Contact kısmına ulaşabilmeli ve mesaj gönderebilmelidir
    Given Kullanici "http://www.getlandestate.com/" sayfasina gidebilmeli
    When login butonuna tiklayabilmeli
    And email ve password bilgileri ile login olabilmeli
    And üst menüden Contact tıklanır
    Then  Açılan sayfada Have a question? yazısının görüldüğü test edilir
    And First Name  girilir
    And Last Name girilir
    And Email Addres girilir
    And Messsage girilir
    But captcha geçilir























