package pl.maclor.conselenium2019.pages;

import lombok.Getter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import pl.maclor.conselenium2019.domain.Product;
import pl.maclor.conselenium2019.pages.box.ConfirmationBox;

@DefaultUrl("/index.php?id_product=1&controller=product")
public class ProductPage extends PageObject {

    @FindBy(css = "#add_to_cart button")
    private WebElementFacade addToCartButton;

    @FindBy(xpath = "//*[@itemprop='name']")
    private WebElementFacade productName;

    @Getter
    private ConfirmationBox confirmationBox;

    public void clickAddToCart() {
        addToCartButton.click();
    }

    public Product getProduct() {
        return Product.builder()
                .name(productName.getText())
                .build();
    }
}
