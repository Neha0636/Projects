package com.OrangeHRM.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.Pages.OrangeAdminPage;
import com.OrangeHRM.Pages.OrangeMenuPage;

/**
 * Simple navigation test that logs in and navigates to Admin section.
 */
public class OrangeNavigationTest extends OrangeBase {

    @Test(priority = 1)
    public void navigateToAdminAfterLogin() {
        // login using demo credentials
        String username = "Admin";
        String password = "admin123";

        loginPage.doLogin(username, password);

        // navigate using the menu helper
        OrangeMenuPage menu = new OrangeMenuPage(driver);
        menu.navigateTo("Admin");

        OrangeAdminPage admin = new OrangeAdminPage(driver);
        Assert.assertTrue(admin.isAdminHeaderDisplayed(), "Admin header was not displayed after navigation");
        System.out.println("Navigation to Admin page successful");
    }
}
