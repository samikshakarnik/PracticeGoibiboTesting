package TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObjectModel.SearchFlight;
import PageObjectModel.popup;
import Resources.BaseClass;
import Resources.CommonMethods;
import Resources.Constants;

public class VerifySearchFlight extends BaseClass {
	@Test
	public void searchFlight() throws Exception {

		SearchFlight obj = new SearchFlight(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
		obj.EntercityName().click();
		obj.FromcityName().sendKeys(Constants.FromcityName);
		obj.SelectFromCityName().click();
		obj.EnterDesCityName().sendKeys(Constants.EnterDesCityName);
		obj.SelectDestinationCityName().click();
		CommonMethods.calendarHandling(Constants.bookingDate, obj.Calendar());
		obj.Done().click();
		// for(int i = 0; i<2; i++) {
		obj.AddNumbersofAdult().click();
		// }
		obj.AddNumberofChildren().click();
		obj.Done1().click();
		obj.SearchFlightButton().click();
	}

}
