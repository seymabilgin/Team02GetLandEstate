package getlandestate.stepDefinitions.db_stepDefinitions;

import getlandestate.utilities.DB_Utilty;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class US02_CategoriesTableStepDefs {

    String query="SELECT * FROM categories";

    @Given("categories sutun isimleri ve bilgileri almak icin query gonderilir")
    public void categoriesSutunIsimleriVeBilgileriAlmakIcinQueryGonderilir() throws SQLException {
        DB_Utilty.createConnection();
        DB_Utilty.executeQuery(query);

    }

    @Then("categories sutun isimleri ve bilgileri dogrulanır")
    public void categoriesSutunIsimleriVeBilgileriDogrulanır() throws SQLException {
        List<String> expectedDataColumns=List.of("built_in", "is_active", "seq", "created_at", "id", "updated_at", "icon", "title", "slug");

       List<String> actualDataColumns= DB_Utilty.getColumnNames(query);


        for (int i = 0; i < actualDataColumns.size(); i++) {

            Assert.assertEquals(expectedDataColumns.get(i), actualDataColumns.get(i));

        }

        List<Object> expectedDataInfo=List.of(true,true,1,"2024-04-14 16:25:42.570894",1,"","fa-solid fa-house","House","house-1713111942569");
        List<Object> actualDataInfo=DB_Utilty.getRowList(query);
        System.out.println(actualDataInfo);

        for (int i = 0; i <1 ; i++) {

            Assert.assertEquals(expectedDataInfo.get(i), actualDataInfo.get(i));

        }


    }
}




