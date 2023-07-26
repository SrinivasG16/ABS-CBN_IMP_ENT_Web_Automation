package com.testcases;

import com.applicationobjects.VideosInnerOR;
import com.applicationpages.PhotosInnerPage;
import com.applicationpages.VideosInnerPage;
import com.genericmethods.GenericMethods;
import io.qameta.allure.Description;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC_14_VideosInner_UI extends GenericMethods {

      VideosInnerPage videosInnerPage;

      VideosInnerOR videosInnerOR;

    @Description("Launching the browser")
    @Test(priority =0)
    public void launchbrowser() throws InterruptedException {
        launchBrowser();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }
    @Description("Verification for availability of ENT logo on the home page")
    @Test(priority =1)
    public void verify_MainVideoFrame() throws InterruptedException {
        videosInnerPage = VideosInnerPage.getInstance();
        videosInnerPage.Verify_MainVideo_frame();
    }
    @Description("Verification for availability of ENT logo on the home page")
    @Test(priority =1)
    public void verify_MainVideoSocialLinks() throws InterruptedException {
        videosInnerPage.Verify_MainVideo_sociallnks();
    }
    @Description("Verification for availability of ENT logo on the home page")
    @Test(priority =1)
    public void verify_MainVideoImage() throws InterruptedException {
        videosInnerPage.Verify_MainVideo_Image();
    }
    @Description("Verification for availability of ENT logo on the home page")
    @Test(priority =1)
    public void verify_RelatedVideoSection() throws InterruptedException {
        videosInnerPage.Verify_RelatedVideo_Section();
    }
    @Description("Verification for availability of ENT logo on the home page")
    @Test(priority =1)
    public void verify_RelatedFirstVideo() throws InterruptedException {
        videosInnerPage.Verify_Related_FirstVideo();
    }
}
