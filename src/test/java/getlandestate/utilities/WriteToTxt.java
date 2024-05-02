package getlandestate.utilities;

import getlandestate.pojos.RegisterPojo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class WriteToTxt {

    public static void saveRegisterData(String fileName, RegisterPojo registerPojo) {
        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));

            for (String s : Arrays.asList(registerPojo.getRegisterFirstName() + "," + registerPojo.getRegisterLastName() + ",",
                    registerPojo.getRegisterPhoneNumber() + "," + registerPojo.getRegisterEmail() + ",",
                    registerPojo.getRegisterPassword() + " \n")) {
                writer.append(s);
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void saveUsers(String fileName, List<List<Object>> user) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, false));

            for (int i = 0; i < user.size(); i++)
                writer.append(user.get(i).toString() + ",\n");
            writer.close();
        } catch (IOException e) {
        }
    }
}