Feature: Navigate to dropdown page

#  Background is like Before hook in TestNG. It is called before each scenarios
  Background:
    Given Browser is in the home page

  Scenario Outline: Navigate to an exercise element
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
