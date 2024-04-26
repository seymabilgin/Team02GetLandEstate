@US06
Feature:Manager Sayfada Kiralık İlanı Verebilmeli
  Background:
    Given Kullanici siteye gider
    And Login butonuna tiklanir
    And Kullanıcı Manager olarak "getLandEmailManager" ve "getLandPswManager" kısmına geçerli bir bir veri girer ve login butonuna tıklar
    And Back to Site butonuna tiklanir
    And Create Property butonuna tıklanır
  @US06-TC01
  Scenario:TC_01 Manager valid değerler ile sayfada kiralık ilanı verebilmeli
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
    And Sayfa kapanir

    @US06-TC02
    Scenario: TC02 Manager kiralık ilan verirken "Title" alanını boş bırakırsa ilan oluşturamamalı
      And Title ve description alanları boş bırakılır
      And Title icin "Enter a title" , description alanı icin "Enter a description" uyarı metni geldiği doğrulanır
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
      Then Create butonu aktif olmaz ve ilan oluşturulamadığı doğrulanır
      And sayfayi kapatir

      @US06-TC03
      Scenario: Manager kiralık ilan verirken "Address" alanını boş bırakırsa kiralık ilan oluşturamamalı
        And Title "Öğrenciler için Ucuza 1+0 Ev" ile doldurulur
        And Description "1+0 eşyalı öğrencilere özel ev, pencere bulunur" ile doldurulur
        And Kullanıcı ilana uygun Price'i "3500" seçer
        And AdvertType'ı "Rent" secer
        And Category'i "House" secer
        And Country'i "Türkiye" secer
        And City'i "Adıyaman" secer
        And District'i "Gölbaşı" secer
        And Address alanı boş bırakılır ve "newAdvertPageTranslations.requiredAddress" uyarı metni geldiği doğrulanır
        And Size'ı "80" belirtir
        And Bedrooms'u "1" belirtir
        And Bathrooms'u "1" belirtir
        And Garage "No" secer
        And Year of Build "1990" girer
        And Furniture' "Yes" secer
        And Maintenance Fee'ı "1000" belirtir
        And Terrace "No" secer
        When Drag and drop the images or click here alanına tıklanır ve gerekli resimler seçilip eklenir
        Then Kullanıcı  ilanla ilgili resim eklendiği doğrulanır
        Then Create butonu aktif olmaz ve ilan oluşturulamadığı doğrulanır
        And sayfayi kapatir

        @US06-TC04
        Scenario: TC04-Manager kiralık ilan verirken 3mb'dan büyük resim eklerse ilan oluşturulamamalı
          And Title "Geniş Aile Evi Bahçeli, Eşyalı, Geniş, Ferah" ile doldurulur
          And Description "5+1, eşyalı, bakımı yeni yapıldı teraslı, garajılı ve bahçeli" ile doldurulur
          And Kullanıcı ilana uygun Price'i "15000" seçer
          And AdvertType'ı "Rent" secer
          And Category'i "House" secer
          And Country'i "Türkiye" secer
          And City'i "Adıyaman" secer
          And District'i "Gölbaşı" secer
          And Address'i "Atatürk Bulvarı No:2222" belirtir
          And Size'ı "225" belirtir
          And Bedrooms'u "2" belirtir
          And Bathrooms'u "2" belirtir
          And Garage "Yes" secer
          And Year of Build "2005" girer
          And Furniture' "Yes" secer
          And Maintenance Fee'ı "20000" belirtir
          And Terrace "Yes" secer
          When Drag and drop the images or click here alanına tıklanır ve 3 mb dan büyük resim seçilir
          Then "Each image should be a maximum of 3 MB" uyarı metni geldiği doğrulanır
          Then Create butonu aktif olmaz ve ilan oluşturulamadığı doğrulanır
          And sayfayi kapatir

          @US06-TC05
          Scenario: TC05-Manager tüm bilgileri girmeden kiralık ilan olusturamamalı Bug
            And Title "Memurlara Özel Aile Evi" ile doldurulur
            And Description "3+1 sehre 5dk uzaklıkta, eşyalı, bakımı yeni yapıldı garajı ve bahçeli e" ile doldurulur
            And Kullanıcı ilana uygun Price'i "7500" seçer
            And AdvertType'ı "Rent" secer
            And Category'i "House" secer
            And Country'i "Türkiye" secer
            And City'i "Adıyaman" secer
            And District'i "Gölbaşı" secer
            And Address'i "Hürriyet Mahallesi, NO:9" belirtir
            And Size'ı "" belirtir
            And Bedrooms'u "" belirtir
            And Bathrooms'u "" belirtir
            And Garage "" secer
            And Year of Build "" girer
            And Furniture' "" secer
            And Maintenance Fee'ı "" belirtir
            And Terrace "" secer
            When Drag and drop the images or click here alanına tıklanır ve gerekli resimler seçilip eklenir
            Then Kullanıcı  ilanla ilgili resim eklendiği doğrulanır
            Then Create butonu aktifleşmez ve ilanın oluşturulamadığı doğrulanır
            And sayfayi kapatir