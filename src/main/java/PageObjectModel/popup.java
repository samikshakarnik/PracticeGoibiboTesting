package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Resources.BaseClass;

public class popup extends BaseClass{
	
	public WebDriver driver;
	
	private By close = By.xpath("//div[@class='lgRightSection ']//span//span");
	private By close2 = By.xpath("(//div[@class='sc-jlwm9r-0 dvqXYq']//p[1])[1]");
	
	public popup(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement close () {
		return driver.findElement(close);
	}
	
	public WebElement close2 () {
		return driver.findElement(close2);
	}

}
