package com.BlazeDemo.Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.BlazeDemo.Utilities.ElementUtil;

//Encapsulation=public data+private method
public class HomePage {

	private WebDriver driver;

	public HomePage(WebDriver driver) // pass driver from baseclass
	{

		this.driver = driver;
		PageFactory.initElements(driver, this);// initializing webelement
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	// locator
	@FindBy(linkText = "Travel The World")
	private WebElement ele;

	@FindBy(tagName = "h1")
	private WebElement heading;

	@FindBy(name = "fromPort")
	private WebElement DepDropdown;

	@FindBy(name = "toPort")
	private WebElement DesDropdown;

	@FindBy(css = "input.btn-primary")
	private WebElement SubmitOption;

	// public action methods

	public String getPageUrl() {
		return driver.getCurrentUrl();
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public void DepartureOpt() {
		

		Select select = new Select(DepDropdown);
		List<WebElement> allDepOptions = select.getOptions();
		System.out.println("=====Departure Options=====");
		for (WebElement i : allDepOptions) {

			System.out.println(i.getText());

		}

	}

	public void DestinationOpt() {
		Select select = new Select(DesDropdown);
		List<WebElement> allDesOptions = select.getOptions();
		System.out.println("=====Destination Options=====");
		for (WebElement i : allDesOptions) {

			System.out.println(i.getText());

		}

	}

	// Action method to select departure city by visible text
	public HomePage selectDepartureCity(String cityName1) {
		ElementUtil.waitForVisibilityOfElement(driver, By.name("fromPort"),10);
		Select select = new Select(DepDropdown);
		select.selectByVisibleText(cityName1);
		return this;
	}

	// Action method to select destination city by visible text
	public HomePage selectDestinationCity(String cityName2) {
		ElementUtil.waitForVisibilityOfElement(driver, By.name("toPort"), 10);
		Select select = new Select(DesDropdown);
		select.selectByVisibleText(cityName2);
		return this;
	}

	public ReservePage clickFlight() {
	    ElementUtil.getScreenshot(driver, "HomePage");
	
        ElementUtil.waitForVisibilityOfElement(driver, By.cssSelector("input.btn-primary"),10);
		SubmitOption.click();
		return new ReservePage(driver); // Transitions to the Reserve Page
		
	}	

}
