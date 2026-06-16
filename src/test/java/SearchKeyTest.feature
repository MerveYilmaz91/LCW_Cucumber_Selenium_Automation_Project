
Feature:Search Key Test

  Scenario: When user search keys, these keys must be in the product page

  Given User navigates to main page
  When Enter "kolsuz tişört " in search input
  And Click to a product in search page and navigate to product page
  Then User be able to see "kolsuz" and "tişört" in the product description

