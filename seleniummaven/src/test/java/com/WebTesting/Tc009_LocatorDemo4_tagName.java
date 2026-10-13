package com.WebTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc009_LocatorDemo4_tagName {

	public static void main(String[] args) {
		//create driver session
	WebDriver driver = new ChromeDriver();
	
	//implicit time
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//enter app
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
    //number of input boxes---first type to count no.
	  List<WebElement> allInputBoxes  =  driver.findElements(By.tagName("input"));
	System.out.println("number of input boxes: "+allInputBoxes.size());
	
	  //number of input boxes---when tagname is wrong
	 // List<WebElement> allInputBoxes  =  driver.findElements(By.tagName("input###"));
	 // System.out.println("allInputBoxes"); // result--[]
	//System.out.println("number of input boxes: "+allInputBoxes.size()); result==0
	
	//number of images----second type to count no.
	int totalImages = driver.findElements(By.tagName("img")).size();
	System.out.println("number of images: "+totalImages);
	
	//number of links
	 List<WebElement> allLinks  =  driver.findElements(By.tagName("a"));
		System.out.println("number of links: "+allLinks.size());
		
		/*
		 * Scenario: identify all links and get every link text and value of href attribute in console
		 * 
		 */
		
		
		
		for(WebElement i:allLinks)
		{
			System.out.println(i.getText());
			System.out.println(i.getDomAttribute("href"));
			
		}
		
		
		System.out.println("-----------------------");
		
		String expLink="https://www.youtube.com/c/OrangeHRMInc";
		for(WebElement i:allLinks)
		{
			
			if(i.getDomAttribute("href").equals(expLink))
			{
				System.out.println("Link Found!");
				
				break;
			}
			
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
