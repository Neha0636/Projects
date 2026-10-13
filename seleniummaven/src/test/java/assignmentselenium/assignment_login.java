package assignmentselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment_login {

	public static void main(String[] args) throws InterruptedException
	{
		
WebDriver driver = new ChromeDriver();
		
		//open application
	  driver.get("https://the-internet.herokuapp.com/login");
		
	  //validate credential
	    driver.findElement(By.id("username")).sendKeys("tomsmith"); 
	
	    driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!"); 
	    Thread.sleep(2000);
	    driver.findElement(By.className("fa")).click();
		
			
	   Thread.sleep(2000);
		driver.quit();
			

	}

}
