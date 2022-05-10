package Properties;

public class Locators {

//region SerchTickets
public String Assert_Dateid = "pk.gov.railways:id/textview_date_depart";
//endregion

//region Etickets Locators
     public String TrainName = "37UP - Fareed Express";
     public String FormStation = "karachi";
     public String ToStation = "LAHORE";
     public String Assert_Berth_Fare = "pk.gov.railways:id/seat_berth_fare";
     public String Assert_Seat_Fare = "pk.gov.railways:id/seat_fare";
//endregion
//region PakRailwayMethods Locarors
     public String clickFormStation = "pk.gov.railways:id/tv_from_station";
     public String TextFormStation = "android:id/search_src_text";
     public String clickKarachi = "//android.widget.ListView//android.widget.TextView";
     public String TextToStation = "android:id/search_src_text";
     public String clickOnlahore = "//android.widget.ListView//android.widget.TextView";
     public String clickOnDate = "android:id/button1";
     public String clickOnSerchTrain = "pk.gov.railways:id/btn_search_trains";
     public String clickOnEticketButton = "pk.gov.railways:id/book_ticket_button";
     public String clickOnACstandard = "//android.widget.TextView[@text='AC Standard']//following-sibling::android.widget.RelativeLayout";
     public String clickOnEconomy = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView";
//endregion

}
