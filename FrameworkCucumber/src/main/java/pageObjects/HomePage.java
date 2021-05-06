package pageObjects;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Helpers.ButtonHelper;
import Helpers.GenericHelper;
import baseObjects.BaseClass;

public class HomePage extends BaseClass{
		
	By loginButton = By.xpath("//a[@class='login']");
	By account = By.xpath("//a[@class='account']/span");
	
	Logger log = LogManager.getLogger(this.getClass().getName());
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void ClickLogin()
	{
		ButtonHelper.ClickButton(loginButton);
		log.info("Click the login option");
	}
	
	public void CheckAccount(String user) {
		Assert.assertEquals(user, GenericHelper.GetText(account));
	}

	

}
