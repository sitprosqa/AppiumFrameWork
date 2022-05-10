package TestLogic;
import BrowsePackage.driverMain;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;


public class Addition extends driverMain{

    public MobileElement firstInput(){
      //  return driver.findElement(MobileBy.id("com.sec.android.app.popupcalculator:id/bt_02"));
        return driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[4]/android.widget.Button[2]"));
    }


    public MobileElement addbutton(){
        return driver.findElement(MobileBy.id("com.sec.android.app.popupcalculator:id/bt_add"));
    }

    public MobileElement subButton(){
        return driver.findElement(MobileBy.id("com.sec.android.app.popupcalculator:id/bt_sub"));
    }

    public MobileElement equalsButton(){
        return driver.findElement(MobileBy.id("com.sec.android.app.popupcalculator:id/bt_equal"));
    }

    public MobileElement secondInput(){
        return driverMain.driver.findElement(MobileBy.id("com.sec.android.app.popupcalculator:id/bt_02"));
    }

    public MobileElement Multi_Button(){
        return driver.findElement(MobileBy.id("com.sec.android.app.popupcalculator:id/bt_mul"));
    }


}
