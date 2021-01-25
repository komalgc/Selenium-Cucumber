$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("hover.feature");
formatter.feature({
  "line": 1,
  "name": "Hover test",
  "description": "",
  "id": "hover-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7964212130,
  "status": "passed"
});
formatter.before({
  "duration": 13818982693,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "testSuccessful hover and get title",
  "description": "",
  "id": "hover-test;testsuccessful-hover-and-get-title",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@HoverTag"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "Click on HoverPage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "The user Hovers on figure1",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Caption is Displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "The title is \"name: user1\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "The link text is \"View Profile\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 183983746,
  "status": "passed"
});
formatter.after({
  "duration": 176544129,
  "status": "passed"
});
});