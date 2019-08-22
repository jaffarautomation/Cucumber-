Feature: Login amazon page


#Without Example keyword - DDFramework
#Scenario: Free CRM Login Test Scenario

#Given user is already on Login Page
#When title of login page amazon
#Then user enters "8087679770" and "deepika98"
#Then user clicks on login button
#Then user is on home page
#Then user close the browser



#With Example keyword
#With examples keyword Data driven approach  two times browser will open ,one willbe for first data and second will be for second data


Scenario Outline: Free CRM Login Test Scenario

Given user is already on Login Page
When title of login page amazon
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then user close the browser


Examples:

  | username | password |
  | 8087679770|deepika98|
  | 8784954995|deepika |












