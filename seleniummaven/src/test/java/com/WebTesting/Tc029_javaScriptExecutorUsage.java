package com.WebTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc029_javaScriptExecutorUsage {
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://formy-project.herokuapp.com/form");
	  
	  // I want operation on currentsession
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  
	 //to get title
	  System.out.println("title is:" +driver.getTitle());  //title in normaly way means with the help of selenium
	  
	    String title= js.executeScript("return document.title").toString();  //title with the help of javascript executor
	  System.out.println("javasriptexeccutor title is:" +title);
	  
	  //to refrace page
	  driver.navigate().refresh();  //through selenium
	  
	  Thread.sleep(1500);
	  js.executeScript("history.go()");   //through javascript executor
	  System.out.println("done");
	  
	  //click on element
	   WebElement radioele= driver.findElement(By.id("radio-button-1"));
	   js.executeScript("arguments[0].click();",radioele);  //click through javascript...we can also use this when driver.click is not working
	  
	  //enter text
	   WebElement textele= driver.findElement(By.id("job-title"));
	   js.executeScript("arguments[0].value='SDET'",textele);
	  
	   //hidden element automation
	   driver.navigate().to("https://www.letskodeit.com/practice");
	  
	        Thread.sleep(2000);
		  
		  //click on hide button 
		  driver.findElement(By.id("hide-textbox")).click();
	   
	   // hidden element ----gives elementNotInteractableException
		// driver.findElement(By.id("displayed-text")).sendKeys("hello");     fail  1 method
		  
		 WebElement inputele= driver.findElement(By.id("displayed-text"));  //2 method
		   js.executeScript("arguments[0].value='hello'",inputele);
		  
		  
		  
		  
	   
	   
	   
  }
}
