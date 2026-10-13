package com.WebTestingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tc066_AssertionTest {
  @Test
  public void verifytitle() {
	  
	// to launch browser= create driver session with chrome	
		
		WebDriver driver = new ChromeDriver();	
			
		//open google application
		driver.get("https://www.google.com/");
		
		//to get page title
		String actTitle=driver.getTitle();
		    
		   //validate title should be google
		  Assert.assertTrue( actTitle.contains("Google"),"test fail:title not mached");
		   System.out.println("test pass:title matched  "+actTitle);
		
	  
	  
	  
	  
	  
  }
}
