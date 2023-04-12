package com.ctis.pages;

import com.ctis.utilities.Driver;
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

    @FindBy(id = "bx-b-mention-blogPostForm")
    public WebElement addMentionButton;

    @FindBy(xpath = "//div[contains(text(),'Gurhan')]")
    public WebElement gurhan;







}
