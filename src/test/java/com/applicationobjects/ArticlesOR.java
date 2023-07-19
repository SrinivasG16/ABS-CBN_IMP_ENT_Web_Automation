package com.applicationobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ArticlesOR {
    @FindBy(xpath="//li[@class='slide previous']/a/div/picture/img")
    public WebElement img_mainarticle;

    @FindBy(xpath="(//div[text()='Articles'])[2]")
    public WebElement txt_mainarticle_section;

    @FindBy(xpath="( //button[@aria-label='facebook']//*[name()='svg']//*[name()='path' and contains(@d,'M22 12c0-5')]")
    public WebElement btn_mainarticle_fb;

    @FindBy(xpath="//button[@aria-label='twitter']//*[name()='svg']//*[name()='path' and contains(@d,'M22.46 6c-')]")
    public WebElement btn_mainarticle_twitter;

    @FindBy(xpath="//button[@aria-label='viber']//*[name()='svg']")
    public WebElement btn_mainarticle_viber;

    @FindBy(xpath="//div[text()='We Recommend']")
    public WebElement txt_werecommend_section;

    @FindBy(xpath="(//img[@data-id='image-0'])[1]")
    public WebElement img_werecommend_fstarticle;

    @FindBy(xpath="//div[text()='Popular']")
    public WebElement txt_popular_section;

    @FindBy(xpath="(//img[@data-id='image-0'])[2]")
    public WebElement img_popular_frstarticl;

    @FindBy(xpath="(//button[text()='SEE MORE'])[1]")
    public WebElement btn_popular_seemore;

    @FindBy(xpath="//div[text()='Latest']")
    public WebElement txt_latest_section;

    @FindBy(xpath="(//img[@data-id='image-0'])[3]")
    public WebElement img_latest_frstarticle;

    @FindBy(xpath="(//button[text()='SEE MORE'])[2]")
    public WebElement btn_latest_seemore;

    @FindBy(xpath="//div[text()='Other Articles']")
    public WebElement txt_otherarticles_section;

    @FindBy(xpath="(//img[@data-id='image-0'])[4]")
    public WebElement img_otherarticles_frstarticle;

    @FindBy(xpath="(//button[text()='SEE MORE'])[3]")
    public WebElement btn_otherarticles_seemore;

}
