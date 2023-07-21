package com.applicationpages;

import com.applicationobjects.ArticlesOR;
import com.applicationobjects.HomePageOR;
import com.genericmethods.GenericMethods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Articles extends GenericMethods {

    private static ArticlesOR articlesOR;

    private static HomePageOR homePageOR;

    private static Articles articles;

    // Constructor for the Articles class
    private Articles() {
        // Print a message to the console
        System.out.println("Creating object for ARTICLES");
    }

    // This method returns an instance of the Articles class
    public static Articles getInstance() {
        // Set homePage to null initially
        articles = null;

        // Check if homePage is null
        if (articles == null) {
            // If it is, create a new instance of HomePage
            articles = new Articles();

            // Initialize homePageOR using PageFactory and the driver
            articlesOR = PageFactory.initElements(driver, ArticlesOR.class);
        }

        // Return the instance of HomePage
        return articles;
    }

    public void Verify_MainArticle_section() {
        // Check the availability of the Push logo image on the Home page
        availableElement("Articels", "Main article", "Main article", articlesOR.txt_mainarticle_section);
    }

    public void Verify_MainArticle_image() {
        // Check the availability of the Push logo image on the Home page
        availableImage("Articels", "Main article", "Main article", articlesOR.img_mainarticle);
    }

    public void Verify_MainArticle_Socialicons() {
        // Check the availability of the Push logo image on the Home page
        availableElement("Articels", "Main article", "fb", articlesOR.btn_mainarticle_fb);

        // Check the availability of the Push logo image on the Home page
        availableElement("Articels", "Main article", "twitter", articlesOR.btn_mainarticle_twitter);

        // Check the availability of the Push logo image on the Home page
        availableElement("Articels", "Main article", "viber", articlesOR.btn_mainarticle_viber);
    }

    public void Verify_WeRecommend_section() {
        // Check the availability of the Push logo image on the Home page
        availableElement("Articels", "We Recommend", "We Recommend", articlesOR.txt_werecommend_section);
    }

    public void Verify_WeRecommend_FirstArticle() {
        // Check the availability of the Push logo image on the Home page
        availableImage("Articels", "We Recommend", "First Article", articlesOR.img_werecommend_fstarticle);
    }

    public void Verify_Popular_section() {
        // Check the availability of the Push logo image on the Home page
        availableElement("Articels", "Popular", "Popular", articlesOR.txt_popular_section);
    }

    public void Verify_Popular_FirstArticle() {
        // Check the availability of the Push logo image on the Home page
        availableImage("Articels", "Popular", "First Article", articlesOR.img_popular_frstarticl);
    }

    public void Verify_Popular_SeeMore() {
        // Check the availability of the Push logo image on the Home page
        availableElement("Articels", "Popular", "See More", articlesOR.img_popular_frstarticl);
    }

    public void Verify_Latest_Section() {
        // Check the availability of the Push logo image on the Home page
        availableElement("Articels", "Latest", "Latest", articlesOR.txt_latest_section);
    }

    public void Verify_Latest_FirstArticle() {
        // Check the availability of the Push logo image on the Home page
        availableImage("Articels", "Latest", "First Article", articlesOR.img_latest_frstarticle);
    }

    public void Verify_Latest_SeeMore() {
        // Check the availability of the Push logo image on the Home page
        availableElement("Articels", "Latest", "See More", articlesOR.btn_latest_seemore);
    }

    public void Verify_OtherArticles_Section() {
        // Check the availability of the Push logo image on the Home page
        availableElement("Articels", "Other Articles", "Other Articles", articlesOR.txt_otherarticles_section);
    }

    public void Verify_OtherArticles_FirstArticle() {
        // Check the availability of the Push logo image on the Home page
        availableImage("Articels", "Other Articles", "First Article", articlesOR.img_otherarticles_frstarticle);
    }

    public void Verify_OtherArticles_SeeMore() {
        // Check the availability of the Push logo image on the Home page
        availableElement("Articels", "Other Articles", "See More", articlesOR.btn_otherarticles_seemore);
    }
    public void Verify_SeeMoreArticles_fun() throws InterruptedException {
        // Retrieves the count of articles before clicking on "More Photos" button
        int artCount_bf = articlesOR.lst_art_bf.size();
        System.out.println("Before : " + artCount_bf);

        // Clicks on the "See More" button
        clickElement("Photos", "More Photos", articlesOR.btn_popular_seemore);
        Thread.sleep(2000);

        // Retrieves the count of articles after clicking on "See More" button
        int artCount_af = articlesOR.lst_art_af.size();
        System.out.println("After : " + artCount_af);

        if (artCount_af != artCount_bf) {
            System.out.println("See More button functionality working as expected");
        } else {
            Assert.assertNotEquals(artCount_af, artCount_bf, "See More button functionality not working as expected");
        }
    }
    public void Verify_SeeMoreLatestArticles_fun() throws InterruptedException {
        // Retrieves the count of articles before clicking on "More Photos" button
        int artCount_bf = articlesOR.lst_latestart_bf.size();
        System.out.println("Before : " + artCount_bf);

        // Clicks on the "See More" button
        clickElement("Photos", "More Photos", articlesOR.btn_latest_seemore);
        Thread.sleep(2000);

        // Retrieves the count of articles after clicking on "See More" button
        int artCount_af = articlesOR.lst_latestart_af.size();
        System.out.println("After : " + artCount_af);

        if (artCount_af != artCount_bf) {
            System.out.println("See More button functionality working as expected");
        } else {
            Assert.assertNotEquals(artCount_af, artCount_bf, "See More button functionality not working as expected");
        }
    }
    public void Verify_SeeMoreOtherArticles_fun() throws InterruptedException {
        // Retrieves the count of articles before clicking on "More Photos" button
        int artCount_bf = articlesOR.lst_otherart_bf.size();
        System.out.println("Before : " + artCount_bf);

        // Clicks on the "See More" button
        clickElement("Photos", "More Photos", articlesOR.btn_otherarticles_seemore);
        Thread.sleep(2000);

        // Retrieves the count of articles after clicking on "See More" button
        int artCount_af = articlesOR.lst_otherart_af.size();
        System.out.println("After : " + artCount_af);

        if (artCount_af != artCount_bf) {
            System.out.println("See More button functionality working as expected");
        } else {
            Assert.assertNotEquals(artCount_af, artCount_bf, "See More button functionality not working as expected");
        }
    }

    public void Verify_innerArticles_fun() {
        // Check the functionality of the "Videos" button in the "Latest" section on the Home page
        clickElement("Articles", "Article", articlesOR.img_werecommend_fstarticle);
    }
    public void Navigate_To_Articleinner() {
        // Clicks on the main article image in the "Photos" section
        clickElement("Articles inner", "Main article", articlesOR.img_werecommend_fstarticle );

        // Scrolls the window by a certain amount using JavaScriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)","");
        js.executeScript("window.scrollBy(0,1200)","");
        js.executeScript("window.scrollBy(0,2000)","");
    }
}
