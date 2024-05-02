package getlandestate.stepDefinitions.db_stepDefinitions;

import getlandestate.utilities.DB_Utilty;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class US12_ImagesTableStepDefs {

    String query = "select * from images";

    @Given("images sutun isimleri ve bilgileri dogrulamak icin query gonderilir")
    public void imagesSutunIsimleriVeBilgileriDogrulamakIcinQueryGonderilir() {
        DB_Utilty.createConnection();
        DB_Utilty.executeQuery(query);
    }

    @Then("images sutun isimleri ve bilgileri dogrulanir")
    public void imagesSutunIsimleriVeBilgileriDogrulanir() {
        List<String> expectedColumnsName=List.of("featured","advert_id","id","name","type","data");
        List<String> actualColumnsName=DB_Utilty.getColumnNames(query);
        for (int i = 0; i < actualColumnsName.size(); i++) {
            Assert.assertEquals(expectedColumnsName.get(i),actualColumnsName.get(i));
        }

        List<Object> expectedColumsnInfo=List.of(true,	1,	1,	"Comfortable house in Kusadasi",	"image/jpg",	"51385");
        List<Object> actualColumnsInfo=DB_Utilty.getRowList(query);
        for (int i = 0; i <1 ; i++) {
            Assert.assertEquals(expectedColumsnInfo.get(i),actualColumnsInfo.get(i));
        }
    }
}
