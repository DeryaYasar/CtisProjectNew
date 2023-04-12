package com.ctis.step_definitions;

import com.ctis.pages.InteractionsInMessageMenu;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InteractionsInMessageMenuStepDef {

    InteractionsInMessageMenu interactionsInMessageMenu = new InteractionsInMessageMenu();

    @When("user clicks to the message")
    public void user_clicks_to_the_message() {

    }

    @And("user writes {string} to the message area")
    public void userWritesToTheMessageArea(String messageText) {
    }

    @When("user clicks to the add mention button")
    public void user_clicks_to_the_add_mention_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @And("user adds mention to the Gurhan")
    public void userAddsMentionToTheGurhan() {
    }

    @When("user clicks to the send button")
    public void user_clicks_to_the_send_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user should see Gurhan displayed on the Activity Stream")
    public void user_should_see_gurhan_displayed_on_the_activity_stream() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
