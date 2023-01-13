
Feature: Combat entre un Gaulois et un navire
  Scenario: Gaulois gagne le combat contre un navire
    Given Un Gaulois de taille 180 et un navire avec un équipage de 10 pirates
    When Le Gaulois et le navire se battent
    Then Le Gaulois gagne le combat et le capitaine pirate est enlevé du navire
