package com.OrangeHRM.TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.OrangeHRM.Pages.OrangeDashboardPage;
import com.OrangeHRM.Pages.OrangeLoginPage;

public class OrangeBase {

    protected WebDriver driver;
    protected OrangeLoginPage loginPage;
    protected OrangeDashboardPage dashboardPage;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // opensource demo site
        driver.get("https://opensource-demo.orangehrmlive.com/");

        loginPage = new OrangeLoginPage(driver);
        dashboardPage = new OrangeDashboardPage(driver);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
