package com.WebTestingTestNGPageObjectModelUsingByClass;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTestCase extends BaseClass {
  @Test(priority=1)
  public void verifyUrl() {	  
	 // LoginPage lp=new LoginPage(driver); 
	 String appurl= lp.getPageUrl();
	 Assert.assertTrue(appurl.contains("login"));
	 System.out.println("title matched!");
  }
  
  @Test(priority=2)
  public void verifyTitle() {
  //LoginPage lp=new LoginPage();
	  String apptitle=lp.getPageTitle();
	  Assert.assertTrue(apptitle.contains("Login"));
	  System.out.println("title matched! "+apptitle);
	  
  }
  
  @Test(priority=3)
  public void validateLogin() 
  {
	  lp.doLogin("test@gmail.com","test123");
	  Assert.assertTrue(lp.getPageUrl().contains("customers"));
	  System.out.println("User navigated to Customers page");
	  
  }
}
