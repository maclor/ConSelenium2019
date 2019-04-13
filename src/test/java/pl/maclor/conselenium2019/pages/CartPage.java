package pl.maclor.conselenium2019.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import pl.maclor.conselenium2019.domain.Product;
import pl.maclor.conselenium2019.domain.ProductBuilder;

import java.util.ArrayList;
import java.util.List;

@DefaultUrl("/index.php?controller=order")
public class CartPage extends PageObject {

    @FindBy(css = "#cart_summary tbody tr")
    private List<WebElementFacade> products;

    private ProductBuilder productBuilder;

    public List<Product> getProducts() {
        final List<Product> products = new ArrayList<>();
        this.products.forEach(productElement -> products.add(productBuilder.getFromWebElement(productElement)));
        return products;
    }
}
