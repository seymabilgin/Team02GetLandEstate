package getlandestate.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:TestOutPut/failed_scenario.txt"},
        features = "@TestOutPut/failed_scenario.txt",
        glue = {"getlandestate/stepDefinitions", "getlandestate/hooks"},
        dryRun = false,
        monochrome = false

)
public class FailedRunner {
}
/*
   Bu classta sadece fail olan test scenario larini çalıştıracağız
   sadece txt dosyasındaki fail olan senaryolar çalıştırılacağı için tags parametresine gerek yoktur


    rerun plugini ile fail olan scenariolari burada belirtmiş olduğumuz failed_scenario.txt dosyası içinde tutabiliriz
 */