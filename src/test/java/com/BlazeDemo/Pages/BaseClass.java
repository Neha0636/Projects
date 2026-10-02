package com.BlazeDemo.Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.BlazeDemo.Utilities.PropertiesUtil;

import org.testng.annotations.*;

public class BaseClass {
	
	  protected WebDriver driver;
	  protected HomePage hp;
	  protected ReservePage rp;
	  protected PurchasePage pp;
	  protected ConfirmationPage cp;
	  
	 PropertiesUtil prop=new PropertiesUtil("Project");
	  
	  @Parameters({ "bname" })
	  @BeforeMethod(alwaysRun=true)
	  public void setUp(String bname){
		
		   if(driver==null) {

		    
			switch (bname.toLowerCase().trim()) {

			case "chrome":
				driver = new ChromeDriver();
				break;
			case "edge":
				driver = new EdgeDriver();
				break;
			case "firefox":
				driver = new FirefoxDriver();
				break;
			default:
				driver = new EdgeDriver();
				break;
			}
			 
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			  driver.get("https://blazedemo.com/index.php");
			
	  }
		 
		  hp=new HomePage(driver);
	      rp=new ReservePage(driver);
	      pp=new PurchasePage(driver);
	      cp=new ConfirmationPage(driver);      
	
	  }
	  
	@AfterMethod(alwaysRun=true)
	public void tearDown() {
		
		if(driver!=null){
			driver.quit();
			driver=null;
		}
		
			  
	  }
	

}
