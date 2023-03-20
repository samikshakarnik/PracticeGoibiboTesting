package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObject {
	
	public WebDriver driver;
	
	By loginButton = By.xpath("//div[@class='login__tab gotrible']");
	By phoneNo = By.xpath("//input[@name='phone']");
	

}
