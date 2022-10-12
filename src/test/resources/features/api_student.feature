Feature: Student Management API Test Automation
  Scenario Outline: Add a new Student
    Given Add Student JSON payload with "<fName>", "<lName>", "<stId>", "<stClass>" and "<country>"
    Then request with added JSON payload and check status code "200"
    Examples:
      | fName | lName | stId   | country   | stClass |
      | Mike  | Wong  | 223445 | Singapore | 3 A     |

  Scenario Outline: Fetch a existing Student
    Given Fetch student "<stId>" with http status "200"
    Examples:
      | stId  |
      | 223445 |

  Scenario Outline: Update a Student
    Given Update student "<fName>", "<lName>", "<stClass>", "<country>" using "<stId>" with http status "200"
    Examples:
      | fName | lName | stId   | country   | stClass |
      | Jhon  | Wong  | 223445 | Singapore | 3 B     |

  Scenario Outline: Delete a Student
    Given Delete student "<stId>" with http status "200"
    Examples:
      | stId  |
      | 223445 |
