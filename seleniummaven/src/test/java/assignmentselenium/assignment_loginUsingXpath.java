package assignmentselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment_loginUsingXpath {

	public static void main(String[] args) {
		//create driver session
		WebDriver driver = new ChromeDriver();
		
        //implicit time
		
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//open app
       driver.get("https://the-internet.herokuapp.com/login");
      
       //username
       driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
       
       //password
       driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPaasword!");
       
       //login
       driver.findElement(By.xpath("//button[@type='submit']")).click();  //no login password is wrong
       
       //logout
       //driver.findElement(By.xpath("")).click();
       
       
       
       
	}

}
