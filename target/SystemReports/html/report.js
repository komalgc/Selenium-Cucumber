$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Horizontal.feature");
formatter.feature({
  "line": 1,
  "name": "test Horizontal slider",
  "description": "",
  "id": "test-horizontal-slider",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10879857166,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "slide the slider to value 4",
  "description": "",
  "id": "test-horizontal-slider;slide-the-slider-to-value-4",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@Slider"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "the user is on the Horizontalslider page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "slide the slider to right till the value is \"4\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "slide is moved",
  "keyword": "Then "
});
formatter.match({
  "location": "HorizontalSteps.the_user_is_on_the_Horizontalslider_page()"
});
formatter.result({
  "duration": 1043125050,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 45
    }
  ],
  "location": "HorizontalSteps.slide_the_slider_to_right_till_the_value_is(String)"
});
formatter.result({
  "duration": 819659068,
  "status": "passed"
});
formatter.match({
  "location": "HorizontalSteps.slide_is_moved()"
});
formatter.result({
  "duration": 35988363,
  "status": "passed"
});
formatter.after({
  "duration": 209133149,
  "status": "passed"
});
});