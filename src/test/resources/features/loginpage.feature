Feature: Default


	@CTSL10-321 @smoke
	Scenario: Verify user type 'Human Resource ' can login
		Given user is on the login page
		When user enters username "hr1@cybertekschool.com"
		And user enters password "UserUser"
		Then clicks to the Log In button
		And user lands on the home page.

	@CTSL10-323
	Scenario: Verify user type 'Help Desk ' can login
		Given user is on the login page
		When user enters username "helpdesk1@cybertekschool.com"
		And user enters password "UserUser"
		Then clicks to the Log In button
		And user lands on the home page.

	@CTSL10-322
	Scenario: Verify user type 'Marketing ' can login
		Given user is on the login page
		When user enters username "marketing1@cybertekschool.com"
		And user enters password "UserUser"
		Then clicks to the Log In button
		And user lands on the home page.

	@CTSL10-324
	Scenario: Verify -"Incorrect username or password." message is displayed for invalid credentials
		Given user is on the login page
		When user enters username "hr1@cybertekschool.com"
		And user enters password "useruser"
		Then clicks to the Log In button
		And "Incorrect username or password" message should be displayed

	@CTSL10-325
	Scenario: Verify - "Please fill out this field" message is displayed when the password or username is empty
		Given user is on the login page
		When user enters username "marketing1@cybertekschool.com"
		And user leaves the password field empty
		Then clicks to the Log In button
		And "Please fill out this field." message should displayed

	@CTSL10-326
	Scenario: Verify ‘Forgot Password’ link exists and is clickable on the login page
		Given user is on the login page
		And user sees Forgot Password link on the page.
		When user click to the forgot password link
		Then user lands on the "Get Password" page.


	@CTSL10-327
	Scenario: Verify user can see "Remember Me" link exists and is clickable on the login page
		Given user is on the login page
		And user sees Remember Me link on the page.
		Then user clicks to the link.

	@CTSL10-328
	Scenario: Verify user can see the password in bullet signs by default
		Given user is on the login page
		And user enters password "UserUser"
		Then user sees the written password in bullet signs.


