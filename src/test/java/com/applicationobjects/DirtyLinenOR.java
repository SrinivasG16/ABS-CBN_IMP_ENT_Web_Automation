package com.applicationobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DirtyLinenOR {

    @FindBy(xpath="(//div[contains(@class,'MuiBox-root')]//a[@href='/shows'])[1]")
    public WebElement lnk_hdr_shows;

    @FindBy(xpath="//a[contains(@class,'MuiTypography-root MuiTypography-inherit MuiLink-root MuiLink-underlineNone')]//div[text()='Dirty Linen']")
    public WebElement lnk_dirtylinen;

    @FindBy(xpath="//li[@class='slide previous']/a/div/picture/img")
    public WebElement img_dirtylinen_mainart;

    @FindBy(xpath="//li[@aria-label='slide item 1']")
    public WebElement img_dirtylinen_mainthumb;

    @FindBy(xpath="//button[@aria-label='facebook']//*[name()='svg']//*[name()='path' and contains(@d,'M22 12c0-5')]")
    public WebElement btn_dirtlinen_mainarticle_fb;

    @FindBy(xpath="//button[@aria-label='twitter']//*[name()='svg']//*[name()='path' and contains(@d,'M22.46 6c-')]")
    public WebElement btn_dirtlinen_mainarticle_twitter;

    @FindBy(xpath="//button[@aria-label='viber']//*[name()='svg']")
    public WebElement btn_dirtlinen_mainarticle_viber;

    @FindBy(xpath="(//div[contains(@class,'MuiBox-root')]//div[text()='Home'])[2]")
    public WebElement btn_dirtlinen_home;

    @FindBy(xpath="//a[@href='/shows-about']")
    public WebElement btn_dirtlinen_about;

    @FindBy(xpath="//a[@href='/shows-photos']")
    public WebElement btn_dirtlinen_photos;

    @FindBy(xpath="//a[@href='/shows-videos']")
    public WebElement btn_dirtlinen_videos;

    @FindBy(xpath="//a[@href='/shows-article']")
    public WebElement btn_dirtlinen_article;

    @FindBy(xpath="//a[@href='/shows-live']")
    public WebElement btn_dirtlinen_live;

    @FindBy(xpath="(//div[text()='About'])[2]")
    public WebElement txt_about_section;

    @FindBy(xpath="//div[text()='Popular']")
    public WebElement txt_popular;

    @FindBy(xpath="(//div[text()='Article'])[2]")
    public WebElement btn_popular_article;

    @FindBy(xpath="(//div[text()='Photos'])[3]")
    public WebElement btn_popular_photos;

    @FindBy(xpath="(//div[text()='Videos'])[3]")
    public WebElement btn_popular_videos;

    @FindBy(xpath="(//img[@data-id='image-0'])[1]")
    public WebElement img_frst_popular;

    @FindBy(xpath="(//button[text()='SEE MORE'])[1]")
    public WebElement btn_Popular_seemore;

    @FindBy(xpath="//div[text()='Latest']")
    public WebElement txt_latest;

    @FindBy(xpath="(//div[text()='Article'])[3]")
    public WebElement btn_latest_article;

    @FindBy(xpath="(//div[text()='Photos'])[4]")
    public WebElement btn_latest_photos;

    @FindBy(xpath="(//div[text()='Videos'])[4]")
    public WebElement btn_latest_videos;

    @FindBy(xpath="(//img[@data-id='image-0'])[2]")
    public WebElement img_first_latest;

    @FindBy(xpath="(//button[text()='SEE MORE'])[2]")
    public WebElement btn_latest_seemore;

    @FindAll(@FindBy(xpath = "(//div[contains(@class,'MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-3')])[1]//parent::div//div//div[contains(@class,'MuiGrid-root MuiGrid-container')]"))
    public List<WebElement> lst_popularart_af;

    @FindAll(@FindBy(xpath = "(//div[contains(@class,'MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-3')])[1]//parent::div//div//div[contains(@class,'MuiGrid-root MuiGrid-container')]"))
    public List<WebElement> lst_popularart_bf;

    @FindAll(@FindBy(xpath = "(//div[contains(@class,'MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-3')])[2]//parent::div//div//div[contains(@class,'MuiGrid-root MuiGrid-container')]"))
    public List<WebElement> lst_latestart_af;

    @FindAll(@FindBy(xpath = "(//div[contains(@class,'MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-3')])[2]//parent::div//div//div[contains(@class,'MuiGrid-root MuiGrid-container')]"))
    public List<WebElement> lst_latestart_bf;

}
