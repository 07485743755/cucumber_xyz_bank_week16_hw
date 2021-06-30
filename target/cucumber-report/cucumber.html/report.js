$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featureFile/bankAddCustomer.feature");
formatter.feature({
  "line": 1,
  "name": "Bank Test",
  "description": "\r\nAs a User I want to test that bank manager should add customer successfully.",
  "id": "bank-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3839678800,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Verify Bank manager should able to add customer successfully",
  "description": "",
  "id": "bank-test;verify-bank-manager-should-able-to-add-customer-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@Smoke"
    },
    {
      "line": 5,
      "name": "@Sanity"
    },
    {
      "line": 5,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on Bank manager login tab",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click on add customer tab",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter first name \"Jenna\"in first name field and last name \"Salvator\"in last name field and post code \"LE43NJ\"in post code field",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on add customer button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I should get the alert message \"Customer added successfully\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomerStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 106372900,
  "status": "passed"
});
formatter.match({
  "location": "AddCustomerStepdefs.iClickOnBankManagerLoginTab()"
});
formatter.result({
  "duration": 123464000,
  "status": "passed"
});
formatter.match({
  "location": "AddCustomerStepdefs.iClickOnAddCustomerTab()"
});
formatter.result({
  "duration": 367308000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jenna",
      "offset": 20
    },
    {
      "val": "Salvator",
      "offset": 61
    },
    {
      "val": "LE43NJ",
      "offset": 104
    }
  ],
  "location": "AddCustomerStepdefs.iEnterFirstNameInFirstNameFieldAndLastNameInLastNameFieldAndPostCodeInPostCodeField(String,String,String)"
});
formatter.result({
  "duration": 1279432800,
  "status": "passed"
});
formatter.match({
  "location": "AddCustomerStepdefs.iClickOnAddCustomerButton()"
});
formatter.result({
  "duration": 171933600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Customer added successfully",
      "offset": 32
    }
  ],
  "location": "AddCustomerStepdefs.iShouldGetTheAlertMessage(String)"
});
formatter.result({
  "duration": 1020848000,
  "status": "passed"
});
formatter.after({
  "duration": 936359600,
  "status": "passed"
});
});