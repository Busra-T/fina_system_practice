@smoke @channel
Feature: Fina channel functionality
  Agile Story: User should be able to create a channel and send message on the channel.

  Background: For all scenarios user is on the dashboard
    Given user goes to the Discuss page


  @wip
  Scenario: Fina channel name verification
    Then user clicks + sign of Channels
    Then user writes channel name for the new channel
      |channel name| Wednesday |
    And user clicks on #Create channel name to add the channel
    Then user should see the channel name under Channels



    Scenario: Fina channel send message verification
      Then user clicks on #"Wednesday"
      And user writes a "message" in the message box
      Then user clicks on Send button






