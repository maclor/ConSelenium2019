package pl.maclor.conselenium2019.pages.box;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ConfirmationBox extends PageObject {

    @FindBy(id = "layer_cart")
    private WebElementFacade box;

    public void waitForPresent() {
        box.waitUntilVisible();
    }
}
