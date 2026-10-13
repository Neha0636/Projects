package com.WebTestingTestNGPageObjectModelUsingPageFactoryClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	protected WebDriver driver;
	public NewLoginPage lp;
	
	@BeforeClass
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://automationplayground.com/crm/login.html");
		
		 lp=new NewLoginPage(driver);
	}
	
	
	

}
