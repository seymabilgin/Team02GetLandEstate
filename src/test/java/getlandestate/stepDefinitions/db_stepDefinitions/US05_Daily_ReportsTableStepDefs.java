package getlandestate.stepDefinitions.db_stepDefinitions;

import getlandestate.utilities.ConfigReader;
import getlandestate.utilities.DB_Utilty;
import getlandestate.utilities.ExcelReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.util.List;

import static getlandestate.utilities.DB_Utilty.getColumnNames;
import static org.junit.Assert.assertEquals;

public class US05_Daily_ReportsTableStepDefs {


    String query="SELECT * FROM daily_reports";

    @Given("daily_reports sutun isimleri ve bilgileri almak icin query gonderilir")
    public void daily_reportsSutunIsimleriVeBilgileriAlmakIcinQueryGonderilir() {
        DB_Utilty.createConnection();
        DB_Utilty.executeQuery(query);

    }

    @Then("daily_reports sutun isimleri ve bilgileri dogrulanır")
    public void daily_reportsSutunIsimleriVeBilgileriDogrulanır() throws ParseException {
        /* 1.Method:Verification by manually entering expected data
        //Sutun baslıgı dogrulama
        List<String> expectedDataColumns=List.of("date","number_of_contact_message","number_of_favorites","number_of_rent_adverts","number_of_sale_adverts","number_of_tour_requests","number_of_users","id");
        List<String> actualDataColumns= DB_Utilty.getColumnNames(query);
        System.out.println(actualDataColumns);
        Assert.assertEquals(expectedDataColumns.toString(), actualDataColumns.toString());
        //Satır bilgileri dogrulama
        Date date= DB_Utilty.date("2024-04-17");
        Integer num=4;
        Long numLong=num.longValue();
        List<Object> expectedDataInfo=List.of(date, 10, 2, 31, 32, 21, 66,numLong );
        List<Object> actualDataInfo=DB_Utilty.getRowListIndex(query,3);
        System.out.println(actualDataInfo);
        Assert.assertEquals(expectedDataInfo.toString(),actualDataInfo.toString());
       */

        // 2.Method :Pulling data from Excel using ExcelReader
        String query ="SELECT *FROM daily_reports";
        ExcelReader excelReader= new ExcelReader(ConfigReader.getProperty("dataBaseExpectedDataPath"),
                "Şeyma");
        List<String> actualColumsData = getColumnNames(query);
        List<Object> expectedColumnData = excelReader.getRowData(0);
        assertEquals(actualColumsData.toString(),expectedColumnData.toString());

        //Satır bilgileri
        List<Object> actualInfoData =DB_Utilty.getRowListIndex(query,2);
        List<Object> expectedInfoData = excelReader.getRowData(3);
        assertEquals(actualInfoData.toString(),expectedInfoData.toString());


        }




    }

