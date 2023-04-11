package com.ctis.step_definitions;

import com.ctis.pages.LogoutPageElements;
import com.ctis.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;


public class logout_stepdef {

    LogoutPageElements logoutPageElements = new LogoutPageElements();

    @When("users click dropdown contains username right side")
    public void usersClickDropdownContainsUsernameRightSide() {
        logoutPageElements.profildropdown.click();

    }
    @When("user select log out")
    public void user_select_log_out() {

       // logoutPageElements.logoutButton.click();

        logoutPageElements.logout();

    }
    @Then("will log out succesfully")
    public void will_log_out_succesfully() {

        String expectedTitle = "Authorization";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);

    }
    @Then("see five options under profile name")
    public void seeFiveOptionsUnderProfileName() {

   //boolean actualOptions= logoutPageElements.fiveOptions.isDisplayed();
       // System.out.println("actualOptions = " + actualOptions);
    }
    @And("users click Log out button under profile name")
    public void usersClickLogOutButtonUnderProfileName() {

        logoutPageElements.logoutButton.click();
    }

    @When("after succesfully log out users click to the go back button on browser")
    public void after_succesfully_log_out_users_click_to_the_go_back_button_on_browser() {

        Driver.getDriver().navigate().back();
        String expectedPage = "Authorization";
                String actualPage = Driver.getDriver().getTitle();
                Assert.assertEquals(expectedPage,actualPage);

    }


}
