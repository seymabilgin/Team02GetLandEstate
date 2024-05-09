package getlandestate.stepDefinitions.db_stepDefinitions;

import getlandestate.utilities.ConfigReader;
import getlandestate.utilities.DB_Utilty;
import getlandestate.utilities.ExcelReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

import static getlandestate.utilities.DB_Utilty.getColumnNames;
import static org.junit.Assert.assertEquals;

public class US12_ImagesTableStepDefs {

    String query = "select * from images";

    @Given("images sutun isimleri ve bilgileri dogrulamak icin query gonderilir")
    public void imagesSutunIsimleriVeBilgileriDogrulamakIcinQueryGonderilir() {
        DB_Utilty.createConnection();
        DB_Utilty.executeQuery(query);
    }

    @Then("images sutun isimleri ve bilgileri dogrulanir")
    public void imagesSutunIsimleriVeBilgileriDogrulanir() {
        /* 1. Method : Verification by manually entering expected data
        List<String> expectedColumnsName=List.of("featured","advert_id","id","name","type","data");
        List<String> actualColumnsName=DB_Utilty.getColumnNames(query);
        for (int i = 0; i < actualColumnsName.size(); i++) {
            Assert.assertEquals(expectedColumnsName.get(i),actualColumnsName.get(i));
        }

        List<Object> expectedColumsnInfo=List.of(true,	1,	1,	"Comfortable house in Kusadasi",	"image/jpg",	"51385");
        List<Object> actualColumnsInfo=DB_Utilty.getRowList(query);
        for (int i = 0; i <1 ; i++) {
            Assert.assertEquals(expectedColumsnInfo.get(i),actualColumnsInfo.get(i));
        }*/

        // 2. Method : Pulling data from Excel using ExcelReader
        ExcelReader excelReader= new ExcelReader(ConfigReader.getProperty("dataBaseExpectedDataPath"),
                "Mehmet");
        List<String> actualColumsData = getColumnNames(query);
        List<Object> expectedColumnData = excelReader.getRowData(0);
        assertEquals(actualColumsData.toString(),expectedColumnData.toString());

        //Satır bilgileri
        List<Object> actualInfoData =DB_Utilty.getRowListIndex(query,2);
        List<Object> expectedInfoData = excelReader.getRowData(3);
        assertEquals(actualInfoData.toString(),expectedInfoData.toString());
    }
}
