$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Developer.feature");
formatter.feature({
  "line": 1,
  "name": "Developer",
  "description": "",
  "id": "developer",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I open browser and launch Developer URL",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I validate the initialization of Angular on page",
  "keyword": "Then "
});
formatter.match({
  "location": "TestDeveloperApp.setUp()"
});
formatter.result({
  "duration": 57612612800,
  "status": "passed"
});
formatter.match({
  "location": "TestDeveloperApp.testAngularInitialization()"
});
formatter.result({
  "duration": 6715751500,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "To validate the Documentation Page",
  "description": "",
  "id": "developer;to-validate-the-documentation-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I check the Internal Links present on documentation page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I validate whether all links are getting loaded or not",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I quit the driver",
  "keyword": "Then "
});
formatter.match({
  "location": "TestDeveloperApp.validateInternalLinks()"
});
formatter.result({
  "duration": 20477634400,
  "status": "passed"
});
formatter.match({
  "location": "TestDeveloperApp.test()"
});
formatter.result({
  "duration": 89875824100,
  "status": "passed"
});
formatter.match({
  "location": "TestDeveloperApp.tearDown()"
});
formatter.result({
  "duration": 2200533000,
  "status": "passed"
});
});