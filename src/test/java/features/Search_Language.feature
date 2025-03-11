Feature: Change the search language

  Scenario: User changes search language
    Given The user is on the main page
    When The user inputs "Gabriel García Márquez" in the search field
    And Change the search language to Spanish
    And Clicks the submit button
    Then The article page for "Gabriel García Márquez" is displayed