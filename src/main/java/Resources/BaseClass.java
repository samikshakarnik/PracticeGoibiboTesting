package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public Properties prop;
	public  WebDriver driver;

	public void driverInitialize() throws Exception {

		FileInputStream fs = new FileInputStream(
				"C:\\Users\\Samiksha\\eclipse-workspace\\GoibiboMavenProject\\src\\main\\java\\Resources\\data.properties");
		prop = new Properties();
		prop.load(fs);

		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("Enter Valid Browser");
		}
	}

	@BeforeMethod
	public void  openBrowser() throws Exception {
		driverInitialize();
		String url = prop.getProperty("url");
		driver.get(url);
	}

	@AfterMethod
	public void closeDriver() {
		driver.quit();
	}

}
