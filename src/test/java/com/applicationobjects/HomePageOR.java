package com.applicationobjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePageOR {

    @FindBy(xpath="//*[name()='rect' and contains(@x,'38.2539')]")
    public WebElement img_ENT_logo;

    @FindBy(xpath="//div[text()='Shows']")
    public WebElement lnk_hdr_shows;

    @FindBy(xpath="//div[contains(text(),'Schedule')]")
    public WebElement lnk_hdr_Schedule;

    @FindBy(xpath="//div[contains(text(),'Photos')]")
    public WebElement lnk_hdr_Photos;

    @FindBy(xpath="//div[text()='Videos']")
    public WebElement lnk_hdr_Videos;

    @FindBy(xpath="//div[contains(text(),'Articles')]")
    public WebElement lnk_hdr_Articles;

    @FindBy(xpath="//div[text()='Kapamilya']")
    public WebElement lnk_hdr_Kapamilya;

    @FindBy(xpath="//div[contains(text(),'Get Tickets')]")
    public WebElement lnk_hdr_GetTickets;

    @FindBy(xpath="//li[@aria-label='slide item 1']//div[@class='MuiBox-root css-0']//li//div]")
    public WebElement img_first_slideitem1;

    @FindBy(xpath="//li[@aria-label='slide item 1']//div[@class='MuiBox-root css-0']//li//div]")
    public WebElement img_slideShow;

    @FindBy(xpath="(//button[@class='react-share__ShareButton'])[1]")
    public WebElement btn_social_FB;

    @FindBy(xpath="(//button[@class='react-share__ShareButton'])[2]")
    public WebElement btn_social_Twitter;

    @FindBy(xpath="(//button[@class='react-share__ShareButton'])[3]")
    public WebElement btn_social_Viber;

    @FindBy(xpath="//div[text()='Upcoming Shows']")
    public WebElement txt_UpcomingShows;

    @FindBy(xpath="(//div[contains(@class,'jss17 MuiBox-root css')]//img[@data-id='image-undefined'])[1]")
    public WebElement img_firstImage;

    @FindBy(xpath="//div[text()='Popular']")
    public WebElement txt_Popular;

    @FindBy(xpath="//div[text()='Article']]")
    public WebElement btn_popular_Article;

    @FindBy(xpath="(//div[text()='Photos'])[2]")
    public WebElement btn_popular_Photos;

    @FindBy(xpath="(//div[text()='Videos'])[2]")
    public WebElement btn_popular_Videos;

    @FindBy(xpath="(//img[@data-id='image-0'])[1]")
    public WebElement img_frst_Popular;

    @FindBy(xpath="(//button[text()='SEE MORE'])[1]")
    public WebElement btn_Popular_SeeMore;

    @FindBy(xpath="(//div[text()='Kapamilya Chat'])[1]")
    public WebElement txt_KapamilyaChat;

    @FindBy(xpath="//a[text()='See More']")
    public WebElement lnk_kampalia_seemore;

    @FindBy(xpath="(//img[@alt='PAWS relief alts'])[1]")
    public WebElement img_first_Kampalia;

    @FindBy(xpath="//button[normalize-space()='Watch Now']")
    public WebElement btn_watchnow;

    @FindBy(xpath="//div[text()='Latest']")
    public WebElement txt_latest;

    @FindBy(xpath="//div[text()='Latest']")
    public WebElement btn_latest_article;

    @FindBy(xpath="(//div[text()='Photos'])[3]")
    public WebElement btn_latest_photos;

    @FindBy(xpath="(//div[text()='Videos'])[3]")
    public WebElement btn_latest_videos;

    @FindBy(xpath="(//img[@data-id='image-0'])[4]")
    public WebElement img_first_latest;

    @FindBy(xpath="((//button[text()='SEE MORE'])[3]")
    public WebElement btn_latest_SeeMore;

    @FindBy(xpath="//img[@alt='PUSH']")
    public WebElement img_PushLogo;

    @FindBy(xpath="(//img[@data-id='image-0'])[5]")
    public WebElement img_first_push;

    @FindBy(xpath="//button[text()='VISIT PUSH']")
    public WebElement btn_VISITPUSH;

    @FindBy(xpath="//*[name()='path' and contains(@fill,'url(#c)')]")
    public WebElement img_iWTFC_Logo;

    @FindBy(xpath="(//img[@data-id='image-0'])[6]")
    public WebElement img_first_iWTFC;

    @FindBy(xpath="//button[text()='VISIT IWTFC']")
    public WebElement btn_VISITIWTFC;

    @FindBy(xpath="//a[@href='https://www.facebook.com/ABSCBNnetwork']//*[name()='svg']")
    public WebElement lnk_footer_fb;

    @FindBy(xpath="//a[@href='https://www.instagram.com/abscbn/']//*[name()='svg']")
    public WebElement lnk_footer_insta;

    @FindBy(xpath="//a[contains(@href,'https://twitter.com/ABSCBN')]")
    public WebElement lnk_footer_tweet;

    @FindBy(xpath="//a[@href='https://www.youtube.com/user/ABSCBNOnline']")
    public WebElement lnk_footer_youtube;

    @FindBy(xpath="//a[@href='https://www.tiktok.com/']")
    public WebElement lnk_footer_tiktok;

    @FindBy(xpath="//div[text()='About']")
    public WebElement lnk_footer_About;

    @FindBy(xpath="//div[text()='Privacy policy']")
    public WebElement lnk_footer_Privacy;

    @FindBy(xpath="//div[text()='Terms of Use']")
    public WebElement lnk_footer_terms;

    @FindBy(xpath="//div[text()='Advertise with us']")
    public WebElement lnk_footer_Advertise;

    @FindBy(xpath="//div[text()='Careers']")
    public WebElement lnk_footer_careers;






































































}
