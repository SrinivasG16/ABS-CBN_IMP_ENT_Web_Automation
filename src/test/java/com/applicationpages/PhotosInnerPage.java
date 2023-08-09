package com.applicationpages;

import com.applicationobjects.PhotoInnerOR;
import com.applicationobjects.VideosInnerOR;
import com.genericmethods.GenericMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.List;

public class PhotosInnerPage extends GenericMethods {

    public static PhotosInnerPage photosInnerPage;

    public static PhotoInnerOR photoInnerOR;

    // Constructor for the Articles class
    private PhotosInnerPage() {
        // Print a message to the console
        System.out.println("Creating object for ARTICLES");
    }

    // This method returns an instance of the Articles class
    public static PhotosInnerPage getInstance() {
        // Set homePage to null initially
        photosInnerPage = null;

        // Check if homePage is null
        if (photosInnerPage== null) {
            // If it is, create a new instance of HomePage
            photosInnerPage = new PhotosInnerPage();

            // Initialize homePageOR using PageFactory and the driver
            photoInnerOR = PageFactory.initElements(driver, PhotoInnerOR.class);
        }

        // Return the instance of HomePage
        return photosInnerPage;
    }
    public void Verify_MainPhotoArticle() {
        // Check the availability of the Push logo image on the Home page
        availableImage("Photo inner page", "Main Photo", "Main photo", photoInnerOR.img_mainphotoarticle);
    }
    public void Verify_MainPhotoSection_SocialLinks() {
        // Check the availability of the Push logo image on the Home page
        availableElement("Photo inner page", "Main Photo", "FB", photoInnerOR.btn_mainphoto_fb);

        availableElement("Photo inner page", "Main Photo", "Twitter", photoInnerOR.btn_mainphoto_twitter);

        availableElement("Photo inner page", "Main Photo", "Viber", photoInnerOR.btn_mainphoto_viber);

    }
    public void Verify_MainPhotoThumb() {
        // Check the availability of the Push logo image on the Home page
        availableImage("Photo inner page", "Main Photo", "Main photo thumb", photoInnerOR.img_mainphoto_thumb);
    }
    public void Verify_RelatedSection() {
        // Check the availability of the Push logo image on the Home page
        availableElement("Photo inner page", "Related", "Related", photoInnerOR.txt_related_section);
    }
    public void Verify_RelatedFirstThumb() {
        // Check the availability of the Push logo image on the Home page
        availableImage("Photo inner page", "Main Photo", "First thumb", photoInnerOR.img_related_frstphoto);
    }
    public void Verify_Social_share_fun() throws InterruptedException {
        // Creating an instance of SoftAssert for assertion purposes
        SoftAssert softAssert = new SoftAssert();

        // Creating a list to store social share elements
        List socialshare = new ArrayList();
        socialshare.add(photoInnerOR.btn_mainphoto_fb); // Adding Facebook share element
        socialshare.add(photoInnerOR.btn_mainphoto_twitter); // Adding Twitter share element
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
