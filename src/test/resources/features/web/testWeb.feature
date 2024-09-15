Feature: Web UI Testing

  Scenario: User navigates to homepage
    Given homepage
    When click "Phones"
    Then List of phones
