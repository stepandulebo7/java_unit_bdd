package hooks;

import aquality.selenium.browser.AqualityServices;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import utils.EnvDataReader;


import static aquality.selenium.browser.AqualityServices.getBrowser;

public class Hooks {
    @Before()
    @Given("The user is on the main page")
      public void setup() {
        getBrowser().maximize();
        getBrowser().goTo(EnvDataReader.getEnvData().getHost());
    }

    @After()
    public void teardown() {
        if (AqualityServices.isBrowserStarted()) {
            //  step("Quiting the browser");
         //   getBrowser().quit();
        }
    }
}
