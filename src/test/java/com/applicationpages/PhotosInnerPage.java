package com.applicationpages;

import com.applicationobjects.PhotoInnerOR;
import com.applicationobjects.VideosInnerOR;
import com.genericmethods.GenericMethods;
import org.openqa.selenium.support.PageFactory;

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
}
