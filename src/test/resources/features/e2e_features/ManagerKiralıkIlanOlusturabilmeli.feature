@E2E
Feature:


  @US06-TC0111 @UITakesScreenShot @UICloseDriver
  Scenario:UI | Manager Kiralık İlan Oluşturma
    Given Kullanici siteye gider
    And Login butonuna tıklanır
    And Kullanıcı Manager olarak "getLandEmailManager" ve "getLandPswManager" kısmına geçerli bir bir veri girer ve login butonuna tıklar
    And Back To Site butonuna tiklar
    And Create Property butonuna tıklanır
    And Title "Memurlara Özel Aile Evi" ile doldurulur
    And Description "3+1 sehre 5dk uzaklıkta, eşyalı, bakımı yeni yapıldı garajı ve bahçeli e" ile doldurulur
    And Kullanıcı ilana uygun Price'i "7500" seçer
    And AdvertType'ı "Rent" secer
    And Category'i "House" secer
    And Country'i "Türkiye" secer
    And City'i "Adıyaman" secer
    And District'i "Gölbaşı" secer
    And Address'i "Hürriyet Mahallesi, NO:9" belirtir
    And Size'ı "170" belirtir
    And Bedrooms'u "1" belirtir
    And Bathrooms'u "2" belirtir
    And Garage "Yes" secer
    And Year of Build "1996" girer
    And Furniture' "Yes" secer
    And Maintenance Fee'ı "10000" belirtir
    And Terrace "Yes" secer
    When Drag and drop the images or click here alanına tıklanır ve gerekli resimler seçilip eklenir
    Then Kullanıcı  ilanla ilgili resim eklendiği doğrulanır
    Then Create butonuna tıklayarak ilan oluşturulur ve "Advert created successfully" mesajı çıktıgı dogrulanır

  @E2EApiGet @APIAdmin
  Scenario: ApiGet | Get Advert Testi
    Given Adverts icin kayıtlı  ID bigisi alınırr
    Given Get advert icin URL duzenlenirr
    And Get advert icin expected data duzenlenirr
    When Get advert icin GET request gonderilir ve response alinirr
    Then Get advert icin Status kodunun 200 oldugu dogrulanırr
    And Get advert icin Response body dogrulanırr

  @E2EDB
    Scenario: Database | advert_types Sutun İsimlerini ve Bilgilerini Doğrulama
    Given Database ile bağlantı kurulur
    Given adverts sutun isimleri ve bilgileri almak icin query gonderilirr
    Then adverts sutun isimleri ve bilgileri dogrulanırr

  @E2EApiDelete @APIAdmin
  Scenario: ApiDelete | Kayıtlı advertı Silme
    Given Kendi hesabini silmek icin URL duzenlenir
    When Kendi hesabini silmek icin DELETE request gonderilir ve response alinirr
    Then Kendi hesabini silmek icin Status kodunun 200 oldugu dogrulanir

