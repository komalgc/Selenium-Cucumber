$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Features/dropdown.feature");
formatter.feature({
  "line": 1,
  "name": "Dropdown Feature",
  "description": "",
  "id": "dropdown-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7906361164,
  "status": "passed"
});
formatter.before({
  "duration": 5328560774,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Select one option from the dropdown",
  "description": "",
  "id": "dropdown-feature;select-one-option-from-the-dropdown",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@Dropdowntag"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "Clicks on Dropdownoption page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "The user selects \"Option 1\" from the dropdown",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "\"Option 1\" is selected",
  "keyword": "Then "
});
formatter.match({
  "location": "dropdownsteps.clicks_on_Dropdownoption()"
});
formatter.result({
  "duration": 788326095,
  "status": "passed"
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
  "duration": 181345058,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Option 1",
      "offset": 1
    }
  ],
  "location": "dropdownsteps.is_selected(String\u003e)"
});
formatter.result({
  "duration": 131518293,
  "status": "passed"
});
formatter.after({
  "duration": 117924984,
  "status": "passed"
});
formatter.after({
  "duration": 94027240,
  "status": "passed"
});
});