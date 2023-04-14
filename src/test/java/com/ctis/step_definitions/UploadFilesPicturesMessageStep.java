package com.ctis.step_definitions;

import com.ctis.pages.UploadFilesPicturesMessage;
import com.ctis.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UploadFilesPicturesMessageStep {


    UploadFilesPicturesMessage uploadFilesPicturesMessage = new UploadFilesPicturesMessage();

    @Given("User clicks message tab on dashboard")
    public void user_clicks_message_tab_on_dashboard() {

        uploadFilesPicturesMessage.messagetab.click();

    }
    @When("User clicks upload file image and click upload files and images box")
    public void user_clicks_upload_file_image_and_click_upload_files_and_images_box() {

        uploadFilesPicturesMessage.UploadFilesImage.click();
        BrowserUtils.sleep(2);



    }
    @When("User selects three files and photos from his or her computer")
    public void user_selects_three_files_and_photos_from_his_or_her_computer() {
        BrowserUtils.sleep(2);
       /* String file1 = "/Users/suhedapehlivan/Desktop/ctisSoluions Project/files/Locators_Summary.pdf";
        String file2 = "/Users/suhedapehlivan/Desktop/ctisSoluions Project/files/git/github interview.docx";
        String file3 = "/Users/suhedapehlivan/Desktop/ctisSoluions Project/files/the starry night-van gogh.jpg";
        uploadFilesPicturesMessage.UploadFilesAndImagesBox.sendKeys(file1+ "\n" +file2+ "\n" +file3); */
        uploadFilesPicturesMessage.UploadFilesAndImagesBox.sendKeys("/Users/suhedapehlivan/Desktop/ctisSoluions Project/files/thestarrynight-vangogh.jpg");
        BrowserUtils.sleep(3);
        uploadFilesPicturesMessage.UploadFilesAndImagesBox.sendKeys("/Users/suhedapehlivan/Desktop/ctisSoluions Project/files/git_githubinterview.docx");
        BrowserUtils.sleep(3);
        uploadFilesPicturesMessage.UploadFilesAndImagesBox.sendKeys("/Users/suhedapehlivan/Desktop/ctisSoluions Project/files/Locators_Summary.pdf");
        BrowserUtils.sleep(3);

    }
    @When("User clikcs Send button to upload them")
    public void user_clikcs_send_button_to_upload_them() {
        uploadFilesPicturesMessage.SendButtonn.click();
        BrowserUtils.sleep(2);

    }
    @Then("Verify the all files uploaded as message")
    public void verify_the_all_files_uploaded_as_message() {

        Assert.assertTrue(uploadFilesPicturesMessage.photodisplayed.isDisplayed()||uploadFilesPicturesMessage.filesdisplayed.isDisplayed());

    }

    @And("User selects files in different formats\\(.pdf, .txt, .jpeg)")
    public void userSelectsFilesInDifferentFormatsPdfTxtJpeg() {
        uploadFilesPicturesMessage.uploaddifferentformatPhotoFiles1();
    }

    @And("User selects files in different formats\\(.gif, .png, .docx)")
    public void userSelectsFilesInDifferentFormatsGifPngDocx() {
        uploadFilesPicturesMessage.uploaddifferentformatPhotoFiles2();
    }


    @And("User selects pictures in different formats\\(.jpeg, .gif, .png)")
    public void userSelectsPicturesInDifferentFormatsJpegGifPng() {
        uploadFilesPicturesMessage.uploaddifferentformatPhoto3();

    }

    @And("User selects files in different formats\\(.pdf, .txt, .jpeg, .gif, .png, .docx)")
    public void userSelectsFilesInDifferentFormatsPdfTxtJpegGifPngDocx() {
        uploadFilesPicturesMessage.insertingPhotoFiles4();
    }

    @And("User clicks insert the files and images into the text")
    public void userClicksInsertTheFilesAndImagesIntoTheText() {
        uploadFilesPicturesMessage.insert.click();
    }

    @Then("Verify the files and images are inserted in message body")
    public void verifyTheFilesAndImagesAreInsertedInMessageBody() {
        Assert.assertFalse(uploadFilesPicturesMessage.messageBody.getText().isEmpty());
    }

    @And("User should be able to remove one files or images at any time before sending")
    public void userShouldBeAbleToRemoveOneFilesOrImagesAtAnyTimeBeforeSending() {
        uploadFilesPicturesMessage.removeButtonn.click();
    }

    @And("User should be able to rename one files or images at any time before sending")
    public void userShouldBeAbleToRenameOneFilesOrImagesAtAnyTimeBeforeSending() {

        uploadFilesPicturesMessage.renameMethd();
    }
}
