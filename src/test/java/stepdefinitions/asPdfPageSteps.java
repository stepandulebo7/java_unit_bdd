package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.asPdfPage;

public class asPdfPageSteps {
    asPdfPage asPdfPage = new asPdfPage();
    @Then("The Download as PDF page is displayed")
    public void isPageDisplayed(){
        Assert.assertTrue(asPdfPage.isPageOpened(),"Download as pdf page is not opened");
    }
    @When("The user downloads the file from the \"Download as PDF\" page")
    public void downloadFile(){
    asPdfPage.clickFileDownloadLink();
    }
    @Then("The file is successfully downloaded with the expected name")
    public void isDownloadedFileExist(){
        Assert.assertTrue(asPdfPage.isFileExists());
    }
}
