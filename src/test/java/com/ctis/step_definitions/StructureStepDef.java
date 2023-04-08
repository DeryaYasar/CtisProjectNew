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
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

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
        select.selectByVisibleText(" .  . "+parent);
    }

    @When("user select Parent Department from dropdown button")
    public void userSelectParentDepartmentFromDropdownButton() {
        Select select = new Select(structurePageELements.parentDepartmentDropdown);
        select.selectByIndex(2);
    }
    @When("user click Select from structure button")
    public void userClickSelectFromStructureButton() {
        structurePageELements.selectFromStructureButton.click();
    }


    @Then("user select {string}")
    public void userSelect(String Options) {

     //   method yaz!!!
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
        actions.moveToElement(structurePageELements.cyberVetDepartmentButton).perform();
    }
    @And("user click Add child department button")
    public void userClickAddChildDepartmentButton() {
        structurePageELements.addDepartmentButton.click();
    }
    @When("user write a {string}")
    public void user_write_a_name(String childname) {
        structurePageELements.departmentName.sendKeys(childname+" Child Department");
        BrowserUtils.sleep(2);
    }

    @And("user click Edit department button")
    public void userClickEditDepartmentButton() {
        structurePageELements.editDepartmentButton.click();
    }
    @And("user click save button")
    public void userClickSaveButton() {
        structurePageELements.saveButton.click();
    }

    @And("user click Delete department button")
    public void userClickDeleteDepartmentButton() {
        //method
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(structurePageELements.developerDepartmentButton).perform();
        structurePageELements.deleteDepartmentButton.click();
// method yazilabilir
    }

    @When("user drag and drop a department under another department")
    public void userDragAndDropADepartmentUnderAnotherDepartment() {
        Actions actions = new Actions(Driver.getDriver());
        actions.dragAndDrop(structurePageELements.childDepartment,structurePageELements.parentDepartment).perform();
    }

    @Then("user see ADD DEPARTMENT button")
    public void userSeeADDDEPARTMENTButton() {
        //employeePage.addDepartmentButton.isDisplayed();
        //String str = (employeePage.addDepartmentContainer).getText();
        //System.out.println(str);
        //Assert.assertFalse(str.equals("ADD DEPARTMENT"));
        WebElement c=Driver.getDriver().findElement(By.xpath("//span[@class='menu-item-link-text'][contains(.,'Employees')]"));
        c.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement dr=Driver.getDriver().findElement(By.xpath("//div[@class='pagetitle-inner-container']"));
        System.out.println(dr.getText());
        Assert.assertTrue(dr.getText().contains("ADD DEPARTMENT"));


    }

    @Then("user should not see ADD DEPARTMENT button")
    public void userShouldNotSeeADDDEPARTMENTButton(){
        //String str = (employeePage.addDepartmentContainer).getText();
        //Assert.assertFalse(str.equals("ADD DEPARTMENT"));
        WebElement c=Driver.getDriver().findElement(By.xpath("//span[@class='menu-item-link-text'][contains(.,'Employees')]"));
        c.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        WebElement dr=Driver.getDriver().findElement(By.xpath("//div[@class='pagetitle-inner-container']"));
        System.out.println(dr.getText());
        Assert.assertFalse(dr.getText().contains("ADD DEPARTMENT"));

       /* try{
            Assert.assertFalse(employeePage.addDepartmentButton.getText().equals("ADD DEPARTMENT"));
        }
        catch (RuntimeException e){
            System.out.println("You dont have permission");
        }*/


    }



}
/*
 1. All user types should be able to display company structure.

  2. Hr user should be able to add a department from the company structure.
  3. Hr user should be able to select a parent department from the department dropdown.
  4.Hr userr should be able to select a supervisor from "recent", "company" and "search"

  5.Hr user should be able to close add department pop-up at any time before sending.

  6.Hr user should be able to edit departments, add child departments, and delete departments after adding the department.

  7.Hr user should be able to drag and drop the existing department under another department as a subdepartment.

  8. Helpdesk and marketing users can not change company structure.
 */