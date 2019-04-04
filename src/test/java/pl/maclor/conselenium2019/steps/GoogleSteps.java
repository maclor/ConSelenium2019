package pl.maclor.conselenium2019.steps;

import pl.maclor.conselenium2019.pages.SearchPage;

public class GoogleSteps {
    private SearchPage googlePage;

    public void searchInGoogle(final String phrase) {
        googlePage.enterSearchPhrase(phrase);
        googlePage.clickSearch();
    }

}
