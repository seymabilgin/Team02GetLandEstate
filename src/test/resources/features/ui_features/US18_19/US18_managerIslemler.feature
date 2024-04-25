@US018
Feature:US_18 Manager ilanlar ile ilgili işlemler yapabilmeli

  @US018_TC01
  Scenario:TC_01 Sayfadaki bir ilanı görmek için istekte bulunabilmeli

    Given Kullanici sayfasina gidilir
    When login butonuna tiklanır
    And email ve password bilgileri ile login olunur
    And Back to Site butonuna tiklanir
    And arama kutusuna istanbul yazılır ve aratılır
    And çıkan sonucun üzerine tıklanır
    And tour date ,tour time girilir
    And Submit a tour request butonuna tiklayarak randevu talebinde bulunulur
    Then "TourRequest created successfully" mesaji goruntulendigi dogrulanmalır


  Scenario:TC_02 Kendi verdiği ilanların gezme isteklerini görebilmeli, kabul edebilmeli ve reddedebilmeli

    Given Kullanici "http://www.getlandestate.com/" sayfasina gidilir
    When login butonuna tiklanır
    And email ve password bilgileri ile login olunur
    And Dashboard yazdıgı dogrulanır
    And Back to Site butonuna tiklanir
    And profil üzerinden MY TOUR REQUEST'e tıklanır
    And MY RESPONSES'e tıklanır
    And çıkan ekranda  doğru ilan olduğu doğrulanır
    And birincisini kabul edebilir
    Then ikincisini ret edebilir





















