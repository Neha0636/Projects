package com.WebTestingTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Tco61_TestNGTimeouts {
  @Test(priority=1,timeOut=5000)
  public void testcase1() throws InterruptedException {
	  
      System.out.println("test case started");
      Thread.sleep(6000);                          //in this expected timeout is less than time given through java so this test case execution fails
      System.out.println("test case 1 is executed");
       }
  
  @Test(priority=2,timeOut=5000)    //to add expected timeout,use timeOut attribute means to set execution time 
  public void testcase2() throws InterruptedException {
	  
      System.out.println("test case started");
      Thread.sleep(4000);
      System.out.println("test case 2 is executed");
       }
  
  
  
  
  
  
  
  
  
  
		  }