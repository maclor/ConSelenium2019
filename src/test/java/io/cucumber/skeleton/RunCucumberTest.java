package io.cucumber.skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "com.hpe.alm.octane.OctaneGherkinFormatter:target/gherkin-results.xml",
        features = "src/test/resources/io/cucumber/skeleton")
public class RunCucumberTest {
}
