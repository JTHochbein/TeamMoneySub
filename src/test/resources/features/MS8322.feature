@checkoutWithoutLogin

Feature:  Checkout Process

  Scenario:  The l2ate login after the check-out works as a user

    Given a user wants2 to add items to the shopping cart without logging in to their account
    When  the user 2visits the website and selects the items they want to purchase
    And   click on the2 checkout
    Then  they will be2 prompted to sign in to their account
    When  the user sign2s in with the Login Data
    Then  the user can 2complete the purchase

    Scenario: The late login after the check-out dont works as a user with wrong user data.

  Given a user wants to ad2d items to the shopping cart without logging in to their account,
  When  the user visits t2he website and selects the items they want to purchase,
  And   click on the chec2kout,
  Then  they will be prom2pted to sign in to their account,
  When  the user signs i2n with wrong user Data,
  Then  they will not be 2able to continue shopping and proceed to checkout because wrong user data.