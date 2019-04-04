package pl.maclor.conselenium2019.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/index.php?id_product=1&controller=product")
public class ProductPage extends PageObject {

    @FindBy(css = "#add_to_cart button")
    private WebElementFacade addToCartButton;

    public void clickAddToCart() {
        addToCartButton.click();
    }
}
