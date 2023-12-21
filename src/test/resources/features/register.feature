@register
Feature: register
  As a user I want to login website travelio
  Scenario: "Test Case Positive 1: Login with Valid Credentials"
    Given User open the website Official travelio
    When User Click button Buat Akun
    Then input ALL Field form Register in page and click button Daftar
    And input Verification Number
    Then User already on landing page

# Test Case Negative 1: Register with Existing Email
  Scenario: Register with Existing Email
    When User Click button "Buat Akun"
    Then User enters existing email "existing@example.com"
    And User enters a valid password
    Then User clicks on the "Daftar" button

    Then User sees an error message indicating that the email is already registered

  # Test Case Negative 2: Register with Weak Password
  Scenario: Register with Weak Password
    When User Click button "Buat Akun"
    Then User enters a valid email
    And User enters a weak password (e.g., less than 8 characters)
    Then User clicks on the "Daftar" button
    And User sees an error message indicating that the password is too weak

  # Test Case Negative 3: Register with Mismatched Passwords
  Scenario: Register with Mismatched Passwords
    When User Click button "Buat Akun"
    Then User enters a valid email
    And User enters a valid password
    Then User re-enters a different password
    And User clicks on the "Daftar" button
    Then User sees an error message indicating that the passwords do not match
