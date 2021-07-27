#Author: manco.5@hotmail.com

@tag
Feature: search stays in travelocity
  As a Web User
  I want to search a stays into travelocity web page
  For my next trip

  @searchStays
  Scenario: Search stays
    Given that the user wants enters the parameters for stays search
      | destination | check in     | check out    |
      | paris       | Jul 29, 2021 | Jul 30, 2021 |
    When he clicks the search button
    Then he should see the stays offered in paris