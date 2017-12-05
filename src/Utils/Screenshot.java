package Utils;

import Execute.Setup;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;

public class Screenshot {
    public static void makeSS(){
        File screenshot = ((TakesScreenshot)Setup.driver).getScreenshotAs(OutputType.FILE);
    }
}
