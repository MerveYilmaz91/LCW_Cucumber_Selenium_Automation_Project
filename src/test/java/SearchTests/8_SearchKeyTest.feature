   #8-Senaryo:
      # 1- User anasayfaya gider
   # 2- Arama inputuna kolsuz tişört yazar
   # 3- İlk ürüne tıklar
   # 4- Açıklamada kolsuz ve tişört kelimelerinin geçtiği onaylanır
   #    https://www.lcwaikiki.com/



Feature:Search Key Test

  Scenario: When user search keys, these keys must be in the product page

  Given User navigates to main page
  When Enter "kolsuz tişört" in search input and search
  And Click to a product in search page and navigate to product page
  Then User be able to see "kolsuz tişört" in the product description

