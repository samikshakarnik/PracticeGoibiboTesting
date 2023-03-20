package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Resources.BaseClass;

public class SearchTrain extends BaseClass {
	
	public WebDriver driver;
	
	private By searchTrain = By.xpath("//a[@href='/trains/']");
	private By EnterFromName = By.xpath("//p[normalize-space()='Enter Source Name']");
	private By EnterName = By.xpath("//input[@type='text']");
	private By SearchFromList = By.xpath("//ul[@class='styles_FswAutoCompBody__tuU_O']//li//div//div//p[1]//span");
	private By EnterToName = By.xpath("//p[normalize-space()='Enter Destination Name']");
	//EnterName
	private By SearchToList = By.xpath("//ul[@class='styles_FswAutoCompBody__tuU_O']//li//div//div//p[1]//span");
	private By Calendar = By.xpath("(//div[@class='styles_calMnth__calDateWrap__nQQLi'])[4]//div//div//p[1]");
	private By Tatkal = By.xpath("//button[@class='styles_rdDySlct__optn__0Ur06 ']");
	private By searchTrainBt = By.xpath("//span[@class='styles_FswSearchCta__Tf7s4']");
	
	public SearchTrain(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement searchTrain() {
		return driver.findElement(searchTrain);
	}
	
	public WebElement EnterFromName() {
		return driver.findElement(EnterFromName);
	}
	
	public WebElement EnterName() {
		return driver.findElement(EnterName);
	}
	
	
	public List<WebElement> SearchFromList() {
		return driver.findElements(SearchFromList);
	}
	
	public WebElement EnterToName() {
		return driver.findElement(EnterToName);
	}
	
	public List<WebElement> SearchToList() {
		return driver.findElements(SearchToList);
	}
	
	public List<WebElement> Calendar() {
		return driver.findElements(Calendar);
	}
	
	public WebElement Tatkal() {
		return driver.findElement(Tatkal);
	}
	
	public WebElement searchTrainBt() {
		return driver.findElement(searchTrainBt);
	}
}
