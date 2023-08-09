package com.testcases;

import com.applicationpages.ArticleInnerPage;
import com.applicationpages.HomePage;
import com.applicationpages.Photos;
import com.applicationpages.PhotosInnerPage;
import com.genericmethods.GenericMethods;
import io.qameta.allure.Description;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC_18_PhotosInner_SocialShare extends GenericMethods {

    HomePage homePage;
    Photos photos;
    PhotosInnerPage photosInnerPage;

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

    @Test(priority = 1)
    @Description("Verify the availability of the Main article on the Articles page")
    public void verify_MainArticle_SocialShare_fun() throws InterruptedException {
        photosInnerPage = PhotosInnerPage.getInstance();
        photosInnerPage.Verify_Social_share_fun();
    }
}
