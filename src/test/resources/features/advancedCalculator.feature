@tag
Feature: Advanced Calculator

  Scenario: sqrt of dividing two numbers
    Given Two int input values, 9 and 1
    When I get sqrt of dividing the two values
    Then I expect the double result 3

  Scenario Outline: sqrt of dividing two numbers
    Given Two int input values, <first> and <second>
    When I get sqrt of dividing the two values
    Then I expect the double result <result>

    Examples:
      | first | second | result |
      | 4     | 1      | 2      |
      | 36    | 4      | 3      |