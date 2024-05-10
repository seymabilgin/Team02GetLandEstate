package getlandestate.stepDefinitions.db_stepDefinitions;

import getlandestate.utilities.ConfigReader;
import getlandestate.utilities.ExcelReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.util.List;

import static getlandestate.utilities.DB_Utilty.*;
import static getlandestate.utilities.DB_Utilty.getRowListIndex;
import static org.testng.Assert.assertEquals;

public class US04_ContactsBilgileriDogrulamaStepDefs {


    String query;
    String query2;
    List<Object> expectedColmsData;
    List<String> actualColmsData;
    List<Object> expectedInfoData;
    List<Object> actualInfoData;
    ExcelReader excelReader;
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
        excelReader =new ExcelReader(ConfigReader.getProperty("dataBaseExpectedDataPath"),"Furkan");

        //Sutun Dogrulama
        expectedColmsData = excelReader.getRowData(0);
        actualColmsData = getColumnNames(query);
        Assert.assertEquals(expectedColmsData,actualColmsData);

        //Bilgi dogrulama
        List<Object> expectedInfoData = excelReader.getRowData(1);
        List<Object> actualInfoData = getRowListIndex(query, 2);

    }

    @Given("adverts sutun isimleri ve bilgileri almak icin query gonderilirr")
    public void advertsSutunIsimleriVeBilgileriAlmakIcinQueryGonderilir() {
        query2="select * from adverts where id = 292";
        executeQuery(query2);
    }

    @Then("adverts sutun isimleri ve bilgileri dogrulanırr")
    public void advertsSutunIsimleriVeBilgileriDogrulanırr() {
        excelReader=new ExcelReader(ConfigReader.getProperty("dataBaseExpectedDataPath"),"İlknur");
        //Sutun bilgilerini doğrulama
        actualColmsData = getColumnNames(query2);
        expectedColmsData = excelReader.getRowData(0);
        assertEquals(actualColmsData.toString(),expectedColmsData.toString());

        //Satır bilgisi doğrulama
        actualInfoData = getRowListIndex(query2, 0);
        expectedInfoData = excelReader.getRowData(1);

        assertEquals(actualInfoData.toString(),expectedInfoData.toString());
    }
}
