package test_steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.BaseConfiguration;
import lib.Xpaths;
import service_implementation.AccountKitPage_Implementation;
import service_implementation.LandingPage_Implementation;
import service_implementation.LoggedInPage_Implementation;
import service_implementation.LoginPage_Implementation;
import service_implementation.VerifyOTPScreen_Implementation;
import service_interface.AccountKitPage_Interface;
import service_interface.LandingPage_Interface;
import service_interface.LoggedInPage_Interface;
import service_interface.LoginPage_Interface;
import service_interface.VerifyOTPScreen_Interface;

public class ValidLogin_Test {
	
	private BaseConfiguration base = new BaseConfiguration();
	private WebDriver driver=null;
	private LandingPage_Interface landing = new LandingPage_Implementation();
	private LoginPage_Interface login = new LoginPage_Implementation();
	private AccountKitPage_Interface acct = new AccountKitPage_Implementation();
	private VerifyOTPScreen_Interface verf = new VerifyOTPScreen_Implementation();
	private LoggedInPage_Interface loggedIn = new LoggedInPage_Implementation();
	
	@BeforeTest
	public void setUp() throws Exception {
		
		driver=base.loadDriver("https://www.bongobd.com/bn");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test (priority=1)
	public void LandingPage() throws Exception {
		
		landing.guiVerification(driver);
		driver.findElement(By.xpath(Xpaths.LandingPage.LoginButton)).click();
		
	}
	
	@Test (priority=2)
	public void LoginPage() throws Exception {
		
		login.guiVerification(driver);
		driver.findElement(By.xpath(Xpaths.LoginPage.AccountKitButton)).click();
		
	}
	
	@Test (priority=3)
	public void LoginWithPhone() throws Exception {
		
		for(String acctKitPage : driver.getWindowHandles()){
		    driver.switchTo().window(acctKitPage);
		}
		acct.guiVerification(driver);
		driver.findElement(By.xpath(Xpaths.AccountKitPage.PhoneInputBox)).sendKeys("<ProvideValudNumber>");
		Thread.sleep(1000);
		driver.findElement(By.xpath(Xpaths.AccountKitPage.UseSMSButton)).click();
	
	}
	
	@Test (priority=4)
	public void VerifyOTP() throws Exception {
		
		for(String VerifyOTPScreen : driver.getWindowHandles()){
		    driver.switchTo().window(VerifyOTPScreen);
		}
		driver.manage().window().maximize();
		Thread.sleep(5000);
		verf.guiVerification(driver);
		//please type the received OTP in the browser manually as this script is not configured to interact with your phone
		WebDriverWait wait2activateContinueBtn = new WebDriverWait(driver,20);
		WebElement ContinueButton = wait2activateContinueBtn.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpaths.VerifyOTPScreen.ContinueButton)));
		ContinueButton.click();
		
	}
	
	@Test (priority=5)
	public void SignOut() throws Exception {
		
		for(String LoggedInPage : driver.getWindowHandles()) {
			driver.switchTo().window(LoggedInPage);
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath(Xpaths.LoggedInPage.SelfIconDropdown)).click();
		loggedIn.guiVerification(driver);
		driver.findElement(By.xpath(Xpaths.LoggedInPage.SignOutLink)).click();		
		
	}
	
	@AfterTest
    public void tearDown() {
    	driver.quit();
    }

}
