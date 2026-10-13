package com.WebTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Tc022_selectionBased_Formy {
  @Test
  public void testcase1() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://formy-project.herokuapp.com/form ");
	  
	  // automate dropdown
	WebElement dropdownEle=	driver.findElement(By.id("select-menu"));
		
		//select
	  Select sc = new Select(dropdownEle);
	  
	  System.out.println("option have single selection or multiple:" +sc.isMultiple());
	  
	  // select single selection
	   sc.selectByValue("4");
	  
	  Thread.sleep(1000);
	  sc.selectByIndex(2);
	  Thread.sleep(1000);
	  sc.selectByVisibleText("0-1");
	  
	  //get all options
	List<WebElement> allOptions =  sc.getOptions();
	System.out.println("all options are:" +allOptions.size());
	
	//print all options
	for(WebElement i:allOptions) {
		System.out.println(i.getText());
		
		
	}
	
	
	
  }
}
