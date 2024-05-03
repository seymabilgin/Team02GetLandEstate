package getlandestate.stepDefinitions.db_stepDefinitions;

import getlandestate.utilities.ConfigReader;
import getlandestate.utilities.ExcelReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;

import static getlandestate.utilities.DB_Utilty.*;
import static org.testng.Assert.assertEquals;

public class US15_AdvertTypeBilgileriDogrlamaStepDefs {
    String query;
    @Given("advert_types sutun isimleri ve bilgileri almak icin query gonderilir")
    public void advert_typesSutunIsimleriVeBilgileriAlmakIcinQueryGonderilir() {
        query = "select * from advert_types";
        executeQuery(query);
    }

    @Then("advert_types sutun isimleri ve bilgileri dogrulanır")
    public void advert_typesSutunIsimleriVeBilgileriDogrulanır() {
        //Sutun bilgileri dogrulama
        ExcelReader excelReader= new ExcelReader(ConfigReader.getProperty("dataBaseExpectedDataPath"),"Furkan2");
        List<String> actualColumsData = getColumnNames(query);
        List<Object> expectedColumnData = excelReader.getRowData(0);
        assertEquals(actualColumsData.toString(),expectedColumnData.toString());

        //Satır bilgileri
        List<Object> actualInfoData = getRowListIndex(query, 0);
        List<Object> expectedInfoData = excelReader.getRowData(1);
        assertEquals(actualInfoData.toString(),expectedInfoData.toString());
    }
}
