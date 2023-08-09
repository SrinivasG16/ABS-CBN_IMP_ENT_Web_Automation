package com.testcases;

import com.applicationpages.ArticleInnerPage;
import com.applicationpages.Articles;
import com.applicationpages.HomePage;
import com.applicationpages.Videos;
import com.genericmethods.GenericMethods;
import io.qameta.allure.Description;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC_16_ArticlesInner_SocialShare extends GenericMethods {

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
    @Test(priority = 1)
    @Description("Verify the availability of the Main article on the Articles page")
    public void verify_MainArticle_SocialShare_fun() throws InterruptedException {
        articleInnerPage = ArticleInnerPage.getInstance();
        articleInnerPage.Verify_Social_share_fun();
    }
}
