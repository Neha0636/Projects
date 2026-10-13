package com.WebTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Locatordemo_relativeLocator {

	public static void main(String[] args) {
		//Create driver session
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://automationplayground.com/crm/login.html");
		
		//find the email which is above password
		driver.findElement(RelativeLocator.with(By.cssSelector("#email-id")).above(By.id("password"))).sendKeys("test@gmail.com");

       //find password which is below email 
		driver.findElement(RelativeLocator.with(By.cssSelector("#password")).below(By.id("email-id"))).sendKeys("test123");
		
		//toLeftOf(): find search box which if left side of SignIn
		driver.findElement(RelativeLocator.with(By.cssSelector("input[aria-label='Search']")).toLeftOf(By.linkText("Sign In"))).sendKeys("CRM");
		
		// torightof(): find search of which is right of customer service
		driver.findElement(RelativeLocator.with(By.cssSelector("input[aria-label='Search']")).toRightOf(By.linkText("Customer Service"))).clear();
		
		
		//near(): find checkbox which is near to remember keyword
	     driver.findElement(RelativeLocator.with(By.cssSelector("#remember")).near(By.xpath("//label[text()='Remember me']"))).click();
		
		
		
		
	}

}
