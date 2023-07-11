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

    @FindBy(xpath="//div[@class='MuiBox-root css-18biwo'][normalize-space()='Videos']")
    public WebElement lnk_hdr_Videos;

    @FindBy(xpath="//div[contains(text(),'Articles')]")
    public WebElement lnk_hdr_Articles;

    @FindBy(xpath="//div[@class='MuiBox-root css-18biwo'][normalize-space()='Kapamilya']")
    public WebElement lnk_hdr_Kapamilya;

    @FindBy(xpath="//div[contains(text(),'Get Tickets')]")
    public WebElement lnk_hdr_GetTickets;

    @FindBy(xpath="//li[@aria-label='slide item 1']//div[@class='MuiBox-root css-0']//li//div]")
    public WebElement img_first_slideitem1;

    @FindBy(xpath="//li[@aria-label='slide item 1']//div[@class='MuiBox-root css-0']//li//div]")
    public WebElement img_slideShow;

//    @FindBy(xpath="//li[@aria-label='slide item 1']//div[@class='MuiBox-root css-0']//li//div]")
//    public WebElement img_slideShow;




















}
