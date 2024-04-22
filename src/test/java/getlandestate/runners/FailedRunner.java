package getlandestate.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",//==> console da scenariolar ile ilgili ayrintili bilgi verir
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:TestOutPut/failed_scenario.txt"},
        features = "@TestOutPut/failed_scenario.txt", // yol olarak dosya verirsek başına @ koyarız
        glue = {"com/managementonSchools/stepDefinitions", "com/managementonSchools/hooks"},
        dryRun = false,
        monochrome = true

)
public class FailedRunner {
}
/*
   Bu classta sadece fail olan test scenario larini çalıştıracağız
   sadece txt dosyasındaki fail olan senaryolar çalıştırılacağı için tags parametresine gerek yoktur


    rerun plugini ile fail olan scenariolari burada belirtmiş olduğumuz failed_scenario.txt dosyası içinde tutabiliriz
 */