package com.WebTestingTestNGDataReading;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Tc074_parallelClassLevel {
  
  
  @Test(priority=1)
 public void edgeTest() {
	  
	  WebDriver driver=new EdgeDriver();
	  driver.get("https://www.amazon.in");
	  System.out.println("title is :" +driver.getTitle());
  } 
	
  
  
  
	  
  }

