Feature: Interactions in message menu
  As a user, I should be able to add link, insert video, mention, quote, add tag in message.

  Background: Verify user type 'Human Resource' can login
    Given user is on the login page
    When user enters username "hr1@cybertekschool.com"
    And user enters password "UserUser"
    Then clicks to the Log In button
    And user lands on the home page.

  Scenario: Verifying to be able add mention in message
    When user clicks to the message
    And user writes "Test by Junior QA" to the message area
    And user clicks to the add mention button
    And user adds mention to the Gurhan
    And user clicks to the send button
    Then user should see Gurhan displayed on the Activity Stream







  #1. User should be able to add mentions
  #2. User should be able to attach a link to the specified text.
  #3. User should be able to insert YouTube and Vimeo videos.
  #4. User should be able to cancel links before sending the message
  #5. User should be able to add tags to messages.
  #6. User should be able to remove tags before sending the message