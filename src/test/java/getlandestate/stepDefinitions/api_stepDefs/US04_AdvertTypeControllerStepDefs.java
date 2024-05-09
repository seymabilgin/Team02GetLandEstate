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


    @Given("Advert Olusturma icin URL duzenlenir")
    public void advertOlusturmaIcinURLDuzenlenir() {
        spec.pathParam("first","advert-types");
    }

    @And("Advert Olusturma icin payload duzenlenir")
    public void advertOlusturmaIcinPayloadDuzenlenir() {
        payload=new AdvertTypePayloadPojo("studyodaire");
    }

    @When("Advert Olusturma icin POST request gonderilir ve Response alinir")
    public void advertOlusturmaIcinPOSTRequestGonderilirVeResponseAlinir() {
        response=given(spec).body(payload).when().post("{first}");
        actualData=response.as(AdvertTypeResponsePojo.class);
        id=actualData.getId();
        response.prettyPrint();
    }

    @Then("Advert Olusturma icin Status kodunun {int} oldugu dogrulanir")
    public void advertOlusturmaIcinStatusKodununOlduguDogrulanir(int statusCode) {
        assertEquals(statusCode,response.statusCode());
    }

    @And("Advert Olusturma icin Response body dogrulanir")
    public void advertOlusturmaIcinResponseBodyDogrulanir() {
        assertEquals(payload.getTitle(), actualData.getTitle());
        //assertEquals("false", actualData.isBuiltIn());
    }
}
