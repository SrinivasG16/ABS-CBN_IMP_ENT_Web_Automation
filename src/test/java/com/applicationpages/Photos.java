package com.applicationpages;

import com.applicationobjects.HomePageOR;
import com.applicationobjects.PhotosOR;
import com.genericmethods.GenericMethods;
import org.openqa.selenium.support.PageFactory;

public class Photos extends GenericMethods {
    private static PhotosOR PhotosOR;
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
            PhotosOR = PageFactory.initElements(driver, PhotosOR.class);
        }

        // Return the instance of PhotosArticle
        return photos;
    }
    public void Verify_MainPhotos_Section() {
        // Check the availability of the Push logo image on the Home page
        availableImage("Home", "Main Article", "Main Article", PhotosOR.txt_Mainphotos_section);
    }
    public void Verify_MainArticle() {
        // Check the availability of the Push logo image on the Home page
        availableImage("Home", "Main Article", "Main Article", PhotosOR.img_mainarticle);
    }
    public void Verify_Werecommended_Section() {
        // Check the availability of the Push logo image on the Home page
        availableImage("Home", "we recommended", "we recommended", PhotosOR.txt_werecommend);
    }
    public void Verify_frstArticle_Werecommended() {
        // Check the availability of the Push logo image on the Home page
        availableImage("Home", "we recommended", "first article", PhotosOR.img_frst_werecommend);
    }
    public void Verify_photos_section() {
        // Check the availability of the Push logo image on the Home page
        availableImage("Home", "Photos", "Photos", PhotosOR.txt_photos_section);
    }
    public void Verify_frstAticle_photos() {
        // Check the availability of the Push logo image on the Home page
        availableImage("Home", "Photos", "first article", PhotosOR.img_frst_photos);
    }
    public void Verify_SeeMore_photos() {
        // Check the availability of the Push logo image on the Home page
        availableImage("Home", "Photos", "See more", PhotosOR.btn_seemore_photos);
    }


}
