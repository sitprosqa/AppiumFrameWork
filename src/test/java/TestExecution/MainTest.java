package TestExecution;

import BrowsePackage.driverMain;
import BusinessLogic.Implementation;
import TestLogic.Addition;

import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainTest extends driverMain {
    Addition additionPage = new Addition();
    public Implementation methodImplementation = new Implementation();
    public String fileName, filePathUrl = "Screenshot_Mobile_POTs/Android/";
    String dateName = new SimpleDateFormat("d-M-yy_hh_mm_ss").format(new Date());

    @Test(priority = 1,enabled = false)
    public void Add()  {

        System.out.println("TestA");
        methodImplementation.AdditionCase();
    }
    @Test(priority = 2,enabled = false)
    public void Sub(){
        System.out.println("Test sub");
        methodImplementation.Subtraction();
    }

    @Test(priority = 3, enabled = false)
    public void Multiply(){

        methodImplementation.Multiplication();

    }
    @Test(priority = 6, groups = { "Serch", "checkintest" })

    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage()");

    }

    @Test(priority = 4 ,groups = { "Serch" })
    public void SerchTrains() throws InterruptedException, IOException {
        fileName = filePathUrl + "SerchTrains" + dateName;
        Files.createDirectories(Paths.get(fileName));
        methodImplementation.SerchTrains(fileName);

    }

   @Test(priority = 5 ,groups= {"checkintest"})
    public void Eticket() throws InterruptedException {

        methodImplementation.BookEticket();
       System.out.println("Testing groups");

    }

}

