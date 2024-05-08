package getlandestate.stepDefinitions.db_stepDefinitions;


import getlandestate.utilities.ConfigReader;
import getlandestate.utilities.DB_Utilty;
import getlandestate.utilities.ExcelReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.List;

import static getlandestate.utilities.DB_Utilty.getColumnNames;
import static getlandestate.utilities.DB_Utilty.getRowListIndex;
import static org.junit.Assert.assertEquals;

public class US18_FavoritesTableStepDefs {


    String query="SELECT * FROM favorites";

    @Given("favorites sutunundaki isimleri ve bilgileri almak icin query gonderilir")
    public void favoritesSutunundakiIsimleriVeBilgileriAlmakIcinQueryGonderilir() {
        DB_Utilty.createConnection();
        DB_Utilty.executeQuery(query);
    }

    @Then("favorites sutunundaki isimler ve bilgiler dogrulanır")
    public void favoritesSutunundakiIsimlerVeBilgilerDogrulanır() throws SQLException, ParseException {
     /*   1.Method: Verification by manually entering expected data
        //Actual data ile Expected data arasındaki return type farklılıklarını gidermek icin donusum methodları
        String dateTime="2024-04-20 09:58:27.934954";
        Long num2= DB_Utilty.longaDonustur(2);
        Long num12=DB_Utilty.longaDonustur(12);
        Long num183= DB_Utilty.longaDonustur(183);
        //Sutun baslıklarını dogrulama
        List<String> expectedDataColumns=List.of("advert_id", "created_at", "id", "updated_at", "user_id");
        List<String> actualDataColumns= DB_Utilty.getColumnNames(query);
        Assert.assertEquals(expectedDataColumns.toString(), actualDataColumns.toString());
        //Bir satırı dogrulama
        List<Object> expectedDataInfo=List.of(num2,dateTime,num12,"null",num183);
        List<Object> actualDataInfo=DB_Utilty.getRowListIndex(query,3);
        System.out.println(actualDataInfo);
        Assert.assertEquals(expectedDataInfo.toString(),actualDataInfo.toString());
     */

        // 2.Method :Pulling data from Excel using ExcelReader
        String query ="SELECT *FROM favorites";
        ExcelReader excelReader= new ExcelReader(ConfigReader.getProperty("dataBaseExpectedDataPath"),
                "Şeyma2");
        List<String> actualColumsData = getColumnNames(query);
        List<Object> expectedColumnData = excelReader.getRowData(0);
        assertEquals(actualColumsData.toString(),expectedColumnData.toString());

        //Satır bilgileri
        List<Object> actualInfoData = getRowListIndex(query, 2);
        List<Object> expectedInfoData = excelReader.getRowData(3);
        assertEquals(actualInfoData.toString(),expectedInfoData.toString());


















    }
}
