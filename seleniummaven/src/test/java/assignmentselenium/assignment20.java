package assignmentselenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class assignment20 {
  @Test
  public void rightclick() {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/context_menu ");
	  
	  //button ele
	  WebElement button=driver.findElement(By.id("hot-spot"));
	  
	  
	  //perform right click: actions class
	  	  Actions act=new Actions(driver);
	  	  act.contextClick(button).perform();  //context method for right click but perform is also needed to complete action
	  	  
	  	Alert alt=driver.switchTo().alert();
		  System.out.println("Alert text is: "+alt.getText());
		  
		  alt.accept();
		  
	  
  }
}
