package getlandestate.stepDefinitions.api_stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;

import static getlandestate.base_url.Base_Url.spec;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasKey;

public class US11_DailyReportControllerStepDefs {

    Response response;

    @Given("Get daily report icin URL duzenlenir")
    public void getDailyReportIcinURLDuzenlenir() {
        spec.pathParam("first", "daily-report");
    }

    @When("Get daily report icin GET request gonderilir ve response alinir")
    public void getDailyReportIcinGETRequestGonderilirVeResponseAlinir() {
        response = given(spec).when().get("{first}");
        response.prettyPrint();
    }

    @Then("Get daily report icin Status kodunun {int} oldugu dogrulanir")
    public void getDailyReportIcinStatusKodununOlduguDogrulanir(int arg0) {
        response
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .assertThat().
                time(Matchers.lessThan(1000L));
    }

    @And("Get daily report icin Response body ve header dogrulanir")
    public void getDailyReportIcinResponseBodyVeHeaderDogrulanir() {
        response
                .then()
                .assertThat()
                .body("$", hasKey("ContactMessages"))
                .body("$", hasKey("Favorites"))
                .body("$", hasKey("RentAdverts"))
                .body("$", hasKey("SaleAdverts"))
                .body("$", hasKey("TourRequests"))
                .body("$", hasKey("Users"))
                .assertThat()
                .body("ContactMessages.2024-05-09", Matchers.equalTo(5))
                .assertThat()
                .header("Content-Type", Matchers.equalTo("application/json"))
                .header("X-Content-Type-Options", Matchers.equalTo("nosniff"));
    }
}
