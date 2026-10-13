package com.OrangeHRM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeDashboardPage {

    private WebDriver driver;

    // common dashboard header used in modern OrangeHRM versions
    @FindBy(xpath = "//h6[text()='Dashboard' or contains(.,'Dashboard')] | //span[text()='Dashboard']")
    private WebElement dashboardHeader;

    public OrangeDashboardPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isDashboardDisplayed() {
        try {
            return dashboardHeader.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
