
Feature: Recrutement de soldats par une Légion
  Scenario: Recrutement de 100 soldats
    Given Une Légion avec 500 soldats
    When La Légion recrute 100 soldats
    Then Le nombre de soldats de la Légion augmente de 100 pour atteindre 600

