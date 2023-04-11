$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/swag.feature");
formatter.feature({
  "name": "User buy the product",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@a2a"
    }
  ]
});
formatter.scenario({
  "name": "User go to login page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@a2a"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user launch the url",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_launch_the_url()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User fill the username",
  "rows": [
    {
      "cells": [
        "standard_user"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_fill_the_usernamee(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The user fill password",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.the_user_fill_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The user click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.the_user_click_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "User select the products to Add to card page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@a2a"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "user handle the alert",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_handle_the_alert()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User select the products to click the add to card button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_select_the_products_to_click_the_add_to_card_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user go to click the add card page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_go_to_click_the_add_card_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "User check out the product and confirming order",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@a2a"
    },
    {
      "name": "@retest"
    }
  ]
});
formatter.step({
  "name": "user click the checkout button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_click_the_checkout_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user fill the first name",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_fill_the_first_name()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user fill the last name",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_fill_the_last_name()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user fill the postel code",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_fill_the_postel_code()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click the continue button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_click_the_continue_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user go to the description page and click the finish button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_go_to_the_description_page_and_click_the_finish_button()"
});
formatter.result({
  "status": "skipped"
});
});