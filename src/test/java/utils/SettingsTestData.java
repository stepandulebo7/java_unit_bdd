package utils;
import aquality.selenium.core.utilities.ISettingsFile;
import aquality.selenium.core.utilities.JsonSettingsFile;
import lombok.experimental.UtilityClass;

@UtilityClass
public class SettingsTestData {

    public final String FILE_DATA = "fileData.json" ;


    private static final ISettingsFile Filesettings = new JsonSettingsFile(FILE_DATA);




    public static String getDownloadFile(){
        return Filesettings.getValue("/downloadFile").toString();
    }
    public static String getUploadedFileName(){
        return Filesettings.getValue("/fileName").toString();
    }
    public static String getFilePath(){
        return Filesettings.getValue("/filePath").toString();

    }
}
