package com.WebTestingTestNGPageObjectModelUsingPageFactoryClass;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewLoginPageTestCase extends BaseClass {
	  @Test(priority=1)
	  public void verifyUrl() 
	  {
		  
		  String appUrl=lp.getPageUrl();
		  Assert.assertTrue(appUrl.contains("login"));
		  System.out.println("URL matched!:  "+appUrl);
	  }
	  
	  @Test(priority=2)
	  public void verifyTitle()
	  {
		  
		  String appTitle=lp.getPageTitle();
		  Assert.assertTrue(appTitle.contains("Login"));
		  System.out.println("Title match: "+appTitle);
	  }
	  
	  
	  @Test(priority=3)
	  public void validateLogin() 
	  {
		  lp.doLogin("test@gmail.com","test123");
		  Assert.assertTrue(lp.getPageUrl().contains("customers"));
		  System.out.println("User navigated to Customers page");
		  
	  }
	  
	  
	  
  }

