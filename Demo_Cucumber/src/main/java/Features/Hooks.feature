Feature: To check the login functionality of home page



@First
Scenario: user is able to Login home page 

Given  userss is on login page
Then user enter login credentails
Then user is navigate to home page



@Second
Scenario: user is able to Logout home page 

Given  userss is home login page
Then user enter click on  logout link
Then user is navigate to login page



