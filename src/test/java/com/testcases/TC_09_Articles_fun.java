package com.testcases;

import com.applicationpages.Articles;
import com.genericmethods.GenericMethods;
import io.qameta.allure.Description;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC_09_Articles_fun extends GenericMethods {

    Articles articles;

        @Description("Launching the browser")
        @Test(priority =0)
        public void launchbrowser() throws InterruptedException {
            launchBrowser();
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        }
    @Description("Verification for availability of ENT logo on the home page")
    @Test(priority =1)
    public void verify_SeeMoreArticles_fun() throws InterruptedException {
        articles= Articles.getInstance();
        articles.Verify_SeeMoreArticles_fun();
    }
    @Description("Verification for availability of ENT logo on the home page")
    @Test(priority =1)
    public void verify_SeeMoreLatestArticles_fun() throws InterruptedException {
        articles.Verify_SeeMoreLatestArticles_fun();
    }
    @Description("Verification for availability of ENT logo on the home page")
    @Test(priority =1)
    public void verify_SeeMoreOtherArticles_fun() throws InterruptedException {
        articles.Verify_SeeMoreOtherArticles_fun();
    }
}
