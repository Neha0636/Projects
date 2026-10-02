package com.BlazeDemo.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.BlazeDemo.Pages.BaseClass;
import com.BlazeDemo.Pages.HomePage;
import com.BlazeDemo.Pages.ReservePage;
import com.BlazeDemo.Utilities.PropertiesUtil;

public class HomePageTest extends BaseClass {
	
	
	PropertiesUtil prop=new PropertiesUtil("Project");
	
	@BeforeMethod(alwaysRun=true)
	public void setUpforHome(){
		
		hp=new HomePage(driver);
	}
	
	@Test(priority = 1)
	public void verifyUrltitle() {

		
		String appUrl = hp.getPageUrl();
		AssertJUnit.assertTrue(appUrl.contains("index"));
		System.out.println("URL matched!:  " + appUrl);
		
		String appTitle = hp.getPageTitle();
		AssertJUnit.assertTrue(appTitle.contains("BlazeDemo"));
		System.out.println("Title match: " + appTitle);
	}

	@Test(priority = 2, groups="smoke")
	public void verifyAvailableOptions() {
		
		hp.DepartureOpt();
		hp.DestinationOpt();

	}

	@Test(priority = 3, groups="functional")
	public void chhooseOpt() {
    
		
		hp.selectDepartureCity(prop.getValue("depCity"));
		hp.selectDestinationCity(prop.getValue("desCity"));
		
		hp.clickFlight();
		AssertJUnit.assertTrue(hp.getPageUrl().contains("reserve"));
		System.out.println("User navigated to reserve page");

	}
}
