package assignmentselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment10_negativePassword {

	public static void main(String[] args) {
		
		//create driver session
		WebDriver driver = new ChromeDriver();
		
        //implicit time
		
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//open app
       driver.get("https://practicetestautomation.com/practice-test-login");
      
       //username
       driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
       
       //password
       driver.findElement(By.xpath("//input[@id='password']")).sendKeys("incorrectPassword");
       
      // submit
       driver.findElement(By.xpath("//button[@id='submit'] ")).click();
       
       //error msg displayed
       WebElement msg= driver.findElement(By.xpath("//div[@id='error']"));
       
       if(msg.isDisplayed()) {
      System.out.println(msg.isDisplayed());
      System.out.println("text is:" +msg.getText());
        
          
       }      
		

	}

}
