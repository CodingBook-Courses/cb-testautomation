Feature: Navigate to dropdown page

  Scenario Outline: Navigate to an exercise element
    Given Browser is in the home page
    Then A number is selected
    |number|
    |1     |
    |2     |
    |3     |

    When "<exerciseName>" link is clicked
    Then "<exerciseName>" exercise page is loaded

    Examples:
    | exerciseName |
    | dropdown     |
    | checkboxes   |
