package getlandestate.stepDefinitions.db_stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static getlandestate.hooks.Hooks.connection;

public class US01_TabloIsımleriniDogrula {

    ResultSet resultSet;

    @Given("Kayıtlı tablo isimlerini almak icin query gonderilir.")
    public void kayıtlıTabloIsimleriniAlmakIcinQueryGonderilir() throws SQLException {
        Statement statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT table_name FROM information_schema.tables WHERE table_schema = 'public'");

    }

    @Then("Kayitli tablo isimleri dogrulanır")
    public void kayitliTabloIsimleriDogrulanır() throws SQLException {
        List<String> expectedData = List.of("categories", "category_property_values", "contacts", "daily_reports", "cities", "countries", "districts", "category_property_keys", "confirmation_token", "logs","images","profile_photos","tour_requests","advert_types","adverts","users","favorites");

        List<String> actualData = new ArrayList<>();

        while (resultSet.next()) {
            actualData.add(resultSet.getString("table_name"));

        }
        for (int i = 0; i < actualData.size(); i++) {

            Assert.assertEquals(expectedData.get(i), actualData.get(i));

        }


    }
}
