package com.WebTestingTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tc068_AnnotationUseCase extends BaseTest {
	
	
	//WebDriver driver;
	
//	@BeforeClass
//	public void setUp()
//	{
//		//browser + app launch
//		driver=new ChromeDriver();
//		driver.get("https://automationplayground.com/crm/login.html");
//	}
//	
//	@BeforeMethod
//	public void getAppTitle()
//	{
//		System.out.println("App Title: "+ driver.getTitle());
//	}
//	
	
	@Test(priority=1)
	public void verifyUrl()
	{
		String appUrl=driver.getCurrentUrl();
		Assert.assertTrue(appUrl.contains("crm"));
		System.out.println("Current url is: "+appUrl);
	}
	
	
  @Test(priority=2)
  public void validateLogin() 
  {
	  driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("test133");
	  driver.findElement(By.id("submit-id")).click();
	  Assert.assertTrue(driver.getCurrentUrl().contains("customers"));
	  System.out.println("User Navigated to Customers Page");
  }
  
//  @AfterClass
//  public void tearDown()
//  {
//	  driver.quit();
//  }
//  
  
  
  
}