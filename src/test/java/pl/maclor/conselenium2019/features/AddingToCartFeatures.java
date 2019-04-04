package pl.maclor.conselenium2019.features;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pl.maclor.conselenium2019.pages.CartPage;
import pl.maclor.conselenium2019.pages.ProductPage;

import static org.assertj.core.api.Assertions.assertThat;

public class AddingToCartFeatures {
    private ProductPage productPage;
    private CartPage cartPage;

    private String productName;

    @Given("^customer is on product page$")
    public void customerIsOnProductPage() {
        productPage.open();
    }

    @When("^he add product to cart$")
    public void heAddProductToCart() {
        productName = productPage.getProductName();
        productPage.clickAddToCart();
    }

    @Then("^this product should be added to cart$")
    public void thisProductShouldBeAddedToCart() {
        cartPage.open();
        assertThat(cartPage.getProductName()).isEqualTo(productName);
    }
}
