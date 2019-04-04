package pl.maclor.conselenium2019.steps;

import net.thucydides.core.annotations.Step;
import pl.maclor.conselenium2019.pages.LoginPage;

public class LoginSteps {

    private LoginPage loginPage;

    @Step
    public void login(String email, String password) {
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        loginPage.clickLogin();
    }
}
