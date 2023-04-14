Feature: As a user, I should be able to create a poll by clicking on Poll tab under Active Stream

  Background: Verify user type 'Human Resource' can login
    Given user is on the login page
    When user enters username "hr1@cybertekschool.com"
    And user enters password "UserUser"
    Then clicks to the Log In button
    And user lands on the home page.
    And user clicks Poll tab



  @CTSL10-458
  Scenario:User should be able to add users by selecting multiple contacts from Employees and Department's contact lists.
    And user writes a title in message box
    And user clicks Add more button
    And user clicks Employees and departments button
    And user selects multiple contacts
    And user click x button in order to close
    And user select log out


  @CTSL10-459
  Scenario: User should be able to add questions and multiple answers.
    And user writes a title in message box
    And user write questions
    And User clicks Answer1 and write an answer
    And User clicks Answer2 and write an answer
    And User clicks Answer3 and write an answer
    And user select log out

  @CTSL10-460
  Scenario: User should be able to delete questions and multiple answers.
    And user writes a title in message box
    And user write questions
    And User clicks Answer1 and write an answer
    And User clicks Answer2 and write an answer
    And user clicks x on question box
    And user select log out


  @CTSL10-461
  Scenario: User should be able to provide multiple choice to attendees by selecting the Allow multiple choice checkbox
    And user writes a title in message box
    And User clicks Allow multiple choise  checkbox
    And User clicks SEND button
    And user clicks Answer first checkbox
    And user clicks Answer second checkbox
    Then user should see Answer first still selected
    And user select log out

  @CTSL10-462
  Scenario: User should be able to create a poll with mandatory fields
    And User leaves blank in title message box, with default recipient
    And User clicks SEND button
    And Verify "The message title is not specified" message is displayed.
    Then user select log out