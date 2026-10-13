package com.WebTestingTestNGPageObjectModelUsingByClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/*
 * every page class should maintain encapsulation principle
 * encapsulation=private data and public method
 */



public class LoginPage {
		
	private WebDriver driver;
	
	//To initialize driver we need constructor
	public LoginPage(WebDriver driver)//driver from baseclass
	{
		this.driver=driver;
	}
	
	
	//private data(Locator)
	private By emailEle=By.id("email-id");
	private By passwordEle=By.id("password");
	private By submitButton=By.id("submit-id");
	
	
	//public methods/Actions
	
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	
	public String getPageUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public void enterEmail(String email)
	{
		driver.findElement(emailEle).sendKeys(email);
	}
	
	public void enterPassword(String psw)
	{
		driver.findElement(passwordEle).sendKeys(psw);
	}
	
	public void clickSubmit()
	{
		driver.findElement(submitButton).click();
	}
	
	public void doLogin(String email,String psw)
	{
		driver.findElement(emailEle).sendKeys(email);
		driver.findElement(passwordEle).sendKeys(psw);
		driver.findElement(submitButton).click();
	}
	
	
	
	
	
	
	
	

}
