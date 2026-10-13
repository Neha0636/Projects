package com.WebTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc026_datepickerAutomation_Redbus {
  @Test
  public void testDatePicker() {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.redbus.in/");
	  
	  //calender has no predefined method..so we have to use our own logic
	  //open calender ...first find stable component for calender open.because cureent date shown is dynamic so choose calender icon to open calender
	   driver.findElement(By.cssSelector("div[class^='dateInputWrapper']")).click();
	  
	  //expectation   if we want to change date then only change here 
	  String Day = "27";
	  String Month ="December";
	  String Year ="2026";
	  
	  //month selection
	  //get the current month and year
	  while(true) //using because no. of itteration not confirm to find expected month
	  {  
	  //get the current month and year
	   String date = driver.findElement(By.cssSelector("p[class^='monthYear']")).getText();
	  System.out.println(date);
	  
	  // TO Seperate full text ..we use split method in java
	   String cmonth= date.split(" ")[0];    //method---date.split(" ")[index position of that component..means month on 0 no.]
	   String cyear=date.split(" ")[1];
	   System.out.println(cmonth);
	   System.out.println(cyear);
	  
	   if( cmonth.contains(Month) && cyear.contains(Year))
	   {
		   System.out.println("Expected month found"); 
		   break;
		     }
	   else {
		   //click on arrow until expected month found....so for this we use while loop (when no. of itteration not confirm)
		driver.findElement(By.xpath("(//i[contains(@class,' icon-arrow ')])[2]")).click();
	   }
	   
	  }
	  //date selection
	  
	 List<WebElement> allDates= driver.findElements(By.cssSelector("ul[class^='datesWrap'] li span"));
	  
	  for(WebElement i:allDates) {
		  if(i.getText().contains(Day)) {
			  i.click();
			  break;
		  }
	  }
	 
	 
	 
	 
	 
	  
	  
	  
  }
}
