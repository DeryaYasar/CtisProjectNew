package com.ctis.step_definitions;

import com.ctis.pages.AppreciationPage;
import com.ctis.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class appreciation_stepDef {


    AppreciationPage appreciationPage= new AppreciationPage();

    @Given("user clicks More button under Active Stream")
    public void user_clicks_more_button_under_active_stream() {
          appreciationPage.moreButton.click();
    }

    @When("user should see and click Appreciation button")
    public void user_should_see_and_click_appreciation_button() {
           appreciationPage.appreciationButton.click();
    }

    @When("user should text appreciation message in the Message Content field")
    public void user_should_text_appreciation_message_in_the_message_content_field() {
        Actions actions= new Actions(Driver.getDriver());
        Faker faker= new Faker();
       // actions.moveToElement(appreciationPage.contentField).sendKeys(faker.address().city()).perform();
        actions.moveToElement(appreciationPage.contentField).sendKeys("Perfetto").perform();

       // Driver.getDriver().switchTo().frame(appreciationPage.contentField);
        //appreciationPage.contentField.sendKeys("Congrats!");

        //@FindBy (xpath = "//body[@contenteditable]")  ////iframe[@class='bx-editor-iframe']  page classta bununla dene!!!
        //public WebElement textArea;

        //@FindBy(xpath = "//div[@class='bxhtmled-area-cnt']//iframe")
        //public WebElement messageArea;
    }

    @When("user removes All employes option from to field")
    public void user_removes_all_employes_option_from_to_field() {
           appreciationPage.deleteAllEmployees.click();
    }



    @When("adds helpdesk22@cybertekschool.com user")
    public void adds_helpdesk22_cybertekschool_com_user() {
        appreciationPage.addPersonOrGroupsOrDepartmnt.click();
        appreciationPage.addingPersonVsField.sendKeys("helpdesk22@cybertekschool.com"+ Keys.ENTER);
    }

    @When("user chooses Gift from sticker field")
    public void user_chooses_gift_from_sticker_field() {
            appreciationPage.stickerButton.click();
            appreciationPage.giftSticker.click();
    }

    @When("adds helpdesk22@cybertekschool.com user to recipient filed")
    public void adds_helpdesk22_cybertekschool_com_user_to_recipient_filed() {
           appreciationPage.addEmployees.click();
           appreciationPage.addRecipient.sendKeys("helpdesk22@cybertekschool.com"+Keys.ENTER);
    }

    @When("user clicks to Send button")
    public void user_clicks_to_send_button() {
           appreciationPage.sendButton.click();
    }


    @Then("user should see sent message on the activity stream page")
    public void user_should_see_sent_message_on_the_activity_stream_page() {

       String actualText= appreciationPage.resultInActivityStream.getText();
       String expectedText= "Perfetto";
       Assert.assertTrue(actualText.contains(expectedText));
       appreciationPage.moreeButton.click();
       appreciationPage.deleteeButton.click();

    }


    @And("user should see All Employees as recipient of the message by default")
    public void userShouldSeeAllEmployeesAsRecipientOfTheMessageByDefault() {
         String actualText= appreciationPage.allEmployesText.getText();
         String expectedText= "All employees";

         Assert.assertTrue(actualText.equals(expectedText));



    }

    @And("adds Gurhan from the options")
    public void addsGurhanFromTheOptions() {
        appreciationPage.addPersonOrGroupsOrDepartmnt.click();
        appreciationPage.gurhanUser.click();

    }

    @And("user clicks cancel button")
    public void userClicksCancelButton() {
        appreciationPage.cancelButton.click();
    }

    @Then("appreciation content field is disappeared")
    public void appreciationContentFieldIsDisappeared() {
        Assert.assertFalse(appreciationPage.contentField.isDisplayed());
    }

    @And("user chooses an icon from sticker field")
    public void userChoosesAnIconFromStickerField() throws InterruptedException {
         appreciationPage.stickerButton.click();
         appreciationPage.iconThumbsUp.click();
         Thread.sleep(2000);
         appreciationPage.stickerButton.click();
         appreciationPage.iconAward.click();
         Thread.sleep(2000);
         appreciationPage.newStickerButton.click();
         appreciationPage.iconCrown.click();


    }
}
