package com.WebTestingTestNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tc062_TestNGDependsOnMethodAttribute {
  @Test(priority=1)
  public void registertest() {
	  
	  System.out.println("user register first");
	  AssertJUnit.assertEquals(true, true); //pass                         //to validate test case,assertion used 
  }
  
  @Test(priority=1,dependsOnMethods="registertest")
  public void logintest() {
	  
	  System.out.println("register user can login");
	  AssertJUnit.assertEquals(false, true); //fail                      //when assertion fail..it gives "assertion error" not any exception
  }
  
  @Test(priority=3,dependsOnMethods="logintest")
  public void logouttest() {
	  
	  System.out.println("login user can logout"); //skip      //because this depends on second which fails so it skips
  }
  
  
  
  
  
}
