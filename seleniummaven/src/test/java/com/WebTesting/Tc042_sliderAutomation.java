package com.WebTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Tc042_sliderAutomation {
  @Test
  public void testSlider() {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://jqueryui.com/slider/");
	  
	  //handle frame
	  driver.switchTo().frame(0);
	 //find element
	 WebElement sliderEle= driver.findElement(By.cssSelector("span.ui-slider-handle"));
	 
	 //action
	 Actions act = new Actions(driver);
	 act.clickAndHold(sliderEle).moveToElement(sliderEle,100,0).build().perform();
	  
  }
}
