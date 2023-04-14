package com.ctis.step_definitions;

import com.ctis.pages.Send_M_ActiveStream;
import com.ctis.utilities.BrowserUtils;
import com.ctis.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.bouncycastle.jce.provider.BrokenJCEBlockCipher;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class Send_Mess_AvtiveStream {
    Send_M_ActiveStream sendMActiveStream=new Send_M_ActiveStream();

    @Given("user clicks to the Message Tab on the Navigation Bar")
    public void user_clicks_to_the_message_tab_on_the_navigation_bar() {
    sendMActiveStream.MessBtn.click();
    }
    @When("user writes a message in to the Message Field")
    public void user_writes_a_message_in_to_the_message_field() {

        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(sendMActiveStream.MssField).sendKeys("Hello hr1 have a good day").perform();


        BrowserUtils.sleep(3);

    }
    @When("chooses one or more  recipients from recipient input")
    public void chooses_one_or_more_recipients_from_recipient_input() {
    sendMActiveStream.AllEmpBtnn.click();
    BrowserUtils.sleep(1);
    sendMActiveStream.PersChoose.sendKeys("hr1@cybertekschool.com", Keys.ENTER);

    }
    @When("clicks on to the Send button")
    public void clicks_on_to_the_send_button() {
        BrowserUtils.sleep(3);
    sendMActiveStream.SendingBtnn.click();

    }
    @Then("verify that the message can be displayed on the Activity Stream")
    public void verify_that_the_message_can_be_displayed_on_the_activity_stream() {
        BrowserUtils.sleep(1);
       Assert.assertEquals(sendMActiveStream.AddingMes.getText(),"Hello hr1 have a good day");
    }


}
