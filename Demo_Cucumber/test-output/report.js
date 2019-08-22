$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/ADMIN/eclipse-workspace1/Demo_Cucumber/src/main/java/Features/Address.feature");
formatter.feature({
  "line": 1,
  "name": "To check  add address functionality",
  "description": "",
  "id": "to-check--add-address-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "User can add mutiple address in amazon site",
  "description": "",
  "id": "to-check--add-address-functionality;user-can-add-mutiple-address-in-amazon-site",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": ": user is on Login  page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": ": Title of Login page is amazon",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": ": User enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": ": user click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": ": user lands on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": ": user navigate to my account page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": ": user navigate to my address page and click on add address",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": ": User select country and enter \"\u003cfullname\u003e\" and \"\u003cmobileno\u003e\" and \"\u003cpincode\u003e\" and \"\u003cStreetAdd\u003e\"and \"\u003ccolony\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": ": User enter \"\u003cLandmark\u003e\" and \"\u003ccity\u003e\" and select state",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": ": User select Address type and click on add address",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": ": User validate the address is saved",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": ": user close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "to-check--add-address-functionality;user-can-add-mutiple-address-in-amazon-site;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "fullname",
        "mobileno",
        "pincode",
        "StreetAdd",
        "colony",
        "Landmark",
        "city"
      ],
      "line": 21,
      "id": "to-check--add-address-functionality;user-can-add-mutiple-address-in-amazon-site;;1"
    },
    {
      "cells": [
        "8087679770",
        "deepika98",
        "anurag N",
        "8087184935",
        "411057",
        "blue ridge",
        "Hinjawadi",
        "near marina mart",
        "pune"
      ],
      "line": 22,
      "id": "to-check--add-address-functionality;user-can-add-mutiple-address-in-amazon-site;;2"
    },
    {
      "cells": [
        "8087679770",
        "deepika98",
        "jaffar A",
        "8087184935",
        "411057",
        "blue ridge society",
        "wakad palace",
        "near shiv palace",
        "pune"
      ],
      "line": 23,
      "id": "to-check--add-address-functionality;user-can-add-mutiple-address-in-amazon-site;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 22,
  "name": "User can add mutiple address in amazon site",
  "description": "",
  "id": "to-check--add-address-functionality;user-can-add-mutiple-address-in-amazon-site;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": ": user is on Login  page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": ": Title of Login page is amazon",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": ": User enter \"8087679770\" and \"deepika98\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": ": user click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": ": user lands on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": ": user navigate to my account page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": ": user navigate to my address page and click on add address",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": ": User select country and enter \"anurag N\" and \"8087184935\" and \"411057\" and \"blue ridge\"and \"Hinjawadi\"",
  "matchedColumns": [
    2,
    3,
    4,
    5,
    6
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": ": User enter \"near marina mart\" and \"pune\" and select state",
  "matchedColumns": [
    7,
    8
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": ": User select Address type and click on add address",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": ": User validate the address is saved",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": ": user close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "AddressStepDefinition.user_is_on_Login_page()"
});
formatter.result({
  "duration": 9789159000,
  "status": "passed"
});
formatter.match({
  "location": "AddressStepDefinition.title_of_Login_page_is_amazon()"
});
formatter.result({
  "duration": 28639400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8087679770",
      "offset": 14
    },
    {
      "val": "deepika98",
      "offset": 31
    }
  ],
  "location": "AddressStepDefinition.user_enter_and(String,String)"
});
formatter.result({
  "duration": 3483613500,
  "status": "passed"
});
formatter.match({
  "location": "AddressStepDefinition.user_click_on_login_button()"
});
formatter.result({
  "duration": 4022345900,
  "status": "passed"
});
formatter.match({
  "location": "AddressStepDefinition.user_lands_on_home_page()"
});
formatter.result({
  "duration": 55510100,
  "status": "passed"
});
formatter.match({
  "location": "AddressStepDefinition.user_navigate_to_my_account_page()"
});
formatter.result({
  "duration": 2343755900,
  "status": "passed"
});
formatter.match({
  "location": "AddressStepDefinition.user_navigate_to_my_address_page_and_click_on_add_address()"
});
formatter.result({
  "duration": 2159000100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "anurag N",
      "offset": 33
    },
    {
      "val": "8087184935",
      "offset": 48
    },
    {
      "val": "411057",
      "offset": 65
    },
    {
      "val": "blue ridge",
      "offset": 78
    },
    {
      "val": "Hinjawadi",
      "offset": 94
    }
  ],
  "location": "AddressStepDefinition.user_select_country_and_enter_allvalues(String,String,String,String,String)"
});
formatter.result({
  "duration": 1201357600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "near marina mart",
      "offset": 14
    },
    {
      "val": "pune",
      "offset": 37
    }
  ],
  "location": "AddressStepDefinition.user_enter_and_and_select_state(String,String)"
});
formatter.result({
  "duration": 5450350200,
  "status": "passed"
});
formatter.match({
  "location": "AddressStepDefinition.user_select_Address_type_and_click_on_add_address()"
});
formatter.result({
  "duration": 1763162300,
  "status": "passed"
});
formatter.match({
  "location": "AddressStepDefinition.user_validate_the_address_is_saved()"
});
formatter.result({
  "duration": 40173200,
  "status": "passed"
});
formatter.match({
  "location": "AddressStepDefinition.user_close_the_browser()"
});
formatter.result({
  "duration": 725243700,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "User can add mutiple address in amazon site",
  "description": "",
  "id": "to-check--add-address-functionality;user-can-add-mutiple-address-in-amazon-site;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": ": user is on Login  page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": ": Title of Login page is amazon",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": ": User enter \"8087679770\" and \"deepika98\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": ": user click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": ": user lands on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": ": user navigate to my account page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": ": user navigate to my address page and click on add address",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": ": User select country and enter \"jaffar A\" and \"8087184935\" and \"411057\" and \"blue ridge society\"and \"wakad palace\"",
  "matchedColumns": [
    2,
    3,
    4,
    5,
    6
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": ": User enter \"near shiv palace\" and \"pune\" and select state",
  "matchedColumns": [
    7,
    8
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": ": User select Address type and click on add address",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": ": User validate the address is saved",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": ": user close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "AddressStepDefinition.user_is_on_Login_page()"
});
formatter.result({
  "duration": 10236824700,
  "status": "passed"
});
formatter.match({
  "location": "AddressStepDefinition.title_of_Login_page_is_amazon()"
});
formatter.result({
  "duration": 42583400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8087679770",
      "offset": 14
    },
    {
      "val": "deepika98",
      "offset": 31
    }
  ],
  "location": "AddressStepDefinition.user_enter_and(String,String)"
});
formatter.result({
  "duration": 2628047700,
  "status": "passed"
});
formatter.match({
  "location": "AddressStepDefinition.user_click_on_login_button()"
});
formatter.result({
  "duration": 4391583200,
  "status": "passed"
});
formatter.match({
  "location": "AddressStepDefinition.user_lands_on_home_page()"
});
formatter.result({
  "duration": 99116500,
  "status": "passed"
});
formatter.match({
  "location": "AddressStepDefinition.user_navigate_to_my_account_page()"
});
formatter.result({
  "duration": 2225889300,
  "status": "passed"
});
formatter.match({
  "location": "AddressStepDefinition.user_navigate_to_my_address_page_and_click_on_add_address()"
});
formatter.result({
  "duration": 1782661900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jaffar A",
      "offset": 33
    },
    {
      "val": "8087184935",
      "offset": 48
    },
    {
      "val": "411057",
      "offset": 65
    },
    {
      "val": "blue ridge society",
      "offset": 78
    },
    {
      "val": "wakad palace",
      "offset": 102
    }
  ],
  "location": "AddressStepDefinition.user_select_country_and_enter_allvalues(String,String,String,String,String)"
});
formatter.result({
  "duration": 1281875200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "near shiv palace",
      "offset": 14
    },
    {
      "val": "pune",
      "offset": 37
    }
  ],
  "location": "AddressStepDefinition.user_enter_and_and_select_state(String,String)"
});
formatter.result({
  "duration": 5442906000,
  "status": "passed"
});
formatter.match({
  "location": "AddressStepDefinition.user_select_Address_type_and_click_on_add_address()"
});
formatter.result({
  "duration": 1082256600,
  "status": "passed"
});
formatter.match({
  "location": "AddressStepDefinition.user_validate_the_address_is_saved()"
});
formatter.result({
  "duration": 133626300,
  "error_message": "java.lang.AssertionError: Address not save please try again  expected [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:94)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:513)\r\n\tat org.testng.Assert.assertTrue(Assert.java:42)\r\n\tat StepDefinition.AddressStepDefinition.user_validate_the_address_is_saved(AddressStepDefinition.java:216)\r\n\tat ✽.Then : User validate the address is saved(C:/Users/ADMIN/eclipse-workspace1/Demo_Cucumber/src/main/java/Features/Address.feature:15)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "AddressStepDefinition.user_close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});