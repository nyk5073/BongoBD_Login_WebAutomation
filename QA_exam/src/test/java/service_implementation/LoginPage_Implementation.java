package service_implementation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import lib.StaticTexts;
import lib.Xpaths;
import service_interface.LoginPage_Interface;

public class LoginPage_Implementation implements LoginPage_Interface{
	
	public void guiVerification( WebDriver driver) throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Assert.assertEquals(driver.findElement(By.xpath(Xpaths.LoginPage.HeroTextEn)).getText(), StaticTexts.LoginPage.HeroTextEn);
		Assert.assertEquals(driver.findElement(By.xpath(Xpaths.LoginPage.HeroTextBn)).getText(), StaticTexts.LoginPage.HeroTextBn);
		Assert.assertEquals(driver.findElement(By.xpath(Xpaths.LoginPage.AccountKitButton)).getText(), StaticTexts.LoginPage.AccountKitButton);
		Assert.assertEquals(driver.findElement(By.xpath(Xpaths.LoginPage.FooterText)).getText(), StaticTexts.LoginPage.FooterText);

	}

}
