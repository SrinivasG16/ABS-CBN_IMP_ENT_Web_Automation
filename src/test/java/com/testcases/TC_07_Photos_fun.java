package com.testcases;

import com.applicationpages.Photos;
import com.genericmethods.GenericMethods;
import io.qameta.allure.Description;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC_07_Photos_fun extends GenericMethods {

    Photos photos;

    @Description("Launching the browser")
    @Test(priority =0)
    public void launchbrowser() throws InterruptedException {
        launchBrowser();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }
    @Description("Verify the functionality of See more button in photos section")
    @Test(priority =1)
    public void verify_SeeMorePhotos_fun() throws InterruptedException {
        photos= Photos.getInstance();
        photos.Verify_SeeMorePhotos_fun();
    }
}
