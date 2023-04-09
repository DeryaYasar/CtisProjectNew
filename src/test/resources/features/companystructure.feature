@wip
Feature:Use functions on Company Structure under Employee menu.

  Background:user is already logged in
    Given user is on the login page
    When user enters username "hr22@cybertekschool.com"
    And user enters password "UserUser"
    Then clicks to the Log In button
    And user lands on the home page.
    When user should click Employee tab

  @firstOK
  Scenario Outline: Verify all user types should be able to display company structure
    When user select log out
    When user clean username bar
    When user enters username "<Employee e-mail>"
    And user enters password "<Employee password>"
    Then clicks to the Log In button
    Then user should see Company Structure tab

    Examples:
      | Employee e-mail                | Employee password |
      | hr25@cybertekschool.com        | UserUser          |
      | helpdesk50@cybertekschool.com  | UserUser          |
      | marketing75@cybertekschool.com | UserUser          |

  @second-third-fourthOK
  Scenario Outline:Verify that Hr user should be able to add a department from the company structure and
  be able to select a parent department from the department dropdown should be able to select a supervisor
    When Hr user click ADD DEPARTMENT button
    And user write a department "<name>"

    When user select "<Parent Department>" from dropdown button
    When user click Select from structure button
    Then user select "<Structure Options>" and add supervisor
    And user click ADD button

    Examples:
      | name           | Parent Department | Structure Options |
      | DevOps         | Developer         | Company           |
      | Product Owners | group17           | Search            |
      | Cosmetic       | Tester1           | Recent            |

  @fifthOK
  Scenario:Verify Hr user should be able to close add department pop-up at any time before sending
    When Hr user click ADD DEPARTMENT button
    And user write a "<name>"
    And user click CLOSE button

    When Hr user click ADD DEPARTMENT button
    When user click Parent Department dropdown button
    When user select Parent Department from dropdown button
    And user click CLOSE button

    When Hr user click ADD DEPARTMENT button
    When user click Select from structure button
    Then user select "<Recent>" and add supervisor
    And user click CLOSE button

  @sixthOK
  Scenario Outline:Verify Hr user should be able to edit add child departments and
  Hr user should be able to edit departments and delete departments after adding the department
    When user hover over on a department
    And user click Add child department button
    And user write a "<child name>"
    When user select Parent Department from dropdown button
    And user click ADD button

    When user hover over on a department
    And user click Edit department button
    When user clean department "<parent name>" bar
    And user write a new "<name>"
    And user click save button
    And user click Delete child department button

    Examples:
      | child name | parent name | name      |
      | Team 1     | Developer   | Boss      |
      | Team 2     | Boss        | Developer |

  @seventhOK
  Scenario:Verify Hr user should be able to drag and drop the existing department under another department as a subdepartment
    When user drag and drop a department under another department

  @eighthOK
  Scenario Outline:Verify Helpdesk and marketing users can not change company structure
    Then user see ADD DEPARTMENT button
    When user select log out
    When user clean username bar
    When user enters username "<Employee e-mail>"
    And user enters password "<Employee password>"
    Then clicks to the Log In button
    Then user should not see ADD DEPARTMENT button
    When user select log out

    Examples:
      | Employee e-mail                | Employee password |
      | helpdesk50@cybertekschool.com  | UserUser          |
      | marketing75@cybertekschool.com | UserUser          |





