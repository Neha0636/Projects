package com.WebTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc025_datepickerAutomation_Formy {
  @Test
  public void datepicker () {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://formy-project.herokuapp.com/form");
	  
	  //datepicker..if simply given mm/dd/yyyy....use this method
	  driver.findElement(By.id("datepicker")).sendKeys("07/27/2026");
	  
  }

 
  
}
