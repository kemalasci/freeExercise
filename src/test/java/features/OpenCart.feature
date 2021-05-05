Feature: openCart web page test

  Scenario:check site products
  Given Open the openCart web page
    When Check login status
    Then  Search Mac and add to card
    And total product and price control
