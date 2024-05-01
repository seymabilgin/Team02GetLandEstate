package getlandestate.stepDefinitions.db_stepDefinitions;

import getlandestate.utilities.DB_Utilty;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class US13_ProfilePhotosTableStepDefs {

    String query = "select * from profile_photos";

    @Given("profile photos sutun isimleri ve bilgileri dogrulamak icin query gonderilir")
    public void profilePhotosSutunIsimleriVeBilgileriDogrulamakIcinQueryGonderilir() {
        DB_Utilty.createConnection();
        DB_Utilty.executeQuery(query);
    }

    @Then("profile photos sutun isimleri ve bilgileri dogrulanir")
    public void profilePhotosSutunIsimleriVeBilgileriDogrulanir() {
        List<String> expectedColumnsName=List.of("id","name","type","data");
        List<String> actualColumnsName=DB_Utilty.getColumnNames(query);
        for (int i = 0; i < actualColumnsName.size(); i++) {
            Assert.assertEquals(expectedColumnsName.get(i),actualColumnsName.get(i));
        }

        List<Object> expectedColumsnInfo=List.of(5,	"cropped-image.jpg",	"image/jpeg",	"51564");
        List<Object> actualColumnsInfo=DB_Utilty.getRowList(query);
        for (int i = 1; i <2 ; i++) {
            Assert.assertEquals(expectedColumsnInfo.get(i),actualColumnsInfo.get(i));
        }
    }
}
