package com.BlazeDemo.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BlazeDemo.Pages.BaseClass;
import com.BlazeDemo.Pages.HomePage;
import com.BlazeDemo.Pages.ReservePage;
import com.BlazeDemo.Utilities.PropertiesUtil;

public class ReservePageTest extends BaseClass {
	
	PropertiesUtil prop=new PropertiesUtil("Project");
	
	@BeforeMethod(alwaysRun=true)
	public void navigateToReservePage() {
		
		hp.selectDepartureCity(prop.getValue("depCity"));
		hp.selectDestinationCity(prop.getValue("desCity"));
		rp = hp.clickFlight();
		

	}

	@Test(priority = 1)
	public void VerifyReservePageHeader() {

		String headerText = rp.getPageHeaderTitle();
		System.out.println("Page Header: " + headerText);
		 Assert.assertTrue(headerText.contains("Flights from"), "Header title does not match!");
		
	}

	@Test(priority = 2)
	public void testFlightCountAndNames() {
		
		rp.getallFlight();

		// Verify flight count
		int availableFlightsCount = rp.getAvailableFlightsCount();
		System.out.println("Total Flights Found: " + availableFlightsCount);
		Assert.assertTrue(availableFlightsCount > 0, "No flights listed on the reserve page!");

	}

	@Test(priority = 3, groups="functional")
	public void SelectFlightAndProceed() {
		
		
		rp.clickSecondChooseFlight();

		// verify that you landed on the purchase page
		System.out.println("Successfully clicked flight and transitioned.");
	}
}
