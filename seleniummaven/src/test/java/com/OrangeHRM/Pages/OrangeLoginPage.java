package com.OrangeHRM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Page Object for OrangeHRM login page (works with opensource-demo.orangehrmlive.com)
 */
public class OrangeLoginPage {

    private WebDriver driver;

    // username - supports multiple attribute sets used by different OrangeHRM versions
    @FindBy(xpath = "//input[@name='username' or @id='txtUsername']")
    private WebElement usernameEle;

    @FindBy(xpath = "//input[@name='password' or @id='txtPassword']")
    private WebElement passwordEle;

    // login button - various versions use button or input
    @FindBy(xpath = "//button[@type='submit' or @id='btnLogin' or contains(.,'Login')]")
    private WebElement loginButton;

    public OrangeLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getPageUrl() {
        return driver.getCurrentUrl();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public void doLogin(String username, String password) {
        usernameEle.clear();
        usernameEle.sendKeys(username);
        passwordEle.clear();
        passwordEle.sendKeys(password);
        loginButton.click();
    }
}
