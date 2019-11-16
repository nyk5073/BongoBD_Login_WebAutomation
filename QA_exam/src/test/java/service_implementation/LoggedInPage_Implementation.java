package service_implementation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import lib.StaticTexts;
import lib.Xpaths;
import service_interface.LoggedInPage_Interface;

public class LoggedInPage_Implementation implements LoggedInPage_Interface{
	
	public void guiVerification( WebDriver driver) throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Assert.assertEquals(driver.findElement(By.xpath(Xpaths.LoggedInPage.MyAccountLink)).getText(), StaticTexts.LoggedInPage.MyAccountLink);
		Assert.assertEquals(driver.findElement(By.xpath(Xpaths.LoggedInPage.MyFavouritesLink)).getText(), StaticTexts.LoggedInPage.MyFavouritesLink);
		Assert.assertEquals(driver.findElement(By.xpath(Xpaths.LoggedInPage.HistoryLink)).getText(), StaticTexts.LoggedInPage.HistoryLink);
		Assert.assertEquals(driver.findElement(By.xpath(Xpaths.LoggedInPage.SignOutLink)).getText(), StaticTexts.LoggedInPage.SignOutLink);		
	
	}

}
