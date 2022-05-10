package ReuseabeComponent;

import TestExecution.ObjectsRepo;
import com.aventstack.extentreports.Status;
import org.aspectj.util.FileUtil;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ListenersImplementation extends ObjectsRepo implements ITestListener {

    @Override
    public void onStart(ITestContext iTestContext) {
//setup method call
       extent = ExtentSetup.setupExtentReport();
    }
    @Override
    public void onFinish(ITestContext iTestContext) {
        // close extent
        extent.flush();
    }
    @Override
    public void onTestStart(ITestResult result) {
     test =   extent.createTest(result.getMethod().getMethodName());

    }
    @Override
    public void onTestSuccess(ITestResult iTestResult) {
      test.log(Status.PASS,"Test Case"+" "+iTestResult.getMethod().getMethodName()+" "+"Is Passed");

    }
   @Override
    public void onTestFailure(ITestResult iTestResult) {

        test.log(Status.FAIL,"Test Case"+iTestResult.getMethod().getMethodName()+"Is Failed");
        test.log(Status.FAIL,iTestResult.getThrowable());
       File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyy HH-mm-ss");
        Date date = new Date();
        String actualDate = format.format(date);
        File dest = new File("D:/Results/ScreenShort/"+actualDate+".Jpeg");

        try {
            FileUtil.copyFile(src,dest);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            test.addScreenCaptureFromPath("D:/Results/ScreenShort/"+actualDate+".Jpeg","Test case failure");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void onTestSkipped(ITestResult iTestResult) {
       /* Log.info(getTestMethodName(iTestResult) + " test is skipped.");
        //ExtentReports log operation for skipped tests.
        getTest().log(Status.SKIP, "Test Skipped");*/
        test.log(Status.SKIP,"Test Skipped");
    }
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
     //   Log.info("Test failed but it is in defined success ratio " + getTestMethodName(iTestResult));
    }
}
