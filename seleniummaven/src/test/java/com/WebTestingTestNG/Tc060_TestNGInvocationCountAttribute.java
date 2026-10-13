package com.WebTestingTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Tc060_TestNGInvocationCountAttribute {
  @Test(priority=1 )
  public void register() {
	  
	  System.out.println("user is register");
  }
  @Test(priority=2,invocationCount=3)           //for executing test case multiple times, use invocationCount 
  public void login() {
	  
	  System.out.println("user is login");
  }
  
  @Test(priority=3)
  public void searchproduct() {
	  
	  System.out.println("user search the product");
  }
  
  
  
  
  
  
  
}
