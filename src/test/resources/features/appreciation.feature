@emin
Feature: Default

	Background: Verify user type 'Human Resource' can login
		Given user is on the login page
		When user enters username "hr1@cybertekschool.com"
		And user enters password "UserUser"
		And clicks to the Log In button
		Then user lands on the home page.

	@CTSL10-439 @CTSL10-443
	Scenario: Verify user can send an appreciation by filling the mandatory fields
		Given user clicks More button under Active Stream
		    When user should see and click Appreciation button
		    And  user should text appreciation message in the Message Content field
		    And  user removes All employes option from to field
		    And adds helpdesk22@cybertekschool.com user
		    And user chooses Gift from sticker field
		    And adds helpdesk22@cybertekschool.com user to recipient filed
		    And user clicks to Send button
		    Then user should see sent message on the activity stream page

	@CTSL10-440 @CTSL10-443
	Scenario: Verify the message delivery is to 'All employees' by default and changeable.
		Given user clicks More button under Active Stream
		When user should see and click Appreciation button
		And user should see All Employees as recipient of the message by default
		And  user removes All employes option from to field
		And adds Gurhan from the options

	@CTSL10-441 @CTSL10-443
	Scenario: Verify user can cancel sending appreciation at any time before sending
		Given user clicks More button under Active Stream
		When user should see and click Appreciation button
		And  user should text appreciation message in the Message Content field
		And user clicks cancel button
		Then appreciation content field is disappeared

	@CTSL10-442 @CTSL10-443
	Scenario: Verify user can select an icon
		Given user clicks More button under Active Stream
		When user should see and click Appreciation button
		And user chooses an icon from sticker field