package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.forms.Form;
import constants.LocatorConstants;
import org.openqa.selenium.By;

public class articlePage extends Form {
    private final ILabel headerText = getElementFactory().getLabel(By.xpath("//span[@class='mw-page-title-main']"),"Header text");
    private final IButton toolsBtn = getElementFactory().getButton(By.xpath("//div[@id=\"vector-page-tools-dropdown\"]"),"Tools button");

    public articlePage() {
        super(By.xpath("//div[@class='mw-page-container']"),"Article page");
    }
    public boolean isPageOpened(String pagename) {
        return headerText.getText().contains(pagename);
    }
    public void clickToolsMenu(){
    toolsBtn.click();
    }


    private ILink getILink(String navigation) {
        return AqualityServices.getElementFactory().getLink(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH,
                navigation)), navigation);
    }
    public void clicktoolsBtn(String navigation) {
        getILink(navigation).click();
    }

}
