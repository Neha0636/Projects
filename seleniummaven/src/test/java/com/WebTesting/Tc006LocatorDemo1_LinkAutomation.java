package com.WebTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc006LocatorDemo1_LinkAutomation {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://automationplayground.com/crm/");

		// sign in  click
		//driver.findElement(By.id("SignIn")).click();
	//for hyperlink we have 2 methods so not use id method
		//1--linktext()   2--- partiallinktest()
		
		// <a> linktext  </a>
		
		//driver.findElement(By.linkText("Sign In")).click();
		//driver.findElement(By.linkText("Sign")).click(); // NoSuchelEmentException
		
		
	driver.findElement(By.partialLinkText("Sign")).click();
	
	// if 2 option have same element like sign in ,sign out--in partiallinktext it uses first element like start from top left to bottoom right
	}

}
