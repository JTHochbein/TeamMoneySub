@CalculationTest

Feature:  Calculation of total price

  Scenario:  successfull calculation of the total price

    Given user opens the website tdw
    When  the user adds at least five articles to the shopping cart
    And   clicks on shopping cart
    Then  the user receives a total price that corresponds to the sum of all articles

