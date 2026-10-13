package com.WebTestingTestNGDataReading;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Tc070_DataReadingfromXmlFile {
	
	@Parameters({"un","psw"})     //this un and line 13 14 is diff so no prbm because it take first parameter at first position second at second whatever the name
  @Test
  public void testlogin(String usern,String password) {
	  
	  System.out.println("username is" +usern);
	  System.out.println("password is" +password);
	  
	  
	  
  }
}
