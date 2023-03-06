@abu
Feature: ERP Web table login feature

  User Story:
  As a user, I should be able to access all the features on the login page.


  Scenario Outline: login with valid credentials
    Given  user is on  Login page
    When  user enters correct email address"<emails>"
    Then    user enters correct password "<passwords>"
    And   user should see the dashboard page
    Examples:
      | emails                | passwords  |
      | posmanager15@info.com | posmanager |
      | posmanager10@info.com | posmanager |
      | posmanager12@info.com | posmanager |

  Scenario Outline: login with invalid credentials
    Given  user is on  Login page
    When   user enters invalid email address"<emails>"
    Then   user enters invalid password"<passwords>"
    And    user should see "Wrong login/password"
    Examples:
      | emails                | passwords |
      | abu15@info.com        | ag897     |
      | Posmanager10@info.com | 1234      |
      | John@gmail.com        | eruiour   |
