$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginUsingDataTableStepDefinitions.feature");
formatter.feature({
  "line": 2,
  "name": "Log in using Data Table",
  "description": "",
  "id": "log-in-using-data-table",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SmokeTest"
    }
  ]
});
formatter.before({
  "duration": 3452256835,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Login with invalid credentials",
  "description": "",
  "id": "log-in-using-data-table;login-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "User is in login page",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 8,
      "value": "#When   Enter invalid email and password"
    }
  ],
  "line": 9,
  "name": "Enter invalid email and password from Data Table",
  "rows": [
    {
      "cells": [
        "userName",
        "password"
      ],
      "line": 10
    },
    {
      "cells": [
        "testdat@gmail.com",
        "testdata"
      ],
      "line": 11
    },
    {
      "cells": [
        "testabc@gmail.com",
        "testabc"
      ],
      "line": 12
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Error message appear",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginUsingDataTableStepDefinitions.user_is_in_login_page()"
});
formatter.result({
  "duration": 1541070777,
  "status": "passed"
});
formatter.match({
  "location": "LoginUsingDataTableStepDefinitions.enter_invalid_email_and_password_from_Data_Table(DataTable)"
});
formatter.result({
  "duration": 1028654073,
  "status": "passed"
});
formatter.match({
  "location": "LoginUsingDataTableStepDefinitions.error_message_appear()"
});
formatter.result({
  "duration": 28564403,
  "status": "passed"
});
formatter.after({
  "duration": 78439466,
  "status": "passed"
});
});