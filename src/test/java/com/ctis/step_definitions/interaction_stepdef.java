package com.ctis.step_definitions;

import com.ctis.pages.InteractionPageElements;
import com.ctis.utilities.BrowserUtils;
import com.ctis.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class interaction_stepdef {

    InteractionPageElements interactionPage = new InteractionPageElements();
    Actions actions = new Actions(Driver.getDriver());


    @When("user makes a comment {string} on others post")
    public void user_makes_a_comment_on_others_post(String myComment) {
        actions.click(interactionPage.addCommentBtn).perform();
        actions.sendKeys(myComment).perform();
        actions.moveToElement(interactionPage.sendCommentBtn).perform();
        actions.click(interactionPage.sendCommentBtn).perform();
        BrowserUtils.sleep(2);
    }

    @When("user likes on other employees' post")
    public void user_likes_on_other_employees_post() {
        interactionPage.likeBtn.click();
    }

    @When("user unfollows other employees post")
    public void user_unfollows_other_employees_post() {
        interactionPage.unfollowBtn.click();
    }

    @Then("user verifies that the comment is posted")
    public void user_verifies_that_the_comment_is_posted() {
        Assert.assertEquals("My test comment", interactionPage.userCommentText.getText());

    }

    @Then("user verifies that the post is liked")
    public void user_verifies_that_the_post_is_liked() {
        Assert.assertTrue(interactionPage.likeThumb.isDisplayed());
    }

    @Then("user verifies that the post is unfollowed")
    public void user_verifies_that_the_post_is_unfollowed() {
        Assert.assertTrue(interactionPage.followBtn.isEnabled());
    }


    @When("user likes his-her own comment")
    public void user_likes_his_her_own_comment() {
        interactionPage.likeForMyComment.click();
    }

    @When("user replies his-her own comment")
    public void user_replies_his_her_own_comment() {
        String myComment = "My reply message";
        actions.click(interactionPage.replyForMyComment).perform();
        actions.sendKeys(myComment).perform();
        actions.moveToElement(interactionPage.replySendBtn).perform();
        actions.click(interactionPage.replySendBtn).perform();
        BrowserUtils.sleep(2);

    }

    @Then("user verifies the comment is liked")
    public void user_verifies_the_comment_is_liked() {
        //Assert.assertTrue(interactionPage.getLikeForMyComment.isDisplayed());
    }

    @Then("user verifies the comment is replied")
    public void user_verifies_the_comment_is_replied() {
        Assert.assertTrue(interactionPage.replyMessageArea.getText().
                contains("My reply message"));
    }


    @When("user edits his-her comment")
    public void user_edits_his_her_comment() {
        actions.click(interactionPage.moreBtn).perform();
        actions.click(interactionPage.edit).perform();
        Driver.getDriver().switchTo().frame(interactionPage.frame);
        actions.sendKeys("Edited ").perform();
        Driver.getDriver().switchTo().parentFrame();
        actions.moveToElement(interactionPage.replySendBtn).perform();
        actions.click(interactionPage.replySendBtn).perform();
        BrowserUtils.sleep(2);

    }

    @Then("user verifies that his-her comment edited")
    public void user_verifies_that_his_her_comment_edited() {
        Assert.assertEquals("Edited My test comment", interactionPage.userCommentTextEdited.getText());
    }

    @Then("user clicks to delete button")
    public void user_clicks_to_delete_button() {
        interactionPage.moreBtn.click();
        interactionPage.delete.click();
        Driver.getDriver().switchTo().alert().accept();
    }

    @Then("user sees the comment deleted message")
    public void user_sees_the_comment_deleted_message() {
        Assert.assertTrue(interactionPage.commentDeleted.isDisplayed());

    }


    @When("user clicks to star icon")
    public void user_clicks_to_star_icon() {
        interactionPage.starButton.click();
    }

    @When("user clicks to filter and search input")
    public void user_clicks_to_filter_and_search_input() {
        interactionPage.searchInput.click();


    }

    @When("user chooses Favorites")
    public void user_chooses_favorites() {
        interactionPage.favoritesBtn.click();
    }

    @Then("user verifies that the favorite post is seen under the activity stream")
    public void user_verifies_that_the_favorite_post_is_seen_under_the_activity_stream() {
        Assert.assertTrue(interactionPage.removeStarButton.isDisplayed());


    }
}
