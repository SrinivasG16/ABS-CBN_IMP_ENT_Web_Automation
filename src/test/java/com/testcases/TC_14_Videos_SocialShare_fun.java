package com.testcases;

import com.applicationpages.Articles;
import com.applicationpages.HomePage;
import com.applicationpages.Videos;
import com.genericmethods.GenericMethods;
import io.qameta.allure.Description;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC_14_Videos_SocialShare_fun extends GenericMethods {

    Videos videos;
    HomePage homePage;

    @Description("Launching the browser")
    @Test(priority =0)
    public void launchbrowser() throws InterruptedException {
        launchBrowser();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        homePage = HomePage.getInstance();
        homePage.verify_videos_hdrLink_fun();
    }
        @Test(priority = 1)
        @Description("Verify the availability of the Main article on the Articles page")
        public void verify_MainArticle_SocialShare_fun() throws InterruptedException {
            videos = Videos.getInstance();
            videos.Verify_Social_share_fun();
        }
}
