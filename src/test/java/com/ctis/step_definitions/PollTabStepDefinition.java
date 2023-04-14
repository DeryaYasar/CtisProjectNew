package com.ctis.step_definitions;

import com.ctis.pages.LoginPageElements;
import com.ctis.pages.PollTabPage;
import com.ctis.utilities.BrowserUtils;
import com.ctis.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class PollTabStepDefinition {

    PollTabPage pollTabPage = new PollTabPage();
    LoginPageElements loginPageElements= new LoginPageElements();

    Actions actions = new Actions(Driver.getDriver());

    @When("user clicks Poll tab")
    public void userClicksPollTab() {
        pollTabPage.PollButton.click();
    }


    @And("user writes a title in message box")
    public void userWritesATitleInMessageBox() {
        BrowserUtils.sleep(2);
        actions.click(pollTabPage.titleMessageBox).perform();
        pollTabPage.titleMessageBox.sendKeys(Keys.chord(Keys.CONTROL+"A")+Keys.CLEAR+"Sample Title");
    }

    @And("user clicks Add more button")
    public void userClicksAddMoreButton() {
        pollTabPage.AddmoreButton.click();
    }
    @And("user clicks Employees and departments button")
    public void userClicksEmployeesAndDepartmentsButton() {
        pollTabPage.EmployeesAndDepartmentsButton.click();
    }
    @And("user selects multiple contacts")
    public void userSelectsMultipleContacts() {
        pollTabPage.marketingEmail.click();
        pollTabPage.hrEmail.click();
        pollTabPage.helpdeskEmail.click();
    }
    @Then("user click x button in order to close")
    public void userClickXButtonInOrderToClose() {
        pollTabPage.closeXbutton.click();
    }

    @When("user write questions")
    public void userWriteQuestions() {
        pollTabPage.questionInput.sendKeys("Question Sample");
    }

    @And("User clicks Answer1 and write an answer")
    public void userClicksAnswer1AndWriteAnAnswer() {
        pollTabPage.answer1input.sendKeys("Answer1");
    }
    @And("User clicks Answer2 and write an answer")
    public void userClicksAnswer2AndWriteAnAnswer() {
        pollTabPage.answer2input.sendKeys("Answer2");
    }

    @And("User clicks Answer3 and write an answer")
    public void userClicksAnswer3AndWriteAnAnswer() {
        pollTabPage.answer3input.sendKeys("Answer3");
    }

    @When("user clicks x on question box")
    public void userClicksXOnQuestionBox() {
        BrowserUtils.sleep(2);
        actions.moveToElement(pollTabPage.questionInput).perform();
        BrowserUtils.sleep(2);
        pollTabPage.closeQuestion.click();
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
    }
    @When("User clicks Allow multiple choise  checkbox")
    public void user_clicks_allow_multiple_choise_checkbox() {
        pollTabPage.allowMultipleChoiceCheckbox.click();
        BrowserUtils.sleep(2);
    }
    @When("User clicks SEND button")
    public void user_clicks_send_button() {
        pollTabPage.SaveButton.click();
        BrowserUtils.sleep(2);
    }


    @And("User leaves blank in title message box, with default recipient")
    public void userLeavesBlankInTitleMessageBoxWithDefaultRecipient() {
        BrowserUtils.waitFor(1);

    }

    @Then("Verify {string} message is displayed.")
    public void verifyMessageIsDisplayed(String arg0) {
        Assert.assertTrue(pollTabPage.messageTitleIsNeededMessage.isDisplayed());
    }

    @And("user clicks Answer first checkbox")
    public void userClicksAnswerFirstCheckbox() {
        pollTabPage.firstCheckBox.click();
        BrowserUtils.sleep(2);
    }
    @And("user clicks Answer second checkbox")
    public void userClicksAnswerSecondCheckbox() {
        pollTabPage.secondCheckBox.click();
        BrowserUtils.sleep(2);
    }

    @Then("user should see Answer first still selected")
    public void userShouldSeeAnswerFirstStillSelected() {
        pollTabPage.firstCheckBox.isSelected();
    }


}
