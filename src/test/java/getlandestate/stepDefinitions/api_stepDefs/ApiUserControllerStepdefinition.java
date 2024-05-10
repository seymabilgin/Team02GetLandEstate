package getlandestate.stepDefinitions.api_stepDefs;

import getlandestate.pojos.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static getlandestate.base_url.Base_Url.spec;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;

public class ApiUserControllerStepdefinition {
    UserRegisterPayloadPojo payloadRegister;
    LoginPayloadPojo payloadLogin;
    UsersPatchPayloadPojo patchPayload;
    UserRegisterResponsePojo actualDataRegister;
    LoginResponsePojo actualDataLogin;
    UsersPatchResponsePojo actualDataPatch;
    Response response;
    static int userId;
    Map<String, Object> expectedDataGetId;
    HashMap < String, Object > actualDataGetId;


    //-----------------------TC01 User Register---------------------------------------------------------------------------//

    @Given("User Register icin URL duzenlenir")
    public void userRegisterIcinURLDuzenlenir() {
        //{{baseUrl}}/users/register
        spec.pathParams("first", "users", "second", "register");
    }

    @And("User Register icin payload duzenlenir")
    public void userRegisterIcinPayloadDuzenlenir() {
        payloadRegister = new UserRegisterPayloadPojo("Tom", "Can", "(536) 555-8850", "VeliCan123@", "veliCan0750@gmail.com");
    }

    @When("User Register icin POST request gonderilir ve Response alinir")
    public void userRegisterIcinPOSTRequestGonderilirVeResponseAlinir() {
        response = given(spec).body(payloadRegister).when().post("{first}/{second}");
        actualDataRegister = response.as(UserRegisterResponsePojo.class);
        userId = actualDataRegister.getId();
        System.out.println("userId = " + userId);
        response.prettyPrint();
    }

    @Then("User Register icin Status kodunun {int} oldugu dogrulanir")
    public void userRegisterIcinStatusKodununOlduguDogrulanir(int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }

    @And("User Register icin Response body dogrulanir")
    public void userRegisterIcinResponseBodyDogrulanir() {
        assertEquals(payloadRegister.getFirstName(), actualDataRegister.getFirstName());
        assertEquals(payloadRegister.getLastName(), actualDataRegister.getLastName());
        assertEquals(payloadRegister.getPhone(), actualDataRegister.getPhone());
        assertEquals(payloadRegister.getEmail(), actualDataRegister.getEmail());
    }

    //--------------------TC02 User Login----------------------------------------------------------------------------------//

    @Given("User Login icin URL duzenlenir")
    public void userLoginIcinURLDuzenlenir() {
        //http://www.getlandestate.com:8092/users/login
        spec.pathParams("first", "users", "second", "login");
    }

    @And("User Login icin payload duzenlenir")
    public void userLoginIcinPayloadDuzenlenir() {
        payloadLogin = new LoginPayloadPojo("veliCan0750@gmail.com", "VeliCan123@");

    }

    @When("User Login icin POST request gonderilir ve Response alinir")
    public void userLoginIcinPOSTRequestGonderilirVeResponseAlinir() {
        response= given(spec).body(payloadLogin).when().post("{first}/{second}");
        actualDataLogin = response.as(LoginResponsePojo.class);
        response.prettyPrint();
    }

    @Then("User Login icin Status kodun {int} oldugu dogrulanir")
    public void userLoginIcinStatusKodunOlduguDogrulanir(int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }


    @And("User Login icin Response body dogrulanir")
    public void userLoginIcinResponseBodyDogrulanir() {
        // 1) MATCHER CLASS
        response.then().assertThat().body("id", equalTo(userId)
                , "email", equalTo("veliCan0750@gmail.com")
                , "firstName", equalTo("Tom")
                , "lastName", equalTo("Can")
                , "phone", equalTo("(536) 555-8850")
                , "role", equalTo("CUSTOMER")
                , "profilePhoto", equalTo(null));
    }

    //----------------TC03 Get User----------------------------------------------------------------------------------------//

    @Given("Get user icin URL duzenlenir")
    public void getUserIcinURLDuzenlenir() {
        // http://www.getlandestate.com:8092/users/id/admin

        spec.pathParams("first", "users", "second",userId, "third", "admin");
    }

    @And("Get User icin expected data duzenlenir")
    public void getUserIcinExpectedDataDuzenlenir() {

        //3)EXPECTED DATA HASHMAP
        expectedDataGetId = new HashMap<>();
        expectedDataGetId.put("id", userId);
        expectedDataGetId.put("firstName", "Tom");
        expectedDataGetId.put("lastName", "Can");
        expectedDataGetId.put("email", "veliCan0750@gmail.com");
        expectedDataGetId.put("phone", "(536) 555-8850");
        expectedDataGetId.put("role", "CUSTOMER");

    }

    @When("Get User icin GET request gonderilir ve response alinir")
    public void getUserIcinGETRequestGonderilirVeResponseAlinir() {
        response = given(spec).when().get("{first}/{second}/{third}");
        actualDataGetId = response.as(HashMap.class);
        // as(HashMap.class): response tan gelen JSON formatını datayı HashMap dönüştürür.
        System.out.println("Actual Data: " + actualDataGetId);
    }

    @Then("Get User icin Status kodunun {int} oldugu dogrulanır")
    public void getUserIcinStatusKodununOlduguDogrulanır(int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }

    @And("Get User icin Response body dogrulanır")
    public void getUserIcinResponseBodyDogrulanır() {
        assertEquals(expectedDataGetId.get("id"),actualDataGetId.get("id"));
        assertEquals(expectedDataGetId.get("firstName"),actualDataGetId.get("firstName"));
        assertEquals(expectedDataGetId.get("lastName"),actualDataGetId.get("lastName"));
        assertEquals(expectedDataGetId.get("email"),actualDataGetId.get("email"));
        assertEquals(expectedDataGetId.get("phone"),actualDataGetId.get("phone"));
        assertEquals(expectedDataGetId.get("role"),actualDataGetId.get("role"));
    }

    //-------------TC04 PATCH-UsersRoleIdAdmin--------------------------------------------------------------------//
    @Given("Kullanıcı bilgileri degisikligi icin Url duzenlenir")
    public void kullanıcıBilgileriDegisikligiIcinUrlDuzenlenir() {
       // http://www.getlandestate.com:8092/users/1074/admin
        spec.pathParams("first","users","second",userId,"third","admin");
    }
    @When("Kullanıcı bilgileri degisikligi icin payload duzenlenir")
    public void kullanıcıBiilgileriDegisikligiIcinPayloadDuzenlenir() {
        patchPayload=new UsersPatchPayloadPojo("Ayse", "Can", "(536) 555-8850", "VeliCan123@", "veliCan0750@gmail.com","CUSTOMER");

    }

    @Then("Kullanıcı bilgileri degisikligi icin PATCH request gonderilir ve response alınır")
    public void kullanıcıBilgileriDegisikligiIcinPatchRequestGonderilirVeResponseAlınır() {
      response= given(spec).body(patchPayload).when().patch("{first}/{second}/{third}");
    actualDataPatch=response.as(UsersPatchResponsePojo.class);
    }

    @And("Kullanıcı bilgileri degisikligi icin Status kodun {int} oldugu dogrulanır")
    public void kullanıcıRoleDegisikligiIcinStatusKodunOlduguDogrulanır(int statusKod) {
        assertEquals(statusKod,response.statusCode());
    }

    @And("Kullanıcı bilgileri degisikligi icin Response body dogrulanır")
    public void kullanıcıRolDegisikligiIcinResponseBodyDogrulanır() {
        assertEquals(patchPayload.getFirstName(),actualDataPatch.getFirstName());
    }


    //-------------TC05 DELETE------------------------------------------------------------//
    @Given("Kendi hesabini silmek icin UrL duzenlenir")
    public void kendiHesabiniSilmekIcinUrLDuzenlenir() {
        //http://www.getlandestate.com:8092/users/auth
        spec.pathParams("first", "users", "second", "auth");
    }

    @When("Kendi hesabini silmek icin DELETE request gonderilir ve response alinir")
    public void kendiHesabiniSilmekIcinDELETERequestGonderilirVeResponseAlinir() {
        response = given(spec).when().delete("{first}/{second}");
    }

    @Then("Kendi hesabini silmek icin Status kodunun {int} oldugu dogrulanır")
    public void kendiHesabiniSilmekIcinStatusKodununOlduguDogrulanır(int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }
    //---------------------------------------------------------------------------------------//
    //E2E
    @Given("Kayıtlı User Id bilgisi alinir")
    public void kayıtlıUserIdBilgisiAlinir() {
        //http://www.getlandestate.com:8092/users/admin?size=30&sort=id,desc
        spec.pathParams("first", "users", "second", "admin")
                .queryParams("size", 30, "sort", "id,desc");
        response = given(spec).when().get("{first}/{second}");

        userId = response.jsonPath().getInt("content.find{it.email=='customer@ayseyilmaz.com'}.id");
    }

}

