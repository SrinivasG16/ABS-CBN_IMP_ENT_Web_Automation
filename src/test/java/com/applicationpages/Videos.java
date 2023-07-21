package com.applicationpages;

import com.applicationobjects.PhotosOR;
import com.applicationobjects.VideosOR;
import com.genericmethods.GenericMethods;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Videos extends GenericMethods {

    public static VideosOR videosOR;

    public static Videos videos;

    // Private constructor to prevent direct instantiation of the class
    private Videos() {
        System.out.println("Creating object for Photos Article inner PAGE");
    }

    // Public method to get the instance of PhotosArticle class
    public static Videos getInstance() {
        videos = null;

        // Check if the instance is not already created
        if (videos == null) {
            // Create a new instance of PhotosArticle
            videos = new Videos();

            // Initialize the PageFactory elements for the PhotosArticleOR class
            videosOR = PageFactory.initElements(driver, VideosOR.class);
        }

        // Return the instance of PhotosArticle
        return videos;
    }

    public void Verify_MainVideoFrame_Section() {
        // Check the availability of the Push logo image on the Home page
        availableElement("Home", "Main Video", "Main videoframe", videosOR.vdo_main_videoframe);
    }

    public void Verify_MainExclusiveVideos_Section() {
        // Check the availability of the Push logo image on the Home page
        availableElement("Home", "Main Exclusive videos", "Main Exclusive videos", videosOR.txt_mainexcusive_section);
    }

    public void Verify_MainExclusive_FirstVideo() {
        // Check the availability of the Push logo image on the Home page
        availableElement("Home", "Main Exclusive videos", "Main Exclusive videos", videosOR.lnk_mainexcusive_frst_video);
    }

    public void Verify_MainExclusive_SeeMore() {
        // Check the availability of the Push logo image on the Home page
        availableElement("Home", "Main Exclusive videos", "See More", videosOR.btn_mainexcusive_seeMore);
    }

    public void Verify_MainExclusive_Sociallinks() {
        // Check the availability of the Push logo image on the Home page
        availableElement("Home", "Main Exclusive videos", "FB", videosOR.btn_mainvideo_fb);

        availableElement("Home", "Main Exclusive videos", "Twitter", videosOR.btn_mainvideo_twitter);

        availableElement("Home", "Main Exclusive videos", "Viber", videosOR.btn_mainvideo_viber);
    }

    public void Verify_HotShot_Section() {
        // Check the availability of the Push logo image on the Home page
        availableElement("Home", "Hot Shot", "Hot Shot", videosOR.txt_hotshot_section);
    }

    public void Verify_HotShot_FirstVideo() {
        // Check the availability of the Push logo image on the Home page
        availableImage("Home", "Hot Shot", "First Video", videosOR.img_hotshot_frstvideo);
    }

    public void Verify_Videos_Section() {
        // Check the availability of the Push logo image on the Home page
        availableElement("Home", "Videos", "Videos", videosOR.txt_videos_section);
    }

    public void Verify_Videos_FirstVideo() {
        // Check the availability of the Push logo image on the Home page
        availableImage("Home", "Videos", "First Video", videosOR.img_videos_frstvideo);
    }

    public void Verify_Videos_SeeMore() {
        // Check the availability of the Push logo image on the Home page
        availableElement("Home", "Videos", "See more", videosOR.btn_videos_seemore);
    }

    public void Verify_iWTFC_Logo() {
        // Check the availability of the Push logo image on the Home page
        availableElement("Home", "iWTFC", "Logo", videosOR.img_iWTFC_Logo);
    }

    public void Verify_iWTFC_FirstVideo() {
        // Check the availability of the Push logo image on the Home page
        availableElement("Home", "iWTFC", "First Video", videosOR.img_iWTFC_frstvideo);
    }

    public void Verify_iWTFC_VisitiWTFC() {
        // Check the availability of the Push logo image on the Home page
        availableElement("Home", "iWTFC", "Visit iWTFC", videosOR.btn_iWTFC_visitiwtfc);
    }
    public void Verify_SeeMoreOtherArticles_fun() throws InterruptedException {
        // Retrieves the count of articles before clicking on "More Photos" button
        int artCount_bf = videosOR.lst_videoart_bf.size();
        System.out.println("Before : " + artCount_bf);

        // Clicks on the "See More" button
        clickElement("Photos", "More Photos", videosOR.btn_videos_seemore);
        Thread.sleep(2000);

        // Retrieves the count of articles after clicking on "See More" button
        int artCount_af = videosOR.lst_videoart_af.size();
        System.out.println("After : " + artCount_af);

        if (artCount_af != artCount_bf) {
            System.out.println("See More button functionality working as expected");
        } else {
            Assert.assertNotEquals(artCount_af, artCount_bf, "See More button functionality not working as expected");
        }
    }
}
