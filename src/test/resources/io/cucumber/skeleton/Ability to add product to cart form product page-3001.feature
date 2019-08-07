#Auto generated Octane revision tag
@TID3001REV0.2.0
Feature: Adding product to cart from product view

  Scenario: Ability to add product to cart form product page
    Given customer is on product page
    When he adds product to cart
    Then this product should be added to cart