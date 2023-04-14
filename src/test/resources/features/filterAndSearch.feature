@CTSL10-
Feature: Filter and search functionality
  As a user, I should be able to use "Filter and search" functionality on Active Stream.

  Background: Verify user type 'Human Resource' can login
    Given user is on the login page
    When user enters username "hr1@cybertekschool.com"
    And user enters password "UserUser"
    Then clicks to the Log In button
    And user lands on the home page.
    When user hover over and clicks the filter and search box

  @CTSL10-
  Scenario: Verifying to see default filters
    Then user should be able to see default filters as my activity, work, favorite, announcements and workflows

  @CTSL10-
  Scenario: Verify that user should be able to add and remove fields
    When user clicks the Restore default fields button and add field button
    And user sees Date, Type, Author and To fields checked as default
    And user clicks to the Favorites, Tag and Extranet field checkboxes
    And user sees all choosen fields' input boxes is displayed on the screen
    Then user unchecks all field checkboxes and user sees all input boxes disappeared


  @CTSL10-
  Scenario: Verify that user should be able to search by specifying the date.
    When user clicks to the Restore default fields button
    When user clicks to the date box and specific dates appears
    And user chooses the Exact Date as an option
    And a new date input box appears and user clicks to this input box
    And user chooses a random date
    Then user clicks the search button


  @CTSL10
  Scenario: Verify that user should be able to search by selecting single type.
    Given user clicks to the Restore default fields button
    When user clicks to the type box and specific types appears
    And user chooses Polls as a single option
    And user should see Polls type inside the type input box
    Then user clicks the search button

  @CTSL10
  Scenario: Verify that user should be able to search by selecting multiple types.
    When user clicks to the type input box delete button
    And user clicks to the Restore default fields button
    And user clicks to the type box and specific types appears
    And user chooses Posts, Announcements and Appreciations as multiple options
    And user should see Posts, Announcements and Appreciations types inside the type input box
    Then user clicks the search button

  @CTSL10-
  Scenario: Verify that user should be able to save the filter.
    When user clicks to the save filter button
    And user gives name of the filter as "MY FILTER"
    And user clicks to the Save button
    Then user should see the "MY FILTER" as filter name under the filters menu

  @CTSL10-
  Scenario: Verify that user should be able to restore the default field.
    When user clicks to the add field button
    And user clicks to the Favorites, Tag and Extranet field checkboxes
    And user clicks to the Restore default fields button
    Then user should see Date, Type, Author and To fields checked and Favorites, Tag, Extranet fields unchecked as default

  @CTSL10-
  Scenario: Verify that user should be able to reset filters to default.
    When user clicks to the add field button
    And user clicks to the Favorites, Tag and Extranet field checkboxes
    And user clicks to the Reset Button
    And user hover over and clicks the filter and search box
    Then user should see Date, Type, Author and To fields checked and Favorites, Tag, Extranet fields unchecked as default


