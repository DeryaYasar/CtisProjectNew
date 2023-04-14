package com.ctis.pages;

import com.ctis.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InteractionPageElements {

    public InteractionPageElements(){


        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "(//a[@class='bx-ilike-text'])[1]")
    public WebElement likeBtn;

    @FindBy(xpath = "//div[contains(@id, 'bx-ilike-top-users-BLOG_POST')][.='You']")
    public WebElement likeThumb;

    @FindBy(xpath = "//a[text()='Comment']")
    public WebElement addCommentBtn;

    @FindBy(xpath = "(//button[@class='ui-btn ui-btn-sm ui-btn-primary'])[1]")
    public WebElement sendCommentBtn;

    @FindBy(xpath = "(//a[text()='Unfollow'])[1]")
    public WebElement unfollowBtn;

    @FindBy(xpath = "(//a[text()='Follow'])[1]")
    public WebElement followBtn;

    @FindBy(xpath = "//div[@class='feed-com-text-inner-inner']//div[.='My test comment']")
    public WebElement userCommentText;

    @FindBy(xpath = "//div[@class='feed-com-text-inner-inner']//div[.='Edited My test comment']")
    public WebElement userCommentTextEdited;

    @FindBy(xpath = "//div[.='My test comment']/../../../..//div//a[text()='Like']")
    public WebElement likeForMyComment;

    @FindBy(xpath = "//div[.='My test comment']/../../../..//div//a[text()='Reply']")
    public WebElement replyForMyComment;

    @FindBy(xpath = "//div[@id='log_internal_container']/div[@class='feed-wrap']/div[1]/div/div[@class='feed-comments-block']" +
            "/div[3]/div[@class='feed-com-block-outer']//div[@class='feed-post-emoji-container feed-post-emoji-container-nonempty']" +
            "/span[@class='feed-post-emoji-icon-box']//div[@title='Like']")
    public WebElement getLikeForMyComment;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement frame;

    @FindBy (xpath = "//div[text()=', My reply message']")
    public WebElement replyMessageArea;

    @FindBy(xpath = "//span[.='Comment deleted']")
    public WebElement commentDeleted;

    @FindBy(xpath = "(//div[@class='feed-add-post-buttons']/button[.='Send'])[1]")
    public WebElement replySendBtn;

    @FindBy(xpath = "//div[@id='log_internal_container']/div[@class='feed-wrap']" +
            "/div[1]/div/div[@class='feed-comments-block feed-comments-block-editor-shown']" +
            "/div[4]/div/div[@class='feed-com-block-outer']//div[@class='feed-com-text-inner']" +
            "/div[@class='feed-com-text-inner-inner']/div")
    public WebElement replyConfirmation;



    @FindBy(xpath = "//div[@class='feed-com-informers-bottom']/a/span[.='More'][1]")
    public WebElement moreBtn;

    @FindBy(xpath = "//span[contains(@class,'menu-popup-item blog-comment-popup-menu')]//span[@class='menu-popup-item-text'][normalize-space()='Edit']")
    public WebElement edit;

    @FindBy(xpath = "//span[contains(@class,'menu-popup-item blog-comment-popup-menu')]//span[@class='menu-popup-item-text'][normalize-space()='Delete']")
    public WebElement delete;

    @FindBy(xpath = "(//div[@title='Add to favorites'])[1]")
    public WebElement starButton;

    @FindBy(xpath = "//div[@title='Add to favorites']")
    public WebElement removeStarButton;

    @FindBy(xpath = "//input[@placeholder='Filter and search']")
    public WebElement searchInput;

    @FindBy(xpath = "(//span[.='Favorites'])[1]")
    public WebElement favoritesBtn;

    @FindBy (xpath = "//body[@contenteditable]")
    public WebElement commentTextArea;

    public void likeCommand(String username){
        WebElement likeButton =  Driver.getDriver().findElement(By.xpath
                ("(//div//a[text()='" + username + "'])[1]/../../../..//div//a[text()='Like']"));
        likeButton.click();

    }
}
