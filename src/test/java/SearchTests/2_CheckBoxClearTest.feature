#2-Senaryo : Checkbox Clear Function
#Arama çubuğuna metin yazıldıktan sonra yanda beliren temizle (çarpı/x) ikonuna tıklanarak input
#alanının boşaltılması.

  Feature: CheckBox Clear

    Background:
      Given User navigates to main page

    @navbar
    Scenario Outline: Validation of input clearing
      When Enter "<keys>" in search input
      And User clicks clear button
      Then Search input should be empty

      Examples:
        | keys |
        | abcdef |
        | ajısrj |