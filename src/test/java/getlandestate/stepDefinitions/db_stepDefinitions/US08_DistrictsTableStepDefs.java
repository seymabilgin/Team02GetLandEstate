package getlandestate.stepDefinitions.db_stepDefinitions;

import getlandestate.utilities.DB_Utilty;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.sql.SQLException;
import java.util.List;

public class US08_DistrictsTableStepDefs {

    String query = "select * from districts";

    @Given("Districts sutun isimleri ve bilgilerini almak icin query gonderilir")
    public void districtsSutunIsimleriVeBilgileriniAlmakIcinQueryGonderilir() throws SQLException {
        DB_Utilty.createConnection();
        DB_Utilty.executeQuery(query);
    }

    @Then("Districts sutun isimleri ve bilgileri dogrulanir")
    public void districtsSutunIsimleriVeBilgileriDogrulanir() throws SQLException{
        List<String> expectedColumnsName=List.of("lat","lng","city_id","id","name","data");
        List<String> actualColumnsName=DB_Utilty.getColumnNames(query);
        for (int i = 0; i < actualColumnsName.size(); i++) {
            Assert.assertEquals(expectedColumnsName.get(i),actualColumnsName.get(i));
        }
        List<Object> expectedColumsnInfo=List.of(37.5469138,35.3950971,4121,48315,"Aladağ");
        List<Object> actualColumnsInfo=DB_Utilty.getRowList(query);
        for (int i = 1; i <2 ; i++) {
            Assert.assertEquals(expectedColumsnInfo.get(i),actualColumnsInfo.get(i));
        }

    }
}
