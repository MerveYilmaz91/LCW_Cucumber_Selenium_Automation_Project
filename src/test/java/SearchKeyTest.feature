
Feature:Search Key Test

  Scenario: When user search keys, these keys must be in the product page

  Given User navigates to main page
  When Enter "kolsuz gömlek" in search input
  And Click to a product in search page and navigate to product page
  Then User be able to see "kolsuz" and "gömlek" in the product description

