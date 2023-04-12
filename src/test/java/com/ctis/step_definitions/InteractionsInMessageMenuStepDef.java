package com.ctis.step_definitions;

import com.ctis.pages.InteractionsInMessageMenu;
import com.ctis.utilities.BrowserUtils;
import com.ctis.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;

public class InteractionsInMessageMenuStepDef {

    InteractionsInMessageMenu interactionsInMessageMenu = new InteractionsInMessageMenu();

    @When("user clicks to the message button")
    public void user_clicks_to_the_message() {
        interactionsInMessageMenu.messageButton.click();
    }

    @And("user writes {string} to the message area")
    public void userWritesToTheMessageArea(String messageText) {
        Driver.getDriver().switchTo().frame(interactionsInMessageMenu.messageIframe);
        interactionsInMessageMenu.messageArea.sendKeys(messageText);
        Driver.getDriver().switchTo().parentFrame();
    }

    @When("user clicks to the add mention button")
    public void user_clicks_to_the_add_mention_button() {
        interactionsInMessageMenu.addMentionButton.click();
        BrowserUtils.waitForVisibility(interactionsInMessageMenu.gurhan, 3);
    }

    @And("user adds mention to the Gurhan")
    public void userAddsMentionToTheGurhan() {
        interactionsInMessageMenu.gurhan.click();
    }

    @When("user clicks to the send button")
    public void user_clicks_to_the_send_button() {
        interactionsInMessageMenu.sendButton.click();
        BrowserUtils.waitFor(2);
    }

    @Then("user should see {string} displayed on the Activity Stream")
    public void userShouldSeeDisplayedOnTheActivityStream(String gurhanText) {
        Assert.assertTrue(interactionsInMessageMenu.gurhanAfterMention.getText().contains(gurhanText));
    }

    @And("user clicks to the link button")
    public void userClicksToTheLinkButton() {
        interactionsInMessageMenu.linkButton.click();
    }

    @And("user adds {string} to the Link input area")
    public void userAddsLinkToTheLinkInputArea(String linkText) {
        interactionsInMessageMenu.linkURL.sendKeys(linkText);
    }

    @And("user clicks to the save button")
    public void userClicksToTheSaveButton() {
        interactionsInMessageMenu.saveButtonUnderLinkUrl.click();
    }

    @Then("user should see {string} displayed on the Activity Stream")
    public void userShouldSeeLinkDisplayedOnTheActivityStream(String linkText) {
        Assert.assertTrue(interactionsInMessageMenu.linkOnActivityStream.getText().contains(linkText));
        Assert.assertTrue(interactionsInMessageMenu.linkOnActivityStream.isDisplayed());
    }

    @And("user clicks to the insert video button")
    public void userClicksToTheInsertVideoButton() {
        interactionsInMessageMenu.insertVideoButton.click();
    }

    @And("user adds {string} to the video source input area")
    public void userAddsToTheVideoSourceInputArea(String videoSource) {
        interactionsInMessageMenu.insertVideoSourceInputArea.sendKeys(videoSource);
    }

    @And("user clicks to the save button under video source")
    public void userClicksToTheSaveButtonUnderVideoSource() {
        interactionsInMessageMenu.saveButtonUnderVideoSource.click();
    }

    @Then("user should see inserted video is displayed on Activity Stream")
    public void userShouldSeeInsertedVideoIsDisplayedOnActivityStream() {
        try {
            Assert.assertTrue(interactionsInMessageMenu.insertVideoTextAfterInserting.isDisplayed());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }
}