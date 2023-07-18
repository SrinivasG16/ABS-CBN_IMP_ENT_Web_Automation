package com.testcases;

import com.applicationpages.HomePage;
import com.genericmethods.GenericMethods;
import io.qameta.allure.Description;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC_01_Verify_HomePage_UI extends GenericMethods {

    HomePage homePage;

    @Description("Launching the browser")
    @Test(priority =0)
    public void launchbrowser() throws InterruptedException {
        launchBrowser();
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }

    @Description("Verification for availability of ENT logo on the home page")
    @Test(priority =1)
    public void verify_ent_logo() throws InterruptedException {
        homePage=HomePage.getInstance();
        homePage.Verify_ent_logo();
    }

    @Description("Verification for availability of Articles header link on the home page")
    @Test(priority =2)
    public void verify_articles_hdr() throws InterruptedException {
        homePage.Verify_hdr_Articles();
    }

    @Description("Verification for availability of Photos header link on the home page")
    @Test(priority =3)
    public void verify_photos_hdr() throws InterruptedException {
        homePage.Verify_hdr_photos();
    }

    @Description("Verification for availability of videos header link on the home page")
    @Test(priority =4)
    public void verify_videos_hdr() throws InterruptedException {
        homePage.Verify_hdr_videos();
    }

    @Description("Verification for availability of shows header link on the home page")
    @Test(priority =5)
    public void verify_Shows() throws InterruptedException {
        homePage.Verify_hdr_shows();
    }

    @Description("Verification for availability of Schedule header link the home page")
    @Test(priority =6)
    public void verify_Schedule() throws InterruptedException {
        homePage.Verify_hdr_schedule();
    }
    @Description("Verification for availability of kapamilya header link the home page")
    @Test(priority =7)
    public void verify_Kapamilya() throws InterruptedException {
        homePage.Verify_hdr_kapailya();
    }
    @Description("Verification for availability of get tickets header link the home page")
    @Test(priority =8)
    public void verify_getTickets() throws InterruptedException {
        homePage.Verify_hdr_getTickets();
    }
    @Description("Verification for availability of Search header button the home page")
    @Test(priority =9)
    public void verify_search() throws InterruptedException {
        homePage.Verify_hdr_Search();
    }
    @Description("Verification for availability of first thumbnail on the home page")
    @Test(priority =10)
    public void verify_firstThumb() throws InterruptedException {
        homePage.verify_first_thumb();
    }
    @Description("Verification for availability slide show thumbnail in the carousel on the Home page")
    @Test(priority =11)
    public void verify_slideshowImage() throws InterruptedException {
        homePage.Verify_img_slideshow();
    }
    @Description("Verification for availability slide show thumbnail in the carousel on the Home page")
    @Test(priority =12)
    public void verify_slideshowItems() throws InterruptedException {
        homePage.Verify_slideshow_item1k();
    }
    @Description("Verification for availability of Social media icons in the carousel on the Home page")
    @Test(priority =13)
    public void verify_socialMediaIcons() throws InterruptedException {
        homePage.Verify_socialMediaIcons();
    }
    @Description("Verification for availability of upcoming section on the Home page")
    @Test(priority =14)
    public void verify_UpcomingSection() throws InterruptedException {
        homePage.Verify_upcoming_section();
    }
    @Description("Verification for availability of upcoming section on the Home page")
    @Test(priority =15)
    public void verify_upcomingThumb() throws InterruptedException {
        homePage.Verify_upcoming_thumbnail();
    }
    @Description("Verification for availability of upcoming section on the Home page")
    @Test(priority =15)
    public void verify_popularSection() throws InterruptedException {
        homePage.Verify_popular_section();
    }
    @Description("Verification for availability of upcoming section on the Home page")
    @Test(priority =15)
    public void verify_Articlebtn_popularSection() throws InterruptedException {
        homePage.Verify_Articlebutton_popular();
    }
    @Description("Verification for availability of upcoming section on the Home page")
    @Test(priority =15)
    public void verify_FirstArticle_popularSection() throws InterruptedException {
        homePage.Verify_FirstArticle_popular();
    }
    @Description("Verification for availability of upcoming section on the Home page")
    @Test(priority =15)
    public void verify_SeeMoreArticle_popularSection() throws InterruptedException {
        homePage.Verify_SeeMoreArticles_popular();
    }
    @Description("Verification for availability of upcoming section on the Home page")
    @Test(priority =15)
    public void verify_PhotosButton_popularSection() throws InterruptedException {
        homePage.Verify_Photosbutton_popular();
    }
    @Description("Verification for availability of upcoming section on the Home page")
    @Test(priority =15)
    public void verify_FirstPhoto_popularSection() throws InterruptedException {
        homePage.Verify_FirstPhoto_popular();
    }
    @Description("Verification for availability of upcoming section on the Home page")
    @Test(priority =15)
    public void verify_Video_popularSection() throws InterruptedException {
        homePage.Verify_Videosbutton_popular();
    }
    @Description("Verification for availability of upcoming section on the Home page")
    @Test(priority =15)
    public void verify_FirstVideo_popularSection() throws InterruptedException {
        homePage.Verify_Firstvideo_popular();
    }
    @Description("Verification for availability of upcoming section on the Home page")
    @Test(priority =15)
    public void verify_kapamilyaChatSection() throws InterruptedException {
        homePage.Verify_KapamilyaChat();
    }
    @Description("Verification for availability of upcoming section on the Home page")
    @Test(priority =15)
    public void verify_SeeMore_kapamilyaChatSection() throws InterruptedException {
        homePage.Verify_KapamilyaChat_seeMore();
    }
    @Description("Verification for availability of upcoming section on the Home page")
    @Test(priority =15)
    public void verify_firstThumb_kapamilyaChatSection() throws InterruptedException {
        homePage.Verify_KapamilyaChat_firstThumb();
    }
    @Description("Verification for availability of upcoming section on the Home page")
    @Test(priority =15)
    public void verify_watchNow_kapamilyaChatSection() throws InterruptedException {
        homePage.Verify_KapamilyaChat_watchNowBtn();
    }
    @Description("Verification for availability of upcoming section on the Home page")
    @Test(priority =15)
    public void verify_firstslide_kapamilyaChatSection() throws InterruptedException {
        homePage.Verify_KapamilyaChat_firstSlideItem();
    }
    @Description("Verification for availability of upcoming section on the Home page")
    @Test(priority =15)
    public void verify_ExclusiveVideos() throws InterruptedException {
        homePage.Verify_ExclusiveVideos_section();
    }
    @Description("Verification for availability of upcoming section on the Home page")
    @Test(priority =15)
    public void verify_First_ExclusiveVideos() throws InterruptedException {
        homePage.Verify_ExclusiveVideos_firstVideo();
    }
    @Description("Verification for availability of upcoming section on the Home page")
    @Test(priority =15)
    public void verify_SeeMore_ExclusiveVideos() throws InterruptedException {
        homePage.Verify_ExclusiveVideos_seeMore();
    }
    @Description("Verification for availability of upcoming section on the Home page")
    @Test(priority =15)
    public void verify_LatestSection() throws InterruptedException {
        homePage.Verify_Latest_Section();
    }
    @Description("Verification for availability of upcoming section on the Home page")
    @Test(priority =15)
    public void verify_Article_LatestSection() throws InterruptedException {
        homePage.Verify_Latest_Article();
    }
    @Description("Verification for availability of upcoming section on the Home page")
    @Test(priority =15)
    public void verify_SeeMore_LatestSection() throws InterruptedException {
        homePage.Verify_Latest_SeeMore();
    }
    @Description("Verification for availability of upcoming section on the Home page")
    @Test(priority =15)
    public void verify_photos_LatestSection() throws InterruptedException {
        homePage.Verify_Latest_Photos();
    }
    @Description("Verification for availability of upcoming section on the Home page")
    @Test(priority =15)
    public void verify_videos_LatestSection() throws InterruptedException {
        homePage.Verify_Latest_Videos();
    }
    @Description("Verification for availability of upcoming section on the Home page")
    @Test(priority =15)
    public void verify_PushLogo() throws InterruptedException {
        homePage.Verify_PushLogo();
    }
    @Description("Verification for availability of upcoming section on the Home page")
    @Test(priority =15)
    public void verify_Forst_Push() throws InterruptedException {
        homePage.Verify_First_Push();
    }
    @Description("Verification for availability of upcoming section on the Home page")
    @Test(priority =15)
    public void verify_VisitPush() throws InterruptedException {
        homePage.Verify_VisitPush();
    }
    @Description("Verification for availability of upcoming section on the Home page")
    @Test(priority =15)
    public void verify_iWTFC() throws InterruptedException {
        homePage.Verify_iWTFC();
    }
    @Description("Verification for availability of upcoming section on the Home page")
    @Test(priority =15)
    public void verify_First_iWTFC() throws InterruptedException {
        homePage.Verify_FirstVideo_iWTFC();
    }
    @Description("Verification for availability of upcoming section on the Home page")
    @Test(priority =15)
    public void verify_VisitiWTFC_iWTFC() throws InterruptedException {
        homePage.Verify_VisitiWTFC();
    }
    @Description("Verification for availability of upcoming section on the Home page")
    @Test(priority =15)
    public void verify_Socialmedia_footer() throws InterruptedException {
        homePage.Verify_Footer_SocialLinks();
    }
    @Description("Verification for availability of upcoming section on the Home page")
    @Test(priority =15)
    public void verify_About_footer() throws InterruptedException {
        homePage.Verify_Footer_Aboutlnk();
    }
    @Description("Verification for availability of upcoming section on the Home page")
    @Test(priority =15)
    public void verify_privacyPolicy_footer() throws InterruptedException {
        homePage.Verify_Footer_PrivacyPolicy();
    }
    @Description("Verification for availability of upcoming section on the Home page")
    @Test(priority =15)
    public void verify_TermsOfUse_footer() throws InterruptedException {
        homePage.Verify_Footer_TermsOfUse();
    }
    @Description("Verification for availability of upcoming section on the Home page")
    @Test(priority =15)
    public void verify_Contacts_footer() throws InterruptedException {
        homePage.Verify_Footer_Contacts();
    }
    @Description("Verification for availability of upcoming section on the Home page")
    @Test(priority =15)
    public void verify_Careers_footer() throws InterruptedException {
        homePage.Verify_Footer_Careers();
    }

}
