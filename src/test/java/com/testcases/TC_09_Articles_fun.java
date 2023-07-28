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
    @Test(priority = 1)
    @Description("Verify the 'See More' functionality for articles on the Articles page")
    public void verify_SeeMoreArticles_fun() throws InterruptedException {
        articles = Articles.getInstance();
        articles.Verify_SeeMoreArticles_fun();
    }

    @Test(priority = 2)
    @Description("Verify the 'See More' functionality for latest articles on the Articles page")
    public void verify_SeeMoreLatestArticles_fun() throws InterruptedException {
        articles.Verify_SeeMoreLatestArticles_fun();
    }

    @Test(priority = 3)
    @Description("Verify the 'See More' functionality for other articles on the Articles page")
    public void verify_SeeMoreOtherArticles_fun() throws InterruptedException {
        articles.Verify_SeeMoreOtherArticles_fun();
    }

}
