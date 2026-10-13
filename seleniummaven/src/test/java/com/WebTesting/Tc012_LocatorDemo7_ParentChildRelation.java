package com.WebTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc012_LocatorDemo7_ParentChildRelation {

	public static void main(String[] args) {
		//create driver session
		WebDriver driver = new ChromeDriver();
		
        //implicit time
		
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
       driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

         //get all link text in console

      List<WebElement>allLinks= driver.findElements(By.cssSelector("div.list-group>a"));
          System.out.println("number of all links:" +allLinks.size());

         for( WebElement i: allLinks)
         {
        	System.out.println(i.getText()); 	 
        	 
         }

           //search for forgotten password and click
         for (WebElement i:allLinks)
         {
        	if(i.getText().contains("Password"))
        	
        	{
        	 
        	 System.out.println("link found!");
        	 
        	 //click
        	i.click();
        	break;
        	
        	//if we want to do cssSelector with indexing====not good to do
        	//syntax===parent>child:nth-child(dom no.)
        	}
         }

	}

}
