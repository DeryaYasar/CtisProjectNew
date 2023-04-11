Feature: upload files and pictures as message

  Background: user is already logged in
    Given user is on the login page
    When user enters username "hr1@cybertekschool.com"
    And user enters password "UserUser"
    Then clicks to the Log In button
    And user lands on the home page.

  @CTSL10-451 @CTSL10-450 @CtisSolutions
  Scenario: User should be able to upload multiple files at the same time (Test with max 3 files.)
    Given User clicks message tab on dashboard
    When User clicks upload file image and click upload files and images box
    And User selects three files and photos from his or her computer
    And User clikcs Send button to upload them
    Then Verify the all files uploaded as message


  @CTSL10-452 @CTSL10-450 @CtisSolutions
  Scenario: User should be able to upload files in different formats.
    Given User clicks message tab on dashboard
    When User clicks upload file image and click upload files and images box
    And User selects files in different formats(.pdf, .txt, .jpeg)
    And User clikcs Send button to upload them
    Then Verify the all files uploaded as message
    Given User clicks message tab on dashboard
    When User clicks upload file image and click upload files and images box
    And User selects files in different formats(.gif, .png, .docx)
    And User clikcs Send button to upload them
    Then Verify the all files uploaded as message

  @CTSL10-453 @CTSL10-450 @CtisSolutions
  Scenario: User should be able to upload pictures.
    Given User clicks message tab on dashboard
    When User clicks upload file image and click upload files and images box
    And User selects pictures in different formats(.jpeg, .gif, .png)
    And User clikcs Send button to upload them
    Then Verify the all files uploaded as message


  @CTSL10-454 @CTSL10-450 @CtisSolutions
  Scenario: User should be able to insert the files and images into the text
    Given User clicks message tab on dashboard
    When User clicks upload file image and click upload files and images box
    And User selects files in different formats(.pdf, .txt, .jpeg, .gif, .png, .docx)
    And User clicks insert the files and images into the text
    And User clikcs Send button to upload them
    Then Verify the files and images are inserted in message body


  @CTSL10-455 @CTSL10-450 @CtisSolutions
  Scenario: User should be able to remove files and images at any time before sending.
    Given User clicks message tab on dashboard
    When User clicks upload file image and click upload files and images box
    And User selects three files and photos from his or her computer
    And User should be able to remove one files or images at any time before sending
    And User clikcs Send button to upload them
    Then Verify the all files uploaded as message

  @CTSL10-456 @CTSL10-450 @CtisSolutions
  Scenario: User should be able to rename the file before sending it.
    Given User clicks message tab on dashboard
    When User clicks upload file image and click upload files and images box
    And User selects three files and photos from his or her computer
    And User should be able to rename one files or images at any time before sending
    And User clikcs Send button to upload them
    Then Verify the all files uploaded as message