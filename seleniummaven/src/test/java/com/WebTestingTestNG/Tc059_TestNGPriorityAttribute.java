package com.WebTestingTestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Tc059_TestNGPriorityAttribute {/*
  @Test
  public void firefoxTest() {
	  
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.google.com");
	  System.out.println("title is :" +driver.getTitle());
  }
  
  @Test
  public void chromeTest() {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  System.out.println("title is :" +driver.getTitle());
	  
  }
  
  @Test
 public void edgeTest() {
	  
	  WebDriver driver=new EdgeDriver();
	  driver.get("https://www.amazon.in");
	  System.out.println("title is :" +driver.getTitle());
  } */
  
	@Test(priority=1,description="this is user register")            //it execute test case in alphabetical order.so need to set priority to every test case
	public void register()
	{
	  System.out.println("user is register");
	}
	
	@Test(priority=2,description="this is user login")                                        //if we give same priority to two test case then it follow alphabetical order
	public void login()                                       //if we give priority to only two test case and other two remains same
	{                                                          //then /first other two execute in alphabetical order,then priority test case will execute
	  System.out.println("user is login");
	}
	
	@Test(priority=3,description="this is add to cartr")                                         //if we want to add extra information then use description
	public void addtocart()
	{
	  System.out.println("add to cart");
	}
	
	@Test(priority=4,description="this is user logout")
	public void logout()
	{
	  System.out.println("user is logout");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
