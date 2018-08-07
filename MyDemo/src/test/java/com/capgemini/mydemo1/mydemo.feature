Feature: Sample Login 
#This is how background can be used to eliminate duplicate steps 


Scenario: If both are successful
  Given I am on Sample login page
   When I enter username as vamshimanigandla
   And I enter password as vamshi
   Then Alert successful
   
Scenario: If Username correct only
  Given I am on Sample login page
   When I enter username as vamshimanigandla
   And I enter password as vamcc
   Then Alert failed 
   
  Scenario: Both are wrong
  Given I am on Sample login page
   When I enter username as vamshimm
   And I enter password as vamcc
   Then Alert failed completely
    
 