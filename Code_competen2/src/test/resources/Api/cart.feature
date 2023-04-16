Feature: cart
  Scenario: I as an admin can add and edit products
    Given I set the GET api endpoint
    When I am sending HTTP Api GET request
    Then I received a valid HTTP response code 200 for Get All data Cart
    And I received valid data for all carts