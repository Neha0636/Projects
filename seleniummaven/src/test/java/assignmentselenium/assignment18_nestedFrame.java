package assignmentselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class assignment18_nestedFrame {
  @Test
  public void nestedFrame() throws InterruptedException {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://demoqa.com/nestedframes");
	  
	  //switch to parent frame
	  WebElement frameEle =driver.findElement(By.xpath("//iframe[@src='/sampleiframe.html']"));
	 driver.switchTo().frame(frameEle);
	 Thread.sleep(2000);
	  
	    //switch to child frame
		WebElement frameEle2 =driver.findElement(By.cssSelector("body > iframe"));//prblm in this line
		 driver.switchTo().frame(frameEle2);
		 
		 //again switch to parent frame
		 //driver.switchTo().parentFrame();
		 
		 //switch to main doc
		// driver.switchTo().defaultContent();
  }
}//not completed
