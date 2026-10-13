package com.WebTestingTestNG.ListenersReports;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.WebTestingTestNG.ListenersReports.MyListeners.class)   //1 method for attach listener
public class AppTest {
	
	
  @Test(priority=1)
  public void appRegistration() {
	  System.out.println("user will register");
	 	  AssertJUnit.assertEquals(true,true);
  }
  @Test(priority=2)
  public void appLogin() {
	  System.out.println("user will login");
	  AssertJUnit.assertEquals(true,false);
	  
	  
  }
  
  
  
  
  
  
  
  
  
  
}
