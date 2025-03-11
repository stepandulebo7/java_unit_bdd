Feature: Download article as PDF

  Scenario: User downloads an article as a PDF file
    Given The user is on the main page
    When The user inputs "Albert Einstein" in the search field
    And Clicks the submit button
    Then The article page for "Albert Einstein" is displayed

    When The user clicks the "Tools" menu
    And Clicks the "Download as PDF" button
    Then The Download as PDF page is displayed

    When The user downloads the file from the "Download as PDF" page
    Then The file is successfully downloaded with the expected name
