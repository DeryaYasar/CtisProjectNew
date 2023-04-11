package com.ctis.step_definitions;

import com.ctis.pages.StructurePageELements;
import com.ctis.pages.LoginPageElements;
import com.ctis.pages.LogoutPageElements;
import com.ctis.utilities.BrowserUtils;
import com.ctis.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class StructureStepDef {
    StructurePageELements structurePageELements = new StructurePageELements();
    LogoutPageElements logoutPageElements = new LogoutPageElements();
    LoginPageElements loginPageElements = new LoginPageElements();

    @When("user should click Employee tab")
    public void user_should_click_employee_tab() {
        structurePageELements.employeeTab.click();
        BrowserUtils.sleep(2);
    }

    @When("user clean username bar")
    public void userCleanUsernameBar() {
        structurePageELements.loguserName.clear();
    }

    @Then("user should see Company Structure tab")
    public void user_should_see_company_structure_tab() {
        structurePageELements.companyStructureTab.isDisplayed();
        BrowserUtils.sleep(2);
    }

    @When("Hr user click ADD DEPARTMENT button")
    public void hr_user_click_add_department_button() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(structurePageELements.addDepartmentButton));
        structurePageELements.addDepartmentButton.click();

    }

    @When("user write a department {string}")
    public void user_write_a_department_name(String name) {
        structurePageELements.departmentName.sendKeys(name);

    }

    @When("user click Parent Department dropdown button")
    public void userClickParentDepartmentDropdownButton() {
        structurePageELements.parentDepartmentDropdown.click();

    }


    @When("user select {string} from dropdown button")
    public void userSelectFromDropdownButton(String parent) {
        // structurePageELements.parentDepartmentDropdown.click();
        Select select = new Select(structurePageELements.parentDepartmentDropdown);
        select.selectByVisibleText(" .  . " + parent);
    }

    @When("user select Parent Department from dropdown button")
    public void userSelectParentDepartmentFromDropdownButton() {
        Select select = new Select(structurePageELements.parentDepartmentDropdown);
        select.selectByIndex(1);
    }

    @When("user click Select from structure button")
    public void userClickSelectFromStructureButton() {
        structurePageELements.selectFromStructureButton.click();
    }


    @Then("user select {string} and add supervisor")
    public void userSelect(String Options) {
       structurePageELements.selectOptionsandSupervisor(Options);

    }


    @When("user click ADD button")
    public void user_click_add_button() {
        structurePageELements.departmentName.click();
        structurePageELements.addButton.click();

    }

    @And("user click CLOSE button")
    public void userClickCLOSEButton() {
        structurePageELements.closeButton.click();
        BrowserUtils.sleep(2);
    }

    @When("user hover over on a department")
    public void userHoverOverOnADepartment() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(structurePageELements.DevDepartmentButton).perform();
    }

    @And("user click Add child department button")
    public void userClickAddChildDepartmentButton() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(structurePageELements.addDepartmentButton));
        structurePageELements.addDepartmentButton.click();
    }

    @When("user clean department {string} bar")
    public void userCleanDepartmentNameBar(String barName) {
       structurePageELements.cleanBar(barName);
    }

    @When("user write a {string}")
    public void user_write_a_name(String childname) {
        structurePageELements.departmentName.sendKeys(childname + " Child Department");
        BrowserUtils.sleep(2);

    }

    @And("user write a new {string}")
    public void userWriteANew(String name) {
        structurePageELements.departmentName.sendKeys(name);
        BrowserUtils.sleep(2);
    }



    @And("user click Edit department button")
    public void userClickEditDepartmentButton() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(structurePageELements.editDepartmentButton));
        structurePageELements.editDepartmentButton.click();
    }

    @And("user click save button")
    public void userClickSaveButton() {
        structurePageELements.saveButton.click();
    }

    @And("user click Delete department button")
    public void userClickDeleteDepartmentButton() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(structurePageELements.developerDepartmentButton).perform();
        structurePageELements.deleteDepartmentButton.click();
    }

    @And("user click Delete child department button")
    public void userClickDeleteChildDepartmentButton() {
   structurePageELements.deleteChildDepartment(structurePageELements.childDepartment,structurePageELements.deleteChildDepartmentButton);
    }

    @When("user drag and drop a department under another department")
    public void userDragAndDropADepartmentUnderAnotherDepartment() {
        Actions actions = new Actions(Driver.getDriver());
        actions.dragAndDrop(structurePageELements.childDepartment, structurePageELements.parentDepartment).perform();
    }

    @Then("user see ADD DEPARTMENT button")
    public void userSeeADD_DEPARTMENTButton() {
        //employeePage.addDepartmentButton.isDisplayed();
        //String str = (employeePage.addDepartmentContainer).getText();
        //System.out.println(str);
        //Assert.assertFalse(str.equals("ADD DEPARTMENT"));
        Driver.getDriver().findElement(By.xpath("//span[@class='menu-item-link-text'][contains(.,'Employees')]")).click();
        //c.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement dr = Driver.getDriver().findElement(By.xpath("//div[@class='pagetitle-inner-container']"));
        //System.out.println(dr.getText());
        Assert.assertTrue(dr.getText().contains("ADD DEPARTMENT"));


    }

    @Then("user should not see ADD DEPARTMENT button")
    public void userShouldNotSeeADDDEPARTMENTButton() {
        //String str = (employeePage.addDepartmentContainer).getText();
        //Assert.assertFalse(str.equals("ADD DEPARTMENT"));
        Driver.getDriver().findElement(By.xpath("//span[@class='menu-item-link-text'][contains(.,'Employees')]")).click();
        // c.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement dr = Driver.getDriver().findElement(By.xpath("//div[@class='pagetitle-inner-container']"));
       // System.out.println(dr.getText());
        Assert.assertFalse(dr.getText().contains("ADD DEPARTMENT"));

       /* try{
            Assert.assertFalse(employeePage.addDepartmentButton.getText().equals("ADD DEPARTMENT"));
        }
        catch (RuntimeException e){
            System.out.println("You dont have permission");
        }*/


    }



}
