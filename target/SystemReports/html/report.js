$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("dropdown.feature");
formatter.feature({
  "line": 1,
  "name": "Dropdown Feature",
  "description": "",
  "id": "dropdown-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Select one option from the dropdown",
  "description": "",
  "id": "dropdown-feature;select-one-option-from-the-dropdown",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@Dropdowntag"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "The user in HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Clicks on Dropdownoption",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "The user selects \"\u003cDropdownoptiontoselect\u003e\" from the dropdown",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "\"\u003cDropdownoptiontoselect\u003e\" is selected",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "dropdown-feature;select-one-option-from-the-dropdown;",
  "rows": [
    {
      "cells": [
        "Dropdownoptiontoselect"
      ],
      "line": 10,
      "id": "dropdown-feature;select-one-option-from-the-dropdown;;1"
    },
    {
      "cells": [
        "Option 1"
      ],
      "line": 11,
      "id": "dropdown-feature;select-one-option-from-the-dropdown;;2"
    },
    {
      "cells": [
        "Option 2"
      ],
      "line": 12,
      "id": "dropdown-feature;select-one-option-from-the-dropdown;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 10114640187,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Select one option from the dropdown",
  "description": "",
  "id": "dropdown-feature;select-one-option-from-the-dropdown;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@Dropdowntag"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "The user in HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Clicks on Dropdownoption",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "The user selects \"Option 1\" from the dropdown",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "\"Option 1\" is selected",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "loginsteps.the_user_in_HomePage()"
});
formatter.result({
  "duration": 140137948,
  "status": "passed"
});
formatter.match({
  "location": "dropdownsteps.clicks_on_Dropdownoption()"
});
formatter.result({
  "duration": 1022288,
  "error_message": "java.lang.NullPointerException\n\tat StepDefinations.dropdownsteps.clicks_on_Dropdownoption(dropdownsteps.java:26)\n\tat ✽.And Clicks on Dropdownoption(dropdown.feature:5)\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Option 1",
      "offset": 18
    }
  ],
  "location": "dropdownsteps.the_user_selects_from_the_dropdown(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Option 1",
      "offset": 1
    }
  ],
  "location": "dropdownsteps.is_selected(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 51404,
  "status": "passed"
});
formatter.before({
  "duration": 4545172650,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Select one option from the dropdown",
  "description": "",
  "id": "dropdown-feature;select-one-option-from-the-dropdown;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@Dropdowntag"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "The user in HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Clicks on Dropdownoption",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "The user selects \"Option 2\" from the dropdown",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "\"Option 2\" is selected",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "loginsteps.the_user_in_HomePage()"
});
formatter.result({
  "duration": 41325,
  "status": "passed"
});
formatter.match({
  "location": "dropdownsteps.clicks_on_Dropdownoption()"
});
formatter.result({
  "duration": 388601,
  "error_message": "java.lang.NullPointerException\n\tat StepDefinations.dropdownsteps.clicks_on_Dropdownoption(dropdownsteps.java:26)\n\tat ✽.And Clicks on Dropdownoption(dropdown.feature:5)\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Option 2",
      "offset": 18
    }
  ],
  "location": "dropdownsteps.the_user_selects_from_the_dropdown(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Option 2",
      "offset": 1
    }
  ],
  "location": "dropdownsteps.is_selected(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 43646,
  "status": "passed"
});
});