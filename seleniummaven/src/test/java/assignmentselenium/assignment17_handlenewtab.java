package assignmentselenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class assignment17_handlenewtab {
  @Test
  public void automateAllbutton() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://demoqa.com/browser-windows");   
	  
	  //newTab--->open 
	  driver.findElement(By.id("tabButton")).click(); 
	  Thread.sleep(2000);
	 //new window open
	  driver.findElement(By.id("windowButton")).click(); 
	  
	  //new window message---open
	   driver.findElement(By.id("messageWindowButton")).click();
	  
	
		 
	  Thread.sleep(2000);
	  //total windows open
	 Set<String> allwindows= driver.getWindowHandles();   //set gives unique and unordered elements
	 System.out.println("no. of all windows: " +allwindows.size());  // ids of total windows print
	 System.out.println(allwindows); 
	
  }
  
}
