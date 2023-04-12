package com.ctis.pages;

import com.ctis.utilities.Driver;
import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InteractionsInMessageMenu {

    public InteractionsInMessageMenu (){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[.='Message'])[2]")
    public WebElement messageButton;

    @FindBy (xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement messageIframe;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement messageArea;

    @FindBy(id = "bx-b-mention-blogPostForm")
    public WebElement addMentionButton;

    @FindBy(xpath = "//div[contains(text(),'Gurhan')]")
    public WebElement gurhan;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendButton;

    @FindBy(xpath = "(//span[@class='feed-add-post-destination-cont']//a[text()='Gurhan'])[1]")
    public WebElement gurhanAfterMention;

    @FindBy(xpath = "//span[@title='Link']")
    public WebElement linkButton;

    @FindBy(xpath = "//input[@placeholder='Link URL']")
    public WebElement linkURL;

    @FindBy(xpath = "//input[@value='Save']")
    public WebElement saveButtonUnderLinkUrl;

    @FindBy(xpath = "//a[@href ='https://www.youtube.com/watch?v=OLxaG0TNgMM']")
    public WebElement linkOnActivityStream;

    @FindBy(xpath = "//span[@title='Insert video']")
    public WebElement insertVideoButton;

    @FindBy(xpath = "//input[@id='video_idPostFormLHE_blogPostForm-source']")
    public WebElement insertVideoSourceInputArea;

    @FindBy(xpath = "(//input[@value='Save'])[2]")
    public WebElement saveButtonUnderVideoSource;

    @FindBy(xpath = "(//div[@id='blog_post_body_490'])[1]")
    public WebElement insertVideoTextAfterInserting;












}
