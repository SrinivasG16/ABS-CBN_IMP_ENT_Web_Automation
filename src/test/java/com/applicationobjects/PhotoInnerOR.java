package com.applicationobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PhotoInnerOR {

    @FindBy(xpath="//li[@class='slide previous']/a/div/picture/img")
    public WebElement img_mainphotoarticle;

    @FindBy(xpath="//button[@aria-label='facebook']//*[name()='svg']")
    public WebElement btn_mainphoto_fb;

    @FindBy(xpath="//button[@aria-label='twitter']//*[name()='svg']//*[name()='path' and contains(@d,'M22.46 6c-')]")
    public WebElement btn_mainphoto_twitter;

    @FindBy(xpath="//*[name()='path' and contains(@d,'M10.7809 0')]")
    public WebElement btn_mainphoto_viber;

    @FindBy(xpath="//div[contains(@class,'MuiBox-root')]//div//picture/img")
    public WebElement img_mainphoto_thumb;

    @FindBy(xpath="//div[contains(@class,'MuiBox-root')]//div[text()='Related']")
    public WebElement txt_related_section;

    @FindBy(xpath="(//a[contains(@class,'MuiTypography-root MuiTypography-inherit MuiLink-root MuiLink-underlineNone')]//div//picture//img)[1]")
    public WebElement img_related_frstphoto;



}
