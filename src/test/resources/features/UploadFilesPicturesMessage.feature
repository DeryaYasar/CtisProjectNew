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