package TestCases;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObjectModel.SearchCab;
import PageObjectModel.popup;
import Resources.BaseClass;
import Resources.CommonMethods;
import Resources.Constants;

public class VerifySearchCab extends BaseClass {

	@Test
	public void searchCabb() throws Exception {

		SearchCab obj = new SearchCab(driver);
		obj.searchCab().click();
		Thread.sleep(2000);
		obj.roundTrip().click();
		Thread.sleep(2000);
		obj.EnterPickup().sendKeys(Constants.EnterPickup);
		Thread.sleep(2000);
		for (WebElement list : obj.SearchPickup()) {
			try {
				if (list.getText().equalsIgnoreCase(Constants.EnterPickupp)) {
					Thread.sleep(2000);
					list.click();
				}
			} catch (StaleElementReferenceException Exe) {
				  for (WebElement list1 : obj.SearchPickup()) {
					  if (list1.getText().equalsIgnoreCase(Constants.EnterPickupp)) {
						Thread.sleep(2000);
						list1.click();
					}
				}
			}
		}
		Thread.sleep(2000);
		obj.EnterDrop().sendKeys(Constants.EnterDrop);
		Thread.sleep(2000);
		for (WebElement list : obj.SearchDrop()) {
			try {
				if (list.getText().equalsIgnoreCase(Constants.EnterDropp)) {
					Thread.sleep(2000);
					list.click();
				}
			} catch (StaleElementReferenceException Exe) {
				  for (WebElement list1 : obj.SearchDrop()) {
					  if (list1.getText().equalsIgnoreCase(Constants.EnterDropp)) {
						Thread.sleep(2000);
						list1.click();
					}
				}
			}
		}
		Thread.sleep(3000);
		obj.PickupDate().click();
		CommonMethods.calendarHandling(Constants.bookingDate, obj.Calender());
		Thread.sleep(2000);
		obj.PickupTime().click();
		Thread.sleep(2000);
		for (WebElement list : obj.SelectPickTime()) {
			try {
				if (list.getText().equalsIgnoreCase(Constants.PickupTime)) {
					Thread.sleep(2000);
					list.click();
				}
			} catch (StaleElementReferenceException Exe) {
				for (WebElement list1 : obj.SelectPickTime()) {
					if (list1.getText().equalsIgnoreCase(Constants.PickupTime)) {
						Thread.sleep(2000);
						list1.click();
					}
				}
			}
		}
		Thread.sleep(2000);
		obj.ReturnDate().click();
		Thread.sleep(2000);
		CommonMethods.calendarHandling("28", obj.Calender());
		Thread.sleep(2000);
		obj.ReturnTime().click();
		Thread.sleep(2000);
		for (WebElement list : obj.SelectReturnTime()) {
			try {
				if (list.getText().equalsIgnoreCase(Constants.ReturnTime)) {
					Thread.sleep(2000);
					list.click();
				}
			} catch (StaleElementReferenceException Exe) {
				for (WebElement list1 : obj.SelectReturnTime()) {
					if (list1.getText().equalsIgnoreCase(Constants.ReturnTime)) {
						Thread.sleep(2000);
						list1.click();
					}
				}
			}
		}
		Thread.sleep(2000);
		obj.SearchCabBT().click();
		Thread.sleep(2000);
	}
}
