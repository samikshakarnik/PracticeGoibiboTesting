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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		obj.searchTrain().click();
		obj.EnterFromName().click();
		obj.EnterName().sendKeys(Constants.EnterFromName);
		obj.EnterName().click();
		 
		for(WebElement list : obj.SearchFromList()) {
			try {
			if(list.getText().equalsIgnoreCase("Pune - All Stations")) { 
				list.click(); 
			}
		}
		catch(StaleElementReferenceException exe){
			for(WebElement list1 : obj.SearchFromList()) {
				if(list1.getText().equalsIgnoreCase("Pune - All Stations")) {
					list1.click();
				}
			}
		}	
	}
		obj.EnterToName().click();
		obj.EnterName().sendKeys(Constants.EnterToName);
		for(WebElement list : obj.SearchToList()) {
			try {
			if(list.getText().equalsIgnoreCase("New Delhi Railway Station")) {
			    list.click();
			}
		}catch(StaleElementReferenceException exe){
			for(WebElement list1 : obj.SearchToList()) {
				if(list1.getText().equalsIgnoreCase("New Delhi Railway Station")) {
					list1.click();
				}
			}
		}	
	}
		CommonMethods.calendarHandling("28", obj.Calendar());
		obj.Tatkal().click();
		obj.searchTrainBt().click();
		
	}

}
