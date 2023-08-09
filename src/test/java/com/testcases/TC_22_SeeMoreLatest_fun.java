package com.testcases;

import com.applicationpages.HomePage;
import com.genericmethods.GenericMethods;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class TC_22_SeeMoreLatest_fun extends GenericMethods {

    HomePage homePage;

    @Description("Verification for Functionality of Header links on the home page")
    @Test(priority =0)
    public void verify_hdrlinks_fun() throws InterruptedException {
        launchBrowser();
        manageCookies();
    }

    @Description("Verification for Functionality of Footer links on the home page")
    @Test(priority =1)
    public void verify_LatestSeeMore_fun() throws InterruptedException {
        homePage=HomePage.getInstance();
        homePage.Verify_SeeMore_Latest_fun();
    }
}
