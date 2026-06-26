# 7-Senaryo: Arama menüsü autocomplete case :

# Senaryo 1
# Arama çubuğuna 3 karakterden daha az (ör. "ko") değer girildiğinde otomatik tamamlama (autocomplete) menüsünün açılmaması.

# Negatif Senaryo 2
# Arama çubuğuna 3 karakterden daha fazla (ör. "kot") değer girildiğinde otomatik tamamlama (autocomplete) menüsünün açılması.

  Feature: Search input autocomplete test

    #Scenario: Check the autocomplete box is not visible after send 2 keys
     # Given User navigates to website
      #When Enter "ko" in search input user shouldn't see the autocomplete box



    Scenario: Check the autocomplete box is visible after send 2 keys
      Given User navigates to main page
      When Enter kot in search input user should see the autocomplete box