package pages;

import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class pageInfoPage extends Form {
    private final ILabel headerText = getElementFactory().getLabel(By.xpath("//h1[@id='firstHeading']"),"Header text");
    public pageInfoPage() {
        super(By.xpath("//div[@class='mw-page-container-inner']"),"Download as PDF page");
    }
    public boolean isPageOpened(String pagename) {
        return headerText.getText().contains(pagename);
    }

}
