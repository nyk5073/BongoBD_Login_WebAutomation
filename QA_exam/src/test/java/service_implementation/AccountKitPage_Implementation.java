package service_implementation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import lib.StaticTexts;
import lib.Xpaths;
import service_interface.AccountKitPage_Interface;

public class AccountKitPage_Implementation implements AccountKitPage_Interface{
	
	public void guiVerification( WebDriver driver) throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Assert.assertEquals(driver.findElement(By.xpath(Xpaths.AccountKitPage.HeaderText)).getText(), StaticTexts.AccountKitPage.HeaderText);
		Assert.assertEquals(driver.findElement(By.xpath(Xpaths.AccountKitPage.BodyText)).getText(), StaticTexts.AccountKitPage.BodyText);
		Assert.assertEquals(driver.findElement(By.xpath(Xpaths.AccountKitPage.CountryCodeDropdown)).getText(), StaticTexts.AccountKitPage.CountryCodeDropdown);
		Assert.assertEquals(driver.findElement(By.xpath(Xpaths.AccountKitPage.FooterText)).getText(), StaticTexts.AccountKitPage.FooterText);
		Assert.assertEquals(driver.findElement(By.xpath(Xpaths.AccountKitPage.UseSMSButton)).getText(), StaticTexts.AccountKitPage.UseSMSButton);
		
	}

}
