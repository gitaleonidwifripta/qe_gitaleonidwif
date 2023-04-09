@login
Feature: login sepulsa
  @userA
  Scenario: as a user i can login
    Given I am on the login page
    When I clicked the enter button
    And  I enter valid Email
    And I enter valid Password
    And I clicked the enter login
    Then i am on the home page

  @userB
  Scenario: As a user I can't login successfully
    Given I am on the login page
    When I clicked the enter button
    And  I enter invalid Email
    And I enter invalid Password
    And I clicked the enter login
    Then I can see error message "Coba ingat-ingat lagi alamat e-mail/ nomor handphone dan password kamu. Masih ada yang salah nih."