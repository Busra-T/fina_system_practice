@channel
Feature: Fina channel functionality
  Agile Story: User should be able to create a channel and send message on the channel.

  Background: For all scenarios user is on the dashboard
    Given user goes to the Discuss page


  @wip
  Scenario: Fina channel name verification
    Then user clicks + sign of Channels
    Then user writes "Demo Channel2" for the new channel
    And user clicks on #Create "Demo Channel2" to add the channel
    Then user should see the "Demo Channel2" under Channels

    Scenario: Fina channel send message verification
      Then user clicks on #"Demo Channel2"
      And user writes a "message" in the message box
      Then user clicks on Send button






