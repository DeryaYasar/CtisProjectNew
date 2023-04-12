package com.ctis.pages;

import com.ctis.utilities.Driver;
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

    @FindBy(xpath = "(//div[@class='feed-add-post-buttons'])[1]//button[.='Send']")
    public WebElement sendCommentBtn;

    @FindBy(xpath = "(//a[text()='Unfollow'])[1]")
    public WebElement unfollowBtn;

    @FindBy(xpath = "(//a[text()='Follow'])[1]")
    public WebElement followBtn;

    @FindBy(xpath = "//div[@class='feed-com-text-inner-inner']/div[.='My Test Comment']")
    public WebElement userCommentText;

    @FindBy(xpath = "(//a[@class='feed-post-more-link']/span[.='More'])[1]")
    public WebElement moreBtn;

    @FindBy(xpath = "//span[@class='menu-popup-item blog-comment-popup-menu ']/span[.='Edit']")
    public WebElement Edit;

    @FindBy(xpath = "//span[@class='menu-popup-item blog-comment-popup-menu ']/span[.='Delete']")
    public WebElement Delete;

    @FindBy(xpath = "(//div[@title='Add to favorites'])[1]")
    public WebElement starButton;

    @FindBy(xpath = "//div[@title='Remove from favorites']")
    public WebElement removeStarButton;

    @FindBy(xpath = "//input[@placeholder='search']")
    public WebElement searchInput;

    @FindBy(xpath = "(//span[.='Favorites'])[1]")
    public WebElement favoritesBtn;


}
