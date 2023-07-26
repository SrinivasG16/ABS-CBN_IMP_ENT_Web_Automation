package com.testcases;

import com.applicationpages.Videos;
import com.genericmethods.GenericMethods;
import io.qameta.allure.Description;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC_11_Videos_fun extends GenericMethods {

    Videos videos;

    @Description("Launching the browser")
    @Test(priority =0)
    public void launchbrowser() throws InterruptedException {
        launchBrowser();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }
    @Description("Test: Verify See More Videos functionality")
    @Test(priority = 1)
    public void verifySeeMoreVideos() throws InterruptedException {
        videos = Videos.getInstance();
        videos.Verify_SeeMoreVideos_fun();
    }
}
