package com.applicationpages;

import com.applicationobjects.Article_innerOR;
import com.applicationobjects.VideosInnerOR;
import com.genericmethods.GenericMethods;
import org.openqa.selenium.support.PageFactory;

public class VideosInnerPage extends GenericMethods {

    public static VideosInnerPage videosInnerPage;

    public static VideosInnerOR videosInnerOR;

    // Constructor for the Articles class
    private VideosInnerPage() {
        // Print a message to the console
        System.out.println("Creating object for ARTICLES");
    }

    // This method returns an instance of the Articles class
    public static VideosInnerPage getInstance() {
        // Set homePage to null initially
        videosInnerPage = null;

        // Check if homePage is null
        if (videosInnerPage== null) {
            // If it is, create a new instance of HomePage
            videosInnerPage = new VideosInnerPage();

            // Initialize homePageOR using PageFactory and the driver
            videosInnerOR = PageFactory.initElements(driver, VideosInnerOR.class);
        }

        // Return the instance of HomePage
        return videosInnerPage;
    }

    public void Verify_MainVideo_frame() {
        // Check the availability of the Push logo image on the Home page
        availableElement("Videos inner page", "Main video", "Main video frame", videosInnerOR.vdo_mainvideo);
    }

    public void Verify_MainVideo_sociallnks() {
        // Check the availability of the Push logo image on the Home page
        availableElement("Video inner page", "Main Video", "FB", videosInnerOR.btn_mainvideo_fb);

        availableElement("Video inner page", "Main Video", "twitter", videosInnerOR.btn_mainvideo_twitter);

        availableElement("Video inner page", "Main Video", "viber", videosInnerOR.btn_mainavideo_viber);
    }


    public void Verify_MainVideo_Image() {
        // Check the availability of the Push logo image on the Home page
        availableImage("Videos inner page", "Main video", "Main video Image", videosInnerOR.img_mainavideo_img);
    }

    public void Verify_RelatedVideo_Section() {
        // Check the availability of the Push logo image on the Home page
        availableElement("Videos inner page", "Related video", "Related", videosInnerOR.txt_relatedvideo_section);
    }
    public void Verify_Related_FirstVideo() {
        // Check the availability of the Push logo image on the Home page
        availableImage("Videos inner page", "Related video", "First video", videosInnerOR.img_related_frstvideo);
    }

}
