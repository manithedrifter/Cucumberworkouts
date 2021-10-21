Feature: Instagram Login page
Scenario: Requsted to check login page
    Given I choose to launch instagram apps
    When I choose to enter vaild user's ID s
    |username|password|
    |mani|@112345778|
    |mani|@112345778|
    
    Then I choose to check user are sucessfully logged ins