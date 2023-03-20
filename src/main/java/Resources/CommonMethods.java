package Resources;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonMethods extends BaseClass {

	public static void calendarHandling( String bookingDate, List<WebElement> Calendar) {
		
		
		
		List<WebElement>  compeleteMonth = Calendar;
		for (WebElement date : compeleteMonth) {
			if (date.getText().equalsIgnoreCase(bookingDate)) {
				date.click();
				
			}
		}
	}
	
	public static void calendarHandling1( String bookingDate1, String bookingDate2,
			List<WebElement> HotelBookingDate) {
		
		List<WebElement> compeleteMonth1 = HotelBookingDate;
		for (WebElement date : compeleteMonth1) {
			if (date.getText().equalsIgnoreCase(bookingDate1)) {
				date.click();
			
			}
			if (date.getText().equalsIgnoreCase(bookingDate2)) {
				date.click();
				
			}
		}
	}
	
	
}


