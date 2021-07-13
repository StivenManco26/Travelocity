#Author: manco.5@hotmail.com

@tag
Feature: Login in travelocity
  As a Web User
  I want to login into travelocity web page
  To should see home page

  @login
  Scenario: Login
    Given that User wants sign in into Travelocity
    When he enter the username and password
      | username            | password   |
      | manco.5@hotmail.com | Soluciones |
    Then To should see his name in the next page
      | name   |
      | Stiven |