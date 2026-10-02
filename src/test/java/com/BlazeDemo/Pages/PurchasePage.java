package com.BlazeDemo.Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BlazeDemo.Utilities.ElementUtil;

public class PurchasePage extends BaseClass {

	public PurchasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(20));
	}

	@FindBy(tagName = "h2")
	private WebElement Headertext;

	@FindBy(xpath = "//body//div[@class='container']//p")
	private List<WebElement> purchaseDetails;

	@FindBy(id = "inputName")
	private WebElement NameEle;

	@FindBy(id = "address")
	private WebElement AddressEle;

	@FindBy(id = "city")
	private WebElement CityEle;

	@FindBy(id = "state")
	private WebElement StateEle;

	@FindBy(id = "zipCode")
	private WebElement ZipCodeEle;

	@FindBy(id = "cardType")
	private WebElement CardTypeEle;

	@FindBy(id = "creditCardNumber")
	private WebElement CreditCardNumberEle;

	@FindBy(id = "creditCardMonth")
	private WebElement CreditCardMonthEle;

	@FindBy(id = "creditCardYear")
	private WebElement CreditCardYearEle;

	@FindBy(id = "nameOnCard")
	private WebElement NameOnCardEle;

	@FindBy(id = "rememberMe")
	private WebElement RememberMeCheckboxEle;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement purchaseFlightButton;

	public String getAppUrl() {
		return driver.getCurrentUrl();
	}

	public String getHeadertext() {
		return Headertext.getText();
	}

	public PurchasePage getPurchaseDetails()

	{
		for (WebElement i : purchaseDetails) {
			System.out.println(i.getText());

		}
		return this;
	}

	public void placeOrder(String n, String add, String ci, String sa, String zp, String ca, String cr, String cm,
			String cy, String nc) {

		ElementUtil.waitForVisibilityOfElement(driver,By.id("inputName"), 10);
		NameEle.clear();
		NameEle.sendKeys(n);
		
		ElementUtil.waitForVisibilityOfElement(driver,By.id("address"), 10);
		AddressEle.clear();
		AddressEle.sendKeys(add);
		
		
		ElementUtil.waitForVisibilityOfElement(driver,By.id("city"), 10);
		CityEle.clear();
		CityEle.sendKeys(ci);
		
		ElementUtil.waitForVisibilityOfElement(driver,By.id("state"), 10);
		StateEle.clear();
		StateEle.sendKeys(sa);
		
		ElementUtil.waitForVisibilityOfElement(driver,By.id("zipCode"), 10);
		ZipCodeEle.clear();
		ZipCodeEle.sendKeys(zp);
		
		
		Select select = new Select(CardTypeEle);
		select.selectByVisibleText(ca);
         
		ElementUtil.waitForVisibilityOfElement(driver,By.id("creditCardNumber"), 10);
		CreditCardNumberEle.clear();
		CreditCardNumberEle.sendKeys(cr);
		
		ElementUtil.waitForVisibilityOfElement(driver,By.id("creditCardMonth"), 10);
		CreditCardMonthEle.clear();
		CreditCardMonthEle.sendKeys(cm);
		
		ElementUtil.waitForVisibilityOfElement(driver,By.id("creditCardYear"), 10);
		CreditCardYearEle.clear();
		CreditCardYearEle.sendKeys(cy);
		
		ElementUtil.waitForVisibilityOfElement(driver,By.id("nameOnCard"), 10);
		NameOnCardEle.clear();
		NameOnCardEle.sendKeys(nc);
		
		
	}

	public PurchasePage clickRememberMeCheckbox() {
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		//wait.until(ExpectedConditions.elementToBeClickable(RememberMeCheckboxEle)).click();
		ElementUtil.elementclick(driver, RememberMeCheckboxEle);
		
		return this;
	}

	public ConfirmationPage clickPurchaseFlightButton() {
		purchaseFlightButton.click();
		ElementUtil.getScreenshot(driver, "ConfirmationPage");

		return new ConfirmationPage(driver); // Transitions to the Confirmation
	}

}
