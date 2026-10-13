package assignmentselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class assignment19_allframes_automation {
  @Test
  public void allframes() {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get(" https://ui.vision/demo/webtest/frames/");
	  
	  //switch to frame1
	  driver.switchTo().frame(0);
	  
	  //element inside frame1	  
	
	 driver.findElement(By.name("mytext1")).sendKeys("frame1 test");
	  
	 driver.switchTo().defaultContent(); //to switch main document
	  
	//switch to frame2
	  driver.switchTo().frame(1);
	  
	  //element inside frame2	  
	
	 driver.findElement(By.name("mytext2")).sendKeys("frame2 test");
	 
	 driver.switchTo().defaultContent(); //to switch main document
	 
	 //switch to frame3
	  driver.switchTo().frame(2);
	  
	  //element inside frame3	  
	
	  driver.findElement(By.name("mytext3")).sendKeys("frame3 test");
	 
	   //nested frame
		WebElement frameEle =driver.findElement(By.tagName("iframe"));
		 driver.switchTo().frame(frameEle);
		 
		 //find element
		 driver.findElement(By.xpath("(//div[@class='nWQGrd zwllIb'])[2]//div[@role='radio']")).click(); //driver current focus on child frame
		 
		 driver.switchTo().defaultContent(); //to switch main document
		 
	  //switch to frame4
	  driver.switchTo().frame(3);
	  
	  //element inside frame4	  
	
	 driver.findElement(By.name("mytext4")).sendKeys("frame4 test");
	 
	 driver.switchTo().defaultContent(); //to switch main document
	 
	 //switch to frame5
	  driver.switchTo().frame(4);
	  
	  //element inside frame5	  
	
	 driver.findElement(By.name("mytext5")).sendKeys("frame5 test");
	 
	 driver.switchTo().defaultContent(); //to switch main document

	
	 
	 
	  
	  
  }
}
