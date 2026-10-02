package com.BlazeDemo.TestCases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BlazeDemo.Pages.BaseClass;
import com.BlazeDemo.Pages.HomePage;
import com.BlazeDemo.Pages.PurchasePage;
import com.BlazeDemo.Pages.ReservePage;
import com.BlazeDemo.Utilities.CustomData;
import com.BlazeDemo.Utilities.ElementUtil;
import com.BlazeDemo.Utilities.PropertiesUtil;


public class PurchasePageTest extends BaseClass {
	
	PropertiesUtil prop=new PropertiesUtil("Project");

	@BeforeMethod(alwaysRun=true)
	public void navigateToReservePage() {
		
		hp.selectDepartureCity(prop.getValue("depCity"));
		hp.selectDestinationCity(prop.getValue("desCity"));
		rp=hp.clickFlight();
		
	    pp=rp.clickSecondChooseFlight();
    
	}
	@Test(priority = 1)
	public void geturl() throws InterruptedException {
		pp.getAppUrl();
		Thread.sleep(2000);
	}

	@Test(priority = 2)
	public void verifyPurchasePageHeaderDetails() {
		pp.getHeadertext();
		pp.getPurchaseDetails();
	}


	@Test(priority = 3, dataProvider="excelData", dataProviderClass = CustomData.class, groups="datadriven")
	public void multipleBooking(String n, String add, String ci, String sa, String zp, String ca, String cr, String cm,String cy, String nc) throws InterruptedException {
		
		pp.placeOrder(n, add, ci, sa, zp, ca ,cr ,cm, cy, nc);
		Thread.sleep(2000);
		
		pp.clickRememberMeCheckbox();
		Thread.sleep(3000);
		
		ElementUtil.getScreenshot(driver, "detailsfill");
		pp.clickPurchaseFlightButton();
		Thread.sleep(2000);
		Assert.assertEquals(cp.getConfirmMessage(),"Thank you for your purchase today!");
		System.out.println("Confirmation message is: "+cp.getConfirmMessage());
		
		
	}
	
	@Test(priority=4, dataProvider="BlazeData", dataProviderClass = CustomData.class, groups="negative"  )
	public void usingBlankCreditCard(String n, String add, String ci, String sa, String zp, String ca, String cr, String cm,String cy, String nc) throws InterruptedException {
		
		pp.placeOrder(n, add, ci, sa, zp, ca ,cr ,cm, cy, nc);
		Thread.sleep(2000);
		
		pp.clickRememberMeCheckbox();
		Thread.sleep(3000);
		
		pp.clickPurchaseFlightButton();
		Thread.sleep(2000);
		
		Assert.assertEquals(cp.getConfirmMessage(),"Thank you for your purchase today!");
		System.out.println("Confirmation message is: "+cp.getConfirmMessage());
		
		
	}

	@Test(priority=5, dataProvider="BlazedemoData", dataProviderClass = CustomData.class, groups="negative"  )
	public void usingInvalidCreditCard(String n, String add, String ci, String sa, String zp, String ca, String cr, String cm,String cy, String nc) throws InterruptedException {
		
		pp.placeOrder(n, add, ci, sa, zp, ca ,cr ,cm, cy, nc);
		Thread.sleep(2000);
		
		ElementUtil.getScreenshot(driver, "invalidcarddetailpic");
		pp.clickRememberMeCheckbox();
		Thread.sleep(3000);
		
		pp.clickPurchaseFlightButton();
		Thread.sleep(2000);
		Assert.assertEquals(cp.getConfirmMessage(),"Thank you for your purchase today!");
		System.out.println("Confirmation message is: "+cp.getConfirmMessage());
	}
	
	
}
