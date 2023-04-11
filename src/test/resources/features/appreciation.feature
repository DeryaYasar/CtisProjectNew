

Feature: As a user, I should be able to send appreciation by clicking on Appreciation tab under Active Stream.

  Background:Verify user type 'Human Resource' can login
  Given user is on the login page
  When user enters username "hr1@cybertekschool.com"
  And user enters password "UserUser"
  Then clicks to the Log In button
  And user lands on the home page.


  Scenario: User should be able to send a appreciation by filling the mandatory fields.

    Given user clicks More button under Active Stream
    When user should see and click Appreciation button
    And  user should text appreciation message in the Message Content field
    And  user removes All employes option from to field
    And adds helpdesk22@cybertekschool.com user
    And user chooses Gift from sticker field
    And adds helpdesk22@cybertekschool.com user to recipient filed
    And user clicks to Send button
    Then user should see sent message on the activity stream page

  @emine
    Scenario: The message delivery should be to 'All employees' by default and should be changeable.

      Given user clicks More button under Active Stream
      When user should see and click Appreciation button
      And user should see All Employees as recipient of the message by default
      And  user removes All employes option from to field
      And adds Gurhan from the options


