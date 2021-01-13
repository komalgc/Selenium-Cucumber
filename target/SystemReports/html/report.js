$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9092198919,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Test Successful Login",
  "description": "",
  "id": "login-feature;test-successful-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "The user in HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Clicks on FormAuthentication",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "The user Enters \"tomsmith\" in username field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "The user Enters \"SuperSecretPassword!\" in password field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Clicks on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User is Navigated to Secure Area",
  "keyword": "Then "
});
formatter.match({
  "location": "loginsteps.the_user_in_HomePage()"
});
formatter.result({
  "duration": 231747218,
  "status": "passed"
});
formatter.match({
  "location": "loginsteps.clicks_on_FormAuthentication()"
});
formatter.result({
  "duration": 2559852431,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tomsmith",
      "offset": 17
    }
  ],
  "location": "loginsteps.the_user_Enters_in_username_field(String)"
});
formatter.result({
  "duration": 209509102,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SuperSecretPassword!",
      "offset": 17
    }
  ],
  "location": "loginsteps.the_user_Enters_in_password_field(String)"
});
formatter.result({
  "duration": 122538426,
  "status": "passed"
});
formatter.match({
  "location": "loginsteps.clicks_on_Login_Button()"
});
formatter.result({
  "duration": 945421782,
  "status": "passed"
});
formatter.match({
  "location": "loginsteps.user_is_Navigated_to_Secure_Area()"
});
formatter.result({
  "duration": 45741510,
  "status": "passed"
});
formatter.after({
  "duration": 169349326,
  "status": "passed"
});
});