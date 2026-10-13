package com.WebTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc005_ElementIdentification {

	public static void main(String[] args) {
		
		// create driver session
		
		WebDriver driver = new ChromeDriver();
		
		// open application
		driver.get("https://www.google.com/");
		// technique3 ---find element + action
		//follow this technique mostly
		driver.findElement( By.id("APjFqb") ).sendKeys("selenium");
		
		
		/* technique1
		// method---by locator(address of element) + find element + validate + action

		  By searchBoxAddress =  By.id("APjFqb" );
		  
		  //find element
		WebElement searchElement =   driver.findElement(searchBoxAddress); 
		
		//validate
		System.out.println("search box is displayed: "+searchElement.isDisplayed() );
		System.out.println("search box is enabled: "+searchElement.isEnabled() );
		
		  
		 // ACTION---search for jenkins keyword
		
		  searchElement.sendKeys("Jenkins"); */
		  
		  /*technique2--find element + validate + action
		  //when we want perform multiple action use this method
		  WebElement searchElement =   driver.findElement(By.id("APjFqb")); //find element
		  
		  //validate
		  if
			(searchElement.isDisplayed() && searchElement.isEnabled())
			  
		  {
			  searchElement.sendKeys("Java");  //action
		  }*/
		  
			  
		  
	}

}
