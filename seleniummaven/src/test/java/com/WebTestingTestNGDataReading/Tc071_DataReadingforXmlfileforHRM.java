package com.WebTestingTestNGDataReading;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Tc071_DataReadingforXmlfileforHRM {
	
	@Parameters({"un","psw"})
  @Test
  public void testlogin(String username,String password) {
	  

	   WebDriver driver=new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	  //user name
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  //password
	  driver.findElement(By.name("password")).sendKeys("admin123");
	  //click
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	  
	  
	  
  }
}
