package com.testcases;

import com.applicationpages.HomePage;
import com.applicationpages.Photos;
import com.genericmethods.GenericMethods;
import io.qameta.allure.Description;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.awt.*;

public class TC_28_PhotosInner_BokenImages extends GenericMethods {

    Photos photos;
    HomePage homePage;

    @Description("Launching the browser")
    @Test(priority =0)
    public void launchbrowser() throws InterruptedException {
        launchBrowser();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        homePage = HomePage.getInstance();
        homePage.verify_photos_hdrLink_fun();
        photos = Photos.getInstance();
        photos.Verify_frstArticle_Werecommended_fun();
    }
    @Description("Verification for the functionality of Broken images of the Home page")
    @Test(priority =1)
    public void BrokenImages() throws InterruptedException, AWTException {
        verifyBrokenImages("Home");
    }
}
