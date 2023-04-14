package com.ctis.step_definitions;

import com.ctis.pages.FilterAndSearchPage;
import com.ctis.utilities.BrowserUtils;
import com.ctis.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class FilterAndSearchStepDefinitions {

    FilterAndSearchPage filterAndSearchPage = new FilterAndSearchPage();

    @When("user hover over and clicks the filter and search box")
    public void userHoverOverAndClicksTheFilterAndSearchBox() {
        filterAndSearchPage.filterAndSearchBox.click();
        BrowserUtils.sleep(2);
    }

    @Then("user should be able to see default filters as my activity, work, favorite, announcements and workflows")
    public void user_should_be_able_to_see_default_filters_as_my_activity_work_favorite_announcements_and_workflows() {
        Assert.assertTrue(filterAndSearchPage.workFilter.isEnabled());
        Assert.assertTrue(filterAndSearchPage.myActivityFilter.isEnabled());
        Assert.assertTrue(filterAndSearchPage.favoritesFilter.isEnabled());
        Assert.assertTrue(filterAndSearchPage.announcementsFilter.isEnabled());
        Assert.assertTrue(filterAndSearchPage.workFlowsFilter.isEnabled());
    }

    @When("user clicks the Restore default fields button and add field button")
    public void userClicksTheRestoreDefaultFieldsButtonAndAddFieldButton() {
        filterAndSearchPage.restoreDefaultFields.click();
        filterAndSearchPage.addFieldButton.click();
    }

    @And("user sees Date, Type, Author and To fields checked as default")
    public void userSeesDateTypeAuthorAndToFieldsCheckedFavoritesTagAndExtranetFieldsUncheckedAsDefault() {
        Assert.assertTrue(filterAndSearchPage.dateInputBox.isEnabled());
        Assert.assertTrue(filterAndSearchPage.typeInputBox.isEnabled());
        Assert.assertTrue(filterAndSearchPage.authorInputBox.isEnabled());
        Assert.assertTrue(filterAndSearchPage.toInputBox.isEnabled());
    }

    @And("user clicks to the Favorites, Tag and Extranet field checkboxes")
    public void userClicksToTheFavoritesTagAndExtranetFieldCheckboxes() {
        filterAndSearchPage.favoritesFieldCheckBox.click();
        filterAndSearchPage.extranetFieldCheckBox.click();
        filterAndSearchPage.tagFieldCheckBox.click();
    }

    @And("user sees all choosen fields' input boxes is displayed on the screen")
    public void userSeesAllChoosenFieldsInputBoxesIsDisplayedOnTheScreen() {
        Assert.assertTrue(filterAndSearchPage.favoritesInputBox.isDisplayed());
        Assert.assertTrue(filterAndSearchPage.extranetInputBox.isDisplayed());
        Assert.assertTrue(filterAndSearchPage.tagInputBox.isDisplayed());
    }

    @Then("user unchecks all field checkboxes and user sees all input boxes disappeared")
    public void userUnchecksAllFieldCheckboxesAndUserSeesAllInputBoxesDisappeared() {
        filterAndSearchPage.dateFieldCheckBox.click();
        filterAndSearchPage.toFieldCheckBox.click();
        filterAndSearchPage.authorFieldCheckBox.click();
        filterAndSearchPage.typeFieldCheckBox.click();
        filterAndSearchPage.favoritesFieldCheckBox.click();
        filterAndSearchPage.extranetFieldCheckBox.click();
        filterAndSearchPage.tagFieldCheckBox.click();
    }

    @When("user clicks to the Restore default fields button")
    public void user_clicks_to_the_restore_default_fields_button() {
        filterAndSearchPage.restoreDefaultFields.click();
        BrowserUtils.sleep(2);
    }

    @When("user clicks to the date box and specific dates appears")
    public void user_clicks_to_the_date_box_and_specific_dates_appears() {
        filterAndSearchPage.dateInputBox.click();
    }
    @When("user chooses the Exact Date as an option")
    public void user_chooses_the_exact_date_as_an_option() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(filterAndSearchPage.exactDate).perform();
        filterAndSearchPage.exactDate.click();
    }

    @When("a new date input box appears and user clicks to this input box")
    public void a_new_date_input_box_appears_and_user_clicks_to_this_input_box() {
        filterAndSearchPage.secondDateInputBox.click();
    }

    @And("user chooses a random date")
    public void userChoosesARandomDate() {
        filterAndSearchPage.choosenDate.click();
    }

    @Then("user clicks the search button")
    public void user_clicks_the_search_button() {
        BrowserUtils.waitForVisibility(filterAndSearchPage.searchButton, 1);
        filterAndSearchPage.searchButton.click();
    }

    @When("user clicks to the type box and specific types appears")
    public void user_clicks_to_the_type_box_and_specific_types_appears() {
       filterAndSearchPage.typeInputBox2.click();
    }

    @When("user chooses Polls as a single option")
    public void user_chooses_polls_as_a_single_option() {
        filterAndSearchPage.pollsCheckBox.click();
    }

    @When("user should see Polls type inside the type input box")
    public void user_should_see_polls_type_inside_the_type_input_box() {
       Assert.assertTrue(filterAndSearchPage.pollsInTypeInputBox.isDisplayed());
    }

    @When("user clicks to the type input box delete button")
    public void userClicksToTheTypeInputBoxDeleteButton() {
        filterAndSearchPage.typeInputBoxDeleteButton.click();
        BrowserUtils.waitFor(2);
    }

    @When("user chooses Posts, Announcements and Appreciations as multiple options")
    public void user_chooses_posts_announcements_and_appreciations_as_multiple_options() {
        filterAndSearchPage.postsCheckBox.click();
        BrowserUtils.sleep(1);
        filterAndSearchPage.announcementsCheckBox.click();
        BrowserUtils.sleep(1);
        filterAndSearchPage.appreciationsCheckBox.click();
    }

    @When("user should see Posts, Announcements and Appreciations types inside the type input box")
    public void user_should_see_posts_announcements_and_appreciations_types_inside_the_type_input_box() {
        Assert.assertTrue(filterAndSearchPage.postsInTypeInputBox.isDisplayed());
        Assert.assertTrue(filterAndSearchPage.announcementsInTypeInputBox.isDisplayed());
        Assert.assertTrue(filterAndSearchPage.appreciationsInTypeInputBox.isDisplayed());
    }

    @When("user clicks to the save filter button")
    public void user_clicks_to_the_save_filter_button() {
        filterAndSearchPage.saveFilterButton.click();
        BrowserUtils.waitFor(1);
    }

    @And("user gives name of the filter as {string}")
    public void userGivesNameOfTheFilterAs(String name) {
        filterAndSearchPage.filterNameInputBox.sendKeys(name);
    }

    @When("user clicks to the Save button")
    public void user_clicks_to_the_save_button() {
       filterAndSearchPage.saveButton.click();
    }

    @Then("user should see the {string} as filter name under the filters menu")
    public void userShouldSeeTheAsFilterNameUnderTheFiltersMenu(String name) {
        String expectedText = name;
        String actualText = filterAndSearchPage.filterNameDisplay.getText();
        Assert.assertEquals(expectedText, actualText);
        Assert.assertTrue(filterAndSearchPage.filterNameDisplay.isDisplayed());
    }

    @When("user clicks to the add field button")
    public void user_clicks_to_the_add_field_button() {
        filterAndSearchPage.addFieldButton.click();
    }

    @Then("user should see Date, Type, Author and To fields checked and Favorites, Tag, Extranet fields unchecked as default")
    public void user_should_see_date_type_author_and_to_fields_checked_and_favorites_tag_extranet_fields_unchecked_as_default() {
        Assert.assertTrue(filterAndSearchPage.dateInputBox.isEnabled());
        Assert.assertTrue(filterAndSearchPage.typeInputBox.isEnabled());
        Assert.assertTrue(filterAndSearchPage.authorInputBox.isEnabled());
        Assert.assertTrue(filterAndSearchPage.toInputBox.isEnabled());

        Assert.assertFalse(filterAndSearchPage.favoritesFieldCheckBox.isSelected());
        Assert.assertFalse(filterAndSearchPage.tagFieldCheckBox.isSelected());
        Assert.assertFalse(filterAndSearchPage.extranetFieldCheckBox.isSelected());
    }

    @When("user clicks to the Reset Button")
    public void user_clicks_to_the_reset_button() {
        filterAndSearchPage.resetButton.click();
        BrowserUtils.waitForClickablility(filterAndSearchPage.filterAndSearchBox, 5);
    }


}