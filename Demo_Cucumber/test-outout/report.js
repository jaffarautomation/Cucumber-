$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/ADMIN/eclipse-workspace1/Demo_Cucumber/src/main/java/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login amazon page",
  "description": "",
  "id": "login-amazon-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "login-amazon-page;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page amazon",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_already_on_Login_Page()"
});
formatter.result({
  "duration": 11121849300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.title_of_login_page_amazon()"
});
formatter.result({
  "duration": 62704000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_username()"
});
formatter.result({
  "duration": 3578944600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 3887966600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 88238100,
  "status": "passed"
});
});