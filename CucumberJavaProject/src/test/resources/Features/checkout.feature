Then User is on the checkout information page

    When User enters their shipping information
    And User continues to the next step
    And User finishes the checkout process
    Then User should see the order confirmation page
    