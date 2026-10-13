package assignmentselenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class assignment15_alert {
  @Test
  public void alertautomation() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://formy-project.herokuapp.com/switch-window");   
	  
	  
	  // open  alert
	  driver.findElement(By.id("alert-button")).click();
	   Thread.sleep(2000);
	   
	  //handle alert
	  Alert alt1= driver.switchTo().alert();  //return type of alert() is Alert interface object
	  System.out.println("alert text is:" +alt1.getText());
	  
      //click on ok
	  alt1.accept();
	  
	  
	  
	  
	  
  }
}
