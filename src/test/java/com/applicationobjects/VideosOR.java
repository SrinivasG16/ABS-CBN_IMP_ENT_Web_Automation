package com.applicationobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VideosOR {

    @FindBy(xpath="//iframe[@id='player-yLH50uaNNlw']")
    public WebElement vdo_main_videoframe;

    @FindBy(xpath="//div[text()='Exclusive Videos']")
    public WebElement txt_mainexcusive_section;

    @FindBy(xpath="//div[@data-testid='text-0']")
    public WebElement lnk_mainexcusive_frst_video;

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


}
