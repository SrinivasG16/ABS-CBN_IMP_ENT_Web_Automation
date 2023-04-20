package com.testcases;


import com.applicationpages.HomePage;
import com.applicationpages.PushAwards;
import com.genericmethods.GenericMethods;
import io.qameta.allure.Description;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC_31_Verify_PushAwards_inner_fun extends GenericMethods {

   HomePage homePage;
    PushAwards pushAwards;

    @Description("Launching the browser")
    @Test(priority =0)
    public void launchbrowser() throws InterruptedException {
        launchBrowser();
        manageCookies();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

    }



    @Description("Navigating to Push Awards page from the home page")
    @Test(priority =1)
    public void Navigate_To_PushAwards() throws InterruptedException {

        homePage=HomePage.getInstance();
        homePage.Navigate_To_PushAwards();

    }

    @Description("Verification for the functionality of Push Awards inner page navigation using thumbnail of  push awards section articles from Push Ards page")
    @Test(priority =2)
    public void verify_pushAwards_innerthumb() throws InterruptedException {

       pushAwards=PushAwards.getInstance();
       pushAwards.Verify_pushAwards_innerthumb();

    }
    @Description("Verification for the functionality of Push Awards inner page navigation using link of  push awards section articles from Push Ards page")
    @Test(priority =2)
    public void verify_pushAwards_innerlnik() throws InterruptedException {

        pushAwards.Verify_pushAwards_innerlnik();

    }

}
