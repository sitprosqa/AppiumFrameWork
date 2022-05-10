package BusinessLogic;

import BrowsePackage.driverMain;
import Properties.Locators;
import TestLogic.Addition;
import TestLogic.PakRailwayMethods;
import Utils.CommonFunctions;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;
import static org.testng.Assert.assertEquals;

public class Implementation extends driverMain {
    public Addition add = new Addition();
    public PakRailwayMethods Serch = new PakRailwayMethods();
    public Locators locate = new Locators();
    public CommonFunctions Common = new CommonFunctions();
    public CommonFunctions SS = new CommonFunctions();
    //region Assertion id
    public By asrtID = By.id("pk.gov.railways:id/textview_date_depart");
    public String abc = ( "pk.gov.railways:id/textview_date_depart");
    String text = "Thursday 03-February-2022";
   //endregion
     //region Addition Method
    public void AdditionCase() {

        add.firstInput().click();
        add.addbutton().click();
        add.secondInput().click();
        add.equalsButton().click();
        String result = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_03")).getText();
        assertEquals(result,"5");

    }
    //endregion

    //region Subtrsction Method
    public void Subtraction(){

        add.firstInput().click();
        add.subButton().click();
        add.secondInput().click();
        add.equalsButton().click();

    }
    //endregion

    //region Multiplication
    public void Multiplication(){

        add.firstInput().click();
        add.Multi_Button().click();
        add.secondInput().click();
        add.equalsButton().click();

    }
    //endregion

    public void SerchTrains(String testCaseName) throws InterruptedException {
      //  Common.screenshotCapturing(testCaseName);
        SS.screenshotCapturing(testCaseName);
          Serch.clickFormStation().click();
        TimeUnit.SECONDS.sleep(5);
       Serch.Enter_text_FormStation().sendKeys(locate.FormStation);
        TimeUnit.SECONDS.sleep(5);
        Serch.ClickOnKarachi().click();
        TimeUnit.SECONDS.sleep(5);
        Serch.Enter_text_ToStation().sendKeys(locate.ToStation);
        TimeUnit.SECONDS.sleep(5);
        Serch.ClickOnlAHORE().click();
        TimeUnit.SECONDS.sleep(5);
        Serch.ClickOnDate().click();

        Serch.ClickOnSerchTrain().click();
        TimeUnit.SECONDS.sleep(5);
        Serch.ScrollTillElementBYparameter("\"7UP - Tezgam\"");
        TimeUnit.SECONDS.sleep(5);
       String result = driver.findElement(By.id(locate.Assert_Dateid)).getText();
        System.out.println(result);
       assertEquals(result,text);
        Serch.AssertEquals(By.id(abc),text);
        }
        public void BookEticket() throws InterruptedException {
        //   driver.navigate().back();
            TimeUnit.SECONDS.sleep(10);
            Serch.ClickOnEticketButton().click();

            TimeUnit.SECONDS.sleep(10);
            Serch.Enter_text_FormStation().sendKeys(locate.FormStation);
            TimeUnit.SECONDS.sleep(5);
            Serch.ClickOnKarachi().click();
            TimeUnit.SECONDS.sleep(5);
            Serch.Enter_text_ToStation().sendKeys(locate.ToStation);
            TimeUnit.SECONDS.sleep(5);
            Serch.ClickOnlAHORE().click();
            TimeUnit.SECONDS.sleep(5);
            Serch.ClickOnDate().click();
            TimeUnit.SECONDS.sleep(5);
            Serch.ClickOnSerchTrain().click();
            TimeUnit.SECONDS.sleep(5);

            Serch.ScrollTillElementBYparameter("\"43UP - Shah Hussain Express\"");
         //   Serch.ScrollTillElementBYparameter("\"locate.TrainName\"");
            TimeUnit.SECONDS.sleep(5);
         //   test.log(Status.INFO,"Click Economy button");
            Serch.ClickOnACstandered().click();
            TimeUnit.SECONDS.sleep(10);

try {
    String result = driver.findElement(By.id(locate.Assert_Berth_Fare)).getText();
    System.out.println(result);
    //pk.gov.railways:id/seat_fare
    assertEquals(result,"Rs.4050/B");
}
catch (Exception e) {
    System.out.println("Tickets Sold");
}
try {
    TimeUnit.SECONDS.sleep(5);
    String result = driver.findElement(By.id(locate.Assert_Seat_Fare)).getText();
    System.out.println(result);
    //pk.gov.railways:id/seat_fare
    assertEquals(result,"sold out");
}
catch (Exception e){

    System.out.println("Tickets available");
}

        }
        }




