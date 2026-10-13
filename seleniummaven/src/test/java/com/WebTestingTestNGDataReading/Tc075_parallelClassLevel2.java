package com.WebTestingTestNGDataReading;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Tc075_parallelClassLevel2 {
  
  @Test(priority=1)
  public void chromeTest() {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  System.out.println("title is :" +driver.getTitle());
	  
  }
  
  
  
  }

