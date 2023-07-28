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

    @Test(priority = 1)
    @Description("Test: Verify availability of Main Photo section on the Photos page")
    public void verifyMainPhotoSection() throws InterruptedException {
        photos = Photos.getInstance();
        photos.Verify_MainPhotos_Section();
    }

    @Test(priority = 2)
    @Description("Test: Verify availability of  Main Article on the Photos page")
    public void verifyMainArticle() throws InterruptedException {
        photos.Verify_MainArticle();
    }

    @Test(priority = 3)
    @Description("Test: Verify availability of We Recommended section on the Photos page")
    public void verifyWeRecommendedSection() throws InterruptedException {
        photos.Verify_Werecommended_Section();
    }

    @Test(priority = 4)
    @Description("Test: Verify availability of the First Article in the We Recommended section on the Photos page")
    public void verifyFirstArticleWeRecommended() throws InterruptedException {
        photos.Verify_frstArticle_Werecommended();
    }

    @Test(priority = 5)
    @Description("Test: Verify availability of the Photos section on the Photos page")
    public void verifyPhotosSection() throws InterruptedException {
        photos.Verify_photos_section();
    }

    @Test(priority = 6)
    @Description("Test: Verify availability of the First Article in the Photos section on the Photos page")
    public void verifyFirstArticlePhotos() throws InterruptedException {
        photos.Verify_frstAticle_photos();
    }

    @Test(priority = 7)
    @Description("Test: Verify 'See More photos' availability on the Photos page")
    public void verifySeeMorePhotos() throws InterruptedException {
        photos.Verify_SeeMore_photos();
    }
}

