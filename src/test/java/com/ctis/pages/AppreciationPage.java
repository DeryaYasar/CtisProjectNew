package com.ctis.pages;

import com.ctis.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppreciationPage {

    public AppreciationPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

             @FindBy(xpath = "//span[.='More'][1]")
             public WebElement moreButton;

             @FindBy(xpath = "//span[.='Appreciation'][1]")
             public WebElement appreciationButton;

              //iframe var, stepdefte switch to kullan
              //body[@contenteditable='true']
              @FindBy(xpath = "//div[@class='bxhtmled-area-cnt']//iframe")
              public WebElement contentField;

            @FindBy(xpath = "//span[@class='feed-add-post-del-but']")
            public WebElement deleteAllEmployees;

             @FindBy(xpath = "//a[.='Add persons, groups or department']")
             public WebElement addPersonOrGroupsOrDepartmnt;

             //sendKeys helpdesk22@cybertekschool.com
             @FindBy(xpath = "//input[@id='feed-add-post-destination-input']")
             public WebElement addingPersonVsField;

            /* @FindBy(xpath = "//span[@class='popup-window-close-icon']")
             public WebElement closePersonField;
             */

             @FindBy(xpath = "//span[@class='feed-add-grat-box feed-add-grat-medal-thumbsup']")
             public WebElement stickerButton;

             @FindBy(xpath = "//span[@title='Gift']")
             public WebElement giftSticker;

             @FindBy(xpath = "//a[.='Add employees']")
             public WebElement addEmployees;

             //sendKeys helpdesk22@cybertekschool.com
             @FindBy(xpath = "//input[@id='feed-add-post-grat-input']")
             public WebElement addRecipient;

             @FindBy(xpath = "//button[@id='blog-submit-button-save']")
             public WebElement sendButton;

             //div[@id='blg-post-380']
             //activity stream yazısının altındaki alanı locate et dersek??
             @FindBy(xpath = "//div[@class='feed-post-text-block-inner-inner']")
             public WebElement resultInActivityStream;

             //AC2
             @FindBy(xpath = "//span[.='All employees']")
             public WebElement allEmployesText;

             @FindBy(xpath = "//div[.='Gurhan']")
             public WebElement gurhanUser;














}
