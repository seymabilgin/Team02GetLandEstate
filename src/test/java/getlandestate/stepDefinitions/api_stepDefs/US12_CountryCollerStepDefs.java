package getlandestate.stepDefinitions.api_stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import static getlandestate.base_url.Base_Url.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US12_CountryCollerStepDefs {

    String actualData;
    String[] expectedCountryNames;
    Response response;

    @Given("Get Country Controller icin URL düzenlenir")
    public void get_country_controller_icin_url_düzenlenir() {
        spec.pathParam("first", "countries");
    }

    @Given("Get country icin gerekli expected data duzenlenır")
    public void get_country_icin_gerekli_expected_data_duzenlenır() {
        expectedCountryNames = new String[]{"Deutschland", "United Kingdom", "Espana", "France", "Türkiye"};
    }

    @When("Get country icin GET request gonderilir ve response alinir")
    public void get_country_icin_get_request_gonderilir_ve_response_alinir() {
        response = given(spec).when().get("{first}/{second}");
        response.prettyPrint();
    }

    @Then("Get country icin Status kodunun {int} oldugu dogrulanır")
    public void get_country_icin_status_kodunun_oldugu_dogrulanır( int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }

    @Then("Get country icin Response body dogrulanır")
    public void get_country_icin_response_body_dogrulanır() {
        String responseBody = response.getBody().asString();
        for (String expectedCountryName : expectedCountryNames) {
            assertTrue(responseBody.contains(expectedCountryName));

        }
    }

    @Given("Get Country Controller icin URL düzenlenirr")
    public void getCountryControllerIcinURLDüzenlenirr() {
        spec.pathParams("first", "countries","second", "all");

    }
}
