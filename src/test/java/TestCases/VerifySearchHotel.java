package TestCases;

import java.time.Duration;

import org.testng.annotations.Test;

import PageObjectModel.SearchHotel;
import PageObjectModel.popup;
import Resources.BaseClass;
import Resources.CommonMethods;
import Resources.Constants;

public class VerifySearchHotel extends BaseClass {
	
	@Test
	public void searchHotel() throws Exception {
		
		
		SearchHotel obj = new SearchHotel(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		obj.Hotel().click();
		popup obj1 = new popup(driver);

		if (obj1.close().isEnabled() == true) {
			obj1.close().click();
			Thread.sleep(3000);
		} else if (obj1.close().isEnabled() != true) {
			Thread.sleep(3000);
			System.out.println(" nai millra bhai");
		}

		Thread.sleep(3000);
		if (obj1.close2().isEnabled() == true) {
			obj1.close2().click();
		}

		Thread.sleep(3000);
		obj.RadioButtonIndia().click();
		obj.SearchProperty().sendKeys(Constants.SearchProperty); 
		obj.SelectCity().click();
		Thread.sleep(3000);
		obj.HotelBookingDateBT().click();
		Thread.sleep(3000);
		CommonMethods.calendarHandling1(Constants.bookingDate1, Constants.bookingDate2, obj.HotelBookingDate());
		Thread.sleep(3000);
		obj.NoOfGuest().click();
		Thread.sleep(3000);
//		obj.NoOfAdults().click();
//		Thread.sleep(3000);
		obj.NoOfChildren().click();
		Thread.sleep(3000);
		obj.ClickDownArrow().click();
		obj.AgeOfChild().click();
		Thread.sleep(3000);
		obj.Donebt().click();
		Thread.sleep(3000);
		obj.Search().click();
		Thread.sleep(7000);
	
	}

}
