@regression @login
  Feature: Test the login functionality
    In order to test the login functionality
    As a user
    I want to be able to login to the application

    Scenario: Login with valid credentials
      Given The user is on the login page
      When The user enters valid credentials
      Then The user verifies the login is successful