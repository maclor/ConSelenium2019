package pl.maclor.conselenium2019.features;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
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

    private String productName;

    @Given("^customer is on (product|main|category) page$")
    public void customerIsOnProductPage(String page) {
        switch (page) {
            case "product":
                productPage.open();
                break;
            case "main":
                mainPage.open();
                break;
            case "category":
                categoryPage.open();
                break;
        }
    }

    @When("^he adds product to cart$")
    public void heAddProductToCart() {
        productName = productPage.getProductName();
        productPage.clickAddToCart();
        productPage.getConfirmationBox().waitForPresent();
    }

    @Then("^this product should be added to cart$")
    public void thisProductShouldBeAddedToCart() {
        cartPage.open();
        assertThat(cartPage.getProductName()).isEqualTo(productName);
    }

    @When("^he adds product to cart from popover$")
    public void heAddsProductToCartFromPopover() {
        mainPage.moveMouseOverProduct();
        mainPage.clickAddToCart();
    }
}
