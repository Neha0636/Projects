package com.WebTesting;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.WebTesting.generic.ElementUtil;

public class Tc047_paginationWebTableAutomation {
  @Test
  public void testpagination() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  WebElement ele=driver.findElement(By.xpath("//h2[text()='Pagination Web Table']"));
	  ElementUtil.scrolluptoElement(driver,ele);
	  
	  //Number of pages
	  List<WebElement> allPages=driver.findElements(By.xpath("//ul[@id='pagination']/li/a"));
	  System.out.println("Number of pages are : "+allPages.size());//4
	  
	  Iterator<WebElement> ir=allPages.iterator();
	  
	  while(ir.hasNext())
	  {
		  WebElement page=ir.next();
		  //open page
		  page.click();
		  
		  int numOfRows=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
		  System.out.println("For page "+page.getText()+" Number of rows : "+numOfRows);
		  
		  
	  }
	 System.out.println("--------------------");
	 //scenario-go to page no. 2 and get all product in console
	 
	 Thread.sleep(1500);
	 
	Iterator <WebElement> ir2=allPages.iterator();
	  while(ir2.hasNext()) {
		 WebElement page=ir2.next();
		 
		if(page.getText().contains("2")) {
			
			//open page
			page.click();
			
			//get all products
			List<WebElement> allproducts=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr//td[2]"));
		
		 
		 for(WebElement i:allproducts)
		 {
			 System.out.println(i.getText());
		 }
		 
		 }
		}
	  
	  
	  
	  //scenario 3-go to page no. 2 and find specific product and click on checkbox
		 
		 Thread.sleep(1500);
		 
		Iterator <WebElement> ir3=allPages.iterator();
		  while(ir3.hasNext()) {
			 WebElement page=ir3.next();
			 
			if(page.getText().contains("3")) {
				
				//open page
				page.click();
				
				//get all products
				List<WebElement> allproducts=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr//td[2]"));
			
			 
			 for(WebElement i:allproducts)
			 {
				 if(i.getText().contains("Fitness Tracker")) {
					 driver.findElement(By.xpath("//td[text()='Fitness Tracker']//following-sibling::td[2]/input")).click();
					 
				 }
			 }
			 
			 }
			}
	  
	  
	  
	  
  }
}
