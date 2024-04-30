@US12
Feature:US12 Emlak Arama ve Detayları Görüntüleme

  Background:
    Given Kullanici siteye gider
  @US12TC01
    Scenario Outline: TC01 Kullanici (Sayfaya Kayit olmayan) satilik ve kiralik ilan arayabilmeli
    When Arama kismindeki Rent secenegine tiklar
    And Arama kismindeki House secenegine tiklar
    And Arama alanina bir "Comfortable" girer
    And Arama icin buyutec ikonuna tiklar
    And Price Range kismina bir sayi girer
    And Advert "Rent" secer
    And Category "House" secer
    And Country "Türkiye" secer
    And City "Aydın" secer
    And District "Kuşadası" secer
    And Search Button'a tiklar
    And Bir emlak secer ve resme tiklar
    Then Emlak resminin gorunurlugunu dogrular
    And Description "Beautifully designed and spacious." bilgilerinin gorunurlugunu dogrular

    And Details "<detailSize>" "<bedroomSize>" "<bathroomSize>" "<garageData>" "<yearOfBuild>" "<furniture>" "<maintenanceFee>" "<terrace>" bilgilerinin gorunurlugunu dogrular

    And Location "Türkiye" "Aydın" "Kuşadası" "Bayraklıdede mah. No: 15" bilgilerinin gorunurlugunu dogrular
    When Ilan verenin numarasini gormek icin goz ikonuna tiklar
    Then Don't have an account? Create one now! Menusunun gorundugunu dogrular
    When Ilan verenin mailini gormek icin goz ikonuna tiklar
    Then Don't have an account? Create one now! Menusunun gorundugunu dogrular2
    When Schedule a tour kismindeki Tour Date'e "29062024" tarih girer
    And Schedule a tour kismindeki Tour Time'e "00:00" saat secer
    And Submit a tour request button'a tiklar
    Then Don't have an account? Create one now! Menusunun gorundugunu dogrular3
    When Create one now! butonuna tiklar
    Then Register sayfasinda oldugunu dogrular
    Examples:
      | detailSize | bedroomSize | bathroomSize | garageData | yearOfBuild | furniture | maintenanceFee | terrace |
      | 120 m²     | 2           | 1            | NO         | 2010        | YES       | $ 900          | NO      |

@US12TC02
  Scenario Outline: TC02 Kullanici (Sayfaya Kayit olmayan) satilik ve kiralik ilan arayabilmeli
    When Arama kismindeki Sale secenegine tiklar
    And Arama kismindeki Apartment secenegine tiklar
    And Arama alanina bir "Modern" girer
    And Arama icin buyutec ikonuna tiklar
    And Price Range kismina bir sayi girer
    And Advert "Sale" secer
    And Category "Apartment" secer
    And Country "Türkiye" secer
    And City "Osmaniye" secer
    And District "Düziçi" secer
    And Search Button'a tiklar
    And Bir emlak secer ve resme tiklar2
    Then Emlak resminin gorunurlugunu dogrular
    And Description "Experience urban living at its finest in this modern apartment nestled within Düziçi's thriving community. Offering sleek design and convenient amenities, this residence provides the ideal setting for a vibrant lifestyle." bilgilerinin gorunurlugunu dogrular
    And Details "<detailSize>" "<bedroomSize>" "<bathroomSize>" "<garageData>" "<yearOfBuild>" "<furniture>" "<maintenanceFee>" "<terrace>" bilgilerinin gorunurlugunu dogrular
    And Location "Türkiye" "Osmaniye" "Düziçi" "Düziçi Mah. 789. Ave. No: 10" bilgilerinin gorunurlugunu dogrular
    When Ilan verenin numarasini gormek icin goz ikonuna tiklar
    Then Don't have an account? Create one now! Menusunun gorundugunu dogrular
    When Ilan verenin mailini gormek icin goz ikonuna tiklar
    Then Don't have an account? Create one now! Menusunun gorundugunu dogrular2
    When Schedule a tour kismindeki Tour Date'e "14062025" tarih girer
    And Schedule a tour kismindeki Tour Time'e "00:00" saat secer
    And Submit a tour request button'a tiklar
    Then Don't have an account? Create one now! Menusunun gorundugunu dogrular3
    When Create one now! butonuna tiklar
    Then Register sayfasinda oldugunu dogrular
    Examples:
      | detailSize | bedroomSize | bathroomSize | garageData | yearOfBuild | furniture | maintenanceFee | terrace |
      | 140 m²     | 3           | 2            | YES         | 2020        | NO       | $ 1200          | 2      |

  @US12TC03
  Scenario Outline: TC03 Kullanıcı (Sayfaya Kayıt olmayan) Satılık emlak ilanları için tur isteği oluştururken geçersiz veri kabul olmamalı.
    When Arama kismindeki Sale secenegine tiklar
    And Arama kismindeki House secenegine tiklar
    And Arama alanina bir "Calm" girer
    And Arama icin buyutec ikonuna tiklar
    And Bir emlak secer ve resme tiklar3
    And Details "<detailSize>" "<bedroomSize>" "<bathroomSize>" "<garageData>" "<yearOfBuild>" "<furniture>" "<maintenanceFee>" "<terrace>" bilgilerinin gorunurlugunu dogrular
    And Schedule a tour kismindeki Tour Time'e "00:00" saat secer
    And Schedule a tour kismindeki Tour Date'e "01061996199619996" tarih girer
    Examples:
      | detailSize | bedroomSize | bathroomSize | garageData | yearOfBuild | furniture | maintenanceFee | terrace |
      | 120 m²     | 2           | 1            | NO         | 2010        | YES       | $ 900          | NO      |

    @US12TC04
    Scenario Outline: TC04 Kullanıcı (Sayfaya Kayıt olmayan) Kiralık emlak ilanları için tur isteği oluştururken geçersiz veri kabul olmamalı.
      When Arama kismindeki Rent secenegine tiklar
      And Arama kismindeki Apartment secenegine tiklar
      And Arama alanina bir "Stylish" girer
      And Arama icin buyutec ikonuna tiklar
      And Bir emlak secer ve resme tiklar4
      And Details "<detailSize>" "<bedroomSize>" "<bathroomSize>" "<garageData>" "<yearOfBuild>" "<furniture>" "<maintenanceFee>" "<terrace>" bilgilerinin gorunurlugunu dogrular
      And Schedule a tour kismindeki Tour Time'e "00:00" saat secer
      And Schedule a tour kismindeki Tour Date'e "01061996199619996" tarih girer2
      And Submit a tour request button'a tiklar
      Examples:
        | detailSize | bedroomSize | bathroomSize | garageData | yearOfBuild | furniture | maintenanceFee | terrace |
        | 140 m²     | 3           | 2            | YES         | 2020        | NO       | $ 1200          | 2      |












