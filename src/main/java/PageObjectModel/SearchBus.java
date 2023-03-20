package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Resources.BaseClass;

public class SearchBus extends BaseClass {

	public WebDriver driver;

	private By SearchBusbt = By.xpath("//a[@href='/bus/']");
	private By EnterFromCity = By.xpath("//input[@type='text']");
	private By SearchFromCity = By.xpath("//div[@id='downshift-1-menu']//div//li//span");
	private By EntertoCity = By.xpath("//input[@id='autosuggestBusSRPDestHome']");
	private By SearchtoCity = By.xpath("//div[@id='downshift-2-menu']//div//li//span");
	private By PickDate = By.xpath("//input[@placeholder='Pick a date']");
	private By Calendar = By.xpath("//ul[@class='dcalendarstyles__DateWrapDiv-sc-r2jz2t-7 gJsKZe']//li//span");
	private By SearchBt = By.xpath("//button[@data-testid='searchBusBtn']");

	public SearchBus(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement SearchBusbt() {
		return driver.findElement(SearchBusbt);
	}

	public WebElement EnterFromCity() {
		return driver.findElement(EnterFromCity);
	}

	public List<WebElement> SearchFromCity() {
		return driver.findElements(SearchFromCity);
	}

	public WebElement EntertoCity() {
		return driver.findElement(EntertoCity);
	}

	public List<WebElement> SearchtoCity() {
		return driver.findElements(SearchtoCity);
	}
	
	public WebElement PickDate() {
		return driver.findElement(PickDate);
	}

	public List<WebElement> Calendar() {
		return driver.findElements(Calendar);
	}

	public WebElement SearchBt() {
		return driver.findElement(SearchBt);
	}
}
