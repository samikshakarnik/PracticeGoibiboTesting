package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Resources.BaseClass;

public class SearchHotel extends BaseClass {
	
	public WebDriver driver;
	
	private By Hotel = By.xpath("//a[@href='/hotels/']");
	private By RadioButtonIndia = By.xpath("//input[@type='radio']");
	private By SearchProperty = By.xpath("//input[@data-testid='home-autosuggest-input']");
	private By SelectCity = By.xpath("//div[normalize-space()='Mulshi']");
	private By HotelBookingDateBT = By.xpath("//div[@data-testid='openCheckinCalendar']");
	private By HotelBookingDate = By.xpath("//li[@class='date_is_selectable_true']");
	private By NoOfGuest = By.xpath("//span[text()='Guests & Rooms']");
	//private By NoOfAdults = By.xpath("//span[@data-testid='button-room-add']");
	private By NoOfChildren = By.xpath("//span[@data-testid='button-child-add']");
	private By ClickDownArrow = By.xpath("//h4[contains(text(),'Select')]");
	private By AgeOfChild = By.xpath("//li[contains(text(),'3')]");
	private By Donebt = By.xpath("//button[contains(text(),'Done')]");
	private By Search = By.xpath("//button[@data-testid='searchHotelBtn']");
	
	
	public SearchHotel(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement Hotel() {
		return driver.findElement(Hotel);	
	}
	
	public WebElement RadioButtonIndia() {
		return driver.findElement(RadioButtonIndia);	
	}
	
	public WebElement SearchProperty() {
		return driver.findElement(SearchProperty);	
	}
	
	public WebElement SelectCity() {
		return driver.findElement(SelectCity);	
	}
	
	public WebElement HotelBookingDateBT() {
		return driver.findElement(HotelBookingDateBT);	
	}
	
	public List<WebElement> HotelBookingDate() {
		return driver.findElements(HotelBookingDate);	
	}
	
	public WebElement NoOfGuest() {
		return driver.findElement(NoOfGuest);	
	}
	
//	public WebElement NoOfAdults() {
//		return driver.findElement(NoOfAdults);	
//	}
	
	public WebElement NoOfChildren() {
		return driver.findElement(NoOfChildren);	
	}
	
	public WebElement ClickDownArrow() {
		return driver.findElement(ClickDownArrow);	
	}
	
	public WebElement AgeOfChild() {
		return driver.findElement(AgeOfChild);	
	}
	
	public WebElement Donebt() {
		return driver.findElement(Donebt);
	}
	
	public WebElement Search() {
		return driver.findElement(Search);
	}
	

}
