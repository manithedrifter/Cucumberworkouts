Feature: Instagram Login page
@first
Scenario Outline: Requsted to check login page
	Given i choose to launch instagram aplication in desktop
	    When I choose to pass users vaild crdeientals "<username>" and "<password>"
		And I choose to click login button
		Then I choose to check whether i logged in 
		
		
		
		 Examples:
		|username| password |
		| mmmmmmm | mmmmmmmmmmmmmmmmmmmmmmmm |
		| value2_1 | value2_2 | 
		| value3_1 | value3_2 | 
		
   
    
   
    
