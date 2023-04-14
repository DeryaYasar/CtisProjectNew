package com.ctis.step_definitions;

import com.ctis.pages.Send_M_ActiveStream;
import com.ctis.utilities.BrowserUtils;
import com.ctis.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.bouncycastle.jce.provider.BrokenJCEBlockCipher;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class Send_Mess_AvtiveStream {
    Send_M_ActiveStream sendMActiveStream=new Send_M_ActiveStream();
    String message="Hello hr1 try again updated";
    @Given("user clicks to the Message Tab on the Navigation Bar")
    public void user_clicks_to_the_message_tab_on_the_navigation_bar() {
    sendMActiveStream.MessBtn.click();
    }
    @When("user writes a message in to the Message Field")
    public void user_writes_a_message_in_to_the_message_field() {

        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(sendMActiveStream.MssField).sendKeys(message).perform();


        BrowserUtils.sleep(3);

    }
    @When("chooses one or more  recipients from recipient input")
    public void chooses_one_or_more_recipients_from_recipient_input() {
    sendMActiveStream.AllEmpBtnn.click();
    BrowserUtils.sleep(1);
    sendMActiveStream.PersChoose.sendKeys("hr1@cybertekschool.com", Keys.ENTER);
        BrowserUtils.sleep(3);
    }
    @When("clicks on to the Send button")
    public void clicks_on_to_the_send_button() {

    sendMActiveStream.SendingBtnn.click();


    }
    @Then("verify that the message can be displayed on the Activity Stream")
    public void verify_that_the_message_can_be_displayed_on_the_activity_stream() {
        BrowserUtils.sleep(15);

        List<WebElement> divElements=Driver.getDriver().findElements(By.xpath("//div"));

        List<String> divElementsTexts=new ArrayList<>();

        for (WebElement divElement : divElements) {
            divElementsTexts.add(divElement.getText());
        }

        System.out.println(divElementsTexts);
        Assert.assertTrue(divElementsTexts.contains(message));
    }


      @Then("verifies to see that -The message title is not specified- text as error message")
    public void verifiesToSeeThatTheMessageTitleIsNotSpecifiedTextAsErrorMessage() {
        Assert.assertEquals(sendMActiveStream.TitleMess.getText(),"The message title is not specified");
    }

    @When("user checks recipient input and should verifies that All Employees as default recipient")
    public void userChecksRecipientInputAndShouldVerifiesThatAllEmployeesAsDefaultRecipient() {
        Assert.assertTrue(sendMActiveStream.AllEmpDef.isDisplayed());
    }

    @And("user clicks Add More button and should be able to add more recipients")
    public void userClicksAddMoreButtonAndShouldBeAbleToAddMoreRecipients() {
        sendMActiveStream.AllEmpBtnn.click();
        sendMActiveStream.PersChoose.sendKeys("hr1@cybertekschool.com", Keys.ENTER);

        BrowserUtils.sleep(1);
        sendMActiveStream.PersChoose.sendKeys("hr2@cybertekschool.com", Keys.ENTER);
        BrowserUtils.sleep(1);
        sendMActiveStream.PersChoose.sendKeys("hr3@cybertekschool.com", Keys.ENTER);
    }

    @And("user should be able to delete recipients")
    public void userShouldBeAbleToDeleteRecipients() {
        sendMActiveStream.PersChoose.sendKeys(Keys.BACK_SPACE);
        sendMActiveStream.PersChoose.sendKeys(Keys.BACK_SPACE);
        sendMActiveStream.PersChoose.sendKeys(Keys.BACK_SPACE);
        sendMActiveStream.PersChoose.sendKeys(Keys.BACK_SPACE);

    }

    @Then("verifies to see that -Please specify at least one person- text as error message")
    public void verifiesToSeeThatPleaseSpecifyAtLeastOnePersonTextAsErrorMessage() {
        Assert.assertTrue(sendMActiveStream.AtLeastErrMess.isDisplayed());
    }

    @And("clicks on to the Cancel button")
    public void clicksOnToTheCancelButton() {
        sendMActiveStream.CanclBtnn.click();
    }

    @Then("verifies that messagefield is dissappear")
    public void verifiesThatMessagefieldIsDissappear() {
        Dimension size = sendMActiveStream.MssField.getSize();
        // System.out.println(size);
        int height = size.getHeight();
        int width=size.getWidth();
        // System.out.println(height);
        // System.out.println(width);

        Assert.assertEquals(height,0);
        Assert.assertEquals(width,0);
    }
}
