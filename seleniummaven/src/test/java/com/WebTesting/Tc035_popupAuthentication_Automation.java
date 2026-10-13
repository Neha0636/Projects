package com.WebTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc035_popupAuthentication_Automation {
  @Test
  public void popup() {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth"); //we have to write username and password manually
	                   //admin:admin@ ----this is the hack without writting manually username and password(admin)
	  
	 String text=driver.findElement(By.xpath(" //p[contains(normalize-space(),'Congratulations')]")).getText();
	  
	  System.out.println(text);
	  
	  
	  
  }
}
