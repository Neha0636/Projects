package com.OrangeHRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

/**
 * Page object for top/main navigation menu in OrangeHRM. Provides simple helpers
 * to navigate to main sections like Admin, PIM, Leave, etc.
 */
public class OrangeMenuPage {

    private WebDriver driver;

    public OrangeMenuPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Clicks a main menu item by visible text. Works with labels like "Admin",
     * "PIM", "Leave", etc.
     */
    public void navigateTo(String menuName) {
        String xpath = String.format("//a[normalize-space()='%s'] | //span[normalize-space()='%s'] | //a[normalize-space()='%s']", menuName, menuName, menuName);
        WebElement item = driver.findElement(By.xpath(xpath));
        item.click();
    }
}
