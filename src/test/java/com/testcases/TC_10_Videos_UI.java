package com.testcases;

import com.applicationpages.Articles;
import com.applicationpages.Videos;
import com.genericmethods.GenericMethods;
import io.qameta.allure.Description;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC_10_Videos_UI extends GenericMethods {

    Videos videos;

    @Description("Launching the browser")
    @Test(priority =0)
    public void launchbrowser() throws InterruptedException {
        launchBrowser();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }
    @Test(priority =1)
    public void verify_MainVideoFrame() throws InterruptedException {
        videos= Videos.getInstance();
        videos.Verify_MainVideoFrame_Section();
    }
    @Test(priority =1)
    public void verify_MainExclusiveVideosSection() throws InterruptedException {
        videos.Verify_MainExclusiveVideos_Section();
    }
    @Test(priority =1)
    public void verify_MainExclusiveFirstVideo() throws InterruptedException {
        videos.Verify_MainExclusive_FirstVideo();
    }
    @Test(priority =1)
    public void verify_MainExclusiveSeeMore() throws InterruptedException {
        videos.Verify_MainExclusive_SeeMore();
    }
    @Test(priority =1)
    public void verify_MainExclusiveSocialLinks() throws InterruptedException {
        videos.Verify_MainExclusive_Sociallinks();
    }
    @Test(priority =1)
    public void verify_HotShotSection() throws InterruptedException {
        videos.Verify_HotShot_Section();
    }
    @Test(priority =1)
    public void verify_HotShotFirstVideo() throws InterruptedException {
        videos.Verify_HotShot_FirstVideo();
    }
    @Test(priority =1)
    public void verify_VideosSection() throws InterruptedException {
        videos.Verify_Videos_Section();
    }
    @Test(priority =1)
    public void verify_VideosFirstVideo() throws InterruptedException {
        videos.Verify_Videos_FirstVideo();
    }
    @Test(priority =1)
    public void verify_VideosSeeMore() throws InterruptedException {
        videos.Verify_Videos_SeeMore();
    }
    @Test(priority =1)
    public void verify_iWTFCLogo() throws InterruptedException {
        videos.Verify_iWTFC_Logo();
    }
    @Test(priority =1)
    public void verify_iWTFCFirstVideo() throws InterruptedException {
        videos.Verify_iWTFC_FirstVideo();
    }
    @Test(priority =1)
    public void verify_VisitiWTFC() throws InterruptedException {
        videos.Verify_iWTFC_VisitiWTFC();
    }
}
