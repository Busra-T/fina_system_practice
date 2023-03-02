
@smoke @order
  Feature: Fina manufacturing orders functionalities
    Agile Story: As a Point of Sale manager (POS), I should be able to create manufacturing orders.

    Background: For all the scenarios user is on the dashboard
      Given user goes to the Discuss page

      Scenario: Fina manufacturing order creation verification
       When User goes to the Manufacturing page
        Then User clicks to Create
        And User fills in the fields
        And User clicks to Save
        Then User sees the order info and confirmation message.




