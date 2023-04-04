package com.ctis.pages;

import com.ctis.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageElements {

    public LoginPageElements(){

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(name = "USER_LOGIN")
    public WebElement inputUsername;

    @FindBy(name = "USER_PASSWORD")
    public WebElement inputPassword;

    @FindBy(className = "login-btn")
    public WebElement loginButton;


    @FindBy(className = "errortext")
    public WebElement errorText;


    @FindBy(xpath = "//div[.='Incorrect login or password']")
    public WebElement expectedFilloutMessage;


    @FindBy(xpath = "//a[@class='login-link-forgot-pass']")
    public WebElement forgotPasswordLink;

    @FindBy(xpath = "//label[.='Remember me on this computer']")
    public WebElement rememberMeLink;

    public String isBulletSign(){
        return inputPassword.getAttribute("type");
    }




}
