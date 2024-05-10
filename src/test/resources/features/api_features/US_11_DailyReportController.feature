@API
  Feature: US_11 Daily Report Controller

    @APIAdmin
    Scenario: TC01 | Get Daily Report Testi
      Given Get daily report icin URL duzenlenir
      When Get daily report icin GET request gonderilir ve response alinir
      Then Get daily report icin Status kodunun 200 oldugu dogrulanir
      And Get daily report icin Response body ve header dogrulanir