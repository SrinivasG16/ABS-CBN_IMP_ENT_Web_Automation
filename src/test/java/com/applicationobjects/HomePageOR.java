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
    public WebElement lnk_hdr_schedule;

    @FindBy(xpath="//div[contains(text(),'Photos')]")
    public WebElement lnk_hdr_photos;

    @FindBy(xpath="//div[text()='Videos']")
    public WebElement lnk_hdr_videos;

    @FindBy(xpath="//div[contains(text(),'Articles')]")
    public WebElement lnk_hdr_articles;

    @FindBy(xpath="//div[text()='Kapamilya']")
    public WebElement lnk_hdr_kapamilya;

    @FindBy(xpath="//div[contains(text(),'Get Tickets')]")
    public WebElement lnk_hdr_gettickets;

    @FindBy(xpath="//button[@aria-label='search']")
    public WebElement lnk_hdr_search;

    @FindBy(xpath="(//img[@data-id='image-undefined'])[1]")
    public WebElement img_first_firstthumb;

    @FindBy(xpath="//div[@class='carousel-root']")
    public WebElement img_slideshow;

    @FindBy(xpath="(//li[@class='thumb'])[1]")
    public WebElement img_first_slideitem1;

    @FindBy(xpath="(//button[@class='react-share__ShareButton'])[1]")
    public WebElement btn_social_fb;

    @FindBy(xpath="(//button[@class='react-share__ShareButton'])[2]")
    public WebElement btn_social_twitter;

    @FindBy(xpath="(//button[@class='react-share__ShareButton'])[3]")
    public WebElement btn_social_viber;

    @FindBy(xpath="//div[text()='Upcoming Shows']")
    public WebElement txt_upcomingshows;

    @FindBy(xpath="(//div[contains(@class,'jss17 MuiBox-root css')]//img[@data-id='image-undefined'])[1]")
    public WebElement img_firstimage;

    @FindBy(xpath="//div[text()='Popular']")
    public WebElement txt_popular;

    @FindBy(xpath="//div[text()='Article']]")
    public WebElement btn_popular_article;

    @FindBy(xpath="(//div[text()='Photos'])[2]")
    public WebElement btn_popular_photos;

    @FindBy(xpath="(//div[text()='Videos'])[2]")
    public WebElement btn_popular_videos;

    @FindBy(xpath="(//img[@data-id='image-0'])[1]")
    public WebElement img_frst_popular;

    @FindBy(xpath="(//button[text()='SEE MORE'])[1]")
    public WebElement btn_Popular_seemore;

    @FindBy(xpath="(//div[text()='Kapamilya Chat'])[1]")
    public WebElement txt_kapamilyachat;

    @FindBy(xpath="//a[text()='See More']")
    public WebElement lnk_kampalia_seemore;

    @FindBy(xpath="(//img[@alt='PAWS relief alts'])[1]")
    public WebElement img_first_Kampalia;

    @FindBy(xpath="//button[normalize-space()='Watch Now']")
    public WebElement btn_watchnow;

    @FindBy(xpath="//button[normalize-space()='Watch Now']")
    public WebElement img_kapamilya_slideitem1;

    @FindBy(xpath="//div[text()='Exclusive Videos']")
    public WebElement txt_exclisivevideos;

    @FindBy(xpath="//div[@data-testid='text-0']")
    public WebElement lnk_frstexclusive;

    @FindBy(xpath="(//button[text()='SEE MORE'])[2]")
    public WebElement btn_seemoreexclusive;

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
    public WebElement btn_latest_seemore;

    @FindBy(xpath="//img[@alt='PUSH']")
    public WebElement img_pushlogo;

    @FindBy(xpath="(//img[@data-id='image-0'])[5]")
    public WebElement img_first_push;

    @FindBy(xpath="//button[text()='VISIT PUSH']")
    public WebElement btn_visitpush;

    @FindBy(xpath="//*[name()='path' and contains(@fill,'url(#c)')]")
    public WebElement img_iWTFC_logo;

    @FindBy(xpath="(//img[@data-id='image-0'])[6]")
    public WebElement img_first_iWTFC;

    @FindBy(xpath="//button[text()='VISIT IWTFC']")
    public WebElement btn_visitIWTFC;

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
    public WebElement lnk_footer_about;

    @FindBy(xpath="//div[text()='Privacy policy']")
    public WebElement lnk_footer_privacy;

    @FindBy(xpath="//div[text()='Terms of Use']")
    public WebElement lnk_footer_terms;

    @FindBy(xpath="//div[text()='Contacts']")
    public WebElement lnk_footer_contact;

    @FindBy(xpath="//div[text()='Advertise with us']")
    public WebElement lnk_footer_advertise;

    @FindBy(xpath="//div[text()='Careers']")
    public WebElement lnk_footer_careers;






































































}
