package com.testcases;

import com.applicationpages.HomePage;
import com.applicationpages.Photos;
import com.genericmethods.GenericMethods;
import io.qameta.allure.Description;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC_05_Photos_UI extends GenericMethods {
    Photos photos;
    @Description("Launching the browser")
    @Test(priority =0)
    public void launchbrowser() throws InterruptedException {
        launchBrowser();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }

    @Description("Test: Verify availability of Main Photo section on the photos page")
    @Test(priority = 1)
    public void verifyMainPhotoSection() throws InterruptedException {
        photos = Photos.getInstance();
        photos.Verify_MainPhotos_Section();
    }

    @Description("Test: Verify availability of ENT logo in the Main Article on the home page")
    @Test(priority = 2)
    public void verifyMainArticle() throws InterruptedException {
        photos.Verify_MainArticle();
    }

    @Description("Test: Verify availability of ENT logo in the We Recommended section on the home page")
    @Test(priority = 3)
    public void verifyWeRecommendedSection() throws InterruptedException {
        photos.Verify_Werecommended_Section();
    }

    @Description("Test: Verify availability of ENT logo in the First Article of We Recommended section on the home page")
    @Test(priority = 4)
    public void verifyFirstArticleWeRecommended() throws InterruptedException {
        photos.Verify_frstArticle_Werecommended();
    }

    @Description("Test: Verify availability of ENT logo in the Photos section on the home page")
    @Test(priority = 5)
    public void verifyPhotosSection() throws InterruptedException {
        photos.Verify_photos_section();
    }

    @Description("Test: Verify availability of ENT logo in the First Article of Photos section on the home page")
    @Test(priority = 6)
    public void verifyFirstArticlePhotos() throws InterruptedException {
        photos.Verify_frstAticle_photos();
    }

    @Description("Test: Verify See More photos functionality on the home page")
    @Test(priority = 7)
    public void verifySeeMorePhotos() throws InterruptedException {
        photos.Verify_SeeMore_photos();
    }
}

