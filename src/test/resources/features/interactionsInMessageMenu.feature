Feature: Interactions in message menu
  As a user, I should be able to add link, insert video, mention, quote, add tag in message.

  Background: Verify user type 'Human Resource' can login
    Given user is on the login page
    When user enters username "hr1@cybertekschool.com"
    And user enters password "UserUser"
    Then clicks to the Log In button
    And user lands on the home page.

  Scenario: Verifying to be able to add mention in message
    When user clicks to the message button
    And user writes "Test by Junior QA " to the message area
    And user clicks to the add mention button
    And user adds mention to the Gurhan
    And user clicks to the send button
    Then user should  see "Gurhan" displayed on the Activity Stream

  Scenario: Verifying to be able to attach link to the specific text
    When user clicks to the message button
    And user writes "To be able to a good QA, please click the link => " to the message area
    And user clicks to the link button
    And user adds "https://www.youtube.com/watch?v=OLxaG0TNgMM" to the Link input area
    And user clicks to the save button
    And user clicks to the send button
    Then user should  see "https://www.youtube.com/watch?v=OLxaG0TNgMMurhan" displayed on the Activity Stream

  Scenario Outline: Verifying to be able to insert Youtube and Vimeo videos.
   When user clicks to the message button
   And user writes "Testing for video insert function in message menu " to the message area
     And user clicks to the insert video button
     And user adds "<Video Link>" to the video source input area
     And user chooses video size and clicks to the save button under vimeo video source
     And user clicks to the send button
     Then user should see inserted video is displayed on Activity Stream

    Examples:
      | Video Link                  |
      | https://vimeo.com/219525512 |

  Scenario: Verifying to be able to attach link to the specific text
    When user clicks to the message button
    And user writes "Test for link canceling => " to the message area
    And user clicks to the link button
    And user adds "Random Link" to the Link input area
    And user clicks to the save button
    And user clicks to the link text in the message area
    And user clicks to the link button
    And user clicks to the remove link button
    Then user should not see the link in the message area



  #1. User should be able to add mentions
  #2. User should be able to attach a link to the specified text.
  #3. User should be able to insert YouTube and Vimeo videos.
  #4. User should be able to cancel links before sending the message
  #5. User should be able to add tags to messages.
  #6. User should be able to remove tags before sending the message