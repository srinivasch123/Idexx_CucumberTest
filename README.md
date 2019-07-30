# Idexx_CucumberTest
Assignment for Idexx company
# Overview of the framework written
1. Tests are written using Selenium framework with Cucumber and testng in java programming language. 
2. Its a BDD framework
3. Objects are identified using POM.
4. Maven is used as build tool.
5. Reporting is done using cucumber-reports.
6. src maven package contains Base, Page, SauceLabs and Utilities packages
7. trg maven package contains Features, runners and StepDefinitions packages.
8. Resources package contains Drivers, env, log4j, TestData directories.
9. Test data is passed form the feature file.

# Steps to execute the test
1. Clone the repo to your local machine
2. Open command prompt (Windows) / terminal (mac) and then navigate to the location where the project is cloned. 
3. Run the command "mvn clean test -Dtestfile=testng.xml"

# Environment and browser settings to run on local or saucelabs
1. This test can either be run on local browser or suacelabs based on the configuration present in the feature file. 
- Execution setting to run on local chrome browser: Set the configuration in the feature file as enviroment = local, browser = Chrome
- Execution setting to run on suacelabs chrome browser: Set the configuration in the feature file as enviroment = saucelabs, browser = Chrome, the version number of the saucelabs browser is read from property file. 
2. Test results can be seen in target folder under cucumber-reports and cucumber-pretty.

