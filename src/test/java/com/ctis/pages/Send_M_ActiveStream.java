package com.ctis.pages;

import com.ctis.utilities.Driver;
import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Send_M_ActiveStream {
    public Send_M_ActiveStream()
    {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//span[text()='Message']")
    public WebElement MessBtn;

    @FindBy(xpath = "//div[@class='bxhtmled-area-cnt']//iframe")
    public WebElement MssField;

    @FindBy(id="feed-add-post-destination-input")
    public WebElement PersChoose;

    @FindBy(xpath = "//span[@id=\"feed-add-post-destination-item\"]/span")
    public WebElement AllEmpBtnn;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement SendingBtnn;

   // @FindBy(id="blog_post_body_551")
   // public WebElement AddingMes;

    @FindBy(xpath = "//span[@class='feed-add-info-text']")
    public WebElement TitleMess;

    @FindBy(xpath = "//span[text()='All employees']")
    public WebElement AllEmpDef;

    @FindBy(xpath = "//span[@class='feed-add-info-text']")
    public WebElement AtLeastErrMess;

    @FindBy(id="blog-submit-button-cancel")
    public WebElement CanclBtnn;

}
