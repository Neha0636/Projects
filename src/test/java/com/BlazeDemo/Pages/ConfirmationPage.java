package com.BlazeDemo.Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BlazeDemo.Utilities.ElementUtil;

public class ConfirmationPage {

	private WebDriver driver;

	public ConfirmationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@FindBy(xpath = "//h1")
	private WebElement confirmMessage;

	@FindBy(xpath = "//table//tbody//tr")
	private List<WebElement> confirmDetails;
	
	@FindBy(xpath = "//pre")
	private WebElement confirmDetails2;

	// methods

	public String getTitle() {
		return driver.getTitle();
	}

	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	public String getConfirmMessage() {
		ElementUtil.waitForVisibilityOfElement(driver, By.xpath("//h1"), 10);
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.visibilityOf(confirmMessage));
		return confirmMessage.getText();
	}

	 public String confirmdetails2() {
		 
		 return confirmDetails2.getText();
	 }
	public ConfirmationPage getConfirmDetails() {
		
		System.out.println("===========confirmation details==========");
		
		for(WebElement i: confirmDetails) {
			
			System.out.println(i.getText());
		}

		ElementUtil.getScreenshot(driver, "ConfirmationPage");
		return this;
	}

}
