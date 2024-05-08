package getlandestate.stepDefinitions.db_stepDefinitions;

import getlandestate.utilities.DB_Utilty;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class US_09_CategoryPropertyKeysStepDefs {

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

        List<String> expectedDataColumns=List.of("built_in", "prefix", "suffix", "category_id", "id", "key_type", "name");

        List<String> actualDataColumns= DB_Utilty.getColumnNames(query);


        for (int i = 0; i < actualDataColumns.size(); i++) {

            Assert.assertEquals(expectedDataColumns.get(i), actualDataColumns.get(i));

        }

        List<Object> expectedDataInfo=List.of(true,"","m²",1,1,"NUMBER","Size");
        List<Object> actualDataInfo=DB_Utilty.getRowList(query);
        System.out.println(actualDataInfo);

        for (int i = 0; i <1 ; i++) {

            Assert.assertEquals(expectedDataInfo.get(i), actualDataInfo.get(i));

        }

    }
}
