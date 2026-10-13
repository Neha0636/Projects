package com.WebTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc017_footerLinkAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create driver session
				
	WebDriver driver=new ChromeDriver();
				
	driver.get("https://tutorialsninja.com/demo/index.php?");
				
	List<WebElement> allFooterLinks=driver.findElements(By.cssSelector("div[class*='col-sm'] li>a"));
      System.out.println("total footer links:"+allFooterLinks.size());
	
	for(WebElement i:allFooterLinks  ) {
		System.out.println(i.getText());
	}
	
	}

}
