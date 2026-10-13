package com.WebTestingTestNG;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Tc065_AssertionDemo {
  @Test(priority=1)
  public void testhardassertion() {
	String act= "Selenium Webdriver is WebUi Automation Library";
	String exp= "Selenium Webdriver is WebUi Automation Library/load";
	
	//Assert.assertEquals(act,exp,"test fail: strings are not equal");
	
	//Asset.asserttrue()==== true condition
	//Assert.assertTrue(act.equals(exp),"test fail: strings are not equal");
	//System.out.println("test pass:strings are equal");
	//System.out.println("done!");
	
	//Asset.assertfalse()===test pass     (this is for negative scenario....as actual string not contain testng text)
	
	Assert.assertFalse(act.contains("TestNG"),"test fail: as actual string contains TestNG");
	System.out.println("test pass: as actual string does not contains TestNG");
	
  }
  
  @Test(priority=2)
  
  public void testsoftassertion() {
	  
	  int num1=100,num2=200;
	  
	  SoftAssert sf= new SoftAssert();
	 // sf.assertEquals(num1,num2,"test fail:numbers are not equal");
	 // System.out.println("test pass: numbers are equal");
	  //System.out.println("done!");
	  
	  sf.assertTrue(num1==num2);
	  System.out.println("done!");
	  sf.assertAll();  //if we want to know soft assertion fail or not..we have to write this statement assertall() unless it gives no error while test failed
  } 
  
  
  
}
