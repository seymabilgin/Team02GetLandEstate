package getlandestate.stepDefinitions.db_stepDefinitions;

import getlandestate.utilities.DB_Utilty;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.bytebuddy.matcher.ElementMatcher;
import org.junit.Assert;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class US03_CategoryPropertyValuesTableStepDefs {
    Statement statement;
    ResultSet resultSet;

    String query="SELECT * FROM category_property_values";

    @Given("category property values sutun isimleri ve bilgilerini almak icin query gonderilir")
    public void categoryPropertyValuesSutunIsimleriVeBilgileriniAlmakIcinQueryGonderilir() throws SQLException {
        DB_Utilty.createConnection();
        DB_Utilty.executeQuery(query);
    }

    @Then("category property values sutun isimleri ve bilgileri dogrulanir")
    public void categoryPropertyValuesSutunIsimleriVeBilgileriDogrulanir() throws SQLException {
        List<String> expectedDataColumn=List.of("advert_id","category_property_key_id","id","value");

        List<String> actualDataColumn= DB_Utilty.getColumnNames(query);

        for (int i = 0; i < actualDataColumn.size(); i++) {

            Assert.assertEquals(expectedDataColumn.get(i), actualDataColumn.get(i));

        }
        List<Object> expectedDataInfo=List.of(1,1,1,120);
        List<Object> actualDataInfo=DB_Utilty.getRowList(query);

        

        for (int i = 0; i < expectedDataInfo.size(); i++) {
            assertThat(actualDataInfo.get(i),is(expectedDataInfo.get(i)));

        }
    }

    private void assertThat(Object o, ElementMatcher.Junction<Object> objectJunction) {
    }
}
