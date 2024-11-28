Feature: Checkout functionality for e-commerce site

  Scenario: User successfully adds items to cart and completes checkout
    Given User is on the login page
    When User enters valid credentials
      | username      | password     |
      | standard_user | secret_sauce |
    And User clicks on the login button
    Then User is redirected to the products page
    When User adds items to the cart
      | productId                         |
      | add-to-cart-sauce-labs-backpack   |
      | add-to-cart-sauce-labs-bike-light |
    And User views the shopping cart
    Then User should see the added items in the cart
    When User removes an item from the cart
    And User proceeds to checkout
    Then User is on the checkout information page
    When User enters their shipping information
      | firstName | lastName | postalCode |
      | sanjay    | kumar    |     600091 |
    And User continues to the next step
    And User finishes the checkout process
    Then User should see the order confirmation page
