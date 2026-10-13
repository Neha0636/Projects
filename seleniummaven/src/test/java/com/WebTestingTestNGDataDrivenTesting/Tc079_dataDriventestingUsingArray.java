package com.WebTestingTestNGDataDrivenTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Tc079_dataDriventestingUsingArray {
	
	//test data set
	@DataProvider(name="myArrayData")
	public Object[][] getDataSet()
	{
		 Object arr[][]= {{"Admin", "admin123"},{"Richa" ,"test123"},{"Poonam" ,"test123"},{"Amit", "test123"}};
		 return arr;
	}
	
	
	
	
  @Test(dataProvider="myArrayData")
  public void testlogin(String un,String psw) {
	  
	  System.out.println("username: " +un);
	  System.out.println("password: " +psw);
	  
	  
	  
	  
	  
	  
	  
  }
}
