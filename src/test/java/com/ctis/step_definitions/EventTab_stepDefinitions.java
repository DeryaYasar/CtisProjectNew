package com.ctis.step_definitions;

import com.ctis.pages.EventPage;
import com.ctis.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class EventTab_stepDefinitions {

    EventPage eventPage = new EventPage();
    @When("user clicks Event tab")
    public void user_clicks_event_tab() {
        eventPage.eventTab.click();
        BrowserUtils.sleep(2);

    }
    @When("User sets starting date and time")
    public void user_sets_starting_date_and_time() {

        eventPage.startDate.click();

        eventPage.selectStartAndEndDate(22);

        eventPage.startTime.click();
        eventPage.selectStartingTime(5,45);


    }
    @When("USer sets ending date and time")
    public void u_ser_sets_ending_date_and_time() {
        eventPage.endDate.click();
        eventPage.selectStartAndEndDate(24);
        eventPage.endTime.click();
        eventPage.selectEndingTime(6,30);


    }
    @When("User selects All day")
    public void user_selects_all_day() {

        eventPage.allDayButton.click();


    }

    @When("User click set reminder radio button")
    public void user_click_set_reminder_radio_button() {

        eventPage.setReminder.click();

    }


    @Then("User sets count and {string}")
    public void userSetsCountAnd(String timeType) {

       eventPage.setTimeAndType(10,timeType);

    }

    @And("User writes event name")
    public void userWritesEventName() {
        eventPage.eventName.sendKeys("Grooming Meeting");
    }

    @And("User select event location")
    public void userSelectEventLocation() {
        eventPage.eventLocation.click();
        eventPage.westRoom.click();
    }

    @And("User adds members to event")
    public void userAddsToEvent(List<String>members) {

        eventPage.selectMembers(members);

    }

    @Then("User creates event")
    public void userCreatesEvent() {

        eventPage.sendButton.click();
    }

    @Then("user sees event created")
    public void userSeesEventCreated() {
        Assert.assertTrue(eventPage.createdEvent.isDisplayed());
    }

    @And("User cancels the event")
    public void userCancelsTheEvent() {

        eventPage.cancelButton.click();

        Assert.assertEquals(eventPage.sendMessage.getText(), "Send message …" );
    }
}


