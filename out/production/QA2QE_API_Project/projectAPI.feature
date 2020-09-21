Feature: Test that the system returns a list of search results

  Scenario: Successful list of search results returned

    Given that the customer is on the Home page
    And enters a product name in the search field
    When the customers clicks the search icon to search
    Then the system should return a list of search results