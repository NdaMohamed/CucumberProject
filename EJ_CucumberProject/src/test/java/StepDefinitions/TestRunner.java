package StepDefinitions;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

//import cucumber.api.CucumberOptions;
 


@RunWith(Cucumber.class) 
@CucumberOptions(features="D:/Projects/EJCucmberProject/src/test/resources/Features",
glue={"StepDefinitions"},
monochrome = true,
plugin = { "pretty", "html:target/HtmlReports/report.html"})
public class TestRunner {
}
 