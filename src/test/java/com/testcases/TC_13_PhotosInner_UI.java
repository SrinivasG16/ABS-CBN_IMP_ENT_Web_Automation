package com.testcases;

import com.applicationobjects.PhotoInnerOR;
import com.applicationpages.ArticleInnerPage;
import com.applicationpages.PhotosInnerPage;
import com.genericmethods.GenericMethods;
import io.qameta.allure.Description;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC_13_PhotosInner_UI extends GenericMethods {

    PhotosInnerPage photosInnerPage;

    PhotoInnerOR photoInnerOR;

    @Description("Launching the browser")
    @Test(priority =0)
    public void launchbrowser() throws InterruptedException {
        launchBrowser();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }
    @Description("Verification for availability of ENT logo on the home page")
    @Test(priority =1)
    public void verify_MainPhoto_Section() throws InterruptedException {
        photosInnerPage = PhotosInnerPage.getInstance();
        photosInnerPage.Verify_MainPhotoArticle();
    }
    @Description("Verification for availability of ENT logo on the home page")
    @Test(priority =1)
    public void verify_MainPhoto_SocialLinks() throws InterruptedException {
        photosInnerPage.Verify_MainPhotoSection_SocialLinks();
    }
    @Description("Verification for availability of ENT logo on the home page")
    @Test(priority =1)
    public void verify_MainPhoto_Thumb() throws InterruptedException {
        photosInnerPage.Verify_MainPhotoThumb();
    }
    @Description("Verification for availability of ENT logo on the home page")
    @Test(priority =1)
    public void verify_RelatedSection() throws InterruptedException {
        photosInnerPage.Verify_RelatedSection();
    }
    @Description("Verification for availability of ENT logo on the home page")
    @Test(priority =1)
    public void verify_RelatedFirstThumb() throws InterruptedException {
        photosInnerPage.Verify_RelatedFirstThumb();
    }
}
