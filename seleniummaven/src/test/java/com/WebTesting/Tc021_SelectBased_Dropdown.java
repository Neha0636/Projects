package com.WebTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Tc021_SelectBased_Dropdown {
	@Test
	public void testcase1() throws InterruptedException  {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.amazon.in/");

		// first identify dropdown element
		
		  WebElement dropdownEle=driver.findElement(By.cssSelector("div#nav-search-dropdown-card select"));
		  System.out.println("Is element displayed?: "+dropdownEle.isDisplayed());//false
		  
		//to get all options in console
		  Select sc=new Select(dropdownEle);
		 
	     System.out.println("Is dropdown support single selection or multiple selection:" + sc.isMultiple()); // result-false..means
																												// single selection
																												

		// single option selection
		// can use three methods--1.by visibletext 2.by indexing 3.by value
		// we using indexing method
		sc.selectByIndex(3);
		
		Thread.sleep(1000);
		// using value method
		sc.selectByValue("search-alias=mobile-apps");
		
		//to get all options in console
		List< WebElement> allOptions =  sc.getOptions();  //select class has get option inbuilt method
		System.out.println("all options are:" +allOptions.size());
		
		
		for(WebElement i:allOptions)
		{
			System.out.println(i.getText());
			if(i.getText().contains("MP3 Music"))
			{
			i.click();
			break;
			}
	}
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
