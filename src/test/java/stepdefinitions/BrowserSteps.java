package stepdefinitions;
import aquality.selenium.browser.AlertActions;
import aquality.selenium.browser.AqualityServices;
import io.cucumber.java.en.When;

import static io.qameta.allure.Allure.step;

public class BrowserSteps {
    @When("I accept the alert")
        public void AcceptAlert(){
        step("Accept the alert");
        AqualityServices.getBrowser().handleAlert(AlertActions.ACCEPT);
    }


}
