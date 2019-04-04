package pl.maclor.conselenium2019.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/index.php?controller=order")
public class CartPage extends PageObject {

    @FindBy(css = "#order-detail-content .product-name")
    private WebElementFacade productName;

    public String getProductName() {
        return productName.getText();
    }
}
