package assignmentselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment_loginBycssSelector {

	public static void main(String[] args) {
		//create driver session
		WebDriver driver = new ChromeDriver();
		
        //implicit time
		
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//open app
       driver.get(" https://tutorialsninja.com/demo/index.php?route=account/login app ");
       
     //login using css selector

       driver.findElement(By.cssSelector("#column-right > div > a:nth-child(1)")).click();
       
       // email
       driver.findElement(By.cssSelector("input#input-email")).sendKeys("test2525@gmail.com");
       
       //password
       driver.findElement(By.cssSelector("#input-password")).sendKeys("test123");
       
       //submit
       driver.findElement(By.cssSelector("input[type='submit']")).click();
		
	}

}
