package getlandestate.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports2.html",
                "json:target/json-reports/cucumber2.json",
                "junit:target/xml-report/cucumber2.xml",
                "rerun:TestOutput/failed_scenario.txt"
        },
        features = "src/test/resources/features",
        glue = {"getlandestate/stepDefinitions","getlandestate/hooks"},
        tags = "",
        dryRun = false
        ,monochrome=false
)
public class ParallelRunner2 {

}
