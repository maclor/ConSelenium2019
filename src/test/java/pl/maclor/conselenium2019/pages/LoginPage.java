package pl.maclor.conselenium2019.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/index.php?controller=authentication&back=my-account")
public class LoginPage extends PageObject {

    @FindBy(id = "email")
    private WebElementFacade emailInput;

    @FindBy(id = "passwd")
    private WebElementFacade passwordInput;

    @FindBy(id = "SubmitLogin")
    private WebElementFacade loginButton;

    public void enterEmail(final String email) {
        emailInput.type(email);
    }

    public void enterPassword(final String password) {
        passwordInput.type(password);
    }

    public void clickLogin() {
        loginButton.click();
    }

}
