package com.WebTestingTestNG;

import org.testng.annotations.Test;

public class Tc064_GroupingOfTest {
  @Test(priority=1,groups="smoketest")
  public void register() {
	  
	  System.out.println("user is register");
	  
  }

@Test(priority=2,groups="smoketest")
public void login(){
	
	 System.out.println("user is login");
	 }

@Test(priority=3,groups={"regressiontest","functionaltest"})

		
public void search()
{
  System.out.println("search product");
}

@Test(priority=4,groups="regressiontest")                                      
public void addtocart()  
{
  System.out.println("add to cart");
}

@Test(priority=5,groups="regressiontest")
public void logout()
{
  System.out.println("user is logout");
}

@Test(priority=6)
public void verifytitle()
{
  System.out.println("this is title");
}








}
