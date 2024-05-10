@APIUS05
  Feature: API User Controller Testleri


    @APICustomer @ApiTC01_UserRegister
      Scenario: TC01 | User Register Testi
      Given User Register icin URL duzenlenir
      And User Register icin payload duzenlenir
      When User Register icin POST request gonderilir ve Response alinir
      Then User Register icin Status kodunun 200 oldugu dogrulanir
      And User Register icin Response body dogrulanir

    @APICustomer @ApiTC02_UserLogin
     Scenario: TC02 | Users Login Testi
     Given User Login icin URL duzenlenir
     And User Login icin payload duzenlenir
     When User Login icin POST request gonderilir ve Response alinir
     Then User Login icin Status kodun 200 oldugu dogrulanir
     And User Login icin Response body dogrulanir

    @APIAdmin @ApiTC03_GetUserIdAdmin
     Scenario: TC03 | Get User Id Admin Testi
       Given Get user icin URL duzenlenir
       And Get User icin expected data duzenlenir
       When Get User icin GET request gonderilir ve response alinir
       Then Get User icin Status kodunun 200 oldugu dogrulanır
       And Get User icin Response body dogrulanır

     @APIAdmin @ApiTC04_PatchUsersIdAdmin
       Scenario: TC04 | Patch Users Id Admin Testi
       Given Kullanıcı bilgileri degisikligi icin Url duzenlenir
       When Kullanıcı bilgileri degisikligi icin payload duzenlenir
       Then Kullanıcı bilgileri degisikligi icin PATCH request gonderilir ve response alınır
       And Kullanıcı bilgileri degisikligi icin Status kodun 200 oldugu dogrulanır
       And Kullanıcı bilgileri degisikligi icin Response body dogrulanır


      @APICustomer @ApiTC05_DeleteUsersAuth
      Scenario: TC05 | Kendi hesabini silme Testi
        Given Kendi hesabini silmek icin UrL duzenlenir
        When Kendi hesabini silmek icin DELETE request gonderilir ve response alinir
        Then Kendi hesabini silmek icin Status kodunun 200 oldugu dogrulanır
