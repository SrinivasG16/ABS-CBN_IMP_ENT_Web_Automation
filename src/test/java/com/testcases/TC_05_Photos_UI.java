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
    @Description("Verification for availability of ENT logo on the home page")
    @Test(priority =1)
    public void verify_MainPhoto_section() throws InterruptedException {
        photos= Photos.getInstance();
        photos.Verify_MainPhotos_Section();
    }
    @Description("Verification for availability of ENT logo on the home page")
    @Test(priority =1)
    public void verify_MainArticle() throws InterruptedException {
        photos.Verify_MainArticle();
    }
    @Description("Verification for availability of ENT logo on the home page")
    @Test(priority =1)
    public void verify_werecommended_section() throws InterruptedException {
        photos.Verify_Werecommended_Section();
    }
    @Description("Verification for availability of ENT logo on the home page")
    @Test(priority =1)
    public void verify_werecommended_frstarticle() throws InterruptedException {
        photos.Verify_frstArticle_Werecommended();
    }
    @Description("Verification for availability of ENT logo on the home page")
    @Test(priority =1)
    public void verify_photos_section() throws InterruptedException {
        photos.Verify_photos_section();
    }
    @Description("Verification for availability of ENT logo on the home page")
    @Test(priority =1)
    public void verify_firstphotos() throws InterruptedException {
        photos.Verify_frstAticle_photos();
    }
    @Description("Verification for availability of ENT logo on the home page")
    @Test(priority =1)
    public void verify_SeeMorephotos() throws InterruptedException {
        photos.Verify_SeeMore_photos();
    }
}
