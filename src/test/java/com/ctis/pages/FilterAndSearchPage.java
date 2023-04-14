package com.ctis.pages;

import com.ctis.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilterAndSearchPage {


    public FilterAndSearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//input[@placeholder='Filter and search']")
    public WebElement filterAndSearchBox;

    @FindBy(xpath = "(//span[.='Work'])[2]")
    public WebElement workFilter;

    @FindBy(xpath = "//span[.='Favorites']")
    public WebElement favoritesFilter;

    @FindBy(xpath = "//span[.='My Activity']")
    public WebElement myActivityFilter;

    @FindBy(xpath = "//span[.='Announcements']")
    public WebElement announcementsFilter;

    @FindBy(xpath = "//span[.='Workflows']")
    public WebElement workFlowsFilter;

    @FindBy(xpath = "//span[.='Add field']")
    public WebElement addFieldButton;

    @FindBy(xpath = "//span[@class='main-ui-filter-field-restore-items']")
    public WebElement restoreDefaultFields;

    @FindBy(xpath = "(//div[.='Date'])[2]")
    public WebElement dateFieldCheckBox;

    @FindBy(xpath = "//div[@data-name='DATE_CREATE_datesel']")
    public WebElement dateInputBox;

    @FindBy(xpath = "(//div[.='Type'])[2]")
    public WebElement typeFieldCheckBox;

    @FindBy(xpath = "//div[@data-name='EVENT_ID']")
    public WebElement typeInputBox;

    @FindBy(xpath = "(//div[.='Author'])[2]")
    public WebElement authorFieldCheckBox;

    @FindBy(xpath = "//input[@name='CREATED_BY_ID_label']")
    public WebElement authorInputBox;

    @FindBy(xpath = "(//div[.='To'])[3]")
    public WebElement toFieldCheckBox;

    @FindBy(xpath = "//input[@name='TO_label']")
    public WebElement toInputBox;

    @FindBy(xpath = "(//div[.='Favorites'])[2]")
    public WebElement favoritesFieldCheckBox;

    @FindBy(xpath = "//div[@data-name='FAVORITES_USER_ID']")
    public WebElement favoritesInputBox;

    @FindBy(xpath = "(//div[.='Tag'])[2]")
    public WebElement tagFieldCheckBox;

    @FindBy(xpath = "//input[@name='TAG']")
    public WebElement tagInputBox;

    @FindBy(xpath = "(//div[.='Extranet'])[2]")
    public WebElement extranetFieldCheckBox;

    @FindBy(xpath = "//div[@data-name='EXTRANET']")
    public WebElement extranetInputBox;

    @FindBy(xpath = "(//div[.='Exact date'])[2]")
    public WebElement exactDate;

    @FindBy (xpath = "//input[@name='DATE_CREATE_from']")
    public WebElement secondDateInputBox;

    @FindBy (xpath = "(//a[.='28'])[2]")
    public WebElement choosenDate;

    @FindBy (xpath = "//button[@class='ui-btn ui-btn-primary ui-btn-icon-search main-ui-filter-field-button main-ui-filter-find']")
    public WebElement searchButton;

    @FindBy(xpath = "(//span[@title='Hide field'])[2]")
    public WebElement typeInputBoxDeleteButton;

    @FindBy(xpath = "//div[@data-name='EVENT_ID'][@class='main-ui-control main-ui-multi-select']")
    public WebElement typeInputBox2;

    @FindBy(xpath = "//div[.='Polls']")
    public WebElement pollsCheckBox;

    @FindBy(xpath = "//span[.='Polls']")
    public WebElement pollsInTypeInputBox;

    @FindBy(xpath = "//div[.='Posts']")
    public WebElement postsCheckBox;

    @FindBy(xpath = "//span[.='Posts']")
    public WebElement postsInTypeInputBox;

    @FindBy(xpath = "//div[@class='main-ui-select-inner-label'][normalize-space()='Announcements']")
    public WebElement announcementsCheckBox;

    @FindBy(xpath = "(//span[.='Announcements'])[3]")
    public WebElement announcementsInTypeInputBox;

    @FindBy(xpath = "//div[contains(@data-item, 'Appreciations')]//div[.='Appreciations']")
    public WebElement appreciationsCheckBox;

    @FindBy(xpath = "(//span[.='Appreciations'])[2]")
    public WebElement appreciationsInTypeInputBox;

    @FindBy(xpath = "//span[.='Save filter']")
    public WebElement saveFilterButton;

    @FindBy(css = "input[class='main-ui-filter-sidebar-edit-control']")
    public WebElement filterNameInputBox;

    @FindBy(xpath = "//span[@class='ui-btn ui-btn-success main-ui-filter-field-button main-ui-filter-save']")
    public WebElement saveButton;

    @FindBy(css="div[class='main-ui-filter-sidebar-item main-ui-filter-current-item'] span[class='main-ui-filter-sidebar-item-text']")
    public WebElement filterNameDisplay;

    @FindBy(xpath = "(//span[@class='ui-btn ui-btn-light-border main-ui-filter-field-button main-ui-filter-reset'])[1]")
    public WebElement resetButton;


}
