package com.WebTesting;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Tc003_BrowsersCommands {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//open application
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		//get current page title
		System.out.println("title is: "+driver.getTitle());
		
		//current page URL
		System.out.println("current url is: "+driver.getCurrentUrl());
		
		// current page source code
		System.out.println("source code is: "+driver.getPageSource());
		
		// close the browser----close()   quit()
		driver.quit();
		
		
	}

}
