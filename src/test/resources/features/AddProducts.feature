@regression @addtocart
Feature: Add the products to Cart
  As a user
  I want to add the products to cart
  So that I can verify the products in the cart

  Background:
    * The user is on the login page
    * The user enters valid credentials
    * The user verifies the login is successful

  Scenario: Add the products to Cart
    When The user sorts the products by "Price (high to low)"
    And The user adds the products to cart
      | Sauce Labs Backpack               |
      | Sauce Labs Bike Light             |
      | Sauce Labs Bolt T-Shirt           |
      | Sauce Labs Fleece Jacket          |
      | Sauce Labs Onesie                 |
      | Test.allTheThings() T-Shirt (Red) |
    Then The user verifies the products are added to cart
    When The user clicks on the cart icon
    Then The user verifies the added products are displayed in the cart
      | Sauce Labs Backpack               |
      | Sauce Labs Bike Light             |
      | Sauce Labs Bolt T-Shirt           |
      | Sauce Labs Fleece Jacket          |
      | Sauce Labs Onesie                 |
      | Test.allTheThings() T-Shirt (Red) |
    When The user clicks on the checkout button and fills the form
    And The user clicks on the continue button and clicks on the finish button
    Then The user verifies the order is placed successfully
