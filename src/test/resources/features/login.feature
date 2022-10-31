@CLOUD-1250
Feature: Trycloud app login feature
  User Story:
  As a user, I should be able to login so that I can land on the dashboard page.

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user is on the  login page


  @CLOUD-1236
  Scenario: User should be able to login upon entering valid credentials by hitting the enter button.
    When user enters the valid username
    And user enters the valid password
    And user hits the enter
    Then user should be on the login dashboard

  @CLOUD-1237
  Scenario: User should be able to login upon entering valid credentials by clicking the sing in button.
    When user enters the valid username
    And user enters the valid password
    And user clicks to sign in button
    Then  user should be on the login dashboard

  @CLOUD-1238
  Scenario: User can not login with any invalid credentials
    When user enters the invalid username
    And user enters the invalid password
    And user clicks to sign in button
    Then user should see Wrong username or password error message

  @CLOUD-1239
  Scenario: Invalid username&password shouldn't login the user.
    When user enters the invalid username
    And user enters the valid password
    And user clicks to sign in button
    Then user should see Wrong username or password error message

  @CLOUD-1240
  Scenario: Capitilazed valid username & valid password shouldn't log in the user.
    When user enters capitalized valid username
    And user enters the valid password
    And user clicks to show password button
    And user clicks to sign in button
    Then user should see Wrong username or password error message

  @CLOUD-1241
  Scenario:Valid username & fully capitalized valid password shouldn't login the user.
    When user enters the valid username
    And user enter capitalized valid password
    And user clicks to sign in button
    Then user should see Wrong username or password error message

  @CLOUD-1242
  Scenario:Valid username with only lowercase letters & valid password shouldn't login in the user.
    When user enters valid username with only lowercase letters
    And user enters the valid password
    And user clicks to sign in button
    Then user should see Wrong username or password error message

  @CLOUD-1243
  Scenario:Valid user name & valid password with only lowercase letters shouldn't login the use.
    When user enters the valid username
    And user enters valid password with only lowercase letters
    And user clicks to sign in button
    Then user should see Wrong username or password error message

  @CLOUD-1244
  Scenario: "Please fill out this field" message should be displayed if the username is empty
    When user enters the valid password
    And user clicks to sign in button
    Then user should see Please fill out this field error message

  @CLOUD-1245
  Scenario: "Please fill out this field" message should be displayed if the password is empty
    When user enters the valid username
    And user clicks to sign in button
    Then user should see Please fill out this field error message

  @CLOUD-1246
  Scenario:Password entered should displayed in form of dots by default.
    When user enters the valid password
    Then password should be displayed in form of dots by default.

  @CLOUD-1247
  Scenario: Password entered should be displayed explicitly if needed.
    When user enters the valid password
    And user clicks to show password button
    Then user should be able to see password explicitly.

  @CLOUD-1248
  Scenario:User can see the "Forgot password?" link on the login page and can see the "Reset Password"
  button on the next page after clicking on forget password link
    When user click to forgot password link
    Then user should see reset password button

  @CLOUD-1249
  Scenario: User can see valid placeholders on Username and Password fields
    When user enters the valid username
    When user enters the valid password
    Then user should be able to type username and password






