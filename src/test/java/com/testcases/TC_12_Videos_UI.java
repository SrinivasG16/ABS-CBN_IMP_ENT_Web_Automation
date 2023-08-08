package com.testcases;

import com.applicationpages.Videos;
import com.genericmethods.GenericMethods;
import io.qameta.allure.Description;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC_12_Videos_UI extends GenericMethods {

    Videos videos;

    @Description("Launching the browser")
    @Test(priority =0)
    public void launchbrowser() throws InterruptedException {
        launchBrowser();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }
    @Test(priority = 1)
    @Description("Verify the availability of Main video section on the videos page")
    public void verify_MainVideoFrame() throws InterruptedException {
        videos = Videos.getInstance();
        videos.Verify_MainVideoFrame_Section();
    }

    @Test(priority = 2)
    @Description("Verify the availability of Main Exclusive Videos section on the videos page")
    public void verify_MainExclusiveVideosSection() throws InterruptedException {
        videos.Verify_MainExclusiveVideos_Section();
    }

    @Test(priority = 3)
    @Description("Verify the availability of the first video in the Main Exclusive Videos section")
    public void verify_MainExclusiveFirstVideo() throws InterruptedException {
        videos.Verify_MainExclusive_FirstVideo();
    }

    @Test(priority = 4)
    @Description("Verify the 'See More' link functionality in the Main Exclusive Videos section")
    public void verify_MainExclusiveSeeMore() throws InterruptedException {
        videos.Verify_MainExclusive_SeeMore();
    }

    @Test(priority = 5)
    @Description("Verify the hashtag display in the Main Exclusive Videos section")
    public void verify_MainExclusiveHashTag() throws InterruptedException {
        videos.Verify_MainExclusive_Hashtag();
    }

    @Test(priority = 6)
    @Description("Verify the social links in the Main Exclusive Videos section")
    public void verify_MainExclusiveSocialLinks() throws InterruptedException {
        videos.Verify_MainExclusive_Sociallinks();
    }

    @Test(priority = 7)
    @Description("Verify the Hot Shot section on the videos page")
    public void verify_HotShotSection() throws InterruptedException {
        videos.Verify_HotShot_Section();
    }

    @Test(priority = 8)
    @Description("Verify the first video in the Hot Shot section")
    public void verify_HotShotFirstVideo() throws InterruptedException {
        videos.Verify_HotShot_FirstVideo();
    }

    @Test(priority = 9)
    @Description("Verify the Videos section on the videos page")
    public void verify_VideosSection() throws InterruptedException {
        videos.Verify_Videos_Section();
    }

    @Test(priority = 10)
    @Description("Verify the first video in the Videos section")
    public void verify_VideosFirstVideo() throws InterruptedException {
        videos.Verify_Videos_FirstVideo();
    }

    @Test(priority = 11)
    @Description("Verify the availability of 'See More' link in the Videos page")
    public void verify_VideosSeeMore() throws InterruptedException {
        videos.Verify_Videos_SeeMore();
    }

    @Test(priority = 12)
    @Description("Verify the iWTFC logo display")
    public void verify_iWTFCLogo() throws InterruptedException {
        videos.Verify_iWTFC_Logo();
    }

    @Test(priority = 13)
    @Description("Verify the first video in the iWTFC section")
    public void verify_iWTFCFirstVideo() throws InterruptedException {
        videos.Verify_iWTFC_FirstVideo();
    }

    @Test(priority = 14)
    @Description("Verify the 'Visit iWTFC' link availability")
    public void verify_VisitiWTFC() throws InterruptedException {
        videos.Verify_iWTFC_VisitiWTFC();
    }

}
