@checkout

Feature:  checkout

  Scenario:  checkout test

    Given   user has at least one item in shopping cart
    And     user has opened shopping cart
    When    user does the checkout process
    Then    user gets an order number
    And     verification that is order is completed