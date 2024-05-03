package getlandestate.stepDefinitions.db_stepDefinitions;

import getlandestate.utilities.ConfigReader;
import getlandestate.utilities.ExcelReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.util.List;

import static getlandestate.utilities.DB_Utilty.*;
import static getlandestate.utilities.DB_Utilty.getRowListIndex;

public class US04_ContactsBilgileriDogrulamaStepDefs {


    String query;
    @Given("Database ile bağlantı kurulur")
    public void databaseIleBağlantıKurulur() {
        createConnection();
    }

    @Given("contacs sutun isimleri ve bilgileri almak icin query gonderilir")
    public void contacsSutunIsimleriVeBilgileriAlmakIcinQueryGonderilir() {
        query="select * from contacts";
        executeQuery(query);
    }

    @Then("contacs sutun isimleri ve bilgileri dogrulanır")
    public void contacsSutunIsimleriVeBilgileriDogrulanır() {
        ExcelReader excelReader =new ExcelReader(ConfigReader.getProperty("dataBaseExpectedDataPath"),"Furkan");

        //Sutun Dogrulama
        List<Object> expectedColmsData = excelReader.getRowData(0);
        List<String> actualColmsData = getColumnNames(query);
        Assert.assertEquals(expectedColmsData,actualColmsData);

        //Bilgi dogrulama
        List<Object> expectedInfoData = excelReader.getRowData(1);
        List<Object> actualInfoData = getRowListIndex(query, 2);

    }

}
