Feature: Fina login functionalities
  Agile Story: As a user, I should be able to access all the features on the login page.

  @login
  Scenario: Fina login verification with valid credentials
    Given user is on the login page
    Then user enters a valid e-mail
    And user enters a valid password
    And user clicks on the Log in button
    Then should see the #Inbox in the title





