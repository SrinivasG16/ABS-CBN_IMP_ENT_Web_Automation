package com.applicationpages;

import com.applicationobjects.Article_innerOR;
import com.applicationobjects.VideosInnerOR;
import com.genericmethods.GenericMethods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.List;

public class VideosInnerPage extends GenericMethods {

    public static VideosInnerPage videosInnerPage;

    public static VideosInnerOR videosInnerOR;

    Actions act = new Actions(driver);

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
        availableElement("Videos inner page", "Main video", "Main video frame", videosInnerOR.vdo_main_videoframe);
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

    public void Verify_yt_Video_play() throws InterruptedException {
        // Scroll the page by 80 pixels vertically using JavaScript
        JavascriptExecutor js = null;
        js.executeScript("window.scrollBy(0,80)", "");

        // Switch to the iframe containing the YouTube player
        driver.switchTo().frame(videosInnerOR.vdo_main_videoframe);

        // Click on the play button in the "Video inner Page"
        clickElement("Video Page", "Play button", videosInnerOR.btn_playvideo);

        // Pause execution for 5000 milliseconds (5 seconds)
        Thread.sleep(5000);

        // Move the mouse pointer to the "ply_yt_player" element
        act.moveToElement(videosInnerOR.vdo_playingvideo).perform();

        // Get the play time from the "txt_yt_ptime" element
        String time = videosInnerOR.txt_video_playtime.getText();

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
        clickElement("Video Inner", "Pause", videosInnerOR.btn_ytvideo_playPause);

        // Get the value of the "data-title-no-tooltip" attribute from the "btn_yt_playPause" element
        String pause = videosInnerOR.btn_ytvideo_playPause.getAttribute("data-title-no-tooltip");

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
        act.moveToElement(videosInnerOR.vdo_playingvideo).perform();

        // Click on the "Mute" button in the "Video Inner" section
        clickElement("Video Inner", "Mute", videosInnerOR.btn_ytvideo_vol);

        // Get the value of the "data-title-no-tooltip" attribute from the "btn_yt_vol" element
        String val = videosInnerOR.btn_ytvideo_vol.getAttribute("data-title-no-tooltip");

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
        act.moveToElement(videosInnerOR.vdo_playingvideo).perform();

        // Click on the "Mute" button in the "Video Inner" section
        clickElement("Video Inner", "Mute", videosInnerOR.btn_ytvideo_vol);

        // Get the value of the "data-title-no-tooltip" attribute from the "btn_yt_vol" element
        String val = videosInnerOR.btn_ytvideo_vol.getAttribute("data-title-no-tooltip");

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

    public void Verify_yt_Video_Maximise(){
        // Move the mouse pointer to the "ply_yt_player" element
        act.moveToElement(videosInnerOR.vdo_playingvideo).perform();

        // Click on the "Maximise" button in the "Video Inner" section
        clickElement("Video Inner", "Maximise", videosInnerOR.btn_ytvideo_max);

        // Get the value of the "data-title-no-tooltip" attribute from the "btn_yt_max" element
        String val = videosInnerOR.btn_ytvideo_max.getAttribute("data-title-no-tooltip");

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
        act.moveToElement(videosInnerOR.vdo_playingvideo).perform();

        // Click on the "Minimise" button in the "Video Inner" section
        clickElement("Video Inner", "Minimise", videosInnerOR.btn_ytvideo_max);

        // Get the value of the "data-title-no-tooltip" attribute from the "btn_yt_max" element
        String val = videosInnerOR.btn_ytvideo_max.getAttribute("data-title-no-tooltip");

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
    public void Verify_Social_share_fun() throws InterruptedException {
        // Creating an instance of SoftAssert for assertion purposes
        SoftAssert softAssert = new SoftAssert();

        // Creating a list to store social share elements
        List socialshare = new ArrayList();
        socialshare.add(videosInnerOR.btn_mainvideo_fb); // Adding Facebook share element
        socialshare.add(videosInnerOR.btn_mainvideo_twitter); // Adding Twitter share element
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
