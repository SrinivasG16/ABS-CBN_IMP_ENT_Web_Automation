package com.testcases;

import com.applicationpages.HomePage;
import com.genericmethods.GenericMethods;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

import java.awt.*;

public class TC_27_Photos_BrokenImages extends GenericMethods {

    HomePage homePage;

    @Description("Verification for Functionality of Header links on the home page")
    @Test(priority =0)
    public void verify_hdrlinks_fun() throws InterruptedException {
        launchBrowser();
        manageCookies();
        homePage = HomePage.getInstance();
        homePage.Verify_hdr_photos();
    }
    @Description("Verification for the functionality of Broken images of the Home page")
    @Test(priority =1)
    public void BrokenImages() throws InterruptedException, AWTException {
        verifyBrokenImages("Home");
    }
}
