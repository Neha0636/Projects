package assignmentselenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class assignment16_10tabOpen {
  @Test
  public void FacebookTab() {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.google.com");   
	  
	  for(int i=0; i<10; i++)
	  {
	WebDriver newtab=driver.switchTo().newWindow(WindowType.TAB);
	  newtab.get("https://www.facebbok.com");
	  
	  }
  }
}
