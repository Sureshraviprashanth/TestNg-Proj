$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking in Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "LogIn",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User Launch Url",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User Enters \"\u003cUserName\u003e\" UserName",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User Enters  \"\u003cPassWord\u003e\" PassWord",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User click Login Button And it Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login;",
  "rows": [
    {
      "cells": [
        "Suresh Prashanth",
        "Msdrsp07"
      ],
      "line": 13,
      "id": "hotel-booking-in-adactin-application;login;;1"
    }
  ],
  "keyword": "Examples"
});
});