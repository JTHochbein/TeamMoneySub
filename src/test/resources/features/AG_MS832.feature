@checkoutWithoutLogin

Feature:  Checkout Process

  Scenario:  The late login after the check-out works as a user

    Given a user wants to add items to the shopping cart without logging in to their account
    When  the user visits the website and selects the items they want to purchase
    When  the user proceeds to checkout without logging in
    Then  the user sees the confirmation message

