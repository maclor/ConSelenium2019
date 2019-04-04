Feature: Adding product to cart

  Scenario Outline: Ability to add product from different pages to cart
    Given customer is on <page> page
    When he adds product to cart from popover
    Then this product should be added to cart
    Examples:
      | page     |
      | main     |
      | category |

  Scenario: Ability to add product to cart form product page
    Given customer is on product page
    When he adds product to cart
    Then this product should be added to cart