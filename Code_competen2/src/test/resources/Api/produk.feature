Feature: product

  Scenario: I as an admin can add and edit products
    Given I set GET endpoints
    When I send GET HTTP request
    Then I receive valid HTTP response code 200
    And I received valid data for all products

  Scenario: PUT - As admin I have be able to to update existing user
    Given I set PUT endpoints
    When I send PUT HTTP request
    Then I received a valid HTTP response code 200 on the product's PUT
    And I received valid data for the product

  Scenario: DELETE- As admin I have be able to to delete existing user
    Given I set DELETE endpoints
    When I send DELETE HTTP request
    Then I received a valid HTTP response code 200 on a product DELETE

