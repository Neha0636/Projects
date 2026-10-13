package assignmentselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment_login_logout {

	public static void main(String[] args) {
		
		//create driver session
				WebDriver driver = new ChromeDriver();
				
		        //implicit time
				
		      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				//open app
		       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login ");
		      
		       
		       // email
		       driver.findElement(By.cssSelector("input[placeholder=Username]")).sendKeys("Admin");
		       
		       //password
		      driver.findElement(By.cssSelector("input[type='password']")).sendKeys("admin123");
		       
		       //login
		      driver.findElement(By.cssSelector("button[type='submit']")).click();
		      
		      //open menu
		     driver.findElement(By.cssSelector("i[class*='oxd-icon bi-caret-down-fill']")).click();
		     
		      //logout
		     driver.findElement(By.cssSelector("Ul[role='menu']>li:nth-child(4)>a")).click();
				


	}

}
