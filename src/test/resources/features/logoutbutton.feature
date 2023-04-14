
Feature: Log out Function

	Background:
	@CTSL10-321
	Scenario: Verify user type 'Human Resource ' can login
		Given user is on the login page
		When user enters username "hr1@cybertekschool.com"
		And user enters password "UserUser"
		Then clicks to the Log In button
		And user lands on the home page.



	@CTSL10-375
	Scenario: Users can log out button
		And users click dropdown contains username right side
		When user select log out
		Then will log out succesfully

	@CTSL10-376
	Scenario:  Users see 5 options under the profile name.
		When users click dropdown contains username right side
		Then see five options under profile name


	@CTSL10-377
	Scenario: User can not go to the home page again by clicking the step back button
		And users click Log out button under profile name
		When after succesfully log out users click to the go back button on browser