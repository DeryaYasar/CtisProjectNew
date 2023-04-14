package com.ctis.pages;

import com.ctis.utilities.BrowserUtils;
import com.ctis.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadFilesPicturesMessage {

    public UploadFilesPicturesMessage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "feed-add-post-form-tab-message")
    public WebElement messagetab;

    @FindBy(id = "bx-b-uploadfile-blogPostForm")
    public WebElement UploadFilesImage;

    @FindBy(xpath = "//input[@multiple='multiple']")
    public WebElement UploadFilesAndImagesBox;

    @FindBy(id = "blog-submit-button-save")
    public WebElement SendButtonn;


    public void setUploadFilesImage(){
        UploadFilesImage.click();
        UploadFilesAndImagesBox.click();
    }


    @FindBy(xpath = "//div[text()='Files:']")
    public WebElement filesdisplayed;

    @FindBy(xpath = "//div[text()='Photo:']")
    public WebElement photodisplayed;

    @FindBy(xpath = "//span[text()='Insert in text']")
    public WebElement insert;

    @FindBy(xpath = "(//span[@class='insert-btn'])[2]")
    public WebElement insert2;

    @FindBy(xpath = "//div[@class='feed-post-text-block-inner-inner']")
    public WebElement messageBody;

    @FindBy(xpath = "//span[@class='del-but']")
    public WebElement removeButtonn;

    @FindBy(xpath = "//span[@class='files-name-edit-btn']")
    public WebElement renameButtonn;

    @FindBy(xpath = "//img[@class='files-preview']")
    public WebElement renameImage;

    @FindBy(xpath = "//input[@class='files-name-edit-inp']")
    public WebElement rename1;


    public void uploaddifferentformatPhotoFiles1(){


        UploadFilesAndImagesBox.sendKeys("/Users/suhedapehlivan/Desktop/ctisSoluions Project/files/Locators_Summary.pdf");
        BrowserUtils.sleep(4);
        UploadFilesAndImagesBox.sendKeys("/Users/suhedapehlivan/Desktop/ctisSoluions Project/files/thestarrynight-vangogh.jpg");
        BrowserUtils.sleep(4);
        UploadFilesAndImagesBox.sendKeys("/Users/suhedapehlivan/Desktop/ctisSoluions Project/files/gitgithub.txt");
        BrowserUtils.sleep(3);
    }

    public void uploaddifferentformatPhotoFiles2(){

        UploadFilesAndImagesBox.sendKeys("/Users/suhedapehlivan/Desktop/ctisSoluions Project/files/git_githubinterview.docx");
        BrowserUtils.sleep(4);
        UploadFilesAndImagesBox.sendKeys("/Users/suhedapehlivan/Desktop/ctisSoluions Project/files/Vermeer-thegirlwiththepearlearrings.png");
        BrowserUtils.sleep(4);
        UploadFilesAndImagesBox.sendKeys("/Users/suhedapehlivan/Desktop/ctisSoluions Project/files/edvardmunch-scream.gif");
        BrowserUtils.sleep(3);

    }


    public void uploaddifferentformatPhoto3(){

        UploadFilesAndImagesBox.sendKeys("/Users/suhedapehlivan/Desktop/ctisSoluions Project/files/edvardmunch-scream.gif");
        BrowserUtils.sleep(4);
        UploadFilesAndImagesBox.sendKeys("/Users/suhedapehlivan/Desktop/ctisSoluions Project/files/Vermeer-thegirlwiththepearlearrings.png");
        BrowserUtils.sleep(5);
        UploadFilesAndImagesBox.sendKeys("/Users/suhedapehlivan/Desktop/ctisSoluions Project/files/fikretmualla-cannes.jpg");
        BrowserUtils.sleep(5);

    }

    public void insertingPhotoFiles4(){

        UploadFilesAndImagesBox.sendKeys("/Users/suhedapehlivan/Desktop/ctisSoluions Project/files/thestarrynight-vangogh.jpg");
        BrowserUtils.sleep(3);

    }

    public void inserting(){

        insert.click();
        BrowserUtils.sleep(2);
        insert2.click();
        BrowserUtils.sleep(2);

    }

    public void renameMethd(){

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(renameImage).perform();
        renameImage.click();
        renameButtonn.click();
        BrowserUtils.sleep(2);
        rename1.sendKeys(Keys.chord(Keys.COMMAND,"a")+Keys.CLEAR);
        BrowserUtils.sleep(2);
        rename1.sendKeys("githubRename");
        BrowserUtils.sleep(2);


    }


}
