package lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseConfiguration {
	
	public WebDriver loadDriver(String url)
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();		
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}

}
