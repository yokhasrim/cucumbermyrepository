
Feature: check if login is done in webshop website


  Scenario Outline: 
    Given open url of demoshop "http://demowebshop.tricentis.com/login"
    When user enters the "<stringname>"
    When user enter the "<stringpassword>"
    Then user is in webshop as "<webshopstring>"


    Examples: 
      | stringname          | stringpassword | webshopstring  |
      | abc@gmail.com       |     abc123     |  pass          |
      | yoks@gmail.com      |     yoks123    |  Fail          |
