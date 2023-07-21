package com.applicationpages;

import com.applicationobjects.Article_innerOR;
import com.applicationobjects.ArticlesOR;
import com.genericmethods.GenericMethods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ArticleInnerPage extends GenericMethods {

    public static ArticleInnerPage articleInnerPage;

    public static Article_innerOR articleInnerOR;

    // Constructor for the Articles class
    private ArticleInnerPage() {
        // Print a message to the console
        System.out.println("Creating object for ARTICLES");
    }

    // This method returns an instance of the Articles class
    public static ArticleInnerPage getInstance() {
        // Set homePage to null initially
        articleInnerPage = null;

        // Check if homePage is null
        if (articleInnerPage == null) {
            // If it is, create a new instance of HomePage
            articleInnerPage = new ArticleInnerPage();

            // Initialize homePageOR using PageFactory and the driver
            articleInnerOR = PageFactory.initElements(driver, Article_innerOR.class);
        }

        // Return the instance of HomePage
        return articleInnerPage;
    }


    public void Verify_MainArticle_Img() {
        // Check the availability of the Push logo image on the Home page
        availableImage("Articels inner page", "Main article", "Main article image", articleInnerOR.img_mainarticle);
    }

    public void Verify_MainArticle_sociallnks() {
        // Check the availability of the Push logo image on the Home page
        availableElement("Articels inner page", "Main article", "FB", articleInnerOR.btn_mainarticle_fb);

        availableElement("Articels inner page", "Main article", "twitter", articleInnerOR.btn_mainarticle_twitter);

        availableElement("Articels inner page", "Main article", "viber", articleInnerOR.btn_mainarticle_viber);
    }

    public void Verify_Related_section() {
        // Check the availability of the Push logo image on the Home page
        availableElement("Articels inner page", "Related", "Related", articleInnerOR.txt_related_section);
    }
    public void Verify_Related_FirstArticle() {
        // Check the availability of the Push logo image on the Home page
        availableImage("Articels inner page", "Related", "First article", articleInnerOR.img_related_frstarticle);
    }


}
