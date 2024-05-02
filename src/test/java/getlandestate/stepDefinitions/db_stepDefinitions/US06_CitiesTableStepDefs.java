package getlandestate.stepDefinitions.db_stepDefinitions;

import getlandestate.utilities.DB_Utilty;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class US06_CitiesTableStepDefs {
    Statement statement;
    ResultSet resultSet;

    String query="SELECT * FROM cities";

    @Given("Cities sutun isimleri ve bilgilerini almak icin query gonderilir")
    public void citiesSutunIsimleriVeBilgileriniAlmakIcinQueryGonderilir() throws SQLException {
        DB_Utilty.createConnection();
        DB_Utilty.executeQuery(query);
    }

    @Then("Cities sutun isimleri ve bilgileri dogrulanir")
    public void citiesSutunIsimleriVeBilgileriDogrulanir() throws SQLException {
        List<String> expectedDataColumn=List.of("lat","lng","country_id","id","name");

        List<String> actualDataColumn= DB_Utilty.getColumnNames(query);

        for (int i = 0; i < actualDataColumn.size(); i++) {

            Assert.assertEquals(expectedDataColumn.get(i), actualDataColumn.get(i));

        }
        List<Object> expectedDataInfo=List.of(36.9863599,35.3252861,223,4121,"Adana");
        List<Object> actualDataInfo=DB_Utilty.getRowList(query);
        System.out.println(actualDataInfo);

        for (int i = 0; i <1 ; i++) {

            Assert.assertEquals(expectedDataInfo.get(i), actualDataInfo.get(i));

        }
    }
}
