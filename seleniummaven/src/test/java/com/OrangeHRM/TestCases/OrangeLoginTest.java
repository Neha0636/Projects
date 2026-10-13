package com.OrangeHRM.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeLoginTest extends OrangeBase {

    @Test(priority = 1)
    public void verifyLoginToOrangeHRM() {
        // demo credentials
        String username = "Admin";
        String password = "admin123";

        loginPage.doLogin(username, password);

        // simple assertion that dashboard is visible after login
        Assert.assertTrue(dashboardPage.isDashboardDisplayed(), "Dashboard was not displayed after login");
        System.out.println("OrangeHRM login successful and dashboard displayed");
    }
}
