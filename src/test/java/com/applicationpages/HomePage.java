package com.applicationpages;


import com.applicationobjects.HomePageOR;
import com.genericmethods.GenericMethods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends GenericMethods {
    private static HomePageOR homePageOR;
    private static HomePage homePage;



    // Constructor for the HomePage class
    private HomePage() {
        // Print a message to the console
        System.out.println("Creating object for HOME PAGE");
    }

    // This method returns an instance of the HomePage class
    public static HomePage getInstance() {
        // Set homePage to null initially
        homePage = null;

        // Check if homePage is null
        if (homePage == null) {
            // If it is, create a new instance of HomePage
            homePage = new HomePage();

            // Initialize homePageOR using PageFactory and the driver
            homePageOR = PageFactory.initElements(driver, HomePageOR.class);
        }

        // Return the instance of HomePage
        return homePage;
    }
    public void Verify_ent_logo() {
        // Check the availability of the Push logo image on the Home page
        availableImage("Home", "ent logo", "ent Logo", homePageOR.img_ENT_logo);
    }
    public void Verify_hdr_photos() {
        // Check the availability of the header photos link on the Home page
        availableElement("Home", "Header", "photos", homePageOR.lnk_hdr_photos);
    }

    public void Verify_hdr_videos() {
        // Check the availability of the header videos link on the Home page
        availableElement("Home", "Header", "videos", homePageOR.lnk_hdr_videos);
    }

    public void Verify_hdr_Articles() {
        // Check the availability of the header Articles link on the Home page
        availableElement("Home", "Header", "Articles", homePageOR.lnk_hdr_articles);
    }
    public void Verify_hdr_shows() {
        // Check the availability of the header shows link on the Home page
        availableElement("Home", "Header", "shows", homePageOR.lnk_hdr_shows);
    }
    public void Verify_hdr_schedule() {
        // Check the availability of the header Schedule link on the Home page
        availableElement("Home", "Header", "Schedule", homePageOR.lnk_hdr_schedule);
    }
    public void Verify_hdr_kapailya() {
        // Check the availability of the header Schedule link on the Home page
        availableElement("Home", "Header", "kapailya", homePageOR.lnk_hdr_kapamilya);
    }
    public void Verify_hdr_getTickets() {
        // Check the availability of the header Get tickets link on the Home page
        availableElement("Home", "Header", "Get tickets", homePageOR.lnk_hdr_gettickets);
    }
    public void Verify_hdr_Search() {
        // Check the availability of the header Search on the Home page
        availableElement("Home", "Header", "Search", homePageOR.lnk_hdr_search);
    }

    // This method navigates to the "Photos" section of the website.
    public void Navigate_To_photos(){
        // Clicks on the "Photos" header link located on the home page.
        clickElement("Home","photos header",homePageOR.lnk_hdr_photos);

        // Compares the expected URL with the actual URL of the current page.
        String expURL="https://qa-ent-web.abs-cbn.com/photos";
        String actURL=driver.getCurrentUrl();
        if(expURL.equals(actURL)){
            // If the URLs match, print a message indicating that the page has been successfully navigated to.
            System.out.println("Navigated to Photos section page");

            // Use JavascriptExecutor to scroll down the page to reveal more content.
            JavascriptExecutor js=(JavascriptExecutor)driver;
            js.executeScript("window.scrollBy(0,800)","");
            js.executeScript("window.scrollBy(0,1200)","");
            js.executeScript("window.scrollBy(0,2000)","");
        }else {
            // If the URLs do not match, use the Assert library to fail the test and print an error message.
            Assert.assertEquals(actURL,expURL,"unable to navigate to Photos section page");
        }
    }

    public void Navigate_To_Videos() {
        // Click on the "videos" link in the Freshscoops header
        clickElement("Home", "videos header", homePageOR.lnk_hdr_videos);

        // Define the expected URL for the videos section page
        String expURL = "https://qa-ent-web.abs-cbn.com/videos";
        // Get the current URL
        String actURL = driver.getCurrentUrl();

        // Compare the expected URL with the actual URL
        if (expURL.equals(actURL)) {
            System.out.println("Navigated to videos section page");

            // Scroll the window to specific positions using JavaScriptExecutor
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,800)","");
            js.executeScript("window.scrollBy(0,1200)","");
            js.executeScript("window.scrollBy(0,2000)","");
        } else {
            Assert.assertEquals(actURL, expURL, "Unable to navigate to videos section page");
        }
    }

    public void Navigate_To_Articles() {
        // Click on the "Articles" link in the header
        clickElement("Home", "articles header", homePageOR.lnk_hdr_articles);

        // Define the expected URL for the Articles section page
        String expURL = "https://qa-push-web.abs-cbn.com/videos";
        // Get the current URL
        String actURL = driver.getCurrentUrl();

        // Compare the expected URL with the actual URL
        if (expURL.equals(actURL)) {
            System.out.println("Navigated to Videos section page");

            // Scroll the window to specific positions using JavaScriptExecutor
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,800)","");
            js.executeScript("window.scrollBy(0,1200)","");
            js.executeScript("window.scrollBy(0,2000)","");
        } else {
            Assert.assertEquals(actURL, expURL, "Unable to navigate to Videos section page");
        }
    }

    public void Verify_ent_logo_fun() {

        // Check the availability of the Push logo image on the Home page
        availableImage("Home", "ent logo", "ent Logo", homePageOR.img_ENT_logo);
        // Click on the "ent logo"in the header
        clickElement("Home", "articles header", homePageOR.img_ENT_logo);
    }
    public void verify_first_thumb() {

        // Check the availability of the first thumbnail in the Home page
        availableElement("Home", "Carousel", "Slide show thumbnail", homePageOR.img_first_firstthumb);
    }

    public void Verify_img_slideshow() {

        // Check the availability of the slide show thumbnail in the carousel on the Home page
        availableImage("Home", "Carousel", "Slide show thumbnail", homePageOR.img_slideshow);
    }

    public void Verify_slideshow_item1k() {

         // Check the availability of the slide show items in the carousel on the Home page
        availableElement("Home", "Carousel", "Slide show item1", homePageOR.img_first_slideitem1);
    }
    public void Verify_socialMediaIcons() {

        // Check the availability of the Social media icons in the carousel on the Home page
        availableElement("Home", "Carousel", "facebook", homePageOR.btn_social_fb);
        availableElement("Home", "Carousel", "twitter", homePageOR.btn_social_twitter);
        availableElement("Home", "Carousel", "viber", homePageOR.btn_social_viber);
    }

    public void Verify_upcoming_section() {

        // Check the availability of the upcoming section on the Home page
        availableElement("Home", "upcoming", "upcoming section", homePageOR.txt_upcomingshows);
    }

    public void Verify_upcoming_thumbnail() {

        // Check the availability of the articles with thumbnails in the upcoming section on the Home page
        availableImage("Home", "upcoming", "Article with thumbnail", homePageOR.img_firstimage);
    }

    public void Verify_popular_section() {

        // Check the availability of the popular section on the Home page
        availableElement("Home", "popular", "popular section", homePageOR.txt_popular);
    }

    public void Verify_Articlebutton_popular() {

        // Check the availability of the "article" button in the popular section on the Home page
        availableElement("Home", "popular", "article button", homePageOR.btn_popular_article);
    }
    public void Verify_FirstArticle_popular() {

        // Check the availability of the "article" button in the popular section on the Home page
        availableImage("Home", "popular", "First Article", homePageOR.img_frst_popular);
    }
    public void Verify_SeeMoreArticles_popular() {
        // Check the availability of the "See more" button in the popular section on the Home page
        availableElement("Home", "popular", "See more", homePageOR.btn_Popular_seemore);
    }
    public void Verify_SeeMoreArticles_popular_fun() {
        // Click "See more" button in popular section in "Articls" field on the Home page
        clickElement("Home", "See more button", homePageOR.btn_Popular_seemore);

        // Get the current URL of the web page
        String actURL = driver.getCurrentUrl();

        // Define the expected URL
        String expURL = "https://qa-ent-web.abs-cbn.com/latest-articles";

        // Check if the actual URL matches the expected URL
        if (actURL.equals(expURL)) {
            System.out.println("See more articles Functionality is working as expected");
        } else {
            // If the URLs don't match, fail the test and provide an error message
            Assert.assertEquals(actURL,expURL,"See more articles functionality not working as expected");
        }

    }
    public void Verify_Photosbutton_popular() {
        // Check the availability of the "photos" button in the popular section on the Home page
        availableElement("Home", "popular", "photos button", homePageOR.btn_popular_photos);
    }
    public void Verify_Photosbutton_popular_fun() {
        // Click the "photos" button in the popular section on the home page
        clickElement("Home", "photos button", homePageOR.btn_popular_photos);
    }
    public void Verify_FirstPhoto_popular() {

        // Check the availability of the "first photo"in the photos of popular section on the Home page
        availableImage("Home", "popular", "First photo", homePageOR.img_frst_popular);
    }
    public void Verify_SeeMorePhotos_popular_fun() {
        // Click "See more" button in popular section in "photos" field on the Home page
        clickElement("Home", "See more button", homePageOR.btn_Popular_seemore);

        // Get the current URL of the web page
        String actURL = driver.getCurrentUrl();

        // Define the expected URL
        String expURL = "https://qa-ent-web.abs-cbn.com/photos";

        // Check if the actual URL matches the expected URL
        if (actURL.equals(expURL)) {
            System.out.println("See more photos Functionality is working as expected");
        } else {
            // If the URLs don't match, fail the test and provide an error message
            Assert.assertEquals(actURL,expURL,"See more photos functionality not working as expected");
        }

    }

    public void Verify_Videosbutton_popular() {
        // Check the availability of the "videos" button in the popular section on the Home page
        availableElement("Home", "popular", "videos button", homePageOR.btn_popular_videos);
    }
    public void Verify_Videossbutton_popular_fun() {
        // Click the "videos" button in the popular section on the home page
        clickElement("Home", "videos button", homePageOR.btn_popular_videos);
    }
    public void Verify_Firstvideo_popular() {

        // Check the availability of the "first video"in the videos of popular section on the Home page
        availableImage("Home", "popular", "First video", homePageOR.img_frst_popular);
    }
    public void Verify_SeeMoreVideos_popular_fun() {
        // Click "See more" button in popular section in "videos" field on the Home page
        clickElement("Home", "See more button", homePageOR.btn_Popular_seemore);

        // Get the current URL of the web page
        String actURL = driver.getCurrentUrl();

        // Define the expected URL
        String expURL = "https://qa-ent-web.abs-cbn.com/videos";

        // Check if the actual URL matches the expected URL
        if (actURL.equals(expURL)) {
            System.out.println("See more videos Functionality is working as expected");
        } else {
            // If the URLs don't match, fail the test and provide an error message
            Assert.assertEquals(actURL,expURL,"See more videos functionality not working as expected");
        }

    }

    public void Verify_KapamilyaChat() {
        // Check the availability of the "KapamilyaChat" section on the Home page
        availableElement("Home", "KapamilyaChat", "KapamilyaChat", homePageOR.txt_kapamilyachat);
    }
    public void Verify_KapamilyaChat_seeMore() {
        // Check the availability of the "SeeMore" link in kapamilya chat section on the Home page
        availableElement("Home", "KapamilyaChat", "SeeMore", homePageOR.lnk_kampalia_seemore);
    }
    public void Verify_KapamilyaChat_firstThumb() {
        // Check the availability of the "first thumb"  in kapamilya chat section on the Home page
        availableImage("Home", "KapamilyaChat", "firstThumb", homePageOR.img_first_Kampalia);
    }
    public void Verify_KapamilyaChat_watchNowBtn() {
        // Check the availability of the "Watch Now Button"  in kapamilya chat section on the Home page
        availableElement("Home", "KapamilyaChat", "Watch Now Button", homePageOR.btn_watchnow);
    }
    public void Verify_KapamilyaChat_firstSlideItem() {
        // Check the availability of the "first slide item"  in kapamilya chat section on the Home page
        availableElement("Home", "KapamilyaChat", "slide item", homePageOR.img_kapamilya_slideitem1);
    }
    public void Verify_ExclusiveVideos_section() {
        // Check the availability of the "Exclusive videos" section on the Home page
        availableElement("Home", "Exclusive videos", "Exclusive videos", homePageOR.txt_exclisivevideos);
    }
    public void Verify_ExclusiveVideos_firstVideo() {
        // Check the availability of the "first video" in the "Exclusive videos" section on the Home page
        availableElement("Home", "Exclusive videos", "First video", homePageOR.lnk_frstexclusive);
    }
    public void Verify_ExclusiveVideos_seeMore() {
        // Check the availability of the "See more" button in the "Exclusive videos" section on the Home page
        availableElement("Home", "Exclusive videos", "see more", homePageOR.btn_seemoreexclusive);
    }
    public void Verify_Latest_Section() {
        // Check the availability of  "Latest" section on the Home page
        availableElement("Home", "Latest", "Latest", homePageOR.txt_latest);
    }
    public void Verify_Latest_Article() {
        // Check the availability of the "Article" button in the "Latest" section on the Home page
        availableElement("Home", "Latest", "Article", homePageOR.btn_latest_article);
    }
    public void Verify_Latest_SeeMore() {
        // Check the availability of the "Videos" button in the "Latest" section on the Home page
        availableElement("Home", "Latest", "See more", homePageOR.btn_latest_seemore);
    }
    public void Verify_Latest_Article_fun() {
        // Check the functionality of the "Article" button in the "Latest" section on the Home page
        clickElement("Home", "Article button", homePageOR.btn_latest_article);
    }
    public void Verify_SeeMore_Latest_fun() {
        // Click "See more" button in Latest section in "Article" field on the Home page
        clickElement("Home", "See more button", homePageOR.btn_latest_seemore);

        // Get the current URL of the web page
        String actURL = driver.getCurrentUrl();

        // Define the expected URL
        String expURL = "https://qa-ent-web.abs-cbn.com/latest-articles";

        // Check if the actual URL matches the expected URL
        if (actURL.equals(expURL)) {
            System.out.println("See more Articles Functionality is working as expected");
        } else {
            // If the URLs don't match, fail the test and provide an error message
            Assert.assertEquals(actURL,expURL,"See more Articles functionality not working as expected");
        }

    }

    public void Verify_Latest_Photos() {
        // Check the availability of the "Photos" button in the "Latest" section on the Home page
        availableElement("Home", "Latest", "Photos", homePageOR.btn_latest_photos);
    }
    public void Verify_Latest_Photos_fun() {
        // Check the functionality of the "Photos" button in the "Latest" section on the Home page
        clickElement("Home", "Photos button", homePageOR.btn_latest_photos);
    }
    public void Verify_SeeMorePhotos_Latest_fun() {
        // Click "See more" button in Latest section in "Photos" field on the Home page
        clickElement("Home", "See more button", homePageOR.btn_latest_seemore);

        // Get the current URL of the web page
        String actURL = driver.getCurrentUrl();

        // Define the expected URL
        String expURL = "https://qa-ent-web.abs-cbn.com/photos";

        // Check if the actual URL matches the expected URL
        if (actURL.equals(expURL)) {
            System.out.println("See more PhotosFunctionality is working as expected");
        } else {
            // If the URLs don't match, fail the test and provide an error message
            Assert.assertEquals(actURL,expURL,"See more Photos functionality not working as expected");
        }

    }
    public void Verify_Latest_Videos() {
        // Check the availability of the "Videos" button in the "Latest" section on the Home page
        availableElement("Home", "Latest", "Videos", homePageOR.btn_latest_videos);
    }
        public void Verify_Latest_Videos_fun() {
            // Check the functionality of the "Videos" button in the "Latest" section on the Home page
            clickElement("Home", "Photos button", homePageOR.btn_latest_videos);
        }
    public void Verify_SeeMoreVideos_Latest_fun() {
        // Click "See more" button in Latest section in "Videos" field on the Home page
        clickElement("Home", "See more button", homePageOR.btn_latest_seemore);

        // Get the current URL of the web page
        String actURL = driver.getCurrentUrl();

        // Define the expected URL
        String expURL = "https://qa-ent-web.abs-cbn.com/videos";

        // Check if the actual URL matches the expected URL
        if (actURL.equals(expURL)) {
            System.out.println("See more Videos Functionality is working as expected");
        } else {
            // If the URLs don't match, fail the test and provide an error message
            Assert.assertEquals(actURL,expURL,"See more Videos functionality not working as expected");
        }

    }
    public void Verify_PushLogo() {
        // Check the availability of the "Push" Logo on the Home page
        availableImage("Home", "Push", "Push Logo", homePageOR.img_pushlogo);
    }
    public void Verify_First_Push() {
        // Check the availability of the "First Videos" thumb the Home page
        availableImage("Home", "Latest", "First thumb", homePageOR.img_first_push);
    }
    public void Verify_VisitPush() {
        // Check the availability of the "Visit Push" Button in Push section on the Home page
        availableElement("Home", "Latest", "Visit Push", homePageOR.btn_visitpush);
    }
    public void Verify_VisitPush_fun() {
        // Click "Visit Push" button in Push section on the Home page
        clickElement("Home", "Visit push", homePageOR.btn_visitpush);

        // Get the current URL of the web page
        String actURL = driver.getCurrentUrl();

        // Define the expected URL
        String expURL = "https://push.abs-cbn.com/";

        // Check if the actual URL matches the expected URL
        if (actURL.equals(expURL)) {
            System.out.println("Visit Push Functionality is working as expected");
        } else {
            // If the URLs don't match, fail the test and provide an error message
            Assert.assertEquals(actURL,expURL,"Vish Push functionality not working as expected");
        }

    }

    public void Verify_iWTFC() {
        // Check the availability of the "iWTFC" Logo on the Home page
        availableImage("Home", "iWTFC", "iWTFC Logo", homePageOR.img_iWTFC_logo);
    }
    public void Verify_FirstVideo_iWTFC() {
        // Check the availability of the "First iWTFC" Thumb in iWTFC section on the Home page
        availableImage("Home", "iWTFC", "First iWTFC", homePageOR.img_first_iWTFC);
    }
    public void     Verify_VisitiWTFC() {
        // Check the availability of the "Visit iWTFC" button in iWTFC section on the Home page
        availableElement("Home", "iWTFC", "iWTFC button", homePageOR.btn_visitIWTFC);
    }
    public void Verify_VisitiWTFC_fun() {
        // Click "Visit iWTFC" button in iWTFC section on the Home page
        clickElement("Home", "Visit iWTFC", homePageOR.btn_visitIWTFC);

        // Get the current URL of the web page
        String actURL = driver.getCurrentUrl();

        // Define the expected URL
        String expURL = "https://www.iwanttfc.com/#!/";

        // Check if the actual URL matches the expected URL
        if (actURL.equals(expURL)) {
            System.out.println("Visit iWTFC Functionality is working as expected");
        } else {
            // If the URLs don't match, fail the test and provide an error message
            Assert.assertEquals(actURL,expURL,"Visit iWTFC functionality not working as expected");
        }

    }
    public void Verify_Footer_SocialLinks() {
        // Check the availability of the "FB" icon in footer section on the Home page
        availableElement("Home", "Footer", "FB", homePageOR.lnk_footer_fb);

        // Check the availability of the "insta" icon in footer section on the Home page
        availableElement("Home", "Footer", "Insta", homePageOR.lnk_footer_insta);

        // Check the availability of the "Twitter" icon in footer section on the Home page
        availableElement("Home", "Footer", "Twitter", homePageOR.lnk_footer_tweet);

        // Check the availability of the "YouTube" icon on the Home page
        availableElement("Home", "Footer", "YouTube", homePageOR.lnk_footer_youtube);

        // Check the availability of the "Tiktok" icon in footer section on the Home page
        availableElement("Home", "Footer", "YouTube", homePageOR.lnk_footer_youtube);
    }

    public void Verify_Social_follow_fun() throws InterruptedException {
        // Create a SoftAssert object to accumulate assertions
        SoftAssert softAssert = new SoftAssert();

        // Create a list to store the social follow icons
        List socialfollow = new ArrayList();
        socialfollow.add(homePageOR.lnk_footer_fb);
        socialfollow.add(homePageOR.lnk_footer_insta);
        socialfollow.add(homePageOR.lnk_footer_tweet);
        socialfollow.add(homePageOR.lnk_footer_youtube);
        socialfollow.add(homePageOR.lnk_footer_tiktok);

        // Create a list to store the corresponding expected social media titles
        List socialtitle = new ArrayList();
        socialtitle.add("https://www.facebook.com/ABSCBNnetwork");
        socialtitle.add("https://www.instagram.com/abscbn/");
        socialtitle.add("https://twitter.com/ABSCBN");
        socialtitle.add("https://www.youtube.com/user/ABSCBNOnline");
        socialtitle.add("https://www.tiktok.com/");

        // Iterate over the social follow icons
        for (int i = 0; i < socialfollow.size(); i++) {
            // Click on the current social follow icon
            clickElement("Home", "Social Follow icons", (WebElement) socialfollow.get(i));

            // Switch to the new window or tab that opened
            switchwindow();

            // Get the title of the current web page
            String actURL = driver.getCurrentUrl();

            // Get the expected social media title corresponding to the current social follow icon
            String expURL = socialtitle.get(i).toString();
            System.out.println("Title: " + actURL);

            // Check if the expected social media title contains the actual title
            if (expURL.contains(actURL)) {
                getScreenshot();
                System.out.println(actURL + " functionality is working as expected");
            } else {
                getScreenshot();
                // If the titles don't match, accumulate the assertion error without failing the test immediately
                softAssert.assertEquals(actURL, expURL, "Functionality not working as expected");
            }

            // Close the current window or tab
            driver.close();

            // Switch back to the parent window or tab
            driver.switchTo().window(Parent);

            // Pause execution for 5000 milliseconds (5 seconds)
            Thread.sleep(5000);
        }

        // Perform all accumulated assertions and fail the test if any of the assertions failed
        softAssert.assertAll();
    }
    public void Verify_Footer_Aboutlnk() {
        // Check the availability of the "Abount" Link in footer section on the Home page
        availableElement("Home", "Footer", "About", homePageOR.lnk_footer_about);
    }
    public void Verify_Footer_PrivacyPolicy() {
        // Check the availability of the "Privacy Policy" Link in footer section on the Home page
        availableElement("Home", "Footer", "Privacy Policy", homePageOR.lnk_footer_privacy);
    }
    public void Verify_Footer_TermsOfUse() {
        // Check the availability of the "Terms Of Use" Link in footer section on the Home page
        availableElement("Home", "Footer", "Privacy Policy", homePageOR.lnk_footer_terms);
    }
    public void Verify_Footer_Contacts() {
        // Check the availability of the "Contacts" Link in footer section on the Home page
        availableElement("Home", "Footer", "Contacts", homePageOR.lnk_footer_contact);
    }
    public void Verify_Footer_Advertise() {
        // Check the availability of the "Advertise with us" Link in footer section on the Home page
        availableElement("Home", "Footer", "Advertise with us", homePageOR.lnk_footer_advertise);
    }
    public void Verify_Footer_Careers() {
        // Check the availability of the "Careers" Link in footer section on the Home page
        availableElement("Home", "Footer", "Careers", homePageOR.lnk_footer_careers);
    }
    public void Verify_hdr_link_fun() {
        // Create a SoftAssert object to accumulate assertions
        SoftAssert softAssert=new SoftAssert();

        // Create a list to store the header links
        List hdrlinks = new ArrayList();
        hdrlinks.add(homePageOR.lnk_hdr_shows);
        hdrlinks.add(homePageOR.lnk_hdr_schedule);
        hdrlinks.add(homePageOR.lnk_hdr_photos);
        hdrlinks.add(homePageOR.lnk_hdr_videos);
        hdrlinks.add(homePageOR.lnk_hdr_articles);
        hdrlinks.add(homePageOR.lnk_hdr_kapamilya);
        hdrlinks.add(homePageOR.lnk_hdr_gettickets);

        // Create a list to store the corresponding expected URLs
        List hdrURL = new ArrayList();
        hdrURL.add("https://qa-ent-web.abs-cbn.com/shows");
        hdrURL.add("https://qa-ent-web.abs-cbn.com/schedule");
        hdrURL.add("https://qa-ent-web.abs-cbn.com/photos");
        hdrURL.add("https://qa-ent-web.abs-cbn.com/videos");
        hdrURL.add("https://qa-ent-web.abs-cbn.com/latest-articles");
        hdrURL.add("https://qa-ent-web.abs-cbn.com/kapamilya");
        hdrURL.add("https://qa-ent-web.abs-cbn.com/get-tickets");

        // Iterate over the header links
        for (int i = 0; i < hdrlinks.size(); i++) {
            // Click on the current header link
            clickElement("Home", "Header links", (WebElement) hdrlinks.get(i));

            // Get the current URL of the web page
            String actURL= driver.getCurrentUrl();

            // Get the expected URL corresponding to the current header link
            String expURL=hdrURL.get(i).toString();

            // Check if the actual URL matches the expected URL
            if (actURL.equals(expURL)) {
                System.out.println(actURL + " Section page Functionality is working as expected");
            } else {
                // If the URLs don't match, accumulate the assertion error without failing the test immediately
                softAssert.assertEquals(actURL,expURL,"Section page functionality not working as expected");
            }

            // Click on the "Push Logo" element on the section page to return to the "Home" page
            clickElement("Section ", "Logo", homePageOR.img_ENT_logo);
        }

        // Perform all accumulated assertions and fail the test if any of the assertions failed
        softAssert.assertAll();
    }
    public void Verify_ftr_link_fun() throws InterruptedException {
        // Create a SoftAssert object to accumulate assertions
        SoftAssert softAssert = new SoftAssert();

        // Create a list to store the footer links
        List ftrlinks = new ArrayList();
        ftrlinks.add(homePageOR.lnk_footer_about);
        ftrlinks.add(homePageOR.lnk_footer_privacy);
        ftrlinks.add(homePageOR.lnk_footer_terms);
        ftrlinks.add(homePageOR.lnk_footer_contact);
        ftrlinks.add(homePageOR.lnk_footer_advertise);
        ftrlinks.add(homePageOR.lnk_footer_careers);

        // Create a list to store the corresponding expected URLs
        List ftrURL = new ArrayList();
        ftrURL.add("https://www.abs-cbn.com/about-us");
        ftrURL.add("https://www.abs-cbn.com/privacy");
        ftrURL.add("https://www.abs-cbn.com/terms?screen=terms");
        ftrURL.add("https://ent.abs-cbn.com/contact-us");
        ftrURL.add("https://www.abs-cbn.com/");
        ftrURL.add("https://www.abs-cbn.com/careers");


        // Iterate over the footer links
        for (int i = 0; i < ftrlinks.size(); i++) {
            // Click on the current footer link
            clickElement("Home", "Footer links", (WebElement) ftrlinks.get(i));

            // Get the current URL of the web page
            String actURL = driver.getCurrentUrl();

            // Get the expected URL corresponding to the current footer link
            String expURL = ftrURL.get(i).toString();

            // Check if the actual URL matches the expected URL
            if (actURL.equals(expURL)) {
                System.out.println(actURL + " Section page Functionality is working as expected");
            } else {
                // If the URLs don't match, accumulate the assertion error without failing the test immediately
                softAssert.assertEquals(actURL, expURL, "Section page functionality not working as expected");
            }

            // Navigate back to the previous page
            driver.navigate().back();

            // Pause execution for 5000 milliseconds (5 seconds)
            Thread.sleep(5000);
        }

        // Perform all accumulated assertions and fail the test if any of the assertions failed
        softAssert.assertAll();
    }

    public void verify_photos_hdrLink_fun(){
        // Click on the current footer link
        clickElement("Home", "photos", homePageOR.lnk_hdr_photos);
    }

    public void verify_article_hdrLink_fun(){
        // Click on the current footer link
        clickElement("Home", "article", homePageOR.lnk_hdr_articles);
    }

    public void verify_videos_hdrLink_fun(){
        // Click on the current footer link
        clickElement("Home", "videos", homePageOR.lnk_hdr_videos);
    }

}