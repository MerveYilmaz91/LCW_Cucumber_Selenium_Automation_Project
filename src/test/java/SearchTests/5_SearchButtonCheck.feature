#5- Senaryo : Search Button Check
#Klavye "Enter" tuşu haricinde büyüteç ikonuna tıklandığında da arama işleminin başarıyla başlaması.

Feature: Search Button Check

  @navbar
  Scenario Outline:
    Given User navigates to website
    When Enter "<searchKey>" in search input
    And Click to search button
    Then User must see searched words in url
      | word1 |
      | kazak |

    Examples:
      |searchKey|
      |  kazak  |