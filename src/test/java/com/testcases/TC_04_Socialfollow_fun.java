package com.testcases;

import com.applicationpages.HomePage;
import com.genericmethods.GenericMethods;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class TC_04_Socialfollow_fun extends GenericMethods {

    HomePage homePage;

    @Description("Verification for Functionality of Header links on the home page")
    @Test(priority =0)
    public void verify_hdrlinks_fun() throws InterruptedException {
        launchBrowser();
        manageCookies();
    }
    @Description("Verification for Functionality of Footer links on the home page")
    @Test(priority =1)
    public void verify_socialFollow_fun() throws InterruptedException {
        homePage.Verify_ftr_link_fun();
    }
}
