package assignmentselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment_positiveloginIn_byxpath {

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
		       driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
		       
		      // submit
		       driver.findElement(By.xpath("//button[@id='submit'] ")).click();
		       
		   // verify url of login page
		       
		   System.out.println("current url: " +driver.getCurrentUrl());
		   
		 //verify success msg
		String msg=driver.findElement(By.xpath("//strong[contains(normalize-space(),'student')]")).getText();
		System.out.println(msg);
			 
    //logout is displayed
	WebElement msg2=driver.findElement(By.xpath("//a[@class='wp-block-button__link has-text-color has-background has-very-dark-gray-background-color' ]"));
		
		if(msg2.isDisplayed()) {
	     System.out.println("text is " +msg2.getText());
		}
	}

}
