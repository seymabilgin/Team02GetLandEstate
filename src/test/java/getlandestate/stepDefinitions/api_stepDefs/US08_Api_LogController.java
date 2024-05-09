package getlandestate.stepDefinitions.api_stepDefs;

import getlandestate.pojos.LogController;
import getlandestate.pojos.ReportControllerPojo;
import io.cucumber.java.en.And;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import java.util.HashMap;

import static getlandestate.base_url.Base_Url.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;

public class US08_Api_LogController {
LogController expectedData;
Response response;
HashMap actualData;
    @Given("Get Log Controller için URL düzenlenir")
    public void getLogControllerIçinURLDüzenlenir() {
       // http://www.getlandestate.com:8092/logs/20?page=0&size=20&sort=message&type=asc
        spec.pathParams("first", "logs", "second", 20).queryParams("page","0"
                ,"size","30","sort",
                "message","type","asc");
    }


    @And("Get Log Controller gerekli expected data duzenlenır")
    public void getLogControllerGerekliExpectedDataDuzenlenır() {
        expectedData=new LogController(true,1,3);
    }

    @When("GetLog Controller GET request gonderilir ve response alinir")
    public void getlogControllerGETRequestGonderilirVeResponseAlinir() {
    response= given(spec).when().get("{first}/{second}");
        actualData = response.as(HashMap.class);
        response.prettyPrint();
    }

    @Then("GetLog Controller Status kodunun {int} oldugu dogrulanır")
    public void getlogControllerStatusKodununOlduguDogrulanır(int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }

    @And("Get Log Controller Response body dogrulanır")
    public void getLogControllerResponseBodyDogrulanır() {
        assertEquals(actualData.get("totalPages"),expectedData.getTotalPages());
        assertEquals(actualData.get("last"),expectedData.isLast());

    }
}
