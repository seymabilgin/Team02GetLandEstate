package getlandestate.stepDefinitions.api_stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.testng.Assert;


import java.util.HashMap;
import java.util.List;

import static getlandestate.base_url.Base_Url.spec;

import static getlandestate.stepDefinitions.ui_stepDefs.US06_US07_StepDefinitions.advertId;
import static io.restassured.RestAssured.given;
import static org.testng.AssertJUnit.assertEquals;

public class ApiAdvertsStepDefs {
    Response response;

    List<Object> expectedData;
    HashMap actualdata;
    @Given("Adverts icin kayıtlı  ID bigisi alınırr")
    public void kayıtlıIDBigisiAlınırr() {
        spec.pathParams("first","adverts","second",advertId,"third","admin");
        response = given(spec).when().get("{first}/{second}/{third}");
    }

    @Given("Get advert icin URL duzenlenirr")
    public void getAdvertIcinURLDuzenlenirr() {
        spec.pathParams("first","adverts","second",advertId,"third","admin");
    }

    @And("Get advert icin expected data duzenlenirr")
    public void getAdvertIcinExpectedDataDuzenlenirr() {
        expectedData=List.of(advertId,"Memurlara Özel Aile Evi","3+1 sehre 5dk uzaklıkta, eşyalı, bakımı yeni yapıldı garajı ve bahçeli e","7500.0");
    }

    @When("Get advert icin GET request gonderilir ve response alinirr")
    public void getAdvertIcinGETRequestGonderilirVeResponseAlinirr() {
        response = given(spec).when().get("{first}/{second}/{third}");
        actualdata= response.as(HashMap.class);
    }

    @Then("Get advert icin Status kodunun {int} oldugu dogrulanırr")
    public void getAdvertIcinStatusKodununOlduguDogrulanırr(int statusCode) {
        Assert.assertEquals(statusCode,response.statusCode());
    }

    @And("Get advert icin Response body dogrulanırr")
    public void getAdvertIcinResponseBodyDogrulanırr() {
        assertEquals(expectedData.get(1),actualdata.get("title"));
        assertEquals(expectedData.get(2),actualdata.get("description"));
    }


    @Given("Kendi hesabini silmek icin URL duzenlenir")
    public void kendiHesabiniSilmekIcinURLDuzenlenir() {
        spec.pathParams("first","adverts","second",advertId);
    }
    @When("Kendi hesabini silmek icin DELETE request gonderilir ve response alinirr")
    public void kendiHesabiniSilmekIcinDELETERequestGonderilirVeResponseAlinirr() {
        response= given(spec).when().delete("{first}/{second}");
    }

    @Then("Kendi hesabini silmek icin Status kodunun {int} oldugu dogrulanir")
    public void kendiHesabiniSilmekIcinStatusKodununOlduguDogrulanir(int statusCode) {
        assertEquals(statusCode,response.statusCode());
    }


}
