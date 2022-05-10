package Utils;

import BrowsePackage.driverMain;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class CommonFunctions extends driverMain {


    public void screenshotCapturing(String fileName) {
        String dateName = new SimpleDateFormat("dd-MM-yyyy_hh_mm_ss").format(new Date());
        try {
            TimeUnit.SECONDS.sleep(3);
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            System.out.println(fileName + "/" + dateName + ".png");
            FileUtils.copyFile(source, new File(fileName + "/" + dateName + ".png"));

        } catch (IOException | InterruptedException e) {
            e.getMessage();
        }
        System.out.println("the userStatus screenshot is taken");
    }
}
