package com.testcases;

import com.applicationobjects.PhotoInnerOR;
import com.applicationpages.PhotosInnerPage;
import com.genericmethods.GenericMethods;
import io.qameta.allure.Description;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC_17_PhotosInner_UI extends GenericMethods {

    PhotosInnerPage photosInnerPage;
    PhotoInnerOR photoInnerOR;

    @Description("Launching the browser")
    @Test(priority =0)
    public void launchbrowser() throws InterruptedException {
        launchBrowser();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }
    @Test(priority = 1)
    @Description("Verify the availability of the ENT logo on the Photos inner page")
    public void verify_MainPhoto_Section() throws InterruptedException {
        photosInnerPage = PhotosInnerPage.getInstance();
        photosInnerPage.Verify_MainPhotoArticle();
    }

    @Test(priority = 2)
    @Description("Verify the availability of social links in the Main Photo section on the Photos inner page")
    public void verify_MainPhoto_SocialLinks() throws InterruptedException {
        photosInnerPage.Verify_MainPhotoSection_SocialLinks();
    }

    @Test(priority = 3)
    @Description("Verify the availability of the Main Photo thumbnail on the Photos inner page")
    public void verify_MainPhoto_Thumb() throws InterruptedException {
        photosInnerPage.Verify_MainPhotoThumb();
    }

    @Test(priority = 4)
    @Description("Verify the availability of the Related Section on the Photos inner page")
    public void verify_RelatedSection() throws InterruptedException {
        photosInnerPage.Verify_RelatedSection();
    }

    @Test(priority = 5)
    @Description("Verify the availability of the first thumbnail in the Related Section on the Photos inner page")
    public void verify_RelatedFirstThumb() throws InterruptedException {
        photosInnerPage.Verify_RelatedFirstThumb();
    }
}
