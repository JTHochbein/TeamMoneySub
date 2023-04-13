Feature: Find the best offer for a 100.000 Euros deposit

  Scenario: Find the best offer for a 100.000 Euros deposit
    Given The user locates to the „Festgeld“-Comparison on the focus.de website
    When  the user enters 100000 Euros as an amount
    And   the default filters remain, the timeperiod will be set to 12 months
    Then  after submitting a list of banks should be presented

  Scenario: Find the best offer for a 0 Euros deposit
    Given The user locates to the „Festgeld“-Comparison on the focus.de website
    When  the user enters 0 Euros as an amount
    And   the default filters remain, the timeperiod will be set to 12 months
    Then  after submitting a list of banks should be presented