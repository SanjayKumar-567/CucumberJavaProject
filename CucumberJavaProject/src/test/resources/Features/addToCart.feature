Feature: Checkout functionality for e-commerce site

  Scenario: User successfully adds items to cart and completes checkout
    When User adds items to the cart
      | productId                         |
      | add-to-cart-sauce-labs-backpack   |
      | add-to-cart-sauce-labs-bike-light |
    And User views the shopping cart
    Then User should see the added items in the cart
