package getlandestate.base_url;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static getlandestate.utilities.Authentication.token;

public class Base_Url {
    public static RequestSpecification spec;

    public static void setUp(String email, String password){
        spec = new RequestSpecBuilder()
                .setBaseUri("http://www.getlandestate.com:8092")
                .setContentType(ContentType.JSON)
                .addHeader("Authorization", "Bearer " + token(email, password))
                .build();
    }

}
