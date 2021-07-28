#Author: manco.5@hotmail.com

@tag
Feature: search cars
  As a Web User
  I want to search cars into travelocity web page
  For my transportation

  @searchCars
  Scenario: Search cars for airport transportation
    Given that the user wants search a airport transportation cars service
    When he enters the search parameters
      | airport  | hotel    | flight arrival date |
      | new york | new york | Jul 29, 2021        |
    Then he should see the cars service offered in new york