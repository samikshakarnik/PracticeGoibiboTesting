package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObjectModel.SearchBus;
import PageObjectModel.popup;
import Resources.BaseClass;
import Resources.CommonMethods;
import Resources.Constants;

public class VerifySearchBus extends BaseClass {
	@Test
	public void searchBus() throws Exception {

		SearchBus obj = new SearchBus(driver);
		obj.SearchBusbt().click();
		
		Thread.sleep(3000);

		obj.EnterFromCity().sendKeys(Constants.EnterFromCity);
		Thread.sleep(3000);
		for (WebElement list : obj.SearchFromCity()) {
			try {
				if (list.getText().equalsIgnoreCase("Shivaji Nagar, Pune")) {
					Thread.sleep(3000);
					list.click();

				}
			} catch (StaleElementReferenceException ex) {
				for (WebElement list1 : obj.SearchFromCity()) {
					if (list1.getText().equalsIgnoreCase("Shivaji Nagar, Pune")) {
						Thread.sleep(3000);
						list1.click();

					}
				}
			}
	    }
		obj.EntertoCity().click();
		obj.EntertoCity().sendKeys(Constants.EntertoCity);
		Thread.sleep(3000);
		for (WebElement list1 : obj.SearchtoCity()) {
			try {
				if (list1.getText().equalsIgnoreCase("Mumbai Naka, Nashik")) {
					list1.click();
				}
			} catch (StaleElementReferenceException ex) {
				for (WebElement list2 : obj.SearchtoCity()) {
					if (list2.getText().equalsIgnoreCase("Mumbai Naka, Nashik")) {
						list2.click();
					}
				}
			}
		}
		obj.PickDate().click();
		Thread.sleep(3000);
		try {
		CommonMethods.calendarHandling(Constants.bookingDate, obj.Calendar());
		}catch(Exception ex) {
			CommonMethods.calendarHandling(Constants.bookingDate, obj.Calendar());	
		}
		Thread.sleep(3000);
		obj.SearchBt().click();
		Thread.sleep(3000);
	}
}
