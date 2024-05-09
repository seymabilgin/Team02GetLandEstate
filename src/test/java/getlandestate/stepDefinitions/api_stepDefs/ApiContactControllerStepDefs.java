package getlandestate.stepDefinitions.api_stepDefs;

import getlandestate.pojos.UserContactControllerPayloadPojo;
import getlandestate.pojos.UserPayloadPojo;
import getlandestate.pojos.UserPostResponsePojo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import static getlandestate.base_url.Base_Url.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;


public class ApiContactControllerStepDefs {
    UserContactControllerPayloadPojo payload;
    String expectedData;
    String actualData;
    Response response;

    @Given("Post Contact-Controller icin URL duzenlenir")
    public void postContactControllerIcinURLDuzenlenir() {
        //http://www.getlandestate.com:8092/contact-messages
        spec.pathParam("first", "contact-messages");
    }

    @And("Post Contact-Controller icin payload duzenlenir")
    public void postContactControllerIcinPayloadDuzenlenir() {
        payload = new UserContactControllerPayloadPojo("sevilay", "uyanık", "sevilay@uyanik.com.tr", "işte öylee", true);

    }

    @When("Post Contact-Controller icin POST request gonderilir ve Response alinir")
    public void postContactControllerIcinPOSTRequestGonderilirVeResponseAlinir() {
        response = given(spec).body(payload).when().post("{first}");
        actualData = response.asString();
        response.prettyPrint();
    }

    @Then("Post Contact-Controller icin Status kodunun {int} oldugu dogrulanir")
    public void postContactControllerIcinStatusKodununOlduguDogrulanir(int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }

    @And("Post Contact-Controller icin Response body dogrulanir")
    public void postContactControllerIcinResponseBodyDogrulanir() {
        expectedData  = "Contact message saved successfully.";

        assertEquals(expectedData,actualData);
    }

    @Given("Get Contact-Controller icin URL duzenlenir")
    public void getContactControllerIcinURLDuzenlenir() {
        spec.pathParam("first", "contact-messages");
    }

    @And("Get Contact-Controller icin expected data duzenlenir")
    public void getContactControllerIcinExpectedDataDuzenlenir() {
    }

    @When("Get Contact-Controller icin GET request gonderilir ve response alinir")
    public void getContactControllerIcinGETRequestGonderilirVeResponseAlinir() {
    }

    @Then("Get Contact-Controller icin Status kodunun {int} oldugu dogrulanır")
    public void getContactControllerIcinStatusKodununOlduguDogrulanır(int arg0) {
    }

    @And("Get Contact-Controller icin Response body dogrulanır")
    public void getContactControllerIcinResponseBodyDogrulanır() {
    }

    @Given("Patch Contact-Controller icin URL duzenlenir")
    public void patchContactControllerIcinURLDuzenlenir() {
    }

    @And("Patch Contact-Controller icin expected data duzenlenir")
    public void patchContactControllerIcinExpectedDataDuzenlenir() {
    }

    @When("Patch Contact-Controller icin GET request gonderilir ve response alinir")
    public void patchContactControllerIcinGETRequestGonderilirVeResponseAlinir() {
    }

    @Then("Patch Contact-Controller icin Status kodunun {int} oldugu dogrulanır")
    public void patchContactControllerIcinStatusKodununOlduguDogrulanır(int arg0) {
    }

    @And("Patch Contact-Controller icin Response body dogrulanır")
    public void patchContactControllerIcinResponseBodyDogrulanır() {
    }
}
