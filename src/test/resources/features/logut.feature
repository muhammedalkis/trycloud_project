@CLOUD-1146
Feature: TryCloud logout feature
  User Story=
  As a user, I should be able to log out.

  Background: User should be logged in and be on the dashboard
    Given User should be logged in with valid credentials

  @CLOUD-1361
  Scenario: User can log out and ends up in login page
    Given user clicks to logout button
    Then user should be back to login page

  @CLOUD-1363
  Scenario: User can not go to home page again by clicking step back button after successfully logged out.
    Given user clicks to logout button
    And user clicks to back button
    Then user shouldn't be able to go to home page again


