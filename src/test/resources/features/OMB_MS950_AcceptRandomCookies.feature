Feature: Accept Random Cookies

  Scenario: Visit all three websites and accept all cookies
    Given The user locates to three different websites
    When click on accept all cookies button
    Then cookie popup should disappear
    And list number of cookies for each website

  Scenario: Visit all three websites and deny all cookies
    Given The user locates to three different websites
    When click on deny all cookies button
    Then cookie popup should disappear
    And list number of cookies for each website