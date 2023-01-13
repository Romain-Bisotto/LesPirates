
Feature: Ajout d'un pirate à un navire
  Scenario: Ajout d'un pirate âgé de 25 ans
    Given Un navire avec un butin de 500 pièces d'or
    When Un pirate âgé de 25 ans est ajouté au navire
    Then Le nombre de pirates à bord du navire augmente de 1 et le butin du navire diminue de 100 pièces d'or donc le butin est maintenant de 400 pièces d’or
