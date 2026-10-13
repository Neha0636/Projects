package com.WebTestingTestNG.ListenersReports;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {
  @Test
  public void testReport() {
	  
	  //extent report object
	  ExtentReports extent= new ExtentReports();
	  
	  //path for report
	  ExtentSparkReporter spark=new ExtentSparkReporter(System.getProperty("user.dir")+"//TestReport//ExtentHtmlReport.html");
	  
	  //attach report
	  
	  extent.attachReporter(spark);
	  
	  //configuration
	  spark.config().setDocumentTitle("AutomationReport");
	  spark.config().setReportName("TestApp Automation Report");
	  spark.config().setTheme(Theme.DARK);
	  
	  //create a test
	 ExtentTest test= extent.createTest("Test SwagLab App");
	 
	 //log
	 test.log(Status.PASS,"Test Pass");
	 test.log(Status.FAIL,"Test Fail");
	 test.log(Status.WARNING,"Test gives Warning");
	 test.log(Status.INFO,"Test Info");
	 
	 
	 //flush report
	 extent.flush();
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	  
  }
}
