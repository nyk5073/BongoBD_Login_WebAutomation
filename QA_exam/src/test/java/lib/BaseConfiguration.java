package lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseConfiguration {
	
	public void initEnvironment(){
		String DriverLocation =  "/Users/nooryeaserkhan/Downloads/geckodriver";
		System.setProperty("webdriver.gecko.driver",DriverLocation );	
		
	}
	public WebDriver loadDriver(String url)
	{
		WebDriver driver = new FirefoxDriver();		
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}

}
