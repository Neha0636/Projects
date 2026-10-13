package com.WebTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc015_LocatorDemo_xpathmethod {

	public static void main(String[] args) {
		
		//create driver session
				WebDriver driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//open application
				driver.get("https://www.amazon.in/");
				
				
				// in this we use xpath method
				//syntax==//tagname[text()='visibletext']      but this method doesn't recognize space in starting and ending pf visible text        
				driver.findElement(By.xpath("//a[text()='Sell']")).click();
				
				//for recognize space in starting and ending...use normalize space method
				//syntax   //tagname[normalize-space()='visibletext'] 
				
				driver.findElement(By.xpath("(//span[normalize-space()='Cart'])[2]")).click();
				
				// xpath with normalize space method
			String msg=	driver.findElement(By.xpath("//h3[normalize-space()='Your Amazon Cart is empty']")).getText();
				
			System.out.println("cart is:" +msg);
			
			//xpath with contains method
			//syntax---1.//tagname[contains(@attribute,'partial value')]

            //2.tagname[contains(text(),'partial text')]
            //3.tagname[contains(normalize-space(),'partial text')]
			
		String text= driver.findElement(By.xpath("//h3[contains(normalize-space(),' Cart is empty')]")).getText();  //using method3
		System.out.println("cart is:" +text);
		
		//for searchbox ===using contains method using attribute means 1 method====partialtext use in every method
		 driver.findElement(By.xpath("//input[contains(@id,'textbox')]")).sendKeys("laptop",Keys.ENTER);
		 
		//searchbox by using startswith  ===same syntax like contains..only replace contains with starts with
        WebElement searchBox=driver.findElement(By.xpath("//input[starts-with(@id,'two')]"));
		
		//clear the text
		searchBox.clear();
		
		//search for mobiles
		searchBox.sendKeys("mobiles",Keys.ENTER);
		
		
		
		
		 
		 //starts-with method ---all syntax same like contains===only repace contains with starts-with
		 //SEARCH MOBILE
		 
		
		
		
		
		
		
		
		
		
			
			
		
			
			
			
			
			
			
			
				
	}

}
