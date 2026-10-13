package com.WebTestingTestNGDataDrivenTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tc082_DataDrivenUsingExcel {
  @Test(dataProvider="ExcelData",dataProviderClass=customDataSet.class)
  public void testlogin(String un,String psw) {
	  WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		  //user name
		  driver.findElement(By.name("username")).sendKeys(un);
		  //password
		  driver.findElement(By.name("password")).sendKeys(psw);
		  //click
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  
		  Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"login failed!");
	       System.out.println("user login completed");
	  
	       driver.quit();
}
	 
	  //sometime pass sometime fail
	  
	  
	  
	  
  }

