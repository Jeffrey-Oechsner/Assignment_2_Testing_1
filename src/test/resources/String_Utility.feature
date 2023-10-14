Feature: String_Utility;

  Scenario: Reverse String
    Given String_Utility_reverse is available
    When I reverse "aBc" -> cBa
    Then the result is reversed should be "cBa"

  Scenario: Capitalize string
    Given String_Utility_capitalize is available
    When I Capitalize "aBc" -> ABC
    Then the result is capitalized should be "ABC"

  Scenario: Lowercase string
    Given String_Utility_lowercase is available
    When I Lowercase "aBc" -> abc
    Then the result is lowercase should be "abc"