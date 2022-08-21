package TestRunners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Features",
        glue = {"Steps", "Hooks"},
        monochrome = true,
        plugin = {
                "pretty",
                "html:target/htmlReports",
                "json:target/jsonReports/testResult.json",
                "junit:target/xmlReports/testResults.xml"
        }
)
public class FirefoxTestRunner extends AbstractTestNGCucumberTests {

}