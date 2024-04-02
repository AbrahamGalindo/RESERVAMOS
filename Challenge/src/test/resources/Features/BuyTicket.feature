Feature: BuyTicket

  @buyTicket
  Scenario Outline: Complete the buy ticket test
    Given Enter to the url "<url>"
    And Select departure location "<departure>"
    And Select destination location "<destination>"
    And Chose a travel date "<date>"
    And Click on search
    Then Choose a trip from the displayed options
    And Select seat
    And Enter the passenger name "<name>"
    And Enter the passenger lastName "<lastName>"
    And Enter the passenger email "<email>"
    And Click on next
    And Enter the payment information "<name>" "<lastName>" "<phone>" "<cardNumber>" "<cardDate>" "<CVC>"
    #Validation of the payment, but is not working the payment
    Examples:
      | url                    | departure                                | destination                              | date   | name | lastName | email               | phone      | cardNumber       | cardDate | CVC |
      | https://roll-bits.com/ | Ciudad de México Auditorio Nacional Cdmx | León Centro Max Hotsson Smart            | Mañana | John | Doe      | John@reservamos.com | 5522158197 | 2222400070000005 | 0330     | 737 |
      | https://roll-bits.com/ | León Centro Max Hotsson Smart            | Ciudad de México Auditorio Nacional Cdmx | Hoy    | John | Doe      | John@reservamos.com | 5522158197 | 2222400070000005 | 0330     | 737 |


