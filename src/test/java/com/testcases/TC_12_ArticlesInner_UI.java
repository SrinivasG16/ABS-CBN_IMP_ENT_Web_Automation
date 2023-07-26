package com.testcases;

import com.applicationpages.ArticleInnerPage;
import com.applicationpages.Articles;
import com.genericmethods.GenericMethods;
import io.qameta.allure.Description;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC_12_ArticlesInner_UI extends GenericMethods {

    ArticleInnerPage articleInnerPage;

    @Description("Launching the browser")
    @Test(priority =0)
    public void launchbrowser() throws InterruptedException {
        launchBrowser();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }
    @Description("Verification for availability of ENT logo on the home page")
    @Test(priority =1)
    public void verify_MainArticleImg_Section() throws InterruptedException {
        articleInnerPage = ArticleInnerPage.getInstance();
        articleInnerPage.Verify_MainArticle_Img();
    }
    @Description("Verification for availability of ENT logo on the home page")
    @Test(priority =1)
    public void verify_MainArticleSocialLinks() throws InterruptedException {
        articleInnerPage.Verify_MainArticle_sociallnks();
    }
    @Description("Verification for availability of ENT logo on the home page")
    @Test(priority =1)
    public void verify_RelatedSection() throws InterruptedException {
        articleInnerPage.Verify_Related_section();
    }
    @Description("Verification for availability of ENT logo on the home page")
    @Test(priority =1)
    public void verify_RelatedfirstArticle() throws InterruptedException {
        articleInnerPage.Verify_Related_FirstArticle();
    }
}
