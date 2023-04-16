Feature: users
  Scenario: I as an admin can add and edit users
    Given I set the GET api endpoint for the user
    When I am sending HTTP Api GET requests for users
    Then I received a valid HTTP response code 200 for Get All data users
    And I received valid data for all users