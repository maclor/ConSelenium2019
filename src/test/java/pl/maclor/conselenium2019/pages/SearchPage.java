package pl.maclor.conselenium2019.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("/")
public class SearchPage extends PageObject {

    @FindBy(name = "q")
    private WebElementFacade searchInput;

    @FindBy(name = "btnK")
    private WebElementFacade searchButton;

    public void enterSearchPhrase(final String phrase) {
        searchInput.type(phrase);
    }

    public void clickSearch() {
        searchButton.click();
    }
}