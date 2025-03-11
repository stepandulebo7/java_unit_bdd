package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;
import utils.FileUtils;
import utils.SettingsTestData;

import java.io.File;

public class asPdfPage extends Form {
   // private final String path = "C:\\Users\\stepa\\IdeaProjects\\unit5_finalTask\\src\\test\\resources";
    private final String RESOURCE_FILE_PATH = SettingsTestData.getFilePath();
       public final String FILE_NAME = SettingsTestData.getDownloadFile();
    public final String FILE_PATH = RESOURCE_FILE_PATH+FILE_NAME;
    private final File downloadedFile = new File(FILE_PATH);
    private final IButton submitBtn = getElementFactory().getButton(By.xpath("//button[@type='submit']"),"Submit button");

    public asPdfPage() {
        super(By.xpath("//div[contains(@class,'mw-page-container')]"),"Download as PDF page");
    }
    public boolean isPageOpened() {
        return state().isDisplayed();
    }
    public void clickFileDownloadLink() {
        submitBtn.click();
    }
    public boolean isFileExists(){
        return FileUtils.isFileExist(downloadedFile);
    }

}