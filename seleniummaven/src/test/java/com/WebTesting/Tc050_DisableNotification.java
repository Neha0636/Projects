package com.WebTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Tc050_DisableNotification {
  @Test
  public void disablenotification() {
	  
	  ChromeOptions options=new ChromeOptions();
	  options.addArguments("--disable-notifications");
	  
	  WebDriver driver=new ChromeDriver(options);
	  driver.get("https://www.goibibo.com/");   //to disable notification that came when open goibibo
	                                             //to send notification allow or block..we disable it
	  
	  
	  
  }
}
