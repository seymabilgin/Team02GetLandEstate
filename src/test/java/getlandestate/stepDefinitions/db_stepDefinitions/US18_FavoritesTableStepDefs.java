package getlandestate.stepDefinitions.db_stepDefinitions;


import getlandestate.utilities.DB_Utilty;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.List;

public class US18_FavoritesTableStepDefs {
    Statement statement;
    ResultSet resultSet;


    String query="SELECT * FROM favorites";

    @Given("favorites sutunundaki isimleri ve bilgileri almak icin query gonderilir")
    public void favoritesSutunundakiIsimleriVeBilgileriAlmakIcinQueryGonderilir() {
        DB_Utilty.createConnection();
        DB_Utilty.executeQuery(query);
    }

    @Then("favorites sutunundaki isimler ve bilgiler dogrulanır")
    public void favoritesSutunundakiIsimlerVeBilgilerDogrulanır() throws SQLException, ParseException {
        List<String> expectedDataColumns=List.of("advert_id", "created_at", "id", "updated_at", "user_id");



        List<String> actualDataColumns= DB_Utilty.getColumnNames(query);


        for (int i = 0; i < actualDataColumns.size(); i++) {

            Assert.assertEquals(expectedDataColumns.get(i), actualDataColumns.get(i));

        }




        String dateTime="2024-04-20 09:58:27.934954";
        Long num2= DB_Utilty.longaDonustur(2);
        Long num12=DB_Utilty.longaDonustur(12);
        Long num183= DB_Utilty.longaDonustur(183);

        List<Object> expectedDataInfo=List.of(num2,dateTime,num12,"null",num183);


        List<Object> actualDataInfo=DB_Utilty.getRowListIndex(query,3);
        System.out.println(actualDataInfo);


            Assert.assertEquals(expectedDataInfo.toString(),actualDataInfo.toString());








    }
}
