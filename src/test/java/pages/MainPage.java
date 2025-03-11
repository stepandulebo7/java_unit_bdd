package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IComboBox;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

import static aquality.selenium.browser.AqualityServices.getElementFactory;

public class MainPage extends Form {
    private final ITextBox searchBox = getElementFactory().getTextBox(By.xpath("//input[@id='searchInput']"), "Search Box");
    private final IButton submitBtn = getElementFactory().getButton(By.xpath("//button[contains(@class, 'pure-button')]"),"Submit button");
    private final IButton changeLanguageBtn = getElementFactory().getButton(By.xpath("//select[@id='searchLanguage']"),"Change language button");

    private final IButton esBtn = getElementFactory().getButton(By.xpath("//option[@lang='es' and text()='Español']"),"asdasdasd");
    private final IButton languageSelector = getElementFactory().getButton(By.xpath("//*[@id=\"search-input\"]/div[1]"),"Change language button");
    public MainPage() {
        super(By.xpath("//form[@class='pure-form']"),"Main page");
    }

    public void searchInput(String page) {
       searchBox.clearAndType(page);
    }
    public void submitBtn() {
        submitBtn.click();
    }
    public void changeLanguage(){
    languageSelector.click();
    esBtn.click();
    }


}
