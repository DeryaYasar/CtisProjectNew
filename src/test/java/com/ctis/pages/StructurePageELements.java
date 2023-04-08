package com.ctis.pages;

import com.ctis.utilities.Driver;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class StructurePageELements {
    public StructurePageELements() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public String Options;
    public String barName;


    @FindBy(xpath = "//a[@title='Employees']")
    public WebElement employeeTab;

    @FindBy(name = "USER_LOGIN")
    public WebElement loguserName;

    @FindBy(xpath = "//span[@id='pagetitle']")
    public WebElement companyStructureTab;

    @FindBy(xpath = "//span[@class='webform-small-button-text']")
    public WebElement addDepartmentButton;

    @FindBy(id = "NAME")
    public WebElement departmentName;
    @FindBy(xpath = "//select[@id='IBLOCK_SECTION_ID']")
    public WebElement parentDepartmentDropdown;
    @FindBy(xpath = "//a[@id='single-user-choice']")
    public WebElement selectFromStructureButton;

    @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-link popup-window-button-link-cancel']")
    public WebElement closeButton;

    @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-accept']")
    public WebElement addButton;
    @FindBy(xpath = "//span[@id='bx_str_149']")
    public WebElement DevDepartmentButton;

    @FindBy(xpath = "//span[@id='bx_str_284']")
    public WebElement ChildDepartmentButton;


    @FindBy(xpath = "(//div[@title='Edit department'])[2]")
    public WebElement editDepartmentButton;

    @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-accept']")
    public WebElement saveButton;

    @FindBy(xpath = "/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/div/div[2]/div/div/table[2]/tbody/tr[1]/td[1]/span/div[1]/div[1]")
    public WebElement developerDepartmentButton;

    @FindBy(xpath = "/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/div/div[2]/div/div/table[2]/tbody/tr[1]/td[1]/span/div[1]/div[2]/div[2]")
    public WebElement deleteDepartmentButton;

    @FindBy(xpath = "//input[@value='Developer']")
    public WebElement developerBar;
    @FindBy(xpath = "//input[@value='Boss']")
    public WebElement BossBar;

    @FindBy(xpath = "(//div[@title='Delete department'])[9]")
    public WebElement deleteChildDepartmentButton;

    @FindBy(xpath = "(//span[@class='structure-dept-block structure-dept-third structure-dept-editable'])[1]")
    public WebElement childDepartment;

    @FindBy(xpath = "//span[@id='bx_str_149']")
    public WebElement parentDepartment;

    @FindBy(xpath = "(//span[@class='finder-box-tab-text'])[1]")
    public WebElement recent;

    @FindBy(xpath = "(//span[@class='finder-box-tab-text'])[2]")
    public WebElement company;

    @FindBy(xpath = "(//span[@class='finder-box-tab-text'])[3]")
    public WebElement search;

    @FindBy(xpath = "(//div[@class='finder-box-item-text'])[1]")
    public WebElement recentSV;

    @FindBy(xpath = "(//div[@class='company-department-text'])[1]")
    public WebElement mainboss;
    @FindBy(xpath = "(//div[@class='company-department-text'])[2]")
    public WebElement developerdropdown;

    @FindBy(xpath = "//div[@id='popup-window-content-single-employee-popup']")
    public WebElement companySV;
    @FindBy(xpath = "//input[@class='finder-box-search-textbox']")
    public WebElement searchBar;

    @FindBy(xpath = "//div[@bx-tooltip-user-id='717']")
    public WebElement searchSV;


    public void selectOptionsandSupervisor(String Options) {
        this.Options = Options;
        if (Options.equalsIgnoreCase("Company")) {
            company.click();
            mainboss.click();
            developerdropdown.click();
            companySV.click();
        } else if
        (Options.equalsIgnoreCase("Search")) {
            search.click();
            searchBar.sendKeys("hr25@cybertekschool.com");
            Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            searchSV.click();

        } else {
            recent.click();
            recentSV.click();

        }
    }

    public void cleanBar(String barName) {
        this.barName = barName;
WebElement barlocater = Driver.getDriver().findElement(By.xpath("//input[@value='"+barName+"']"));
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(barlocater));
        barlocater.clear();
    }

}
