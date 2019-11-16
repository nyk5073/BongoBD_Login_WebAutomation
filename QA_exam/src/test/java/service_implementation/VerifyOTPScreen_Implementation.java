package service_implementation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import lib.StaticTexts;
import lib.Xpaths;
import service_interface.VerifyOTPScreen_Interface;

public class VerifyOTPScreen_Implementation implements VerifyOTPScreen_Interface {
	
	public void guiVerification( WebDriver driver) throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Assert.assertEquals(driver.findElement(By.xpath(Xpaths.VerifyOTPScreen.HeaderText)).getText(), StaticTexts.VerifyOTPScreen.HeaderText);
		Assert.assertEquals(driver.findElement(By.xpath(Xpaths.VerifyOTPScreen.BodyText)).getText(), StaticTexts.VerifyOTPScreen.BodyText);
		Assert.assertEquals(driver.findElement(By.xpath(Xpaths.VerifyOTPScreen.ContinueButton)).getText(), StaticTexts.VerifyOTPScreen.ContinueButton);
		Assert.assertEquals(driver.findElement(By.xpath(Xpaths.VerifyOTPScreen.FooterText)).getText(), StaticTexts.VerifyOTPScreen.FooterText);		
	
	}

}
