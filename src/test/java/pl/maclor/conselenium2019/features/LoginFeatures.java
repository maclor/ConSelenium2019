package pl.maclor.conselenium2019.features;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import pl.maclor.conselenium2019.pages.LoginPage;
import pl.maclor.conselenium2019.steps.LoginSteps;

public class LoginFeatures {

    @Steps
    private LoginSteps loginSteps;

    private LoginPage loginPage;

    @Given("^user is on login page$")
    public void isOnLoginPage() {
        loginPage.open();
    }

    @When("^he enters valid username and invalid password$")
    public void heEntersValidUsernameAndInvalidPassword() {
        loginSteps.login("valid", "invalid");
    }

    @When("^he enters valid credentials$")
    public void heEntersValidCredentials() {
        loginSteps.login("valid", "valid");
    }
}
