Feature: Navigate to dropdown page

  Scenario Outline: Navigate to dropdown element
    Given Browser is in the home page
    When "<exerciseName>" link is clicked
    Then "<exerciseName>" exercise page is loaded

    Examples:
    | exerciseName |
    | dropdown     |
    | checkboxes   |
