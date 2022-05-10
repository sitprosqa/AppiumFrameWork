package TestExecution;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ObjectsRepo {

    public static ExtentReports extent;
    public static ExtentTest test;
    public static AppiumDriver<MobileElement> driver;
}
