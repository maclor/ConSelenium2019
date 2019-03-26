package pl.maclor.conselenium2019;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/google.feature", plugin = {"json:target/json"})
public class GoogleTest {
}
