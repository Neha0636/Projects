package assignmentselenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class assignment_redbus_dropdown {
  @Test
  public void testdropdown() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get(" https://www.redbus.in/ ");
	  
	//search for location ==dropdown 1
	driver.findElement(By.id("srcinput")).sendKeys("Delhi");
	Thread.sleep(2000);
	List<WebElement> allOptions=driver.findElements(By.cssSelector("div[class^='searchCategory']>div[id^='suggestion'] div[role='heading']"));
	
	System.out.println(allOptions.size());
	 for(WebElement i:allOptions)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains("kashmiri"))
		  {
			  i.click();
			  break;
		  }
	  }
	  
	 //search for location ==dropdown2
	 driver.findElement(By.id("destinput")).sendKeys("Agra");
	Thread.sleep(2000);
	
	List<WebElement> allOptions2=driver.findElements(By.cssSelector("div[class^='searchCategory']>div[id^='suggestion'] div[role='heading']"));
	
	System.out.println(allOptions2.size());
	 for(WebElement j:allOptions2)
	  {
		  System.out.println(j.getText());
		  if(j.getText().contains("agra"))
		  {
			  j.click();
			  break;
		  }
	  }
	     
	  
  }
}
