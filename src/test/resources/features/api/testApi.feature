Feature: API Testing

  Scenario: Get user by ID
    Given valid user ID
    When GET request to the API
    Then receive 200 response code