package stepdefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.pageInfoPage;

public class pageInfoSteps {
    pageInfoPage pageInfoPage = new pageInfoPage();
    @Then("The {string} page is displayed")
    public void isPageDisplayed(String pagename){
        Assert.assertTrue(pageInfoPage.isPageOpened(pagename),"Article page is not opened");
    }
}
