package com.WebTestingTestNG.ListenersReports;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class MyListeners implements ITestListener{   //in listener we cannot change this line
	
	public void onTestStart(ITestResult result) {
		
		System.out.println("test started: "+result.getName()); //can change this names
	}
	
public void onTestSuccess(ITestResult result) {
		System.out.println("test pass: "+result.getName());
		
	}
	
public void onTestFailure(ITestResult result) {
	System.out.println("test failed: "+result.getName());
	
	
}
	
	
	
	
	
	
	
}
