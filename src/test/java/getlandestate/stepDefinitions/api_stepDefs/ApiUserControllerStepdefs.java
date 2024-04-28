package getlandestate.stepDefinitions.api_stepDefs;


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


public class ApiUserControllerStepdefs {
    UserPayloadPojo payload;
    UserPostResponsePojo actualData;
    Response response;
    public static int userId;
    UserPostResponsePojo expectedData;

    @Given("User Register icin URL duzenlenir")
    public void userRegisterIcinURLDuzenlenir() {
        spec.pathParams("first", "users", "second", "register");
    }

    @And("User Register icin payload duzenlenir")
    public void userRegisterIcinPayloadDuzenlenir() {
        payload = new UserPayloadPojo("Ayşe", "Yılmaz", "(555) 888-8888", "QWEasd123*", "customer@ayseyilmaz.com");
    }

    @When("User Register icin POST request gonderilir ve Response alinir")
    public void userRegisterIcinPOSTRequestGonderilirVeResponseAlinir() {
        response = given(spec).body(payload).when().post("{first}/{second}");
        actualData = response.as(UserPostResponsePojo.class);
        userId=actualData.getId();
        response.prettyPrint();
    }

    @Then("User Register icin Status kodunun {int} oldugu dogrulanir")
    public void userRegisterIcinStatusKodununOlduguDogrulanir(int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }

    @And("User Register icin Response body dogrulanir")
    public void userRegisterIcinResponseBodyDogrulanir() {
        assertEquals(payload.getFirstName(), actualData.getFirstName());
        assertEquals(payload.getLastName(), actualData.getLastName());
        assertEquals(payload.getPhone(), actualData.getPhone());
        assertEquals(payload.getEmail(), actualData.getEmail());
    }
    @Given("Get user icin URL duzenlenir")
    public void getUserIcinURLDuzenlenir() {
        // http://www.getlandestate.com:8092/users/687/admin
        spec.pathParams("first","users","second",userId,"third","admin");
    }

    @And("Get User icin expected data duzenlenir")
    public void getUserIcinExpectedDataDuzenlenir() {
        expectedData = new UserPostResponsePojo(userId, "Ayşe", "Can", "aysecan@gmail.com", "(536) 255-5621");
    }

    @When("Get User icin GET request gonderilir ve response alinir")
    public void getUserIcinGETRequestGonderilirVeResponseAlinir() {
        response = given(spec).when().get("{first}/{second}/{third}");
        actualData=response.as(UserPostResponsePojo.class);
        response.prettyPrint();
    }

    @Then("Get User icin Status kodunun {int} oldugu dogrulanır")
    public void getUserIcinStatusKodununOlduguDogrulanır(int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }

    @And("Get User icin Response body dogrulanır")
    public void getUserIcinResponseBodyDogrulanır() {
        assertEquals(expectedData.getId(), actualData.getId());
        assertEquals(expectedData.getFirstName(), actualData.getFirstName());
        assertEquals(expectedData.getLastName(), actualData.getLastName());
        assertEquals(expectedData.getPhone(), actualData.getPhone());
        assertEquals(expectedData.getEmail(), actualData.getEmail());
    }

    @Given("Kendi hesabini silmek icin UrL duzenlenir")
    public void kendiHesabiniSilmekIcinUrLDuzenlenir() {
        //http://www.getlandestate.com:8092/users/auth
        spec.pathParams("first","users","second","auth");
    }

    @When("Kendi hesabini silmek icin DELETE request gonderilir ve response alinir")
    public void kendiHesabiniSilmekIcinDELETERequestGonderilirVeResponseAlinir() {
        response= given(spec).when().delete("{first},{second}");
    }

    @Then("Kendi hesabini silmek icin Status kodunun {int} oldugu dogrulanır")
    public void kendiHesabiniSilmekIcinStatusKodununOlduguDogrulanır(int statusCode) {
        assertEquals(statusCode,response.statusCode());
    }
}
