$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("GoogleSearch.feature");
formatter.feature({
  "line": 1,
  "name": "Google Search",
  "description": "",
  "id": "google-search",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Google Search",
  "description": "",
  "id": "google-search;google-search",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Search"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "As user viewing Google Search page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Google Search Page should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Enter google search string \"Google\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Google Search Page should be displayed with Google as search parameter",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearchSteps.as_user_viewing_Google_Search_page()"
});
formatter.result({
  "status": "skipped"
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
});