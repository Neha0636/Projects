package assignmentselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class assignment14_datepicker_demoqa {
  @Test
  public void datepicker() {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://demoqa.com/date-picker");
	  
	    //date
	  driver.findElement(By.id("datePickerMonthYearInput")).click();
	  
	  //expectation   if we want to change date then only change here 
	  String Day = "27";
	  String Month ="December";
	  String Year ="2026";
		  
	  
	  
	  
	  
	  
  }
}
