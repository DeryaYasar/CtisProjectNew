@CTSL10-475
Feature: Interact with employees on the posts

  Background: user is already logged in
    Given user is on the login page
    When user enters username "hr1@cybertekschool.com"
    And user enters password "UserUser"
    Then clicks to the Log In button
    And user lands on the home page.


  @CTSL10-471
  Scenario: Verify that user can be able to make a comment, like, or unfollow other employees posts.
    When user makes a comment "My test comment" on others post
    And user likes on other employees' post
    And user unfollows other employees post
    Then user verifies that the comment is posted
    Then user verifies that the post is liked
    Then user verifies that the post is unfollowed


  @CTSL10-472
  Scenario: Verify that user can be able to make a comment, like, or unfollow other employees posts.
    When user likes his-her own comment
    And user replies his-her own comment
    Then user verifies the comment is liked
    Then user verifies the comment is replied


  @CTSL10-473
  Scenario: Verify that After making a comment user should be able to, "edit", "delete" by clicking more
    When user edits his-her comment
    Then user verifies that his-her comment edited
    And user clicks to delete button
    Then user sees the comment deleted message


  @CTSL10-474
  Scenario: Verify that User should be able to add and remove others' posts to favorites by clicking on the Star icon.
    When user clicks to star icon
    And user clicks to filter and search input
    And user chooses Favorites
    Then user verifies that the favorite post is seen under the activity stream