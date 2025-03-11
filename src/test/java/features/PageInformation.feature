Feature: Show page information

  Scenario: User wants to see information about page
    Given The user is on the main page
    When The user inputs "Bengal tiger" in the search field
    And Clicks the submit button
    Then The article page for "Bengal tiger" is displayed

    When The user clicks the "Tools" menu
    And Clicks the "Page information" button
    Then The "Bengal tiger" page is displayed



