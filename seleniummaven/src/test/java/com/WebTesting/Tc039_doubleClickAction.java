package com.WebTesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Tc039_doubleClickAction {
  @Test
  public void testdoubleClick() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	  
	  //find element
	 WebElement buttonEle= driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	  
	 //perform action
	 Actions act=new Actions(driver);
	 act.doubleClick(buttonEle).perform();
	 
	 //handle alert
	  Alert alt1= driver.switchTo().alert();
	  
	  System.out.println("alert is:" +alt1.getText());
	  
	  //ok
	  alt1.accept();
  }
}
