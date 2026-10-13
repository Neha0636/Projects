package com.WebTestingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	//BaseClass Is something where we can add project level configuration(pre and post conditions)
	
		protected WebDriver driver;
		
		@BeforeClass
		public void setup() {
			//browser+app launch
			 driver=new ChromeDriver();
		     driver.get("https://automationplayground.com/crm/login.html");
			
			
			
		}
		
		@BeforeMethod 
			public void getapptitle(){
			System.out.println("title is:" +driver.getTitle());
			
		}

		@AfterClass
      	public void teardown(){
      		driver.quit();
      	}
		
		
	}


