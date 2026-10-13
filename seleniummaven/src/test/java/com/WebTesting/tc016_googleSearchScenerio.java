package com.WebTesting;

import java.time.Duration;
import java.util.List;

import javax.swing.JList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc016_googleSearchScenerio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create driver session
				WebDriver driver=new ChromeDriver();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				driver.get("https://www.google.com/");
				
				//search for keyword and enter
				//driver.findElement(By.id("APjFqb")).sendKeys("Jenkins",Keys.ENTER);
				
//there is some security issue while using some live apps so cannot automate google
				
				
		//search for keyword
		driver.findElement(By.id("APjFqb")).sendKeys("Jenkins");
				
        // get all suggestion from google in console
		List<WebElement> allOptions=driver.findElements(By.cssSelector("ul[role='listbox']>li"));  //want to see list while typing any keyword first search its parent
		
		System.out.println("total keywords are:" +allOptions.size());
		
		for(WebElement i:allOptions) {
			
			System.out.println(i.getText());
		}
		
		
		
		
		
		
		
		
		
	}

}
