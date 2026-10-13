package com.WebTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc010_LocatorDemo5_CssSelectorBasics {

	public static void main(String[] args) {
		//create driver session
		WebDriver driver = new ChromeDriver();
		
		//implicit time
		
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
			driver.get("https://automationplayground.com/crm/");
		
		// sign -- use cssSelector with id==tagname#id
			// shortcut method-- if we want to know cssSelector for id directly--then right click and copy highlighted link as css selector then if we paste it ..in the form of cssSelector
		
		driver.findElement(By.cssSelector("a#SignIn")).click();
		
		//email-- use css selector with attribute == tagname[type='attribute']
		
		driver.findElement(By.cssSelector("input[type='Email']")).sendKeys("test123@gmail.com");
		
		//password-- use cssSelector with attribute like type,class,id.. means any attribute
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("test123");
		
		// checkbox--we use cssSelector with id
		
		driver.findElement(By.cssSelector("input#remember")).click();
		
		//submit button--use cssSelector with classname===tagname.classname
		//we can take full class name in this  but only separate every classname with dot given in line 40
		
		//driver.findElement(By.cssSelector("button.btn.btn-default.btn-primary")).click();   //1 method
		
		// submit button-- use cssSelector  tagname with id,class,attribute--
		//syntax=====  tagname#id.className[attribute='value']
		
		driver.findElement(By.cssSelector("button#submit-id.btn[type='submit']")).click();   //2 method
		
		
		
		
		
		
		
		
		
		
	}

}
