package com.BlazeDemo.Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BlazeDemo.Utilities.ElementUtil;

public class ReservePage {

	private WebDriver driver;

	public ReservePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@FindBy(xpath = " //h3[contains(text(),'Flights from')]")
	private WebElement heading1;

	@FindBy(xpath = "//tbody//tr//td[1]//following-sibling::td[2]")
	private List<WebElement> allflightNames;

	@FindBy(xpath = "//table[@class='table']//tr[2]//input[@type='submit']")
	private WebElement clickFlight;

// 3. Action Methods

	// Get the header text to verify you are on the reserve page
	public String getPageHeaderTitle() {
		return heading1.getText();
	}

	// Get the total number of available flights listed in the table
	public int getAvailableFlightsCount() {
		ElementUtil.getScreenshot(driver, "AllFlight");
		return allflightNames.size();
	}

	// get all flight names
	public void getallFlight() {
		System.out.println("=====flight names=====");
		for (WebElement i : allflightNames) {
			System.out.println(i.getText());

		}

	}

	// Click on the 'Choose This Flight' button for the second flight in the table
	public PurchasePage clickSecondChooseFlight() {
		ElementUtil.waitForVisibilityOfElement(driver, By.xpath("//table[@class='table']//tr[2]//input[@type='submit']"),10);
		clickFlight.click();
        
		ElementUtil.getScreenshot(driver, "PurchasePage");
		return new PurchasePage(driver); // Transitions to the Purchase Page
	}

}
