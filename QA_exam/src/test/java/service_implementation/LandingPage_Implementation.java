package service_implementation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import lib.StaticTexts;
import lib.Xpaths;
import service_interface.LandingPage_Interface;

public class LandingPage_Implementation implements LandingPage_Interface {
	
	public void guiVerification( WebDriver driver) throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Assert.assertEquals(driver.findElement(By.xpath(Xpaths.LandingPage.MoviesLink)).getText(), StaticTexts.LandingPage.MoviesLink);
		Assert.assertEquals(driver.findElement(By.xpath(Xpaths.LandingPage.DramaLink)).getText(), StaticTexts.LandingPage.DramaLink);
		Assert.assertEquals(driver.findElement(By.xpath(Xpaths.LandingPage.SeriesLink)).getText(), StaticTexts.LandingPage.SeriesLink);
		Assert.assertEquals(driver.findElement(By.xpath(Xpaths.LandingPage.BoomLink)).getText(), StaticTexts.LandingPage.BoomLink);
		Assert.assertEquals(driver.findElement(By.xpath(Xpaths.LandingPage.SearchPlaceholder)).getAttribute("placeholder"), StaticTexts.LandingPage.SearchPlaceholder);
		Assert.assertEquals(driver.findElement(By.xpath(Xpaths.LandingPage.LanguageSelectorDropdown)).getText(), StaticTexts.LandingPage.LanguageSelectorDropdown);
		Assert.assertEquals(driver.findElement(By.xpath(Xpaths.LandingPage.LoginButton)).getText(), StaticTexts.LandingPage.LoginButton);
		Assert.assertEquals(driver.findElement(By.xpath(Xpaths.LandingPage.RegisterButton)).getText(), StaticTexts.LandingPage.RegisterButton);

	}

}
