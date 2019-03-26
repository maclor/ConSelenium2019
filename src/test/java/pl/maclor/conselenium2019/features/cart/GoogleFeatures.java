package pl.maclor.conselenium2019.features.cart;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.assertj.core.api.SoftAssertions;
import pl.maclor.conselenium2019.pages.ResultsPage;
import pl.maclor.conselenium2019.pages.SearchPage;
import pl.maclor.conselenium2019.steps.login.GoogleSteps;

public class GoogleFeatures {

    private SearchPage googlePage;
    private ResultsPage resultsPage;

    @Steps
    private GoogleSteps googleSteps;

    @Given("^user is on google$")
    public void userIsOnGoogle() {
        googlePage.open();
    }

    @When("^he searches for a interesting phrase$")
    public void heSearchesForAInterestingPhrase() {
        googleSteps.searchInGoogle("ConSelenium 2019");
    }

    @Then("^search results list is shown$")
    public void searchResultsListIsShown() {
        final SoftAssertions assertions = new SoftAssertions();

        assertions.assertThat(resultsPage.getSearchResultsHeaders())
                .contains("ConSelenium | Konferencja dla automatyków");
        assertions.assertThat(resultsPage.getSearchResultsUrls())
                .contains("http://conselenium.pl/");

        assertions.assertAll();
    }
}
