$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("hover.feature");
formatter.feature({
  "line": 1,
  "name": "Hover test",
  "description": "",
  "id": "hover-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8443107802,
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
  "name": "The user Hovers on figure 1",
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
formatter.match({
  "location": "hoversteps.click_on_HoverPage()"
});
formatter.result({
  "duration": 984579166,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 26
    }
  ],
  "location": "hoversteps.theUserHoversOnFigure(int)"
});
formatter.result({
  "duration": 214821712,
  "status": "passed"
});
formatter.match({
  "location": "hoversteps.caption_is_Displayed()"
});
formatter.result({
  "duration": 77106039,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "name: user1",
      "offset": 14
    }
  ],
  "location": "hoversteps.the_title_is(String)"
});
formatter.result({
  "duration": 72473858,
  "error_message": "org.junit.ComparisonFailure: user not found expected:\u003cname: user[2]\u003e but was:\u003cname: user[1]\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:117)\n\tat Hover.hoversteps.the_title_is(hoversteps.java:63)\n\tat ✽.And The title is \"name: user1\"(hover.feature:7)\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "View Profile",
      "offset": 18
    }
  ],
  "location": "hoversteps.the_link_text_is(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 171059289,
  "status": "passed"
});
});