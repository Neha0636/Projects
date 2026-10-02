package com.BlazeDemo.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BlazeDemo.Pages.BaseClass;
import com.BlazeDemo.Pages.ConfirmationPage;
import com.BlazeDemo.Pages.HomePage;
import com.BlazeDemo.Pages.PurchasePage;
import com.BlazeDemo.Pages.ReservePage;
import com.BlazeDemo.Utilities.PropertiesUtil;

public class ConfirmationPageTest extends BaseClass {
	PropertiesUtil prop=new PropertiesUtil("Project");

	@BeforeMethod(alwaysRun=true)
	public void navigateToReservePage() {
		
         
		hp.selectDepartureCity(prop.getValue("depCity"));
		hp.selectDestinationCity(prop.getValue("desCity"));
		rp = hp.clickFlight();
		rp.clickSecondChooseFlight();
		pp.placeOrder("Pooja", "sanjayplace", "Agra", "UP", "3214", "Visa", "12348765", "11", "2025", "Pooja");
		cp = pp.clickPurchaseFlightButton();

	}

	@Test(priority = 1)
	public void geturlTitle() throws InterruptedException {

		String appUrl = cp.getCurrentUrl();
		AssertJUnit.assertTrue(appUrl.contains("confirmation"));
		System.out.println("URL matched!:  " + appUrl);
		Thread.sleep(2000);
		
		String appTitle = cp.getTitle();
		AssertJUnit.assertTrue(appTitle.contains("BlazeDemo Confirmation"));
		System.out.println("Title match: " + appTitle);
		Thread.sleep(2000);
	}


	@Test(priority = 2)
	public void verifyConfirmationHeader() throws InterruptedException {

		System.out.println("Confirmation message is: "+cp.getConfirmMessage());
		Thread.sleep(2000);

	}

	@Test(priority = 3)
	public void verifyConfirmationDetails() {

		System.out.println("Confirmation details are: "+cp.getConfirmDetails());
		System.out.println("other Confirmation details are: "+cp.confirmdetails2());

	}

}
