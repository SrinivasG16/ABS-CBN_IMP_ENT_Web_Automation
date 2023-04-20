package com.testcases;

import com.applicationpages.FreshScoops;
import com.applicationpages.FreshScoopsArticle;
import com.applicationpages.HomePage;
import com.genericmethods.GenericMethods;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class TC_08_Verify_InfiniteScroll_Arts extends GenericMethods {

    FreshScoopsArticle freshScoopsArticle;
    FreshScoops freshScoops;
    HomePage homePage;

    @Description("Launching the browser and Navigating to Fresh Scoops article inner Page")
    @Test(priority =0)
    public void launchbrowser() throws InterruptedException {
        launchBrowser();
        manageCookies();
        homePage=HomePage.getInstance();
        freshScoops=FreshScoops.getInstance();
        homePage.Navigate_To_freshscoops();
        freshScoops.Navigate_To_FsArticleinner();
    }

    @Description("Verification for Infinite scroll articles on the Fresh Scoops article inner page")
    @Test(priority =1)
    public void verify_infinitescroll_art() throws InterruptedException {
        freshScoopsArticle=FreshScoopsArticle.getInstance();
        freshScoopsArticle.verify_infinitescroll_art();
    }
}
