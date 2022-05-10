package TestLogic;

import BrowsePackage.driverMain;
import Properties.Locators;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class PakRailwayMethods extends driverMain {
    public Locators locate = new Locators();

    public MobileElement clickFormStation(){

        return driver.findElement(MobileBy.id(locate.clickFormStation));
    }

    public MobileElement Enter_text_FormStation(){

        return driver.findElement(MobileBy.id(locate.TextFormStation));
    }

    public MobileElement ClickOnKarachi(){

        return driver.findElement(MobileBy.xpath(locate.clickKarachi));
    }

    public MobileElement Enter_text_ToStation(){

        return driver.findElement(MobileBy.id(locate.TextToStation));
    }

    public MobileElement ClickOnlAHORE(){


        return driver.findElement(MobileBy.xpath(locate.clickOnlahore));
    }

    public MobileElement ClickOnDate(){


        return driver.findElement(MobileBy.id(locate.clickOnDate));
    }

    public MobileElement ClickOnSerchTrain(){

        return driver.findElement(MobileBy.id(locate.clickOnSerchTrain));

    }
    public MobileElement ScrollTillElement(){
       return driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList()" +
                        ".scrollIntoView(new UiSelector().text(\"43UP - Shah Hussain Express\"))"));

    }

    public MobileElement ScrollTillElementBYparameter(String value){
        return driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList()" +
                        ".scrollIntoView(new UiSelector().text("+value+"))"));

        // "7UP - Tezgam"
    }


    public MobileElement ClickOnEticketButton(){

        return driver.findElement(MobileBy.id(locate.clickOnEticketButton));

    }

    public MobileElement ClickOnEconomy(){
        return driver.findElement(MobileBy.xpath(locate.clickOnEconomy));
    }

    public MobileElement ClickOnACstandered(){

        return driver.findElement(MobileBy.xpath(locate.clickOnACstandard));
    }

    public boolean AssertEquals(By by, String value) {

        return  driver.findElement(by).getText().equals(value);

    }
    public boolean isStringContains(By by, String value) {
        return driver.findElement(by).getText().contains(value);
    }
    }

