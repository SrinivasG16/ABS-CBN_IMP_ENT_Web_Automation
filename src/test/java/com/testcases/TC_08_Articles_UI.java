package com.testcases;

import com.applicationpages.Articles;
import com.applicationpages.Photos;
import com.genericmethods.GenericMethods;
import io.qameta.allure.Description;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC_08_Articles_UI extends GenericMethods {

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
    public void verify_MainArticle_Section() throws InterruptedException {
        articles= Articles.getInstance();
        articles.Verify_MainArticle_section();
    }
    @Description("Verification for availability of ENT logo on the home page")
    @Test(priority =1)
    public void verify_MainArticleImage() throws InterruptedException {
        articles.Verify_MainArticle_image();
    }
    @Description("Verification for availability of ENT logo on the home page")
    @Test(priority =1)
    public void verify_MainArticleSocialIcons() throws InterruptedException {
        articles.Verify_MainArticle_Socialicons();
    }
    @Description("Verification for availability of ENT logo on the home page")
    @Test(priority =1)
    public void verify_WeRecommendedSection() throws InterruptedException {
        articles.Verify_WeRecommend_section();
    }
    @Description("Verification for availability of ENT logo on the home page")
    @Test(priority =1)
    public void verify_WeRecommendedFirstArticle() throws InterruptedException {
        articles.Verify_WeRecommend_FirstArticle();
    }
    @Description("Verification for availability of ENT logo on the home page")
    @Test(priority =1)
    public void verify_PopularSection() throws InterruptedException {
        articles.Verify_Popular_section();
    }
    @Description("Verification for availability of ENT logo on the home page")
    @Test(priority =1)
    public void verify_PopularFirstArticle() throws InterruptedException {
        articles.Verify_Popular_FirstArticle();
    }
    @Description("Verification for availability of ENT logo on the home page")
    @Test(priority =1)
    public void verify_PopularSeeMore() throws InterruptedException {
        articles.Verify_Popular_SeeMore();
    }
    @Description("Verification for availability of ENT logo on the home page")
    @Test(priority =1)
    public void verify_LatestSection() throws InterruptedException {
        articles.Verify_Latest_Section();
    }
    @Description("Verification for availability of ENT logo on the home page")
    @Test(priority =1)
    public void verify_LatestFirstArticle() throws InterruptedException {
        articles.Verify_Latest_FirstArticle();
    }
    @Description("Verification for availability of ENT logo on the home page")
    @Test(priority =1)
    public void verify_LatestSeeMore() throws InterruptedException {
        articles.Verify_Latest_SeeMore();
    }
    @Description("Verification for availability of ENT logo on the home page")
    @Test(priority =1)
    public void verify_OtherArticlesSection() throws InterruptedException {
        articles.Verify_OtherArticles_Section();
    }
    @Description("Verification for availability of ENT logo on the home page")
    @Test(priority =1)
    public void verify_OtherArticlesFirst() throws InterruptedException {
        articles.Verify_OtherArticles_FirstArticle();
    }
    @Description("Verification for availability of ENT logo on the home page")
    @Test(priority =1)
    public void verify_OtherArticlesSeeMore() throws InterruptedException {
        articles.Verify_OtherArticles_SeeMore();
    }

}
