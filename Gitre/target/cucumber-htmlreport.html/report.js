$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/training_h2a.06.15/Desktop/Selenium Workspace/Gitre/feature456/mytest999.feature");
formatter.feature({
  "name": "Test validation fot the git jenkins",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "My demo report validation in jenkins today",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "TestMe is up and running",
  "keyword": "Given "
});
formatter.match({
  "location": "Jreports.testme_is_up_and_running()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "registered user enter the valid creds",
  "keyword": "Then "
});
formatter.match({
  "location": "Jreports.registered_user_enter_the_valid_creds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verifies for the login status for this cred",
  "keyword": "And "
});
formatter.match({
  "location": "Jreports.verifies_for_the_login_status_for_this_cred()"
});
formatter.result({
  "status": "passed"
});
});