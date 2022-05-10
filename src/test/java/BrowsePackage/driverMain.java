package BrowsePackage;

import ReuseabeComponent.ListenersImplementation;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.DriverManager;
import java.util.concurrent.TimeUnit;

public class driverMain extends ListenersImplementation {




        @BeforeSuite
        public void driverExec () throws InterruptedException, MalformedURLException {
//        try {

/*
            System.out.println("C");
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("deviceName", "SM-G610F");
            //   cap.setCapability("udid", "0526633071000614");
            cap.setCapability("automationName", "uiAutomator2");
            cap.setCapability("platformName", "Android");
            cap.setCapability("platformVersion", "8.1.0");
           // cap.setCapability("appPackage", "com.sec.android.app.popupcalculator");
            cap.setCapability("appPackage", "com.zong.customercare");
           // cap.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
            cap.setCapability("appActivity", "com.zong.myzong.HomeActivity");*/

            // Pak Railway

            System.out.println("Pakistan Railway");
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("deviceName", "SM-G610F");
            cap.setCapability("automationName", "uiAutomator2");
            cap.setCapability("platformName", "Android");
            cap.setCapability("platformVersion", "8.1.0");
            cap.setCapability("appPackage", "pk.gov.railways");
            cap.setCapability("appActivity", "pk.gov.railways.customers.activities.NewHomeActivity");

            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new AppiumDriver<MobileElement>(url, cap);
           // TimeUnit.SECONDS.sleep(10);

            driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

        }
       // @AfterSuite
        @AfterTest

        public void tearDown () {
            driver.quit();

        }

//    public static AppiumDriver<MobileElement> getDriver(){
//
//        return driver;
//    }

    }
