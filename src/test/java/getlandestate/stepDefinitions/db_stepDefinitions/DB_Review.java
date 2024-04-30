package getlandestate.stepDefinitions.db_stepDefinitions;
import getlandestate.utilities.WriteToTxt;
import org.junit.Test;
import java.util.List;
import java.util.Map;
import static getlandestate.utilities.DB_Utilty.*;
import static org.junit.Assert.assertEquals;

public class DB_Review {

    @Test
    public void test(){
        createConnection();

        //ilk satir bilgilerini verir
        System.out.println(getRowList("select * from users"));

        //sutun isimlerini getirir
        System.out.println(getColumnNames("select * from users"));

        // email adresini verdiginiz kullanici bilgilerini List olarak getirir
        System.out.println(getRowList("select * from users where email = 'murat@manager.com'"));

        // email adresini verdiginiz kullanici bilgilerini Map olarak getirir
        System.out.println(getRowMap("select * from users where email = 'murat@manager.com'"));

        Map<String, Object> data = getRowMap("select * from users where email = 'murat@manager.com'");
        assertEquals("Manager", data.get("first_name"));
        assertEquals("Murat", data.get("last_name"));
        assertEquals("murat@manager.com", data.get("email"));
        assertEquals("(235) 245-2362", data.get("phone"));


        // ilk satırdaki sutun isimleri ve dataları getiriri
        System.out.println(getRowMap("select * from users"));

        // verdiginiz tablodaki tüm bilgileri getirir.
        System.out.println(getQueryResultList("select * from users"));

        List<List<Object>> users = getQueryResultList("select * from users");
        String fileName1 = "src/test/resources/testData/Users.txt";
        WriteToTxt.saveUsers(fileName1, users);
    }
}