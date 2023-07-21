package com.applicationobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

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

    @FindAll(@FindBy(xpath = "(//div[contains(@class,'MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-6')])[2]//parent::div//div//div//div//div[contains(@class,'MuiGrid-root MuiGrid-grid-xs-12')]"))
    public List<WebElement> lst_photoart_af;

    @FindAll(@FindBy(xpath = "(//div[contains(@class,'MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-6')])[2]//parent::div//div//div//div//div[contains(@class,'MuiGrid-root MuiGrid-grid-xs-12')]"))
    public List<WebElement> lst_phototart_bf;

}
