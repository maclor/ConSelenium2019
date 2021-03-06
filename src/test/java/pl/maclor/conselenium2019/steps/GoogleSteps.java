package pl.maclor.conselenium2019.steps;

import net.thucydides.core.annotations.Step;
import pl.maclor.conselenium2019.pages.SearchPage;

public class GoogleSteps {
    private SearchPage googlePage;

    @Step
    public void searchInGoogle(final String phrase) {
        googlePage.enterSearchPhrase(phrase);
        googlePage.clickSearch();
    }

}
