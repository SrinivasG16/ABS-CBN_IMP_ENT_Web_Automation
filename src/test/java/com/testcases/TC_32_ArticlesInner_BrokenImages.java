package com.testcases;

import com.applicationpages.ArticleInnerPage;
import com.applicationpages.Articles;
import com.applicationpages.HomePage;
import com.genericmethods.GenericMethods;
import io.qameta.allure.Description;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.awt.*;

public class TC_32_ArticlesInner_BrokenImages extends GenericMethods {

    ArticleInnerPage articleInnerPage;
    HomePage homePage;
    Articles articles;

    @Description("Launching the browser")
    @Test(priority =0)
    public void launchbrowser() throws InterruptedException {
        launchBrowser();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        homePage = HomePage.getInstance();
        homePage.verify_article_hdrLink_fun();
        articles = Articles.getInstance();
        articles.verify_WeRecommend_FirstArticle_fun();
    }
    @Description("Verification for the functionality of Broken images of the Home page")
    @Test(priority =1)
    public void BrokenImages() throws InterruptedException, AWTException {
        verifyBrokenImages("Home");
    }
}
