
Feature: As a user, I should be able to send messages by  clicking on Message tab under Active Stream.



  Background: Verify user type 'Human Resource ' can login
    Given user is on the login page
    When user enters username "hr1@cybertekschool.com"
    And user enters password "UserUser"
    Then clicks to the Log In button
    And user lands on the home page.


    Scenario: User should be able to send a message by filling in the mandatory fields.
      Given user clicks to the Message Tab on the Navigation Bar
      When user writes a message in to the Message Field
      And chooses one or more  recipients from recipient input
      And clicks on to the Send button
      Then verify that the message can be displayed on the Activity Stream


  Scenario: Verify that user can not sends a message by not filling the 'Message Content' mandatory fields.
    Given user clicks to the Message Tab on the Navigation Bar
    And chooses one or more  recipients from recipient input
    And clicks on to the Send button
    Then verifies to see that -The message title is not specified- text as error message


  Scenario: Verify that The message delivery is 'All employees' by default and it is changeable.
    Given user clicks to the Message Tab on the Navigation Bar
    When user writes a message in to the Message Field
    When user checks recipient input and should verifies that All Employees as default recipient
    And user clicks Add More button and should be able to add more recipients
    And user should be able to delete recipients
    And clicks on to the Send button
    Then verifies to see that -Please specify at least one person- text as error message

  @wip
  Scenario: Verify that user can cancel sending messages at any time before sending.
    Given user clicks to the Message Tab on the Navigation Bar
    When user writes a message in to the Message Field
    And chooses one or more  recipients from recipient input
    And clicks on to the Cancel button
    Then verifies that messagefield is dissappear and send message... is displayed under the message part

