
Feature: As a user, I should be able to send messages by  clicking on Message tab under Active Stream.



  Background: Verify user type 'Human Resource ' can login
    Given user is on the login page
    When user enters username "hr1@cybertekschool.com"
    And user enters password "UserUser"
    Then clicks to the Log In button
    And user lands on the home page.
  @wip
    Scenario: User should be able to send a message by filling in the mandatory fields.
      Given user clicks to the Message Tab on the Navigation Bar
      When user writes a message in to the Message Field
      And chooses one or more  recipients from recipient input
      And clicks on to the Send button
      Then verify that the message can be displayed on the Activity Stream

