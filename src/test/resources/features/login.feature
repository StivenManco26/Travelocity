#Author: manco.5@hotmail.com

@tag
Feature: Login in travelocity
  As a Web User
  I want to login into travelocity web page
  To should see home page

  @login @smokeTest
  Scenario: Login
    Given that User wants sign in into Travelocity
    When he enter the username and password
      | username                | password       |
      | johanescobar1@gmail.com | DevcoPass.2021 |
    Then To should see his name in the next page
      | name  |
      | Johan |