package com.applicationpages;

import com.applicationobjects.DirtyLinenOR;
import com.applicationobjects.HomePageOR;
import com.genericmethods.GenericMethods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DirtyLinen extends GenericMethods {

    private static DirtyLinenOR dirtyLinenOR;

    private static DirtyLinen dirtyLinen;

    private DirtyLinen() {
        // Print a message to the console
        System.out.println("Creating object for Dirty Linen");
    }

    // This method returns an instance of the HomePage class
    public static DirtyLinen getInstance() {
        // Set homePage to null initially
        dirtyLinen = null;

        // Check if homePage is null
        if (dirtyLinen == null) {
            // If it is, create a new instance of HomePage
            dirtyLinen = new DirtyLinen();

            // Initialize homePageOR using PageFactory and the driver
            dirtyLinenOR = PageFactory.initElements(driver, DirtyLinenOR.class);
        }

        // Return the instance of HomePage
        return dirtyLinen;
    }
    public void Verify_dirtylinen() {
        // Move to the "Morescoops" button on the Home page
        moveToElement("Dirty linen", "Morescoops", dirtyLinenOR.lnk_hdr_shows);

        // Click on the first radio button in the Entertainment section carousel on the Home page
        clickElement("Home", "First radio button", dirtyLinenOR.lnk_dirtylinen);

        String actURL = driver.getCurrentUrl();

        // Define the expected URL
        String expURL = "https://qa-ent-web.abs-cbn.com/dirtylinen";

        // Check if the actual URL matches the expected URL
        if (actURL.equals(expURL)) {
            System.out.println("Dirty linen page navigation is working as expected");
        } else {
            // If the URLs don't match, fail the test and provide an error message
            Assert.assertEquals(actURL,expURL,"Dirty linen page navigation is not working as expected");
        }

    }
    public void Verify_DirtyLinen_HeroCorousel() {
        // Check the availability of the Push logo image on the Home page
        availableImage("Dirty Linen", "Main article", "Hero carousel", dirtyLinenOR.img_dirtylinen_mainart);
    }

    public void Verify_DirtyLinen_HeroThumb() {
        // Check the availability of the Push logo image on the Home page
        availableImage("Dirty Linen", "Main article", "Hero thumb", dirtyLinenOR.img_dirtylinen_mainthumb);
    }
    public void Verify_DirtyLinen_SocialShareLinks() {
        // Check the availability of the Push logo image on the Home page
        // Check the availability of the Push logo image on the Home page
        availableElement("Dirty Linen", "Main article", "fb", dirtyLinenOR.btn_dirtlinen_mainarticle_fb);

        // Check the availability of the Push logo image on the Home page
        availableElement("Dirty Linen", "Main article", "twitter", dirtyLinenOR.btn_dirtlinen_mainarticle_twitter);

        // Check the availability of the Push logo image on the Home page
        availableElement("Articels", "Main article", "viber", dirtyLinenOR.btn_dirtlinen_mainarticle_viber);
    }
    public void Verify_Home_SubHeader() {
        // Check the availability of the Push logo image on the Home page
        availableElement("Dirty Linen", "Sub header", "Home", dirtyLinenOR.btn_dirtlinen_home);
    }

    public void Verify_About_SubHeader() {
        // Check the availability of the Push logo image on the Home page
        availableElement("Dirty Linen", "Sub header", "About", dirtyLinenOR.btn_dirtlinen_about);
    }

    public void Verify_Photos_SubHeader() {
        // Check the availability of the Push logo image on the Home page
        availableElement("Dirty Linen", "Sub header", "Photos", dirtyLinenOR.btn_dirtlinen_photos);
    }

    public void Verify_Videos_SubHeader() {
        // Check the availability of the Push logo image on the Home page
        availableElement("Dirty Linen", "Sub header", "Videos", dirtyLinenOR.btn_dirtlinen_videos);
    }

    public void Verify_Articles_SubHeader() {
        // Check the availability of the Push logo image on the Home page
        availableElement("Dirty Linen", "Sub header", "Articles", dirtyLinenOR.btn_dirtlinen_article);
    }

    public void Verify_Live_SubHeader() {
        // Check the availability of the Push logo image on the Home page
        availableElement("Dirty Linen", "Sub header", "Live", dirtyLinenOR.btn_dirtlinen_live);
    }

    public void Verify_About_Section() {
        // Check the availability of the Push logo image on the Home page
        availableElement("Dirty Linen", "About", "About", dirtyLinenOR.txt_about_section);
    }

    public void Verify_Popular_Section() {
        // Check the availability of the Push logo image on the Home page
        availableElement("Dirty Linen", "Popular", "Popular", dirtyLinenOR.txt_popular);
    }

    public void Verify_Articles_Popular() {
        // Check the availability of the Push logo image on the Home page
        availableElement("Dirty Linen", "Popular", "Article", dirtyLinenOR.btn_popular_article);
    }

    public void Verify_Photos_Popular() {
        // Check the availability of the Push logo image on the Home page
        availableElement("Dirty Linen", "Popular", "Photos", dirtyLinenOR.btn_popular_photos);
    }

    public void Verify_Videos_Popular() {
        // Check the availability of the Push logo image on the Home page
        availableElement("Dirty Linen", "Popular", "Videos", dirtyLinenOR.btn_popular_videos);
    }

    public void Verify_Popular_FirstThumb() {
        // Check the availability of the Push logo image on the Home page
        availableImage("Dirty Linen", "Popular", "First thumb", dirtyLinenOR.img_frst_popular);
    }
    public void Verify_Popular_SeeMore() {
        // Check the availability of the Push logo image on the Home page
        availableElement("Dirty Linen", "Popular", "See More", dirtyLinenOR.btn_Popular_seemore);
    }

    public void Verify_Latest_Section() {
        // Check the availability of the Push logo image on the Home page
        availableElement("Dirty Linen", "Latest", "Latest", dirtyLinenOR.txt_latest);
    }

    public void Verify_Latest_Article() {
        // Check the availability of the Push logo image on the Home page
        availableElement("Dirty Linen", "Latest", "Article", dirtyLinenOR.btn_latest_article);
    }

    public void Verify_Latest_Photos() {
        // Check the availability of the Push logo image on the Home page
        availableElement("Dirty Linen", "Latest", "Photos", dirtyLinenOR.btn_latest_photos);
    }

    public void Verify_Latest_Videos() {
        // Check the availability of the Push logo image on the Home page
        availableElement("Dirty Linen", "Latest", "Videos", dirtyLinenOR.btn_latest_videos);
    }

    public void Verify_Latest_FirstThumb() {
        // Check the availability of the Push logo image on the Home page
        availableImage("Dirty Linen", "Latest", "First thumb", dirtyLinenOR.img_first_latest);
    }

    public void Verify_Latest_SeeMore() {
        // Check the availability of the Push logo image on the Home page
        availableElement("Dirty Linen", "Latest", "See More", dirtyLinenOR.btn_latest_seemore);
    }

    public void Verify_About_SubHeader_fun() {
        // Click on the "ent logo"in the header
        clickElement("Dirty linen", "about", dirtyLinenOR.btn_dirtlinen_about);

        // Define the expected URL for the Articles section page
        String expURL = "https://qa-ent-web.abs-cbn.com/shows-about";
        // Get the current URL
        String actURL = driver.getCurrentUrl();

        // Compare the expected URL with the actual URL
        if (expURL.equals(actURL)) {
            System.out.println("Navigated to Shows About page");

            // Scroll the window to specific positions using JavaScriptExecutor
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,800)","");
            js.executeScript("window.scrollBy(0,1200)","");
            js.executeScript("window.scrollBy(0,2000)","");
        } else {
            Assert.assertEquals(actURL, expURL, "Unable to navigate to Shows About page");
        }
    }
    public void Verify_Photos_SubHeader_fun() {
        // Click on the "ent logo"in the header
        clickElement("Dirty linen", "Photos", dirtyLinenOR.btn_dirtlinen_photos);

        // Define the expected URL for the Articles section page
        String expURL = "https://qa-ent-web.abs-cbn.com/shows-photos";
        // Get the current URL
        String actURL = driver.getCurrentUrl();

        // Compare the expected URL with the actual URL
        if (expURL.equals(actURL)) {
            System.out.println("Navigated to Shows Photos page");

            // Scroll the window to specific positions using JavaScriptExecutor
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,800)","");
            js.executeScript("window.scrollBy(0,1200)","");
            js.executeScript("window.scrollBy(0,2000)","");
        } else {
            Assert.assertEquals(actURL, expURL, "Unable to navigate to Shows Photos page");
        }
    }

    public void Verify_Videos_SubHeader_fun() {
        // Click on the "ent logo"in the header
        clickElement("Dirty linen", "Photos", dirtyLinenOR.btn_dirtlinen_videos);

        // Define the expected URL for the Articles section page
        String expURL = "https://qa-ent-web.abs-cbn.com/shows-videos";
        // Get the current URL
        String actURL = driver.getCurrentUrl();

        // Compare the expected URL with the actual URL
        if (expURL.equals(actURL)) {
            System.out.println("Navigated to Shows Videos page");

            // Scroll the window to specific positions using JavaScriptExecutor
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,800)","");
            js.executeScript("window.scrollBy(0,1200)","");
            js.executeScript("window.scrollBy(0,2000)","");
        } else {
            Assert.assertEquals(actURL, expURL, "Unable to navigate to Shows Videos page");
        }
    }
    public void Verify_Article_SubHeader_fun() {
        // Click on the "ent logo"in the header
        clickElement("Dirty linen", "Photos", dirtyLinenOR.btn_dirtlinen_videos);

        // Define the expected URL for the Articles section page
        String expURL = "https://qa-ent-web.abs-cbn.com/shows-article";
        // Get the current URL
        String actURL = driver.getCurrentUrl();

        // Compare the expected URL with the actual URL
        if (expURL.equals(actURL)) {
            System.out.println("Navigated to Shows Article page");

            // Scroll the window to specific positions using JavaScriptExecutor
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,800)","");
            js.executeScript("window.scrollBy(0,1200)","");
            js.executeScript("window.scrollBy(0,2000)","");
        } else {
            Assert.assertEquals(actURL, expURL, "Unable to navigate to Shows Article page");
        }
    }

    public void Verify_Live_SubHeader_fun() {
        // Click on the "ent logo"in the header
        clickElement("Dirty linen", "Photos", dirtyLinenOR.btn_dirtlinen_videos);

        // Define the expected URL for the Articles section page
        String expURL = "https://qa-ent-web.abs-cbn.com/shows-article";
        // Get the current URL
        String actURL = driver.getCurrentUrl();

        // Compare the expected URL with the actual URL
        if (expURL.equals(actURL)) {
            System.out.println("Navigated to Shows Live page");

            // Scroll the window to specific positions using JavaScriptExecutor
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,800)","");
            js.executeScript("window.scrollBy(0,1200)","");
            js.executeScript("window.scrollBy(0,2000)","");
        } else {
            Assert.assertEquals(actURL, expURL, "Unable to navigate to Shows Live page");
        }
    }
    public void Verify_PopularSeeMore_fun() throws InterruptedException {
        // Retrieves the count of articles before clicking on "More Photos" button
        int artCount_bf = dirtyLinenOR.lst_popularart_bf.size();
        System.out.println("Before : " + artCount_bf);

        // Clicks on the "See More" button
        clickElement("Dirty linen", "See more", dirtyLinenOR.btn_Popular_seemore);
        Thread.sleep(2000);

        // Retrieves the count of articles after clicking on "See More" button
        int artCount_af = dirtyLinenOR.lst_popularart_af.size();
        System.out.println("After : " + artCount_af);

        if (artCount_af != artCount_bf) {
            System.out.println("See More button functionality working as expected");
        } else {
            Assert.assertNotEquals(artCount_af, artCount_bf, "See More button functionality not working as expected");
        }
    }
    public void Verify_LatestSeeMore_fun() throws InterruptedException {
        // Retrieves the count of articles before clicking on "More Photos" button
        int artCount_bf = dirtyLinenOR.lst_latestart_bf.size();
        System.out.println("Before : " + artCount_bf);

        // Clicks on the "See More" button
        clickElement("Dirty linen", "See more", dirtyLinenOR.btn_latest_seemore);
        Thread.sleep(2000);

        // Retrieves the count of articles after clicking on "See More" button
        int artCount_af = dirtyLinenOR.lst_latestart_af.size();
        System.out.println("After : " + artCount_af);

        if (artCount_af != artCount_bf) {
            System.out.println("See More button functionality working as expected");
        } else {
            Assert.assertNotEquals(artCount_af, artCount_bf, "See More button functionality not working as expected");
        }
    }

}


