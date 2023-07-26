package com.applicationpages;

import com.applicationobjects.Article_innerOR;
import com.applicationobjects.VideosInnerOR;
import com.genericmethods.GenericMethods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

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

    public void     Verify_yt_Video_Maximise(){
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

}
