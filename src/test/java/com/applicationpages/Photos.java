package com.applicationpages;

import com.applicationobjects.HomePageOR;
import com.applicationobjects.PhotosOR;
import com.genericmethods.GenericMethods;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Photos extends GenericMethods {
    private static PhotosOR photosOR;
    private static HomePageOR homePageOR;
    private static Photos Photos;
    private static Photos photos;

    // Private constructor to prevent direct instantiation of the class
    private Photos() {
        System.out.println("Creating object for Photos Article inner PAGE");
    }

    // Public method to get the instance of PhotosArticle class
    public static Photos getInstance() {
        photos = null;

        // Check if the instance is not already created
        if (photos == null) {
            // Create a new instance of PhotosArticle
            photos = new Photos();

            // Initialize the PageFactory elements for the PhotosArticleOR class
            photosOR = PageFactory.initElements(driver, PhotosOR.class);
        }

        // Return the instance of PhotosArticle
        return photos;
    }
    public void Verify_MainPhotos_Section() {
        // Check the availability of the Push logo image on the Home page
        availableImage("Home", "Main Article", "Main Article", photosOR.txt_Mainphotos_section);
    }
    public void Verify_MainArticle() {
        // Check the availability of the Push logo image on the Home page
        availableImage("Home", "Main Article", "Main Article", photosOR.img_mainarticle);
    }
    public void Verify_Werecommended_Section() {
        // Check the availability of the Push logo image on the Home page
        availableImage("Home", "we recommended", "we recommended", photosOR.txt_werecommend);
    }
    public void Verify_frstArticle_Werecommended() {
        // Check the availability of the Push logo image on the Home page
        availableImage("Home", "we recommended", "first article", photosOR.img_frst_werecommend);
    }
    public void Verify_photos_section() {
        // Check the availability of the Push logo image on the Home page
        availableImage("Home", "Photos", "Photos", photosOR.txt_photos_section);
    }
    public void Verify_frstAticle_photos() {
        // Check the availability of the Push logo image on the Home page
        availableImage("Home", "Photos", "first article", photosOR.img_frst_photos);
    }
    public void Verify_SeeMore_photos() {
        // Check the availability of the Push logo image on the Home page
        availableImage("Home", "Photos", "See more", photosOR.btn_seemore_photos);
    }
    public void Verify_SeeMorePhotos_fun() throws InterruptedException {
        // Retrieves the count of articles before clicking on "More Photos" button
        int artCount_bf = photosOR.lst_phototart_bf.size();
        System.out.println("Before : " + artCount_bf);

        // Clicks on the "See More" button
        clickElement("Photos", "More Photos", photosOR.btn_seemore_photos);
        Thread.sleep(2000);

        // Retrieves the count of articles after clicking on "See More" button
        int artCount_af = photosOR.lst_photoart_af.size();
        System.out.println("After : " + artCount_af);

        if (artCount_af != artCount_bf) {
            System.out.println("See More button functionality working as expected");
        } else {
            Assert.assertNotEquals(artCount_af, artCount_bf, "See More button functionality not working as expected");
        }
    }

}
