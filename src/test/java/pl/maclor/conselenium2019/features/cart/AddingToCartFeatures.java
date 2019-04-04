package pl.maclor.conselenium2019.features.cart;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pl.maclor.conselenium2019.pages.ProductPage;

public class AddingToCartFeatures {
    private ProductPage productPage;

    @Given("^customer is on product page$")
    public void customerIsOnProductPage() {
        productPage.open();
    }

    @When("^he add product to cart$")
    public void heAddProductToCart() {
        productPage.clickAddToCart();
    }
}
