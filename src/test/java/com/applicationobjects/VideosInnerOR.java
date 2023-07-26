package com.applicationobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VideosInnerOR {

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

    @FindBy(xpath="//button[@aria-label='facebook']//*[name()='svg']")
    public WebElement btn_mainvideo_fb;

    @FindBy(xpath="//button[@aria-label='twitter']//*[name()='svg']//*[name()='path' and contains(@d,'M22.46 6c-')]")
    public WebElement btn_mainvideo_twitter;

    @FindBy(xpath="//*[name()='path' and contains(@d,'M10.7809 0')]")
    public WebElement btn_mainavideo_viber;

    @FindBy(xpath="//div[contains(@class,'MuiBox-root')]//div//picture/img")
    public WebElement img_mainavideo_img;

    @FindBy(xpath="(//a[contains(@class,'MuiTypography-root MuiTypography-inherit MuiLink-root MuiLink-underlineNone')]//div//picture//img)[1]")
    public WebElement img_related_frstvideo;

    @FindBy(xpath="//div[contains(@class,'MuiBox-root')]//div[text()='Related']")
    public WebElement txt_relatedvideo_section;



}
