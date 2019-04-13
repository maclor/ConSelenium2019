package pl.maclor.conselenium2019.domain;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class ProductBuilder extends PageObject {

    public Product getFromWebElement(final WebElementFacade productElement) {
        return Product.builder()
                .name(productElement.findElement(By.className("product-name")).getText())
                .build();
    }
}
