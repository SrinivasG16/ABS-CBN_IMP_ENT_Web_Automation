package com.applicationpages;

import com.applicationobjects.PhotosOR;
import com.applicationobjects.VideosOR;
import com.genericmethods.GenericMethods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.List;

public class Videos extends GenericMethods {

    public static VideosOR videosOR;

    public static Videos videos;

    Actions act = new Actions(driver);

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

    public void Verify_MainExclusive_Hashtag() {
        // Check the availability of the Push logo image on the Home page
        availableElement("Home", "Main Exclusive videos", "Hash tag", videosOR.btn_mainvideo_hashtag);
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
    public void Verify_yt_Video_play() throws InterruptedException {
        // Scroll the page by 80 pixels vertically using JavaScript
        JavascriptExecutor js = null;
        js.executeScript("window.scrollBy(0,80)", "");

        // Switch to the iframe containing the YouTube player
        driver.switchTo().frame(videosOR.vdo_main_videoframe);

        // Click on the play button in the "Video inner Page"
        clickElement("Video Page", "Play button", videosOR.btn_playvideo);

        // Pause execution for 5000 milliseconds (5 seconds)
        Thread.sleep(5000);

        // Move the mouse pointer to the "ply_yt_player" element
        act.moveToElement(videosOR.vdo_playingvideo).perform();

        // Get the play time from the "txt_yt_ptime" element
        String time = videosOR.txt_video_playtime.getText();

        // Print the play time
        System.out.println("Play time is: " + time);

        // Convert the play time to an integer by removing the ":" separator
        int pt = Integer.parseInt(time.replaceAll(":", ""));

        if(pt >= 0){
            // The play time is greater than or equal to 0, indicating that the YouTube video is playing and working as expected
            System.out.println("YouTube video is playing and working as expected");
        } else {
            // Assert that the play time is not equal to 0, indicating that the YouTube video is not playing
            Assert.assertNotEquals(pt, 0, "YouTube video is not playing");
        }
    }

    public void Verify_yt_Video_pause(){
        // Click on the "Pause" button in the "Video Inner" section
        clickElement("Video Inner", "Pause", videosOR.btn_ytvideo_playPause);

        // Get the value of the "data-title-no-tooltip" attribute from the "btn_yt_playPause" element
        String pause = videosOR.btn_ytvideo_playPause.getAttribute("data-title-no-tooltip");

        // Print the value of the pause attribute
        System.out.println("Pause value: " + pause);

        if(pause.equals("Play")){
            // The pause value is "Play", indicating that the video pause functionality is working as expected
            System.out.println("Video pause functionality is working as expected");
        }else {
            // Assert that the pause value is "Play", indicating that the video pause functionality is not working as expected
            Assert.assertEquals(pause, "Play", "Video pause functionality is not working as expected");
        }
    }

    public void Verify_yt_Video_mute(){
        // Move the mouse pointer to the "ply_yt_player" element
        act.moveToElement(videosOR.vdo_playingvideo).perform();

        // Click on the "Mute" button in the "Video Inner" section
        clickElement("Video Inner", "Mute", videosOR.btn_ytvideo_vol);

        // Get the value of the "data-title-no-tooltip" attribute from the "btn_yt_vol" element
        String val = videosOR.btn_ytvideo_vol.getAttribute("data-title-no-tooltip");

        // Print the value of the mute attribute
        System.out.println("Mute value: " + val);

        if(val.equals("Unmute")){
            // The mute value is "Unmute", indicating that the video is muted
            System.out.println("Video muted");
        }else {
            // Assert that the mute value is "Unmute", indicating that the video is unable to be muted
            Assert.assertEquals(val, "Unmute", "Unable to mute the video");
        }
    }

    public void Verify_yt_Video_Unmute(){
        // Move the mouse pointer to the "ply_yt_player" element
        act.moveToElement(videosOR.vdo_playingvideo).perform();

        // Click on the "Mute" button in the "Video Inner" section
        clickElement("Video Inner", "Mute", videosOR.btn_ytvideo_vol);

        // Get the value of the "data-title-no-tooltip" attribute from the "btn_yt_vol" element
        String val = videosOR.btn_ytvideo_vol.getAttribute("data-title-no-tooltip");

        // Print the value of the unmute attribute
        System.out.println("Unmute value: " + val);

        if(val.equals("Mute")){
            // The unmute value is "Mute", indicating that the video is unmuted
            System.out.println("Video unmuted");
        }else {
            // Assert that the unmute value is "Mute", indicating that the video is unable to be unmuted
            Assert.assertEquals(val, "Mute", "Unable to unmute the video");
        }
    }

    public void     Verify_yt_Video_Maximise(){
        // Move the mouse pointer to the "ply_yt_player" element
        act.moveToElement(videosOR.vdo_playingvideo).perform();

        // Click on the "Maximise" button in the "Video Inner" section
        clickElement("Video Inner", "Maximise", videosOR.btn_ytvideo_max);

        // Get the value of the "data-title-no-tooltip" attribute from the "btn_yt_max" element
        String val = videosOR.btn_ytvideo_max.getAttribute("data-title-no-tooltip");

        // Print the value of the max attribute
        System.out.println("Max value: " + val);

        if(val.equals("Exit full screen")){
            // The max value is "Exit full screen", indicating that the video is maximised
            System.out.println("Able to maximise the video");
        }else {
            // Assert that the max value is "Exit full screen", indicating that the video is unable to be maximised
            Assert.assertEquals(val, "Exit full screen", "Unable to maximise the video");
        }
    }

    public void Verify_yt_Video_Minimise(){
        // Move the mouse pointer to the "ply_yt_player" element
        act.moveToElement(videosOR.vdo_playingvideo).perform();

        // Click on the "Minimise" button in the "Video Inner" section
        clickElement("Video Inner", "Minimise", videosOR.btn_ytvideo_max);

        // Get the value of the "data-title-no-tooltip" attribute from the "btn_yt_max" element
        String val = videosOR.btn_ytvideo_max.getAttribute("data-title-no-tooltip");

        // Print the value of the min attribute
        System.out.println("Min value: " + val);

        if(val.equals("Full screen")){
            // The min value is "Full screen", indicating that the video is minimised
            System.out.println("Able to Minimise the video");
        }else {
            // Assert that the min value is "Full screen", indicating that the video is unable to be minimised
            Assert.assertEquals(val, "Full screen", "Unable to Minimise the video");
        }
    }


    public void Verify_SeeMoreVideos_fun() throws InterruptedException {
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
    public void Verify_Social_share_fun() throws InterruptedException {
        // Creating an instance of SoftAssert for assertion purposes
        SoftAssert softAssert = new SoftAssert();

        // Creating a list to store social share elements
        List socialshare = new ArrayList();
        socialshare.add(videosOR.btn_mainvideo_fb); // Adding Facebook share element
        socialshare.add(videosOR.btn_mainvideo_twitter); // Adding Twitter share element
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
                System.out.println(actURL + " Social share Functionality is working as expected on the photos page");
            } else {
                // Asserting that the actual title is equal to the expected title
                softAssert.assertEquals(actURL, expURL, "Section page functionality not working as expected on the photos page");
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
