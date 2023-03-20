package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchCab {

	public WebDriver driver;
	
	private By searchCab = By.xpath("//a[@href='/cars/']");
	private By roundTrip = By.xpath("(//span[@class='CustomRadioButtonUIstyles__Dot-sc-1ffkzia-2 hAzeQw'])[2]");
	private By EnterPickup = By.xpath("//input[@id='downshift-1-input']");
	private By SearchPickup = By.xpath("//div[@id='downshift-1-menu']//div//li//div//p[1]");
	private By EnterDrop = By.xpath("(//input[@name='autosuggest'])[2]");
	private By SearchDrop = By.xpath("//div[@id='downshift-2-menu']//li//div//p[1]");
	private By PickupDate = By.xpath("//span[@class='HomeSearchWidgetstyles__DateTxt-sc-1rvppov-7 eiggyI']");
	private By Calender = By.xpath("//ul[@class='dcalendarstyles__DateWrapDiv-sc-r2jz2t-7 ccIMFc']//li//span");
	private By ReturnDate = By.xpath("(//span[@class='HomeSearchWidgetstyles__DateTxt-sc-1rvppov-7 eiggyI'])[3]");
	private By Calender1 = By.xpath("//ul[@class='dcalendarstyles__DateWrapDiv-sc-r2jz2t-7 ccIMFc']//li//span");
	private By PickupTime = By.xpath("(//span[@class='HomeSearchWidgetstyles__DateTxt-sc-1rvppov-7 eiggyI'])[2]");
	private By SelectPickTime = By.xpath("//section[@class='TimeDropdownstyles__TimeDropdown-sc-ycd1i1-0 BHQbN']//ul//li//span");
	private By ReturnTime = By.xpath("(//span[@class='HomeSearchWidgetstyles__DateTxt-sc-1rvppov-7 eiggyI'])[4]");
	private By SelectReturnTime = By.xpath("//section[@class='TimeDropdownstyles__TimeDropdown-sc-ycd1i1-0 BHQbN']//ul//li//span");
	private By SearchCabBT = By.xpath("//button[normalize-space()='SEARCH CABS']");
	
	public SearchCab(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement searchCab() {
		return driver.findElement(searchCab);
	}
	
	public WebElement roundTrip() {
		return driver.findElement(roundTrip);
	}
	
	public WebElement EnterPickup() {
		return driver.findElement(EnterPickup);
	}
	
	public List<WebElement> SearchPickup() {
		return driver.findElements(SearchPickup);
	}
	
	public WebElement EnterDrop() {
		return driver.findElement(EnterDrop);
	}
	
	public List<WebElement> SearchDrop() {
		return driver.findElements(SearchDrop);
	}
	
	public WebElement PickupDate() {
		return driver.findElement(PickupDate);
	}
	
	public List<WebElement> Calender() {
		return driver.findElements(Calender);
	}
	
	public WebElement ReturnDate() {
		return driver.findElement(ReturnDate);
	}
	
	public WebElement PickupTime() {
		return driver.findElement(PickupTime);
	}
	
	public List<WebElement> SelectPickTime() {
		return driver.findElements(SelectPickTime);
	}
	
	public WebElement ReturnTime() {
		return driver.findElement(ReturnTime);
	}
	
	public List<WebElement> SelectReturnTime() {
		return driver.findElements(SelectReturnTime);
	}
	
	public WebElement SearchCabBT() {
		return driver.findElement(SearchCabBT);
	}
}
