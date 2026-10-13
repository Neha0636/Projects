package com.OrangeHRM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Page object for the Admin (User Management) page in OrangeHRM.
 */
public class OrangeAdminPage {

    private WebDriver driver;

    @FindBy(xpath = "//h6[contains(.,'System Users') or contains(.,'Admin')] | //span[contains(.,'System Users') or contains(.,'Admin')]")
    private WebElement adminHeader;

    public OrangeAdminPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isAdminHeaderDisplayed() {
        try {
            return adminHeader.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
