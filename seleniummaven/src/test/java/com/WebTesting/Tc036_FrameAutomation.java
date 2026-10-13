package com.WebTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc036_FrameAutomation {
  @Test
  public void testframe() {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://demoqa.com/frames");

	// String text=driver.findElement(By.id("sampleHeading")).getText();
	 // System.out.println(text);  //NoSuchSessionException found=== this type of exception can occur in 3 ways
	                            //due to synchronize time,due to wrong locator, due to element in frame
	  
	  //to check whether element present in frame==
	  //inspect and see id #document is present..if present then up this document iframe present that means element present in frame
	  //then open path finder and search //iframe ===this gives no. of frame present 
	  //can choose which frame we want 
	  
	  //switch to frame(based on index)
	 // driver.switchTo().frame(0);
	  
	  //switch to frame (based on id)
	   // driver.switchTo().frame("frame1");
	  
	  //switch to frame (based on webelement)
	 WebElement frameEle=driver.findElement(By.xpath("(//iframe[@src='/sample.html'])[1]"));
	  driver.switchTo().frame(frameEle);
	 
	   String text=driver.findElement(By.id("sampleHeading")).getText();
	  System.out.println(text);
	  
	  
	  
  }
}
