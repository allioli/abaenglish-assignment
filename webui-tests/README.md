# Overview

This is a cucumber-jvm, selenium project.

It was put together using visual studio code, mvn.

It will run cucumber scenarios against https://campus.abaenglish.com/en/login and report results to console and `target\cucumber-html-report\index.html`.

Tests use chromedriver v2.40 to run chrome browser with flash installed.

Default selenium timeouts are adjusted to run on a low-end laptop and might appear conservative for higher powered machines.

Examples include design patterns such as *Page object*, *Page factory* and *Action Bot*.

Default cukes runner tag is `@user_registration`


## Contents


| **Folder / File**                    | **Contents** |
| ---                           | ---          |
|   [src/test/resources/features](https://github.com/allioli/abaenglish-assignment/blob/master/webui-tests/src/test/resources/features/user_registration.feature) |   feature file with BDD scenarios      |
|   src/test/java               |    Scenario step definitions and supporting code     |
|   [pom.xml](pom.xml)               |    Maven project dependencies and description     |




## Dependencies

- Java 8
- Chrome browser & chromedriver
- Maven

## How to run

`mvn clean test`
