@TID1001REV0.3.0
Feature: User should be able to secure his account

  Background:
    Given user is on login page

  Scenario: Login with invalid credentials
    When he enters valid username and invalid password
    Then failed login info should be visible

  Scenario: Login with valid credentials
    When he enters valid credentials
    Then he is logged in