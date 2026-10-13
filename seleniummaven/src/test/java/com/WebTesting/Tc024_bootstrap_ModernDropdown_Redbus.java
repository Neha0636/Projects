package com.WebTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc024_bootstrap_ModernDropdown_Redbus {
  @Test
  public void testdropdown() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.redbus.in/");
	  
	  //search for location
	  driver.findElement(By.id("srcinput")).sendKeys("Pune");
	  Thread.sleep(2000);
		List<WebElement> allOptions=driver.findElements(By.cssSelector("div[class^='searchCategory']>div[id^='suggestion'] div[role='heading']"));
	    //List<WebElement> allOptions=driver.findElements(By.xpath("(//div[contains(@class,'searchCategory')])[1]//div[contains(@class,'listHeader')]"));
	  //List<WebElement> allOptions=driver.findElements(By.xpath("//div[contains(@class,'listItem')]//div[@role='heading']"));
	  System.out.println("Total Options are: "+allOptions.size());
	  
	  for(WebElement i:allOptions)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains("Wakad"))
		  {
			  i.click();
			  break;
		  }
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
