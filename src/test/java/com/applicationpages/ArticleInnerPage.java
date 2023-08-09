package com.applicationpages;

import com.applicationobjects.Article_innerOR;
import com.applicationobjects.ArticlesOR;
import com.genericmethods.GenericMethods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.List;

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
    public void Verify_Social_share_fun() throws InterruptedException {
        // Creating an instance of SoftAssert for assertion purposes
        SoftAssert softAssert = new SoftAssert();

        // Creating a list to store social share elements
        List socialshare = new ArrayList();
        socialshare.add(articleInnerOR.btn_mainarticle_fb); // Adding Facebook share element
        socialshare.add(articleInnerOR.btn_mainarticle_twitter); // Adding Twitter share element
        // socialshare.add(freshScoopsArticleOR.icn_vbr_share); // (Commented out) Adding Viber share element

        // Creating a list to store expected social media titles
        List socialtitle = new ArrayList();
        socialtitle.add("Facebook"); // Adding expected title for Facebook
        socialtitle.add("Compose new Tweet / Twitter"); // Adding expected title for Twitter
        // socialtitle.add("Viber"); // (Commented out) Adding expected title for Viber

        // Iterating over the socialshare list
        for (int i = 0; i < socialshare.size(); i++) {
            // Clicking on the social follow icon
            clickElement("Fresh scoops article inner", "Social Follow icons", (WebElement) socialshare.get(i));
            // Switching to the new window
            switchwindow();
            Thread.sleep(2000);

            // Getting the actual title of the current page
            String actURL = driver.getTitle();
            // Getting the expected title from the socialtitle list
            String expURL = socialtitle.get(i).toString();
            System.out.println("Title: " + actURL);

            // Checking if the expected title contains the actual title
            if (expURL.contains(actURL)) {
                System.out.println(actURL + " Section page Functionality is working as expected on the Fresh scoops article inner page");
            } else {
                // Asserting that the actual title is equal to the expected title
                softAssert.assertEquals(actURL, expURL, "Section page functionality not working as expected on the Fresh scoops article inner page");
            }

            // Closing the current window
            driver.close();
            Thread.sleep(5000);
            // Switching back to the parent window
            driver.switchTo().window(Parent);
        }

        // Asserting all the soft assertions
        softAssert.assertAll();
    }


}
