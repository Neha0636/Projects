package com.WebTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Tc049_HeadlessBrowserTest {
  @Test
  public void testheadlessmode() {
	  //for chrome,we use chromeoptions class
	  ChromeOptions options=new ChromeOptions();
	  options.addArguments("--headless");  //it make entire process headless means no ui open
	    //through this test case test fastly..its use in regression testing
	  
	  
	  
	//Create driver session
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("driver session created");
		driver.get("https://www.google.com/");
		
		//search for keyword and enter
		//driver.findElement(By.id("APjFqb")).sendKeys("Jenkins",Keys.ENTER);
		System.out.println("application open");
        //search for keyword
         driver.findElement(By.id("APjFqb")).sendKeys("Jenkins");
		
         System.out.println("keyword search");
        // get all suggestion from google in console
       List<WebElement> allOptions=driver.findElements(By.cssSelector("ul[role='listbox']>li"));  //want to see list while typing any keyword first search its parent

       System.out.println("total keywords are:" +allOptions.size());

        for(WebElement i:allOptions) {
	
	  System.out.println(i.getText());
}





	  
	  
  }
}
