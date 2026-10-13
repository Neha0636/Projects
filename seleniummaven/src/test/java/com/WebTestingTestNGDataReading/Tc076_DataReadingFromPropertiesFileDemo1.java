package com.WebTestingTestNGDataReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Tc076_DataReadingFromPropertiesFileDemo1 {
  @Test
  public void testDataReadingFromFile() throws IOException {
	  
	  // to get the current project directory
	 // System.getProperty("user.dir")
	  
	  
	  
	  //file path:File Class
	  File f1=new File(System.getProperty("user.dir")+"//TestData//config.properties");    //convert backward slash into forward slash
	  
	  //to read the file data in stream: FileInputStream Class
	  FileInputStream fs=new FileInputStream(f1);
	  
	  //to read properties file data use properties class
	  Properties prop= new Properties();
	  
	  //load the file
	  prop.load(fs);
	  
	  System.out.println("browser name is: " +prop.getProperty("browserName"));
	  System.out.println("platform name is: " +prop.getProperty("platformName"));
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
