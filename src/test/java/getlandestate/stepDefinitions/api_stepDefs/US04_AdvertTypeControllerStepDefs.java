package getlandestate.stepDefinitions.api_stepDefs;

import getlandestate.pojos.AdvertTypePayloadPojo;
import getlandestate.pojos.AdvertTypeResponsePojo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import static getlandestate.base_url.Base_Url.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US04_AdvertTypeControllerStepDefs {
    AdvertTypePayloadPojo payload;
    AdvertTypeResponsePojo actualData;
    Response response;
    static int id;
    AdvertTypeResponsePojo expectedData;


    @Given("Advert Olusturma icin URL duzenlenir")
    public void advertOlusturmaIcinURLDuzenlenir() {
        spec.pathParam("first", "advert-types");
    }

    @And("Advert Olusturma icin payload duzenlenir")
    public void advertOlusturmaIcinPayloadDuzenlenir() {
        payload = new AdvertTypePayloadPojo("studyodairem");
    }

    @When("Advert Olusturma icin POST request gonderilir ve Response alinir")
    public void advertOlusturmaIcinPOSTRequestGonderilirVeResponseAlinir() {
        response = given(spec).body(payload).when().post("{first}");
        actualData = response.as(AdvertTypeResponsePojo.class);
        id = actualData.getId();
        response.prettyPrint();
    }

    @Then("Advert Olusturma icin Status kodunun {int} oldugu dogrulanir")
    public void advertOlusturmaIcinStatusKodununOlduguDogrulanir(int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }

    @And("Advert Olusturma icin Response body dogrulanir")
    public void advertOlusturmaIcinResponseBodyDogrulanir() {
        assertEquals(payload.getTitle(), actualData.getTitle());
    }

    @Given("Advert Cagirma icin URL duzenlenir")
    public void advertCagirmaIcinURLDuzenlenir() {
        spec.pathParams("first", "advert-types", "second", id);
    }

    @And("Advert Cagirma icin expected data duzenlenir")
    public void advertCagirmaIcinExpectedDataDuzenlenir() {
        expectedData = new AdvertTypeResponsePojo(id, "studyodairem");
    }

    @When("Advert Cagirma icin GET request gonderilir ve response alinir")
    public void advertCagirmaIcinGETRequestGonderilirVeResponseAlinir() {
        response = given(spec).when().get("{first}/{second}");
        actualData = response.as(AdvertTypeResponsePojo.class);
        response.prettyPrint();
    }

    @Then("Advert Cagirma icin Status kodunun {int} oldugu dogrulanir")
    public void advertCagirmaIcinStatusKodununOlduguDogrulanir(int statusCode) {
        assertEquals(statusCode,response.statusCode());
    }

    @And("Advert Cagirma icin Response body dogrulanir")
    public void advertCagirmaIcinResponseBodyDogrulanir() {
        assertEquals(expectedData.getId(),actualData.getId());
        assertEquals(expectedData.getTitle(),actualData.getTitle());
    }

    @Given("Advert Degistirme icin URL duzenlenir")
    public void advertDegistirmeIcinURLDuzenlenir() {
        spec.pathParams("first", "advert-types", "second", id);
    }

    @And("Advert Degistirme icin payload duzenlenir")
    public void advertDegistirmeIcinPayloadDuzenlenir() {
        payload=new AdvertTypePayloadPojo("kiralikstudyo");
    }

    @When("Advert Degistirme icin PUT request gonderilir ve response alinir")
    public void advertDegistirmeIcinPUTRequestGonderilirVeResponseAlinir() {
        response=given(spec).body(payload).when().put("{first}/{second}");
        actualData=response.as(AdvertTypeResponsePojo.class);
        //id = actualData.getId();
        response.prettyPrint();
    }

    @Then("Advert Degistirme icin Status kodunun {int} oldugu dogrulanir")
    public void advertDegistirmeIcinStatusKodununOlduguDogrulanir(int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }

    @And("Advert Degistirme icin Response body dogrulanir")
    public void advertDegistirmeIcinResponseBodyDogrulanir() {
        assertEquals(payload.getTitle(), actualData.getTitle());
    }
}
