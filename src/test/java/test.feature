
  Feature: Search product and add to cart

    Scenario: Find product on searchbar / add to cart
      Given Navigate to Website
      And Search product on searchbar
      And Pick from products list
      And Go to product page
      When Add product to cart
      Then Verify product added to cart
