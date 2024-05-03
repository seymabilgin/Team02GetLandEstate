package getlandestate.stepDefinitions.db_stepDefinitions;

import getlandestate.utilities.ConfigReader;
import getlandestate.utilities.DB_Utilty;
import getlandestate.utilities.ExcelReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class US10_DB_ConfirmationTokenStepDefs {
    String query ="SELECT * FROM confirmation_token";
    @Given("confirmation token sutun isimleri ve bilgileri almak icin query gonderilir")
    public void confirmationTokenSutunIsimleriVeBilgileriAlmakIcinQueryGonderilir() {
        DB_Utilty.createConnection();
        DB_Utilty.executeQuery(query);

    }

    @Then("confirmation token sutun isimleri ve bilgileri dogrulanır")
    public void confirmationTokenSutunIsimleriVeBilgileriDogrulanır() {
        ExcelReader excelReader =new ExcelReader(ConfigReader.getProperty("dataBaseExpectedDataPath"),"Tuncer");

        //Row data expected and actual assertion
        List<Object> expectedRowData = excelReader.getRowData(2);
        List<Object> actualRowData = DB_Utilty.getRowListIndex(query,1);
        Assert.assertEquals(expectedRowData.toString(),actualRowData.toString());

        //Column data expected and actual assertion
        List<Object> expectedColumnData = excelReader.getRowData(0);
        List<String> actualColumnData = DB_Utilty.getColumnNames(query);
        Assert.assertEquals(expectedRowData.toString(),actualRowData.toString());
    }
}
