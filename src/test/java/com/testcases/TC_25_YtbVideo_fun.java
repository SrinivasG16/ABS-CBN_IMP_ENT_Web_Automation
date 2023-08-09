package com.testcases;

import com.applicationpages.HomePage;
import com.applicationpages.Videos;
import com.applicationpages.VideosInnerPage;
import com.genericmethods.GenericMethods;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class TC_25_YtbVideo_fun extends GenericMethods {

    HomePage homePage;
    Videos videos;
    VideosInnerPage videosInnerPage;

    @Description("Verification for Functionality of Header links on the home page")
    @Test(priority =0)
    public void verify_hdrlinks_fun() throws InterruptedException {
        launchBrowser();
        manageCookies();
        homePage = HomePage.getInstance();
        homePage.verify_videos_hdrLink_fun();
        videos = Videos.getInstance();
        videos.Verify_MainExclusive_FirstVideo_fun();
    }
    @Description("Verification for Functionality of you tube video play in videos inner page")
    @Test(priority =1)
    public void verify_ytVideoPlay_fun() throws InterruptedException {
        videosInnerPage = VideosInnerPage.getInstance();
        videosInnerPage.Verify_yt_Video_play();
    }
    @Description("Verification for Functionality of you tube video pause in videos inner page")
    @Test(priority =2)
    public void verify_ytVideoPause_fun() throws InterruptedException {
        videosInnerPage = VideosInnerPage.getInstance();
        videosInnerPage.Verify_yt_Video_pause();
    }
    @Description("Verification for Functionality of you tube video mute in videos inner page")
    @Test(priority =3)
    public void verify_ytVideoMute_fun() throws InterruptedException {
        videosInnerPage = VideosInnerPage.getInstance();
        videosInnerPage.Verify_yt_Video_mute();
    }
    @Description("Verification for Functionality of you tube video Unmute in videos inner page")
    @Test(priority =4)
    public void verify_ytVideoUnMute_fun() throws InterruptedException {
        videosInnerPage = VideosInnerPage.getInstance();
        videosInnerPage.Verify_yt_Video_Unmute();
    }
    @Description("Verification for Functionality of you tube video maximise in videos inner page")
    @Test(priority =5)
    public void verify_ytVideoMaximise_fun() throws InterruptedException {
        videosInnerPage = VideosInnerPage.getInstance();
        videosInnerPage.Verify_yt_Video_Maximise();
    }
    @Description("Verification for Functionality of you tube video minimise in videos inner page")
    @Test(priority =6)
    public void verify_ytVideoMinimise_fun() throws InterruptedException {
        videosInnerPage = VideosInnerPage.getInstance();
        videosInnerPage.Verify_yt_Video_Minimise();
    }

}
