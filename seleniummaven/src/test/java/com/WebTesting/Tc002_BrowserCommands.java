package com.WebTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Tc002_BrowserCommands {

	public static void main(String[] args) {
	
	// to launch browser= create driver session with chrome	
		
	WebDriver driver = new ChromeDriver();	
		
	//open google application
	driver.get("https://www.google.com/");
	
	//to get page title
	String actTitle=driver.getTitle();
	    
	   //validate title should be google
	   if(actTitle.equals("Google"))
	   {
		   System.out.println("Title Match.....test pass");
	   }
	   else 
	   {
		   System.out.println("Title not Match.....test fail");  
	   }   
		   
		driver.quit();   
	   
	}
}
