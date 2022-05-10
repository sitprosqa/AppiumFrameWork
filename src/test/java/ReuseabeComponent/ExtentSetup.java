package ReuseabeComponent;

import TestExecution.ObjectsRepo;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentSetup extends ObjectsRepo {
    public static ExtentReports setupExtentReport(){
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyy HH-mm-ss");
        Date date = new Date();
        String actualDate = format.format(date);
       ExtentSparkReporter sparkReporter = new ExtentSparkReporter("D:\\Results\\extentReports");
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
        sparkReporter.config().setDocumentTitle("DocumentTitle");
        sparkReporter.config().setTheme(Theme.DARK);
        sparkReporter.config().setReportName("Appium Project");
        return extent;

    }

}
