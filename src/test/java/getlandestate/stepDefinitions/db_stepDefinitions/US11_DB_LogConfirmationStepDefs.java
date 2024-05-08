package getlandestate.stepDefinitions.db_stepDefinitions;

import getlandestate.utilities.ConfigReader;
import getlandestate.utilities.DB_Utilty;
import getlandestate.utilities.ExcelReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class US11_DB_LogConfirmationStepDefs {
    String query ="SELECT * FROM logs";

    @Given("logs sutun isimlerini ve bilgileri almak icin query gonderilir")
    public void logsSutunIsimleriniVeBilgileriAlmakIcinQueryGonderilir() {
        DB_Utilty.createConnection();
        DB_Utilty.executeQuery(query);
    }

    @Then("logs sutun isimlerini ve bilgileri dogrulanır")
    public void logsSutunIsimleriniVeBilgileriDogrulanır() {
        ExcelReader excelReader =new ExcelReader(ConfigReader.getProperty("dataBaseExpectedDataPath"),"Tuncer2");

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
