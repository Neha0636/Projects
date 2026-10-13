package com.WebTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc027_javaScriptExecutor_scollpage {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.amazon.in/");
	  //selenium cannot automate javascript functions so use javascript executor interface
	   
	  //convert driver into javascript executor interface
	  JavascriptExecutor js = ( JavascriptExecutor) driver;  //explicit typecasting---to convert webdriver into java script executor
	  
	  Thread.sleep(2000);
	  //scroll down
	  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	  Thread.sleep(2000);
	  //SCROLL up
	  js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	  
	  Thread.sleep(2000);
	  //scroll upto the element
	WebElement ele=  driver.findElement(By.xpath("//span[contains(text(),'Min.50% off | Top home essentials')] "));
	 js.executeScript("arguments[0].scrollIntoView(true);",ele);
	  
  }
}
