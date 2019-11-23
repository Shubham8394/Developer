*****************************selenium-cucumber-java********************************
This repository contains a collection of sample selenium-cucumber-java projects and libraries that demonstrate how to use the tool and develop automation script using the Cucumber BDD framework with Java as programming language.

*****************************Installation (pre-requisites)***************************
JDK 1.8+ (make sure Java class path is set)
Maven (make sure .m2 class path is set)
Eclipse
Eclipse Plugins for
	-> Maven
	-> Cucumber
Browser driver (make sure you have your desired browser driver and class path is set)

********************************Project Structure*************************************
-> CucumberRunner.java - It consists of the configuration part of cucumber as we have to specify the feature filepath, step definition filepath, format for reports

-> Developer.feature - This file is written in Gherkin language with already defined Cucumber keywords like Given, Then, When, And

-> TestDeveloperApp.java - It consists of all the step definitions which we have used in feature file, java code is written for each step in this file to perform the specified operations

-> Drivers Folder consists of required drivers which are used to invoke the browser

-> target/Destination stores the report file as we have defined the reporting format in CucumberRunner.java file

-> pom.xml file consists of all the maven dependencies which we need in project

-> testng.xml file consists of the configuration which we need to do for TestNG and also the path for CucumberRunner.java file is defined in it so it invokes the file which is specified in it.

*****************************Execution of Test Scenarios********************************
1. Right click on testng.xml and select Run As TestNG Suite
2. CucumberRunner.java will invoke the specified feature file
3. Developer.feature will call the step definition file for executing the mentioned steps in feature file
4. Execution will happen as per the operations specified in step definition file
5. Once the execution is completed then index.html report will be generated in pretty format under target/Destination folder