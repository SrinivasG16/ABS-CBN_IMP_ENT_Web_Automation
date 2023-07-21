package com.applicationobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Article_innerOR {

    @FindBy(xpath="(//div[contains(@class,'MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-md-12')]//parent::div//picture//img)[1]")
    public WebElement img_mainarticle;

    @FindBy(xpath="//button[@aria-label='facebook']//*[name()='svg']")
    public WebElement btn_mainarticle_fb;

    @FindBy(xpath="//button[@aria-label='twitter']//*[name()='svg']//*[name()='path' and contains(@d,'M22.46 6c-')]")
    public WebElement btn_mainarticle_twitter;

    @FindBy(xpath="//*[name()='path' and contains(@d,'M10.7809 0')]")
    public WebElement btn_mainarticle_viber;

    @FindBy(xpath="//div[contains(@class,'MuiBox-root')]//div[text()='Related']")
    public WebElement txt_related_section;

    @FindBy(xpath="(//a[contains(@class,'MuiTypography-root MuiTypography-inherit MuiLink-root MuiLink-underlineNone')]//div//picture//img)[1]")
    public WebElement img_related_frstarticle;



}
