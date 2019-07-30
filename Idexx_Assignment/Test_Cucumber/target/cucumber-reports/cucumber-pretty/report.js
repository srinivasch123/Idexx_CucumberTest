$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("BDD_E2ETests.feature");
formatter.feature({
  "line": 1,
  "name": "Search for hotel in Singapore",
  "description": "Description: The purpose of the test is to search for a hotel in singapore.",
  "id": "search-for-hotel-in-singapore",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "User searches for Rendezvous hotel in Singapore",
  "description": "",
  "id": "search-for-hotel-in-singapore;user-searches-for-rendezvous-hotel-in-singapore",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Search"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on the home page on \"\u003cenvironment\u003e\" and \"\u003cbrowser\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "searches for hotel using \"\u003clocation\u003e\", \"\u003ccheckIn\u003e\", \"\u003ccheckOut\u003e\" and \"\u003cnoofadults\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "search succeeds",
  "keyword": "Then "
});
formatter.examples({
  "comments": [
    {
      "line": 9,
      "value": "#    And user can see the price of Junior suite"
    },
    {
      "line": 10,
      "value": "#    And user can see the reviews from people"
    }
  ],
  "line": 12,
  "name": "",
  "description": "",
  "id": "search-for-hotel-in-singapore;user-searches-for-rendezvous-hotel-in-singapore;",
  "rows": [
    {
      "cells": [
        "environment",
        "browser",
        "location",
        "checkIn",
        "checkOut",
        "noofadults",
        "price"
      ],
      "line": 13,
      "id": "search-for-hotel-in-singapore;user-searches-for-rendezvous-hotel-in-singapore;;1"
    },
    {
      "cells": [
        "saucelabs",
        "Chrome",
        "Singapore",
        "5",
        "10",
        "2",
        "1250$"
      ],
      "line": 14,
      "id": "search-for-hotel-in-singapore;user-searches-for-rendezvous-hotel-in-singapore;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "User searches for Rendezvous hotel in Singapore",
  "description": "",
  "id": "search-for-hotel-in-singapore;user-searches-for-rendezvous-hotel-in-singapore;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Search"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on the home page on \"saucelabs\" and \"Chrome\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "searches for hotel using \"Singapore\", \"5\", \"10\" and \"2\"",
  "matchedColumns": [
    2,
    3,
    4,
    5
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "search succeeds",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "saucelabs",
      "offset": 29
    },
    {
      "val": "Chrome",
      "offset": 45
    }
  ],
  "location": "Steps.user_is_on_the_home_page_on_environment(String,String)"
});
formatter.result({
  "duration": 11159441192,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Singapore",
      "offset": 26
    },
    {
      "val": "5",
      "offset": 39
    },
    {
      "val": "10",
      "offset": 44
    },
    {
      "val": "2",
      "offset": 53
    }
  ],
  "location": "Steps.searches_for_hotel_using_location(String,Integer,Integer,String)"
});
formatter.result({
  "duration": 13037436855,
  "status": "passed"
});
formatter.match({
  "location": "Steps.search_succeeds()"
});
formatter.result({
  "duration": 3483276459,
  "status": "passed"
});
});