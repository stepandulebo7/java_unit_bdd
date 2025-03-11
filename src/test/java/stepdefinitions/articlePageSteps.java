package stepdefinitions;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.ILink;
import constants.LocatorConstants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.articlePage;

public class articlePageSteps {
    articlePage articlePage =new articlePage();
    @Then("The article page for {string} is displayed")
    public void isPageDisplayed(String pagename){
        Assert.assertTrue(articlePage.isPageOpened(pagename),"Article page is not opened");
    }
    @When("The user clicks the \"Tools\" menu")
    public void ToolsMenu(){
        articlePage.clickToolsMenu();
    }
    @And("Clicks the {string} button")
    public void downloadPdf(String name){
        articlePage.clicktoolsBtn(name);
    }

}
