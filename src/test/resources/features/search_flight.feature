#Author: manco.5@hotmail.com

@tag
Feature: search flight one-way in travelocity
  As a Web User
  I want to search a flight one-way into travelocity web page
  For to plan my holiday

  @searchFlightOneWayInTheMorning
  Scenario: Search a flight one-way in the morning
    Given that the user wants enters the search parameters
      | origin   | destination | departing    |
      | new york | paris       | Aug 29, 2021 |
    When he selects the filter morning
    Then he should see the flights offered in the morning