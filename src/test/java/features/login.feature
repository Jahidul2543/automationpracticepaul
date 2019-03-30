@FunctionalTest
Feature: Log in

Scenario Outline: Attempt to log in using invalid credentials
  Given User is in sign in page
  When Users uses incorrect "<email>" and "<password>"
  Then Unable to log in and error message should be displayed
  Examples:
    |email           | password|
    |email@gmail.com | abcd123 |
    |abcd@gmail.com  | abcd1524|


