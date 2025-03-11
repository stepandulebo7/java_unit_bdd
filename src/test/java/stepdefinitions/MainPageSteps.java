package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.MainPage;

import static io.qameta.allure.Allure.step;

public class MainPageSteps {
   MainPage mainPage = new MainPage();
@When("The user inputs {string} in the search field")
   public void inputSearchText(String page){
       mainPage.searchInput(page);
   }
   @And("Clicks the submit button")
    public void clickSubmitBtn(){
        mainPage.submitBtn();
    }
    @And("Change the search language to Spanish")
    public void changeLg(){
    mainPage.changeLanguage();
    }
}
