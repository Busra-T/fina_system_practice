Feature: Fina channel functionality
  Agile Story: User should be able to create a channel and send message on the channel.

  Background: For all scenarios user is on the dashboard
    Given user is on the login page
    Then user enters a valid e-mail
    And user enters a valid password
    And user clicks on the Log in button
    Then should see the #Inbox in the title

  @wip
  Scenario: Fina channel name verification
    Given user goes to Discuss page
    Then user clicks + sign of Channels
    Then user writes "Demo Channel2" for the new channel
    And user clicks on #Create "Demo Channel2" to add the channel
    Then user should see the "Demo Channel2" under Channels






