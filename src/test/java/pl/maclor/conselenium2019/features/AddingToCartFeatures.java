package pl.maclor.conselenium2019.features;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pl.maclor.conselenium2019.domain.Product;
import pl.maclor.conselenium2019.exceptions.InvalidTestStateException;
import pl.maclor.conselenium2019.pages.CartPage;
import pl.maclor.conselenium2019.pages.CategoryPage;
import pl.maclor.conselenium2019.pages.MainPage;
import pl.maclor.conselenium2019.pages.ProductPage;

import static org.assertj.core.api.Assertions.assertThat;

public class AddingToCartFeatures {
    private ProductPage productPage;
    private CartPage cartPage;
    private MainPage mainPage;
    private CategoryPage categoryPage;

    private Product product;

    @Given("^customer is on (product|main|category) page$")
    public void customerIsOnProductPage(final String page) {
    }

    @When("^he adds product to cart$")
    public void heAddProductToCart() {

    }

    @Then("^this product should be added to cart$")
    public void thisProductShouldBeAddedToCart() {

    }

    @When("^he adds product to cart from popover$")
    public void heAddsProductToCartFromPopover() {

    }
}
