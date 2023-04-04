package com.ctis.step_definitions;

import com.ctis.pages.LoginPageElements;
import com.ctis.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class loginpage_stepDefinitions {

    LoginPageElements loginPageElements= new LoginPageElements();

    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
        Driver.getDriver().get("https://qa.ctissolutions.com/");
    }
    @When("user enters username {string}")
    public void user_enters_username(String username) {
           loginPageElements.inputUsername.sendKeys(username);
    }
    @When("user enters password {string}")
    public void user_enters_password(String password) {
             loginPageElements.inputPassword.sendKeys(password);
    }
    @Then("clicks to the Log In button")
    public void clicks_to_the_log_in_button() {
          loginPageElements.loginButton.click();
    }
    @Then("user lands on the home page.")
    public void user_lands_on_the_home_page() {
     String actualTitle= Driver.getDriver().getTitle();
     String expectedTitle= "Portal";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }


    @And("{string} message should be displayed")
    public void messageShouldBeDisplayed(String errorText) {
        String actualMessage= loginPageElements.errorText.getText();
        String expectedMessage= errorText;
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @And("user leaves the password field empty")
    public void userLeavesThePasswordFieldEmpty() {
        loginPageElements.inputPassword.sendKeys("");
    }

    @And("{string} message should displayed")
    public void messageShouldDisplayed(String fillOutMessage) {
      String actualMessage= loginPageElements.expectedFilloutMessage.getText();
      String extepctedText= fillOutMessage;
      Assert.assertEquals(extepctedText, actualMessage);
    }


    @And("user sees Forgot Password link on the page.")
    public void userSeesForgotPasswordLinkOnThePage() {
        System.out.println(loginPageElements.forgotPasswordLink.isDisplayed());
    }


    @When("user click to the forgot password link")
    public void userClickToTheForgotPasswordLink() {
        loginPageElements.forgotPasswordLink.click();
    }


    @Then("user lands on the {string} page.")
    public void userLandsOnThePage(String getPassword) {
      String actualPageTitle=  Driver.getDriver().getTitle();
      String expectedPageTitle= getPassword;
      Assert.assertEquals(actualPageTitle, expectedPageTitle);
    }

    @And("user sees Remember Me link on the page.")
    public void userSeesRememberMeLinkOnThePage() {
        System.out.println(loginPageElements.rememberMeLink.isDisplayed());
    }


    @Then("user clicks to the link.")
    public void userClicksToTheLink() {
        loginPageElements.rememberMeLink.click();
    }


    @Then("user sees the written password in bullet signs.")
    public void userSeesTheWrittenPasswordInBulletSigns() {
          Assert.assertEquals(loginPageElements.isBulletSign(), "password");
    }

}
