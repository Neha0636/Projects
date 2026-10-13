package com.WebTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Tc020_TestngDemo {
	@Test
	public void testcase1() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		
		System.out.println( " title is: " +driver.getTitle());
		
	}
	
	@Test
	public void testcase2() {
		WebDriver driver = new ChromeDriver();
         driver.get("https://www.facebook.com");
		
		System.out.println( " title is: " +driver.getTitle());
		
		
		
		
		
		
		
		
		
	}
}
