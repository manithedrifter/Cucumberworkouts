Feature: instagram login page
Scenario: Requested to check login page
    Given I choose to launch instagram application
    When I choose to enter vaild user's ID "mani" and "@12356789"
    Then I choose to check user ID's are sucesfully logged in
    
	