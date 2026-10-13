package assignmentselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class assignment11_automationScript_form {
  @Test
  public void testform() {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get(" https://formy-project.herokuapp.com/form");
	  
	  //first name
	  driver.findElement(By.id("first-name")).sendKeys("kiran");
	 
	  //last name
	  driver.findElement(By.id("last-name")).sendKeys("sharma");
		
	  //job title
	  driver.findElement(By.id("job-title")).sendKeys("SDET");
		
	  //level of education
	  driver.findElement(By.xpath("//input[@value='radio-button-2']")).click();
		
	  //male or female
	  driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
	  
	   //  experience  ===dropdown
		WebElement dropdownEle=	driver.findElement(By.id("select-menu"));
		 Select sc = new Select(dropdownEle);
		 sc.selectByIndex(2); //select by value
	  
	  //date
		 driver.findElement(By.id("datepicker")).sendKeys("10/6/2026");
		  
	  //submit
	  driver.findElement(By.xpath("//a[@role='button']")).click();
		
	  
	  
	  
  }
}
