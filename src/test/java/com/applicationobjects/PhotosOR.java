package com.applicationobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PhotosOR {
    @FindBy(xpath="(//div[text()='Photos'])[2]")
    public WebElement txt_Mainphotos_section;

    @FindBy(xpath="//li[@class='slide previous']/div/div/picture/img")
    public WebElement img_mainarticle;

    @FindBy(xpath="//div[text()='We Recommend']")
    public WebElement txt_werecommend;

    @FindBy(xpath="(//img[@data-id='image-0'])[1]")
    public WebElement img_frst_werecommend;

    @FindBy(xpath="(//div[text()='Photos'])[3]")
    public WebElement txt_photos_section;

    @FindBy(xpath="(//img[@data-id='image-0'])[2]")
    public WebElement img_frst_photos;

    @FindBy(xpath="//button[text()='SEE MORE']")
    public WebElement btn_seemore_photos;


}
