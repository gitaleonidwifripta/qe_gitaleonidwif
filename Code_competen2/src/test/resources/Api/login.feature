Feature: as a user I can login

  Scenario: I as a user successfully logged in
    Given I set POST endpoints
    When I send POST HTTP request
    And I receive valid HTTP response code Login 201
    Then I received the correct data

