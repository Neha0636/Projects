package com.WebTestingTestNGPageObjectModelUsingPageFactoryClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewLoginPage {
	
	/*private WebDriver driver;
	
	//to initialize object
	public void NewLoginPage(WebDriver driver) //from base class read driver
	{
		
		this.driver=driver;
		
	
    //initialize webelement
	
	PageFactory.initElements(driver,this);
	
	}
	
	
	//locator
	//identify webelement
	@FindBy(id="email-id")
	private WebElement emailEle;
	
	@FindBy(id="password")
	private WebElement passwordEle;
	
	@FindBy(id="submit-id")
	private WebElement submitButton;
	
	//methods
	
	public String getPpageUrl() {
		
		return driver.getCurrentUrl();
	}
	
	
    public String getPagetitle() {
		
		return driver.getTitle();
	}
	
	
    public void dologin(String email, String psw) {
	
	emailEle.sendKeys(email);
	passwordEle.sendKeys(psw);
	submitButton.click();
}*/private WebDriver driver;

//to initialize object
public NewLoginPage(WebDriver driver)//from base class read driver
{
	this.driver=driver;
	//initialize webelement 
	PageFactory.initElements(driver,this);
	
}

//Locator
//Identify the webelements
@FindBy(id="email-id")
private WebElement emailEle;

@FindBy(id="password")
private WebElement passwordEle;

@FindBy(id="submit-id")
private WebElement submitButton;

//methods

public String getPageUrl()
{
	return driver.getCurrentUrl();
}



public String getPageTitle()
{
	return driver.getTitle();
}



public void doLogin(String email,String psw)
{
	emailEle.sendKeys(email);
	passwordEle.sendKeys(psw);
	submitButton.click();
}	
	
	
	
}
