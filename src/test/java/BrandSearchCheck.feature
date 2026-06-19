#Senaryo : Brand Search Check
# LCW bünyesinde satılan spesifik bir marka adı ("PUMA" vb.) aratıldığında
# o markanın sayfasına veya marka filtrelenmiş ürün listesine gidilmesi,
# ilk 10 ürün markasını doğrulama.

Feature: Brand Search Check

  Background:
    Given User navigates to main page

  @brand
  Scenario Outline: Validate brand search result
    When Enter "<brandName>" in search input and search
    Then User must see "PUMA" brand in product 10 at least

    Examples:
      | brandName |
      | PUMA      |