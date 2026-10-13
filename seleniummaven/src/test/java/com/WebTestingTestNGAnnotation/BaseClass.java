package com.WebTestingTestNGAnnotation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
       protected WebDriver driver;
	
	@BeforeClass 
	public void setup(){
		  driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	}
	
	@AfterMethod
	public void getCurrentUrl() {
		System.out.println("title is:" +driver.getCurrentUrl());
	
	}
	
	
	@BeforeMethod
	public void getAppTitle(){
		System.out.println("title is:" +driver.getTitle());
	}
	
	@AfterClass
	public void teardown() {    
		driver.quit(); 
	}
	
	
	
	
}
