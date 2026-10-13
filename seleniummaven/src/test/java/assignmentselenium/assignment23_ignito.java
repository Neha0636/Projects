package assignmentselenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class assignment23_ignito {
  @Test
  public void f() throws InterruptedException {
	  ChromeOptions options=new ChromeOptions();
	  options.addArguments("--incognito");
	  
	  ChromeDriver driver=new ChromeDriver(options);
	  driver.get("https://www.amazon.in");
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	  //search for keyword
	  driver.findElement(By.xpath("//input[@role='searchbox']")).sendKeys("mobile");
	  Thread.sleep(2000);
	     
	  // get all suggestion from google in console
	   List<WebElement> allOptions=driver.findElements(By.xpath("//div[@class='left-pane-results-container']//div[@role='row']"));  //want to see list while typing any keyword first search its parent
		
		System.out.println("total keywords are:" +allOptions.size());
		
		for(WebElement i:allOptions) {
			
			System.out.println(i.getText());
		}
		
		
		

}
	  
	  
  }

