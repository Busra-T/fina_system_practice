 @smoke @login

Feature: Fina login functionalities
  Agile Story: As a user, I should be able to access all the features on the login page.

  Background: For all scenarios user is on the login page
    Given user is on the login page


  Scenario: Fina login verification with valid credentials
    Then user enters a valid e-mail
    And user enters a valid password
    And user clicks on the Log in button
    Then should see the #Inbox in the title

  Scenario Outline: Fina invalid login message verification
    And user enters invalid "<email>" and "<password>" combinations
    Then user should see "Wrong login/password" message

    Examples:
      | email                 | password   |
      | abcd@info.com         | posmanager |
      | posmanager19@info.com | pos123     |
      | abcd@info.com         | pos123     |


  Scenario Outline: Fina login attempt with empty field message verification
    Then clicks on Log in button with empty "<email>" and "<password>" combinations
    Then warning message should be displayed

    Examples:
      | email                 | password   |
    #  |                       |            |
      | posmanager19@info.com |            |
     # |                       | posmanager |








