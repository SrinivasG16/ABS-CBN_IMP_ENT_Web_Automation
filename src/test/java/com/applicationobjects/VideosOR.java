package com.applicationobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class VideosOR {

    @FindBy(xpath="//iframe[@id='player-yLH50uaNNlw']")
    public WebElement vdo_main_videoframe;

    @FindBy(xpath="//button[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']")
    public WebElement btn_playvideo;

    @FindBy(xpath="//video[@class='video-stream html5-main-video']")
    public WebElement vdo_playingvideo;

    @FindBy(xpath="//span[@class='ytp-time-current']")
    public WebElement txt_video_playtime;

    @FindBy(xpath="//button[@class='ytp-play-button ytp-button']")
    public WebElement btn_ytvideo_playPause;

    @FindBy(xpath="//button[@class='ytp-mute-button ytp-button']")
    public WebElement btn_ytvideo_vol;

    @FindBy(xpath="//button[@class='ytp-fullscreen-button ytp-button']")
    public WebElement btn_ytvideo_max;

    @FindBy(xpath="//div[text()='Exclusive Videos']")
    public WebElement txt_mainexcusive_section;

    @FindBy(xpath="//div[@data-testid='text-0']")
    public WebElement lnk_mainexcusive_frst_video;

    @FindBy(xpath="//button[normalize-space()='#']")
    public WebElement btn_mainvideo_hashtag;

    @FindBy(xpath="(//button[text()='SEE MORE'])[1]")
    public WebElement btn_mainexcusive_seeMore;

    @FindBy(xpath="//button[@aria-label='facebook']//*[name()='svg']")
    public WebElement btn_mainvideo_fb;

    @FindBy(xpath="//button[@aria-label='twitter']//*[name()='svg']//*[name()='path' and contains(@d,'M22.46 6c-')]")
    public WebElement btn_mainvideo_twitter;

    @FindBy(xpath="//*[name()='path' and contains(@d,'M10.7809 0')]")
    public WebElement btn_mainvideo_viber;

    @FindBy(xpath="//div[text()='Hotshot']")
    public WebElement txt_hotshot_section;

    @FindBy(xpath="(//img[@data-id='image-0'])[2]")
    public WebElement img_hotshot_frstvideo;

    @FindBy(xpath="(//div[text()='Videos'])[2]")
    public WebElement txt_videos_section;

    @FindBy(xpath="(//img[@data-id='image-0'])[3]")
    public WebElement img_videos_frstvideo;

    @FindBy(xpath="(//button[text()='SEE MORE'])[2]")
    public WebElement btn_videos_seemore;

    @FindBy(xpath="//*[name()='path' and contains(@fill,'url(#c)')]")
    public WebElement img_iWTFC_Logo;

    @FindBy(xpath="//img[@alt='PAWS relief alts']")
    public WebElement img_iWTFC_frstvideo;

    @FindBy(xpath="//button[normalize-space()='VISIT IWTFC']")
    public WebElement btn_iWTFC_visitiwtfc;

    @FindAll(@FindBy(xpath = "(//div[contains(@class,'MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-6 css-sayu3r')])[1]//parent::div//div//div//div//div[contains(@class,'MuiGrid-root MuiGrid-grid-xs-12')]"))
    public List<WebElement> lst_videoart_af;

    @FindAll(@FindBy(xpath = "(//div[contains(@class,'MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-6 css-sayu3r')])[1]//parent::div//div//div//div//div[contains(@class,'MuiGrid-root MuiGrid-grid-xs-12')]"))
    public List<WebElement> lst_videoart_bf;


}
