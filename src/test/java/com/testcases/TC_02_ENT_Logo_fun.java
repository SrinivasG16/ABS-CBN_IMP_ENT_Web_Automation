package com.testcases;

import com.applicationpages.HomePage;
import com.genericmethods.GenericMethods;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class TC_02_ENT_Logo_fun extends GenericMethods {
    HomePage homePage;
    @Description("Verification for Functionality of PUSH logo on the home page")
    @Test(priority =1)
    public void verify_push_logo_fun() throws InterruptedException {
        launchBrowser();
        manageCookies();
        HomePage homePage=HomePage.getInstance();
        homePage.Verify_ent_logo_fun();
    }
}
