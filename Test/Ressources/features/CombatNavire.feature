
Feature: Combat entre deux navires
  Scenario: Navire 1 gagne le combat contre le Navire 2
    Given Un navire 1 avec un équipage de 30 pirates et un navire 2 avec un équipage de 20 pirates
    When Les deux navires se battent
    Then Le navire 1 gagne le combat et remporte le butin du navire 2