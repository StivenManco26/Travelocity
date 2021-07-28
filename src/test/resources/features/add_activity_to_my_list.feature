#Author: manco.5@hotmail.com

@tag
Feature: add activity to my list
  As a Web User
  I want add a activity to my list
  to save for later

  @addActivityToMyList
  Scenario: add activity to my list
    Given that the user enters the parameters for thing to do search
      | location | from         | to           |
      | medellin | Aug 29, 2021 | Aug 30, 2021 |
    When he attempts add the first result at your list
    Then he should see the activity in your list