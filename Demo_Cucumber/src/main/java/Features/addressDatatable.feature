Feature: To check  add address functionality

Scenario: User can add mutiple address in amazon site

Given : users is on Login  page
When : Titles of Login page is amazon
Then : Users enter username and password
|8087679770|anurag@!88|

Then : users click on login button
Then : users lands on home page
Then : users navigate to my account page
Then : users navigate to my address page and click on add address
Then : Users select country and enter fullname and mobileno and pincode and StreetAdd and colony
|anurag N|8087184935|411057|T22 blue ridge|hinjawadi|

Then : Users enter Landmark and city and select state
|near marina mart | pune |

Then : Users select Address type and click on add address
Then : Users validate the address is saved 
Then : users close the browser 
