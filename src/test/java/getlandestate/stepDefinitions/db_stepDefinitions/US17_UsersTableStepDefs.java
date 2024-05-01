package getlandestate.stepDefinitions.db_stepDefinitions;

import getlandestate.utilities.DB_Utilty;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.sql.SQLException;
import java.util.List;

public class US17_UsersTableStepDefs {

    String query="SELECT * FROM users";

    @Given("users tablosu sutun isimleri ve bilgileri almak icin query gonderilir")
    public void usersTablosuSutunIsimleriVeBilgileriAlmakIcinQueryGonderilir() {
        DB_Utilty.createConnection();
        DB_Utilty.executeQuery(query);

    }

    @Then("users tablosu sutun isimleri ve bilgileri dogrulanır")
    public void usersTablosuSutunIsimleriVeBilgileriDogrulanır() throws SQLException {
        List<String> expectedDataColumns=List.of("built_in", "enabled", "locked", "created_at", "id","picture_id","updated_at", "phone", "first_name", "last_name","role","email","password_hash","reset_password_code");

       List<String> actualDataColumns= DB_Utilty.getColumnNames(query);


        for (int i = 0; i < actualDataColumns.size(); i++) {

            Assert.assertEquals(expectedDataColumns.get(i), actualDataColumns.get(i));

        }

        List<Object> expectedDataInfo=List.of(true,true,false,"2024-04-14 16:25:41.716019",1,1,"","","(123)4567890","Jhon","Doe","ADMIN","admin@gmail.com","$2a$10$OzxrZ4QBh48m.xNHWKEmkOJa6LeW..5S7f5S/MGon6lhVCSiP0rBC","");
        List<Object> actualDataInfo=DB_Utilty.getRowList(query);
        System.out.println(actualDataInfo);

        for (int i = 0; i <1 ; i++) {

            Assert.assertEquals(expectedDataInfo.get(i), actualDataInfo.get(i));

        }


    }



}
