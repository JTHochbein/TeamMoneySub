@cookiestest

Feature: cookies

  Scenario: accept cookies on chipde

  Given   user is on website chipde
  When    user accepts cookies on chipde
  Then    the cookie frame vanishes on chipde

  Scenario: accept cookies on spiegelde

  Given   user is on website spiegelde
  When    user accepts cookies on spiegelde
  Then    the cookie frame vanishes on spiegelde

  Scenario: accept cookies on focusde

  Given   user is on website focusde
  When    user accepts cookies on focusde
  Then    the cookie frame vanishes on focusde