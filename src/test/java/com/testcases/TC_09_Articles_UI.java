package com.testcases;

import com.applicationpages.Articles;
import com.genericmethods.GenericMethods;
import io.qameta.allure.Description;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC_09_Articles_UI extends GenericMethods {

    Articles articles;

    @Description("Launching the browser")
    @Test(priority =0)
    public void launchbrowser() throws InterruptedException {
        launchBrowser();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }
    @Test(priority = 1)
    @Description("Verify the availability of the Main article on the Articles page")
    public void verify_MainArticle_Section() throws InterruptedException {
        articles = Articles.getInstance();
        articles.Verify_MainArticle_section();
    }

    @Test(priority = 2)
    @Description("Verify the availability of the Main article image on the Articles page")
    public void verify_MainArticleImage() throws InterruptedException {
        articles.Verify_MainArticle_image();
    }

    @Test(priority = 3)
    @Description("Verify the availability of social icons on the Main article")
    public void verify_MainArticleSocialIcons() throws InterruptedException {
        articles.Verify_MainArticle_Socialicons();
    }

    @Test(priority = 4)
    @Description("Verify the 'We Recommend' section on the Articles page")
    public void verify_WeRecommendedSection() throws InterruptedException {
        articles.Verify_WeRecommend_section();
    }

    @Test(priority = 5)
    @Description("Verify the first article in the 'We Recommend' section")
    public void verify_WeRecommendedFirstArticle() throws InterruptedException {
        articles.Verify_WeRecommend_FirstArticle();
    }

    @Test(priority = 6)
    @Description("Verify the 'Popular' section on the Articles page")
    public void verify_PopularSection() throws InterruptedException {
        articles.Verify_Popular_section();
    }

    @Test(priority = 7)
    @Description("Verify the first article in the 'Popular' section")
    public void verify_PopularFirstArticle() throws InterruptedException {
        articles.Verify_Popular_FirstArticle();
    }

    @Test(priority = 8)
    @Description("Verify the 'See More' button availability in the 'Popular' section")
    public void verify_PopularSeeMore() throws InterruptedException {
        articles.Verify_Popular_SeeMore();
    }

    @Test(priority = 9)
    @Description("Verify the 'Latest' section on the Articles page")
    public void verify_LatestSection() throws InterruptedException {
        articles.Verify_Latest_Section();
    }

    @Test(priority = 10)
    @Description("Verify the first article in the 'Latest' section")
    public void verify_LatestFirstArticle() throws InterruptedException {
        articles.Verify_Latest_FirstArticle();
    }

    @Test(priority = 11)
    @Description("Verify the 'See More' button availability in the 'Latest' section")
    public void verify_LatestSeeMore() throws InterruptedException {
        articles.Verify_Latest_SeeMore();
    }

    @Test(priority = 12)
    @Description("Verify the 'Other Articles' section on the Articles page")
    public void verify_OtherArticlesSection() throws InterruptedException {
        articles.Verify_OtherArticles_Section();
    }

    @Test(priority = 13)
    @Description("Verify the first article in the 'Other Articles' section")
    public void verify_OtherArticlesFirst() throws InterruptedException {
        articles.Verify_OtherArticles_FirstArticle();
    }

    @Test(priority = 14)
    @Description("Verify the 'See More' button availability in the 'Other Articles' section")
    public void verify_OtherArticlesSeeMore() throws InterruptedException {
        articles.Verify_OtherArticles_SeeMore();
    }

}
