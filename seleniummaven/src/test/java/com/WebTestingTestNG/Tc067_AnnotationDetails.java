package com.WebTestingTestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class Tc067_AnnotationDetails {
	  @Test(priority=1)
	  public void resgisterTest() 
	  {
		  System.out.println("User will register first");
	  }
	  
	  
	  @Test(priority=2)
	  public void loginTest() 
	  {
		  System.out.println("User will login");
	  }
	  
	  
	  @Test(priority=3)
	  public void logoutTest() 
	  {
		  System.out.println("User will logout");
	  }
	  
	  //Annotations
	  
	  
	  @BeforeMethod
	  public void bMethod()
	  {
		  System.out.println("@BeforeMethod will execute before every test case");
	  }
	  
	  @AfterMethod
	  public void aMethod()
	  {
		  System.out.println("@AfterMethod will execute after every test case");
	  }
	  
	  @BeforeClass
	  public void bClass()
	  {
		  System.out.println("@BeforeClass will execute one time before first test case");
	  }
	  

	  @AfterClass
	  public void aClass()
	  {
		  System.out.println("@AfterClass will execute one time after last test case");
	  }
	  
	  
	  @BeforeTest
	  public void bTest()
	  {
		  System.out.println("@BeforeTest will execute before all then classes");
		  
	  }
	  
	  @AfterTest
	  public void aTest()
	  {
		  System.out.println("@AfterTest will execute after all then classes");
		  
	  }
	  @BeforeSuite
	  public void bSuite()
	  {
		  System.out.println("@BeforeSuite executes before all the test");
	  }
	  
	  @AfterSuite
	  public void aSuite()
	  {
		  System.out.println("@AfterSuite executes after all the test");
	  }
	  
	  
	  
  }

