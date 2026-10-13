package com.WebTestingTestNGAnnotation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tc069_Orangehrm extends BaseClass{
	
		
  @Test (priority=1)
  public void login() {
	  //user name
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  //password
	  driver.findElement(By.name("password")).sendKeys("admin123");
	  //click
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	  
  }
 @Test(priority=2)
 public void logout() {
	  driver.findElement(By.cssSelector("i.oxd-userdropdown-icon")).click();
	  driver.findElement(By.linkText("Logout")).click();
 }
  
  
  
  
  
}
