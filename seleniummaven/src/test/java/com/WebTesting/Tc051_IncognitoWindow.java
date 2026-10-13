package com.WebTesting;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Tc051_IncognitoWindow {
	@Test
	public void testAppinIncognitowindow() {

		  ChromeOptions options=new ChromeOptions();
		  options.addArguments("--incognito");
		  
		  ChromeDriver driver=new ChromeDriver(options);
		  driver.get("https://www.facebook.com");

		  
		  
		  
	}
}
