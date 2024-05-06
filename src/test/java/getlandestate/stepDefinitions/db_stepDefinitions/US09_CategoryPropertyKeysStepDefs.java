package getlandestate.stepDefinitions.db_stepDefinitions;

import getlandestate.utilities.ConfigReader;
import getlandestate.utilities.DB_Utilty;
import getlandestate.utilities.ExcelReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import static getlandestate.utilities.DB_Utilty.getColumnNames;
import static org.junit.Assert.assertEquals;

public class US09_CategoryPropertyKeysStepDefs {

    Statement statement;
    ResultSet resultSet;

    String query="select * from category_property_keys";
    @Given("Category Property Keys sutun isimleri ve bilgilerini almak icin query gonderilir")
    public void categoryPropertyKeysSutunIsimleriVeBilgileriniAlmakIcinQueryGonderilir() {

        DB_Utilty.createConnection();
        DB_Utilty.executeQuery(query);
    }

    @Then("Category Property Keys sutun isimleri ve bilgileri dogrulanir")
    public void categoryPropertyKeysSutunIsimleriVeBilgileriDogrulanir() {
        String query="select * from category_property_keys";
        ExcelReader excelReader =new ExcelReader(ConfigReader.getProperty("dataBaseExpectedDataPath"),"Sevilay");

        List<String> actualColumsData = getColumnNames(query);
        List<Object> expectedColumnData = excelReader.getRowData(0);
        assertEquals(actualColumsData.toString(),expectedColumnData.toString());

        //Satır bilgileri
        List<Object> actualInfoData =DB_Utilty.getRowListIndex(query,43);
        List<Object> expectedInfoData = excelReader.getRowData(44);
        assertEquals(actualInfoData.toString(),expectedInfoData.toString());

        /*List<String> expectedDataColumns=List.of("built_in", "prefix", "suffix", "category_id", "id", "key_type", "name");

        List<String> actualDataColumns= DB_Utilty.getColumnNames(query);


        for (int i = 0; i < actualDataColumns.size(); i++) {

            Assert.assertEquals(expectedDataColumns.get(i), actualDataColumns.get(i));

        }

        List<Object> expectedDataInfo=List.of(true,"","m²",1,1,"NUMBER","Size");
        List<Object> actualDataInfo=DB_Utilty.getRowList(query);
        System.out.println(actualDataInfo);

        for (int i = 0; i <1 ; i++) {

            Assert.assertEquals(expectedDataInfo.get(i), actualDataInfo.get(i));

        }*/

    }
}
