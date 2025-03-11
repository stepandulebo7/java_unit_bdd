$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/Download_PDF.feature");
formatter.feature({
  "name": "Download article as PDF",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User downloads an article as a PDF file",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user is on the main page",
  "keyword": "Given "
});
formatter.match({
  "location": "hooks.Hooks.setup()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user inputs \"Albert Einstein\" in the search field",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.MainPageSteps.inputSearchText(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicks the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.MainPageSteps.clickSubmitBtn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The article page for \"Albert Einstein\" is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.articlePageSteps.isPageDisplayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user clicks the \"Tools\" menu",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.articlePageSteps.ToolsMenu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicks the \"Download as PDF\" button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.articlePageSteps.downloadPdf(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The Download as PDF page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.asPdfPageSteps.isPageDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user downloads the file from the \"Download as PDF\" page",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.asPdfPageSteps.downloadFile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The file is successfully downloaded with the expected name",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.asPdfPageSteps.isDownloadedFileExist()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/features/PageInformation.feature");
formatter.feature({
  "name": "Show page information",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User wants to see information about page",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user is on the main page",
  "keyword": "Given "
});
formatter.match({
  "location": "hooks.Hooks.setup()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user inputs \"Bengal tiger\" in the search field",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.MainPageSteps.inputSearchText(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicks the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.MainPageSteps.clickSubmitBtn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The article page for \"Bengal tiger\" is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.articlePageSteps.isPageDisplayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user clicks the \"Tools\" menu",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.articlePageSteps.ToolsMenu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicks the \"Page information\" button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.articlePageSteps.downloadPdf(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The \"Bengal tiger\" page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.pageInfoSteps.isPageDisplayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/features/Search_Language.feature");
formatter.feature({
  "name": "Change the search language",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User changes search language",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user is on the main page",
  "keyword": "Given "
});
formatter.match({
  "location": "hooks.Hooks.setup()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user inputs \"Gabriel García Márquez\" in the search field",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.MainPageSteps.inputSearchText(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Change the search language to Spanish",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.MainPageSteps.changeLg()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicks the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.MainPageSteps.clickSubmitBtn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The article page for \"Gabriel García Márquez\" is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.articlePageSteps.isPageDisplayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});