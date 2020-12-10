Feature: Navigate to dropdown page

  Scenario: Navigate to dropdown element
    Given Browser is in the home page
    When "dropdown" link is clicked
    Then "dropdown" exercise page is loaded

  Scenario: Navigate to checkbox element
    Given Browser is in the home page
    When "checkboxes" link is clicked
    Then "checkboxes" exercise page is loaded
