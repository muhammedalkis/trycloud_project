

Feature: Trycloud app login feature
  User Story:
  As a user, I should be able to login so that I can land on the dashboard page.

Background: For the scenarios in the feature file, user is expected to be on login page
Given user is on the  login page

  Scenario: User should be able to login upon entering valid credentials by hitting the enter button.
    When user enters the valid username
    And user enters the valid password
    And user hits the enter
    Then user should be on the login dashboard


    Scenario: User should be able to login upon entering valid credentials by clicking the sing in button.
      When user enters the valid username
      And user enters the valid password
      And user clicks to sign in button
      Then  user should be on the login dashboard

    Scenario: User can not login with any invalid credentials
      When user enters the invalid username
      And user enters the invalid password
      And user clicks to sign in button
      Then user should see Wrong username or password error message

      Scenario: "Please fill out this field" message should be displayed if the username is empty
        When user enters the valid password
        And user clicks to sign in button
        Then user should see Please fill out this field error message

        Scenario: "Please fill out this field" message should be displayed if the password is empty
          When user enters the valid username
          And user clicks to sign in button
          Then user should see Please fill out this field error message

