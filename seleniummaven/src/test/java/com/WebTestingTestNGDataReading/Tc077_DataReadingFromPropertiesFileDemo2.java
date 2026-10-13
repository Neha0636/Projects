package com.WebTestingTestNGDataReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.WebTesting.generic.PropertiesUtil;


public class Tc077_DataReadingFromPropertiesFileDemo2 {
	 @Test
	  public void testReadPropertiesfileData() throws IOException
	  {
		 
		  //create object of util
		  PropertiesUtil prop=new PropertiesUtil("config");
		  
		   WebDriver driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get(prop.getValue("url"));
		  
		  driver.findElement(By.name("username")).sendKeys(prop.getValue("userName"));
		  driver.findElement(By.name("password")).sendKeys(prop.getValue("userPassword"));
		  
		  
	  }
}
