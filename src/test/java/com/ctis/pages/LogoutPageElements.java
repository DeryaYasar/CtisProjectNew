package com.ctis.pages;

import com.ctis.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LogoutPageElements {

    public LogoutPageElements(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath= "//div[@onclick='showUserMenu()']")
    public WebElement profildropdown ;

    @FindBy(xpath = "//span[.='Log out']")
    public WebElement logoutButton;

    @FindBy(xpath = "//div[@class='menu-popup']")
    public WebElement fiveOptions;

    public void logout(){
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        profildropdown.click();
        logoutButton.click();
    }

}
