package com.WebTestingTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Tc063_TestNGDisableTestFromExecutionUsingEnabledAttribute {

@Test(priority=1,description="this is user register")         
public void register()
{
  System.out.println("user is register");
}

@Test(priority=2,description="this is user login")                                     
public void login()                                       
{                                                          
  System.out.println("user is login");
}

//disable using testng xml file                  
@Test(priority=3,description="this is user logout")
public void search()
{
  System.out.println("search product");
}

@Test(priority=4,description="this is add to cart",enabled=false)        //if we want to disable any test case,use enabled=false                                 
public void addtocart()  //this disable so only 4 testcase executed
{
  System.out.println("add to cart");
}

@Test(priority=5,description="this is user logout")
public void logout()
{
  System.out.println("user is logout");
}

}








