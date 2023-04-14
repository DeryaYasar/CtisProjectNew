package com.ctis.pages;

import com.ctis.utilities.BrowserUtils;
import com.ctis.utilities.Driver;
import org.apache.commons.compress.archivers.zip.X000A_NTFS;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class EventPage {

    public EventPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//div[@id='feed-add-post-form-tab']//span[.='Event'])[1]")
    public WebElement eventTab;

    @FindBy(xpath = "//input[contains(@id, 'eed-cal-event-fromcal')]")
    public WebElement startDate;

    @FindBy(xpath = "//input[contains(@id, 'feed_cal_event_from_timecal')]")
    public WebElement startTime;

    @FindBy(xpath = "//input[@value='Set Time']")
    public WebElement setTimeButton1;

    @FindBy(xpath = "//input[contains(@id, 'feed-cal-event-tocal')]")
    public WebElement endDate;

    @FindBy(xpath = "//input[contains(@id, 'feed_cal_event_to_timecal')]")
    public WebElement endTime;

    @FindBy(xpath = "(//input[@value='Set Time'])[2]")
    public WebElement setTimeButton2;

    @FindBy(xpath = "//input[contains(@id ,'event-full-daycal')]")
    public WebElement allDayButton;

    @FindBy(xpath = "//input[contains(@id, 'event-remindercal')]")
    public WebElement setReminder;


    @FindBy(xpath = "//input[contains(@id, 'event-remind_countcal')]")
    public WebElement countTime;


    @FindBy(xpath = "//input[contains(@id, 'feed-cal-event-namecal')]")
    public WebElement eventName;

    @FindBy(xpath = "//input[contains(@id, 'event-locationcal')]")
    public WebElement eventLocation;

    @FindBy(xpath = "//div[@id= 'bxecmr_1']")
    public WebElement westRoom;

    @FindBy(xpath = "//a[contains(@id, 'feed-event-dest-add-link')]")
    public WebElement members;


    @FindBy(xpath = "(//button[contains(@id, 'blog-submit-button')])[1]")
    public WebElement sendButton;

    @FindBy(xpath = "(//div[.='Event'])[1]")
    public WebElement createdEvent;

    @FindBy(id = "blog-submit-button-cancel")
    public WebElement cancelButton;

    @FindBy(xpath = "//span[.='Send message …']")
    public WebElement sendMessage;



    public void selectStartAndEndDate(int day){

       Driver.getDriver().findElement(By.xpath("//div[@class='bx-calendar-range']//a[.='" + day + "']")).click();

    }

    public void selectStartingTime(int hour, int minute){

        BrowserUtils.sleep(2);

        WebElement hourInput = Driver.getDriver().findElement(By.xpath("//input[@title='Hours']"));

        Actions actions = new Actions(Driver.getDriver());

       actions.doubleClick(hourInput).perform();
       hourInput.sendKeys(Keys.DELETE+String.valueOf(hour));

       WebElement minuteInput = Driver.getDriver().findElement(By.xpath("//input[@title='Minutes']"));

       actions.doubleClick(minuteInput).perform();

       minuteInput.sendKeys(Keys.DELETE+String.valueOf(minute));

       setTimeButton1.click();

     }
    public void selectEndingTime(int hour, int minute){

        BrowserUtils.sleep(2);

        WebElement hourInput = Driver.getDriver().findElement(By.xpath("(//input[@title='Hours'])[2]"));

        Actions actions = new Actions(Driver.getDriver());

        actions.doubleClick(hourInput).perform();
        hourInput.sendKeys(Keys.DELETE+String.valueOf(hour));

        WebElement minuteInput = Driver.getDriver().findElement(By.xpath("(//input[@title='Minutes'])[2]"));

        actions.doubleClick(minuteInput).perform();

        minuteInput.sendKeys(Keys.DELETE+String.valueOf(minute));

        setTimeButton2.click();

    }

    public void setTimeAndType(int time, String timeType){

        if(countTime.isDisplayed()){
            Actions actions = new Actions(Driver.getDriver());

            actions.doubleClick(countTime).perform();
            countTime.sendKeys(Keys.DELETE+String.valueOf(time));

            Select select = new Select(Driver.getDriver().findElement(By.xpath("//select[contains(@id, 'event-remind_typecal')]")));
            select.selectByValue(timeType);
        } else{

            setReminder.click();
            Actions actions = new Actions(Driver.getDriver());

            actions.doubleClick(countTime).perform();
            countTime.sendKeys(Keys.DELETE+String.valueOf(time));

            Select select = new Select(Driver.getDriver().findElement(By.xpath("//select[contains(@id, 'event-remind_typecal')]")));
            select.selectByValue(timeType);

        }

    }

    public void selectMembers(List<String> membersEmails){

        members.click();

        for (String membersEmail : membersEmails) {
            Driver.getDriver().findElement(By.xpath("//span[@class='bx-finder-groupbox-content']//a[.='"+membersEmail+"']")).click();
        }


    }



}
