@login
Feature: login
  As a user I want to login website travelio

  Scenario: "Test Case Positive 1: Register with Valid Credentials"
    Given User open the website Official travelio
    When User Click button Masuk
    Then input ALL Field form Login in page and click button Masuk

#  Scenario: "Test Case Negative 1: Register with Invalid Credentials"
#    Given User open the website Official travelio
#    When User Click button Masuk
#    Then input ALL Field form Login in page with invalid credentials and click button Masuk
#    Then User sees an error message indicating invalid login credentials

