package pl.maclor.conselenium2019;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/",
//        plugin = {"json:target/json"},
        plugin = {"junit:target/cucumber.xml"})
public class RunTest {
}
