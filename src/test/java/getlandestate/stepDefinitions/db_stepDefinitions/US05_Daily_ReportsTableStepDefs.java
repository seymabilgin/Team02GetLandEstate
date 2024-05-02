package getlandestate.stepDefinitions.db_stepDefinitions;

import getlandestate.utilities.DB_Utilty;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

public class US05_Daily_ReportsTableStepDefs {

    Statement statement;
    ResultSet resultSet;

    String query="SELECT * FROM daily_reports";

    @Given("daily_reports sutun isimleri ve bilgileri almak icin query gonderilir")
    public void daily_reportsSutunIsimleriVeBilgileriAlmakIcinQueryGonderilir() {
        DB_Utilty.createConnection();
        DB_Utilty.executeQuery(query);

    }

    @Then("daily_reports sutun isimleri ve bilgileri dogrulanır")
    public void daily_reportsSutunIsimleriVeBilgileriDogrulanır() throws ParseException {
        List<String> expectedDataColumns=List.of("date","number_of_contact_message","number_of_favorites","number_of_rent_adverts","number_of_sale_adverts","number_of_tour_requests","number_of_users","id");

        List<String> actualDataColumns= DB_Utilty.getColumnNames(query);
        System.out.println(actualDataColumns);


        for (int i = 0; i < actualDataColumns.size(); i++) {

            Assert.assertEquals(expectedDataColumns.get(i), actualDataColumns.get(i));

        }

        Date date= DB_Utilty.date("2024-04-17");
        Integer num=4;
        Long numLong=num.longValue();

        List<Object> expectedDataInfo=List.of(date, 10, 2, 31, 32, 21, 66,numLong );


        List<Object> actualDataInfo=DB_Utilty.getRowListIndex(query,3);
        System.out.println(actualDataInfo);


        for (int i = 0; i <8 ; i++) {
            Assert.assertEquals(expectedDataInfo.get(i),actualDataInfo.get(i));
        }


        }




    }

