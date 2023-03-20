package TestCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObjectModel.SearchTrain;
import PageObjectModel.popup;
import Resources.BaseClass;
import Resources.CommonMethods;
import Resources.Constants;

public class VerifySearchTrain extends BaseClass{
	@Test
	public void searchTrainn() throws Exception {
		
		SearchTrain obj = new SearchTrain(driver);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
		obj.searchTrain().click();
//		popup obj1 = new popup(driver);
//
//		if (obj1.close().isEnabled() == true) {
//			obj1.close().click();
//			Thread.sleep(3000);
//		} else if (obj1.close().isEnabled() != true) {
//			Thread.sleep(3000);
//			System.out.println(" nai millra bhai");
//		}
//
//		Thread.sleep(3000);
//		if (obj1.close2().isEnabled() == true) {
//			obj1.close2().click();
//		}

		Thread.sleep(3000);
		Thread.sleep(3000);
		obj.EnterFromName().click();
		Thread.sleep(3000);
		obj.EnterName().sendKeys(Constants.EnterFromName);
		obj.EnterName().click();
		Thread.sleep(3000);
		for(WebElement list : obj.SearchFromList()) {
			try {
			if(list.getText().equalsIgnoreCase("Pune - All Stations")) {
				Thread.sleep(3000);
				list.click();
				Thread.sleep(3000);
			}
		}
		catch(StaleElementReferenceException exe){
			for(WebElement list1 : obj.SearchFromList()) {
				if(list1.getText().equalsIgnoreCase("Pune - All Stations")) {
					Thread.sleep(3000);
					list1.click();
					Thread.sleep(3000);
				}
			}
		}	
	}
		Thread.sleep(3000);
		obj.EnterToName().click();
		Thread.sleep(3000);
		obj.EnterName().sendKeys(Constants.EnterToName);
		for(WebElement list : obj.SearchToList()) {
			try {
			if(list.getText().equalsIgnoreCase("New Delhi Railway Station")) {
				Thread.sleep(3000);
				list.click();
				Thread.sleep(3000);
			}
		}catch(StaleElementReferenceException exe){
			for(WebElement list1 : obj.SearchToList()) {
				if(list1.getText().equalsIgnoreCase("New Delhi Railway Station")) {
					Thread.sleep(3000);
					list1.click();
					Thread.sleep(3000);
				}
			}
		}	
	}
		Thread.sleep(3000);
		CommonMethods.calendarHandling("28", obj.Calendar());
		Thread.sleep(3000);
		obj.Tatkal().click();
		Thread.sleep(3000);
		obj.searchTrainBt().click();
		Thread.sleep(5000);
		
	}

}
