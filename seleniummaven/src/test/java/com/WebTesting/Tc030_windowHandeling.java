package com.WebTesting;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc030_windowHandeling {
  @Test
  public void testwindowHandel() {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://formy-project.herokuapp.com/switch-window");   // this open window is parent page
	  
	  
	  
	  /*click on button
	  driver.findElement(By.id("new-tab-button")).click(); //child page open 
	  
	  //open new tab
	  driver.findElement(By.linkText("Checkbox")).click();   //gives NOSUCHELEMENTEXCEPTION because driver focus only on parent page
	                can automate only parent page not child page.checkbox is in child page */
	 
	  //so this handle through window handeling 
	  
	 String parentId= driver.getWindowHandle();
	  System.out.println(parentId);  //session id print
	  
	 // click on button
	  driver.findElement(By.id("new-tab-button")).click(); //child page open
	  
	 Set<String> allwindows= driver.getWindowHandles();   //set gives unique and unordered elements
	 System.out.println("no. of all windows: " +allwindows.size());  // ids of total windows print
	 System.out.println(allwindows); 
	  for(String childId:allwindows) {
		  if(!parentId.equals(childId)) //if parent id not equals to child id then switch to child window
		  {
			 driver.switchTo().window(childId);  //switch to child window
			 
			//open new tab
			driver.findElement(By.linkText("Checkbox")).click();  
			
			driver.close();  //close used to close only one window..so current window close ,means child window
		  }
	  }
	  
	  driver.switchTo().window(parentId);
	 String text = driver.findElement(By.tagName("h1")).getText();
	  System.out.println(text);
	  
	  
	  
	  
  }
}
