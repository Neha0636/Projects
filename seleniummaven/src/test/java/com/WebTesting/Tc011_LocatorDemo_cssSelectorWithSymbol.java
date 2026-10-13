package com.WebTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc011_LocatorDemo_cssSelectorWithSymbol {

	public static void main(String[] args) {
		//create driver session
				WebDriver driver = new ChromeDriver();
				
		//implicit time
				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
	driver.get("https://www.amazon.in/");
					
	//use of css symbols
	// if we want to short the value of attribute means use partial value
	//syntax---tagname[attribute*='value']
	
	//css selector with *  means contains()
	driver.findElement(By.cssSelector("input[id*='searchtext']")).sendKeys("watch",Keys.ENTER);
	
	
    // cssSelector with ^ means startswith()
	// syntax=== tagname[attribute^='prefixvalue']
	driver.findElement(By.cssSelector("input[id^='two']")).clear();
	
	
	
	  // cssSelector with $ means endswith()
		// syntax=== tagname[attribute$='sufixvalue']
		driver.findElement(By.cssSelector("input[id$='box']")).sendKeys("bag",Keys.ENTER);
		
		
		
	
	
	
	
	
	
	
	
	
	

	}

}
