package com.WebTesting;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc_033AlertAutomation_Rediff{
  @Test
  public void testalert() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");   
	  
	  //rediffmail id
	  driver.findElement(By.name("login")).sendKeys("test123");
	  
	  //click on login button
	  driver.findElement(By.name("proceed")).click();
	  
	  
	 // driver.switchTo().alert().accept();  if we want to perform operation only not want tp print alert text
	  Thread.sleep(2000);
	  //alert will open
	  //if we miss to handle alert..selenium throws exception===Unhandeledalerexception
	  
	  //handle alert
	  Alert alt1= driver.switchTo().alert();  //return type of alert() is Alert interface object
	  System.out.println("alert text is:" +alt1.getText());
	  
	  //click on ok
	  alt1.accept();
	  Thread.sleep(2000);
	  
	  //password
	  driver.findElement(By.name("passwd")).sendKeys("123");
  }
}
