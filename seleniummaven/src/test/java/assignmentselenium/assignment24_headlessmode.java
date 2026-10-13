package assignmentselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class assignment24_headlessmode {
  @Test
  public void headlessmode() {
	//for ,we use chromeoptions class
	  ChromeOptions options=new ChromeOptions();
	  options.addArguments("--headless"); 
	  
	  WebDriver driver=new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	  //email
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		//password
		driver.findElement(By.name("password")).sendKeys("admin123");
		//login
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	  
	  
  }
}
