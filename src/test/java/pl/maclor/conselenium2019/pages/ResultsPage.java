package pl.maclor.conselenium2019.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class ResultsPage extends PageObject {

    @FindBy(xpath = "//div[@class='r']/a/h3")
    private List<WebElementFacade> searchResultsHeaders;

    @FindBy(xpath = "//div[@class='r']/a")
    private List<WebElementFacade> searchResultsUrls;

    public List<String> getSearchResultsHeaders() {
        return searchResultsHeaders.stream()
                .map(WebElementFacade::getText)
                .collect(toList());
    }

    public List<String> getSearchResultsUrls() {
        return searchResultsUrls.stream()
                .map(element -> element.getAttribute("href"))
                .collect(toList());
    }

}
