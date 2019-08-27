Feature: To check  add address functionality


#This is Data Driven Testing with Examples Keyword.
#With Examples keyword we need to use the Scenario Outline keyword.
#Advantage to this Data driven approach  is , it will executed the every scenario according to given number of data.


Scenario Outline: User can add mutiple address in amazon site

Given : user is on Login  page
When : Title of Login page is amazon
Then : User enter "<username>" and "<password>"
Then : user click on login button
Then : user lands on home page
Then : user navigate to my account page
Then : user navigate to my address page and click on add address
Then : User select country and enter "<fullname>" and "<mobileno>" and "<pincode>" and "<StreetAdd>"and "<colony>"
Then : User enter "<Landmark>" and "<city>" and select state
Then : User select Address type and click on add address
Then : User validate the address is saved 
Then : user close the browser 


Examples: 

| username | password | fullname | mobileno | pincode | StreetAdd | colony  | Landmark | city | 
| 8087679770|**********| anurag N | 8087184935 | 411057 | blue ridge | Hinjawadi| near marina mart | pune |
| 8087679770|**********| jaffar A | 8087184935 | 411057| blue ridge society | wakad palace  | near shiv palace | pune |