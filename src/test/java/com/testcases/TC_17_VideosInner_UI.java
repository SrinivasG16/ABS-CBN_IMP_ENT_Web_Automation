package com.testcases;

import com.applicationobjects.VideosInnerOR;
import com.applicationpages.VideosInnerPage;
import com.genericmethods.GenericMethods;
import io.qameta.allure.Description;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC_17_VideosInner_UI extends GenericMethods {

      VideosInnerPage videosInnerPage;

      VideosInnerOR videosInnerOR;

    @Description("Launching the browser")
    @Test(priority =0)
    public void launchbrowser() throws InterruptedException {
        launchBrowser();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }
    @Test(priority = 1)
    @Description("Verify the availability of the main video frame on the Videos inner page")
    public void verify_MainVideoFrame() throws InterruptedException {
        videosInnerPage = VideosInnerPage.getInstance();
        videosInnerPage.Verify_MainVideo_frame();
    }

    @Test(priority = 2)
    @Description("Verify the availability of social links in the Main Video section on the Videos inner page")
    public void verify_MainVideoSocialLinks() throws InterruptedException {
        videosInnerPage.Verify_MainVideo_sociallnks();
    }

    @Test(priority = 3)
    @Description("Verify the availability of the Main Video image on the Videos inner page")
    public void verify_MainVideoImage() throws InterruptedException {
        videosInnerPage.Verify_MainVideo_Image();
    }

    @Test(priority = 4)
    @Description("Verify the availability of the Related Video Section on the Videos inner page")
    public void verify_RelatedVideoSection() throws InterruptedException {
        videosInnerPage.Verify_RelatedVideo_Section();
    }

    @Test(priority = 5)
    @Description("Verify the availability of the first video in the Related Video Section on the Videos inner page")
    public void verify_RelatedFirstVideo() throws InterruptedException {
        videosInnerPage.Verify_Related_FirstVideo();
    }
}
