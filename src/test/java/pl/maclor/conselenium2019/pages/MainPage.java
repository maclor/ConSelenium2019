package pl.maclor.conselenium2019.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MainPage extends PageObject {

    @FindBy(className = "ajax_block_product")
    private WebElementFacade product;

    @FindBy(className = "ajax_add_to_cart")
    private WebElementFacade addToCart;

    public void moveMouseOverProduct() {
        withAction().moveToElement(product).perform();
    }

    public void clickAddToCart() {
        addToCart.click();
    }
}
