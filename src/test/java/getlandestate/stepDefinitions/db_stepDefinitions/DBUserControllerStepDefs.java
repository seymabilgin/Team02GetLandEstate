package getlandestate.stepDefinitions.db_stepDefinitions;

import getlandestate.pojos.UserPostResponsePojo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.sql.*;

import static org.junit.Assert.assertEquals;

public class DBUserControllerStepDefs {
    Connection connection;
    UserPostResponsePojo expectedData;
    ResultSet resultSet;

    @Given("Database baglantisi kurulur")
    public void databaseBaglantisiKurulur() throws SQLException {
     connection= DriverManager.getConnection("jdbc:postgresql://64.227.123.49:5432/prettierhomes","tech_pro_edu","testingIsFun");
    }

    @And("Beklenen User datasi duzenlenir")
    public void beklenenUserDatasiDuzenlenir() {
        expectedData = new UserPostResponsePojo(0, "Ayşe", "Can", "aysecan@gmail.com", "(536) 255-5621");
    }

    @When("Kayitli User datasini almak icin query gonderilir")
    public void kayitliUserDatasiniAlmakIcinQueryGonderilir() throws SQLException {
      Statement statement= connection.createStatement();
        resultSet = statement.executeQuery("select * from users where email = 'aysecan@gmail.com'");
    }

    @Then("Kayitli User datasi dogrulanir")
    public void kayitliUserDatasiDogrulanir() throws SQLException {
        resultSet.next();

        assertEquals(expectedData.getFirstName(), resultSet.getString("first_name"));
        assertEquals(expectedData.getLastName(), resultSet.getString("last_name"));
        assertEquals(expectedData.getEmail(), resultSet.getString("email"));
        assertEquals(expectedData.getPhone(), resultSet.getString("phone"));
    }
}
