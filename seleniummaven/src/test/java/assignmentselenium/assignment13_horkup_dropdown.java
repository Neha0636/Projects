package assignmentselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class assignment13_horkup_dropdown {
  @Test
  public void dropdown() {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get(" https://formy-project.herokuapp.com/form");
	  
	  //dropdown===year of experience
	WebElement dropdownEle= driver.findElement(By.id("select-menu"));
	  Select sc = new Select(dropdownEle);
		 sc.selectByIndex(3); //select by value
	  
	  
  }
}
