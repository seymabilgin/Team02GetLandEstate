package getlandestate.stepDefinitions.api_stepDefs;

import getlandestate.pojos.UserContactControllerPayloadPojo;
import getlandestate.pojos.UserContactControllerResponsePojo;
import getlandestate.pojos.UsersPatchResponsePojo;
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
    static int userId;
    UserContactControllerResponsePojo actualData1;

    UserContactControllerResponsePojo expectedData1;
    UserContactControllerPayloadPojo PayloadPatch;
    UserContactControllerResponsePojo actualDataPatch;

    //""""""""""""""""""""""""""POST"""""""""""""""""""""""""""
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

    //""""""""""""""""""""""""""GET"""""""""""""""""""""""""""
    @Given("Get Contact-Controller icin URL duzenlenir")
    public void getContactControllerIcinURLDuzenlenir() {
        //http://www.getlandestate.com:8092/contact-messages/400
        spec.pathParams("first", "contact-messages","second",403);
    }
    @And("Get Contact-Controller icin expected data duzenlenir")
    public void getContactControllerIcinExpectedDataDuzenlenir() {
        expectedData1 = new UserContactControllerResponsePojo(userId, "sevilay", "uyanık", "sevilay@uyanik.com.tr", "işte öylee",true);
    }

    @When("Get Contact-Controller icin GET request gonderilir ve response alinir")
    public void getContactControllerIcinGETRequestGonderilirVeResponseAlinir() {
        response = given(spec).when().get("{first}/{second}");
        actualData1 = response.as(UserContactControllerResponsePojo.class);
        userId = actualData1.getId();
        response.prettyPrint();

    }
    @Then("Get Contact-Controller icin Status kodunun {int} oldugu dogrulanır")
    public void getContactControllerIcinStatusKodununOlduguDogrulanır(int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }

    @And("Get Contact-Controller icin Response body dogrulanır")
    public void getContactControllerIcinResponseBodyDogrulanır() {
        assertEquals(expectedData1.getId(), actualData1.getId());
        assertEquals(expectedData1.getFirstName(), actualData1.getFirstName());
        assertEquals(expectedData1.getLastName(), actualData1.getLastName());
        assertEquals(expectedData1.getMessage(), actualData1.getMessage());
        assertEquals(expectedData1.getEmail(), actualData1.getEmail());
    }
    //""""""""""""""""""""""""""PATCH"""""""""""""""""""""""""""
    @Given("Patch Contact-Controller icin URL duzenlenir")
    public void patchContactControllerIcinURLDuzenlenir() {
        spec.pathParams("first", "contact-messages","second",403);
    }

    @And("Patch Contact-Controller icin expected data duzenlenir")
    public void patchContactControllerIcinExpectedDataDuzenlenir() {
        PayloadPatch = new UserContactControllerPayloadPojo("nagehan", "uyanık", "sevilay@uyanik.com.tr", "işte öylee",true);
    }

    @When("Patch Contact-Controller icin patch request gonderilir ve response alinir")
    public void patchContactControllerIcinGETRequestGonderilirVeResponseAlinir() {
        response= given(spec).body(PayloadPatch).when().patch("{first}/{second}");
        actualDataPatch=response.as(UserContactControllerResponsePojo.class);
    }

    @Then("Patch Contact-Controller icin Status kodunun {int} oldugu dogrulanır")
    public void patchContactControllerIcinStatusKodununOlduguDogrulanır(int statusKod) {
        assertEquals(statusKod,response.statusCode());
    }

    @And("Patch Contact-Controller icin Response body dogrulanır")
    public void patchContactControllerIcinResponseBodyDogrulanır() {
        assertEquals(PayloadPatch.getFirstName(),actualDataPatch.getFirstName());
    }

    //""""""""""""""""""""""""""DELETE"""""""""""""""""""""""""""

    @Given("Kendi mesajini silmek icin UrL duzenlenir")
    public void kendiMesajiniSilmekIcinUrLDuzenlenir() {
        spec.pathParams("first", "contact-messages","second",403);
    }

    @When("Kendi mesajini silmek icin DELETE request gonderilir ve response alinir")
    public void kendiMesajiniSilmekIcinDELETERequestGonderilirVeResponseAlinir() {
        response = given(spec).when().delete("{first}/{second}");
       expectedData= "Contact message deleted successfully.";
    }

    @Then("Kendi mesajini silmek icin Status kodunun {int} oldugu dogrulanır")
    public void kendiMesajiniSilmekIcinStatusKodununOlduguDogrulanır(int statusCode ) {
        actualData = response.asString();
        assertEquals(statusCode, response.statusCode());
        assertEquals(expectedData,actualData);
    }
}
