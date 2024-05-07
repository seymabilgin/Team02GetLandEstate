package getlandestate.stepDefinitions.api_stepDefs;

import getlandestate.pojos.ReportControllerPojo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import static getlandestate.base_url.Base_Url.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US07_ReportControllerStepDefs {
    ReportControllerPojo expectedData;
    Response response;
    ReportControllerPojo actualData;
    @Given("Get Report Controller icin URL düzenlenir")
    public void getReportControllerIcinURLDüzenlenir() {
        //http://www.getlandestate.com:8092/report
        spec.pathParam("first","report");
    }

    @And("Get report icin gerekli expected data duzenlenır")
    public void getReportIcinGerekliExpectedDataDuzenlenır() {
        expectedData= new ReportControllerPojo(169,389,134,158,12);
    }

    @When("Get report icin GET request gonderilir ve response alinir")
    public void getReportyIcinGETRequestGonderilirVeResponseAlinir() {
        response = given(spec).when().get("{first}");
        actualData = response.as(ReportControllerPojo.class);
        response.prettyPrint();
    }

    @Then("Get report icin Status kodunun {int} oldugu dogrulanır")
    public void getReportIcinStatusKodununOlduguDogrulanır(int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }

    @And("Get report icin Response body dogrulanır")
    public void getReportIcinResponseBodyDogrulanır() {
        assertEquals(expectedData.getTotalAdverts(),actualData.getTotalAdverts());
        assertEquals(expectedData.getTotalAdvertTypes(),actualData.getTotalAdvertTypes());
        assertEquals(expectedData.getTotalUsers(),actualData.getTotalUsers());
        assertEquals(expectedData.getTotalCategories(),actualData.getTotalCategories());
        assertEquals(expectedData.getTotalTourRequests(),actualData.getTotalTourRequests());
    }
}
