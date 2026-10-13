package com.WebTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc004_NavigationCommands { 

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
	//open application
  driver.get("https://www.google.com");

	//get title
	System.out.println("title is: "+driver.getTitle());
	
	//navigation in the session to facebook
	driver.navigate().to("https://www.facebook.com/");
	
	//get title facebook
	System.out.println("title is: "+driver.getTitle());
	
	//for static wait    
	Thread.sleep(1000);  // no method  for wait in selenium so use java method

	// for back
	driver.navigate().back();  // reaches to google
	 
	
	// for forward
	driver.navigate().forward(); 
	
	Thread.sleep(2000); 
	
	//to refresh
	driver.navigate().refresh(); 
	
	}
	
	}


