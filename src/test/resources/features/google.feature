Feature: Searching using google

  Scenario: Simple search
    Given user is on google
    When he searches for a interesting phrase
    Then search results list is shown