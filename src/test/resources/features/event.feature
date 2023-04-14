@wip
Feature: Event modules functionality

  Background:Verify user type 'Human Resource ' can login
    Given user is on the login page
    When user enters username "hr1@cybertekschool.com"
    And user enters password "UserUser"
    Then clicks to the Log In button
    And user lands on the home page.

  @CTSL10-444
  Scenario: User should be able to add Event start and ending date and time, select "All day"
    When user clicks Event tab
    And User sets starting date and time
    And USer sets ending date and time
    Then User selects All day

  @CTSL10-445
  Scenario Outline: User should be able to set reminder
    When user clicks Event tab
    And User click set reminder radio button
    Then User sets count and "<time type>"
    Examples:
      |time type|
      |min|
      |hour  |
      |day   |

  @CTSL10-446
  Scenario: User should be able to send event by filling in the mandatory fields.
    When user clicks Event tab
    And User writes event name
    And User select event location
    And User adds members to event
    |hr5@cybertekschool.com|
    |marketing48@cybertekschool.com|
    |helpdesk23@cybertekschool.com      |
    |marketing50@cybertekschool.com|
    And User creates event
    Then user sees event created


  @CTSL10-447
  Scenario: User should be able to cancel sending event at any time before sending
    When user clicks Event tab
    And User writes event name
    And User select event location
    And User adds members to event
      |hr5@cybertekschool.com|
      |marketing48@cybertekschool.com|
    And User cancels the event