package com.WebTesting;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.WebTesting.generic.ElementUtil;

public class Tc032_NewTab_NewWindow {
  @Test
  public void testTabWindow() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.google.com");   
	  
	  //new tab===facebook
	 WebDriver newtab= driver.switchTo().newWindow(WindowType.TAB); //return type of newWindow is webdriver..so we write webdriver before newtab
	  newtab.get("https://www.facebook.com");
	 
	  //new Window ====amazon
	  WebDriver newWin= driver.switchTo().newWindow(WindowType.TAB); //return type of newWindow is webdriver..so we write webdriver before newtab
	  newWin.get("https://www.amazon.com");
	  
	  Set<String> allWins=driver.getWindowHandles();
	  System.out.println("Total windows: "+allWins.size());
	  
	  List<String> allWindows=new ArrayList<String>(allWins);  //set converted into list
	  
	  ElementUtil.switchToExpectedWindow(driver,allWindows,"Facebook"); //switch to facebook
	  
  }
}
