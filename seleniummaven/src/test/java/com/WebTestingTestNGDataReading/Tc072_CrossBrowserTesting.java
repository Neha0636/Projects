package com.WebTestingTestNGDataReading;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Tc072_CrossBrowserTesting {
	WebDriver driver;
	
	@Parameters({"bname","data"})
  @Test
  public void testbrowser(String bname, String value) throws InterruptedException {
	  
	  switch(bname.toLowerCase().trim()){
	  case "chrome":
		  driver=new ChromeDriver();
	  break;
	  
	  
	  case "msedge":
		  driver=new EdgeDriver();
	  break;
	  
	  case "firefox":
		  driver=new FirefoxDriver();
	  break;
	  
	  default:
		  driver=new ChromeDriver();
	  break;
	  }
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.get("https://www.google.com"); 
	 System.out.println("title is " +driver.getTitle());
	 
	//search for keyword
			driver.findElement(By.id("APjFqb")).sendKeys(value);
					
			Thread.sleep(1000);
	        // get all suggestion from google in console
			List<WebElement> allOptions=driver.findElements(By.cssSelector("ul[role='listbox']>li"));  //want to see list while typing any keyword first search its parent
			
			System.out.println("total keywords are:" +allOptions.size());
			
			for(WebElement i:allOptions) {
				
				System.out.println(i.getText());
			}
			
			
			
			
  }
}
