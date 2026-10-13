package com.WebTesting;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Tc054_FileUploadingUsingRobotclass {
  @Test
  public void testfileupload() throws AWTException, InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://the-internet.herokuapp.com/upload");
	  
	  //click on choose file button
	  //driver.findElement(By.id("file-upload")).click();   InvalidArgumentException: invalid argument(selenium webdriver is not finding this)
	  
	 WebElement ele=driver.findElement(By.name("file"));
	 
	 // JavascriptExecutor js=( JavascriptExecutor)driver;
	 // js.executeScript("arguments[0].click();" ,ele);    gives no exception but no window open of files so that we can upload
	  
	 
	//use another method ==action method
	  Actions act= new Actions(driver);
	  act.moveToElement(ele).click(ele).build().perform();
	  
	  //create robot class
	  Robot rb=new Robot();
	  rb.delay(2000);
	  
	  //ctrl+c----copy file
	  StringSelection sc=new StringSelection("C:\\Users\\DELL\\Downloads\\sql assignments.pdf");
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sc,null);
	  
	  //ctrl+v------paste file(press the key)
	  rb.keyPress(KeyEvent.VK_CONTROL);
	  rb.keyPress(KeyEvent.VK_V);
	  
	  
	  //ctrl+v------paste file(release the key) 
	  rb.keyRelease(KeyEvent.VK_CONTROL);
	  rb.keyRelease(KeyEvent.VK_V);
	  
	  //press enter key
	  rb.keyPress(KeyEvent.VK_ENTER);
	  rb.keyRelease(KeyEvent.VK_ENTER);
	  
	  
	  driver.findElement(By.id("file-submit")).click();
	  Thread.sleep(1500);
	  
	  //validate text
	 String text= driver.findElement(By.tagName("h1")).getText();
	 System.out.println("text is:" +text);
  }
}
