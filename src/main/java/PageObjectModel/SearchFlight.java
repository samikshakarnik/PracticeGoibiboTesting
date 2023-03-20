package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Resources.BaseClass;

public class SearchFlight extends BaseClass {
	
	public WebDriver driver;
	
	private By EntercityName = By.xpath("//p[text()='Enter city or airport']");
	private By FromcityName = By.xpath("//input[@type='text']");
	private By SelectFromCityName = By.xpath("//span[text()='Pune, India']");
	private By EnterDesCityName = By.xpath("//input[@type='text']");
	private By SelectDestinationCityName = By.xpath("//span[text()='New Delhi, India']");
	private By Calendar = By.xpath("//p[@class='fsw__date']");
	private By Done = By.xpath("//span[text()='Done']");
	private By AddNumbersofAdult = By.xpath("(//span[@class='sc-dvQaRk ghZzRT'])[2]");
	private By AddNumberofChildren = By.xpath("(//span[@class='sc-dvQaRk ghZzRT'])[4]");
	private By Done1 = By.xpath("//a[text()='Done']");
	private By SearchFlightButton = By.xpath("//span[text()='SEARCH FLIGHTS']");
	
	
	public SearchFlight(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement EntercityName() {
		return driver.findElement(EntercityName);
	}
	
	public WebElement FromcityName() {
		return driver.findElement(FromcityName);
	}
	
	public WebElement SelectFromCityName() {
		return driver.findElement(SelectFromCityName);
	}
	
	public WebElement EnterDesCityName() {
		return driver.findElement(EnterDesCityName);
	}
	
	public WebElement SelectDestinationCityName() {
		return driver.findElement(SelectDestinationCityName);
	}
	
	public List<WebElement> Calendar() {
		return driver.findElements(Calendar);
	}
	
	public WebElement Done() {
		return driver.findElement(Done);
	}
	
	public WebElement AddNumbersofAdult() {
		return driver.findElement(AddNumbersofAdult);
	}
	
	public WebElement AddNumberofChildren() {
		return driver.findElement(AddNumberofChildren);
	}
	
	public WebElement Done1() {
		return driver.findElement(Done1);
	}
	
	public WebElement SearchFlightButton() {
		return driver.findElement(SearchFlightButton);
	}
	
	
}
